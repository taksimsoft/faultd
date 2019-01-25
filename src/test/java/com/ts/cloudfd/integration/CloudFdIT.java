package com.ts.cloudfd.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import com.ts.cloudfd.rest.request.SignalRequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
public class CloudFdIT {

    @Autowired
    TestRestTemplate    template;

    @Test
    public void whenPostFDthenSave(){
        SignalRequest signal = new SignalRequest();
        // Act
        ResponseEntity<SignalRequest> response = template.postForEntity("/cfd/v1/signals", signal, SignalRequest.class);
        // Assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getId()).isGreaterThan(1L);
    }


}
