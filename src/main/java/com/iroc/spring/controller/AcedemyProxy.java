package com.iroc.spring.controller;

import com.iroc.spring.entity.AcedemyDetails;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="academyMicroservice")
@LoadBalancerClient(name="academyMicroservice", configuration = LoadBalanceConfiguration.class)
public interface AcedemyProxy {

    @GetMapping(value = "/acedemy/getAcedemyDetails")
    public AcedemyDetails getAcedemyDetails();

}
