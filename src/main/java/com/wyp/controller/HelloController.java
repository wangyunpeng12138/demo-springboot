package com.wyp.controller;


import com.wyp.model.Student;
import com.wyp.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired  //spring容器帮你注入该对象
    private Student student;

    @GetMapping("/student")
    public Student stu(){
        log.info(JsonUtils.toJson(student));
        return student;
    }

    @GetMapping("/hello")
    public Map<String,Object> hello(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",15);
        return map;
    }
}
