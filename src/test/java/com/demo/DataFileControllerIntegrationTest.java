package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class DataFileControllerIntegrationTest {


    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testDataFile() {
/*        assertEquals("SUCCESS", this.restTemplate.postForObject("http://localhost:" + port + "/data-file/testformat1_2015-06-28.txt", "", String.class));

        DataFile dataFile = this.restTemplate.getForObject("http://localhost:" + port + "/data-file/1", DataFile.class);


    }*/
    }
}

