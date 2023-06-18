package com.trajkovski.sfgpetclinic.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ScheduledBranch {

    @Value("${sfg.customVariable}")
    private String customVariable;

    @GetMapping("/schedule")
    public String print() {
        String message = "Print something" + customVariable;
        log.debug(message);
        return message;
    }
}
