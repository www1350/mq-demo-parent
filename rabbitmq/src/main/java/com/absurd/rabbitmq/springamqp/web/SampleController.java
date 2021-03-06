package com.absurd.rabbitmq.springamqp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by wangwenwei on 16/12/17.
 */
@Controller
public class SampleController {
    private static Logger logger = LoggerFactory.getLogger(SampleController.class);
@Autowired
private
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }




}
