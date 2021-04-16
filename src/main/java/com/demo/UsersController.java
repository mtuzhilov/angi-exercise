package com.demo;

import com.demo.model.Users;
import com.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    Users postUser(@RequestBody Users user) {
        return usersService.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    Users getUser(@PathVariable Integer id){
        return  usersService.findById(id).get();
    }

    @RequestMapping(value = "/users", method = RequestMethod.DELETE)
    Map<String, String> deleteUser(@RequestParam Integer id){
        Map<String, String> status = new HashMap<>();
        Optional<Users> user = usersService.findById(id);
        if(user.isPresent()) {
            usersService.delete(user.get());
            status.put("Status", "User deleted successfully");
        }
        else {
            status.put("Status", "User not exist");
        }
        return status;
    }


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    List<Users> getAllUsers() {
        return usersService.findAll();
    }

    @RequestMapping(value = "/data-files", method = RequestMethod.DELETE)
    String deleteAllUsers() {
        usersService.deleteAll();
        return "SUCCESS";
    }




}
