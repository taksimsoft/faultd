package com.ts.cloudfd.rest.controller;

import com.ts.cloudfd.rest.request.SignalRequest;
import com.ts.cloudfd.rest.response.SignalResponse;
import com.ts.cloudfd.rest.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cfd/v1")
public class SignalController {

    @Autowired
    MessageProducer producer;

    @PostMapping("/signals")
    @ResponseStatus(HttpStatus.CREATED)
    private SignalResponse saveSignal(@RequestBody SignalRequest    signalRequest){
        producer.sendMessage("Hello, World!");
        return   new SignalResponse();

    }

}
