package com.wds.springcloud.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * DESCRIPTION
 *
 * @author wdongsen@linesum.com
 * @data 2017-07-11 9:27
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(){
        return restTemplate.getForObject("http://EUREKA-SERVICE/hi", String.class);
    }
}
