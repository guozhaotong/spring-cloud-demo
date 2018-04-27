package com.guozhaotong.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郭朝彤
 * @date 2018/4/27.
 */
@RestController
public class HelloController {

    @Autowired
    HelloRemoteInterface helloRemoteInterface;

    @RequestMapping("/hello")
    public String hello() {
        return helloRemoteInterface.hi111();
    }
}
