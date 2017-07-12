package com.wds.springboot.demo.service;

import com.wds.springboot.demo.hystrix.HiServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wuds on 2017/7/11.
 */
@FeignClient(value = "eureka-service", fallback = HiServiceHystrix.class)
public interface HiService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHi();
}
