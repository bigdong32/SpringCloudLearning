package com.wds.springboot.demo.controller;

import com.wds.springboot.demo.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESCRIPTION
 *
 * @author wdongsen@linesum.com
 * @data 2017-07-11 10:02
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(){
        return hiService.sayHi() + " from feign";
    }
}
