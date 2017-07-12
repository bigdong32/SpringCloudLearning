package com.wds.springcloud.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DESCRIPTION
 *
 * @author wdongsen@linesum.com
 * @data 2017-07-10 17:06
 */
@RestController
public class HiController {

    @RequestMapping("/hi")
    public String home(){
        return "hello world";
    }
}
