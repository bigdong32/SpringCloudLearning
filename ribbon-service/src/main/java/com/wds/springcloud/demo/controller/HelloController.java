package com.wds.springcloud.demo.controller;

import com.wds.springcloud.demo.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESCRIPTION
 *
 * @author wdongsen@linesum.com
 * @data 2017-07-11 9:33
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    public String hi(){
        return helloService.hiService() + " from ribbon";
    }
}
