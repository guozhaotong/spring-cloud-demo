package com.guozhaotong.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 郭朝彤
 * @date 2018/4/27.
 */
@Component
@FeignClient(name = "eureka-client")
public interface HelloRemoteInterface {
    @RequestMapping(value = "/hi")
    public String hi111();
}
