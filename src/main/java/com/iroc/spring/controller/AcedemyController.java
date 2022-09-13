package com.iroc.spring.controller;

import com.iroc.spring.entity.AcedemyDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/acedemy")
@Slf4j
public class AcedemyController {

    @Autowired
    AcedemyProxy acedemyProxy;

    @GetMapping(value = "/getAcedemyDetails")
    public ResponseEntity<AcedemyDetails> getAcedemyDetails() {
        AcedemyDetails acedemyDetails = acedemyProxy.getAcedemyDetails();
        return new ResponseEntity<>(acedemyDetails, HttpStatus.OK);
    }

}
