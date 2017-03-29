package com.citonomy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: mohammad
 * Creation Date: 3/29/2017
 */
@RestController
public class ServiceFacade {
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String Hello(@RequestParam(value = "name", defaultValue = "Mohammad") String name) {
        return "OK";
    }

}
