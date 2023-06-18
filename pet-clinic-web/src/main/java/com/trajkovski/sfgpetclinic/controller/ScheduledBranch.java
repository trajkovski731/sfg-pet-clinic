package com.trajkovski.sfgpetclinic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduledBranch {

    @GetMapping("/schedule")
    public void print() {
        System.out.println("Print something");
    }


}
