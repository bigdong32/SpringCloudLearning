package com.wds.springboot.demo.hystrix;

import com.wds.springboot.demo.service.HiService;
import org.springframework.stereotype.Component;

/**
 * DESCRIPTION
 *
 * @author wdongsen@linesum.com
 * @data 2017-07-11 10:20
 */
@Component
public class HiServiceHystrix implements HiService{

    @Override
    public String sayHi() {
        return "fallBack hi-service";
    }
}
