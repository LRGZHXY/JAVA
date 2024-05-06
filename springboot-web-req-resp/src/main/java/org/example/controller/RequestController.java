package org.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.example.pojo.User;

//测试请求参数接收

@RestController
public class RequestController {
    //原始方式
   /* @RequestMapping("/simpleParam")
    public String simpleParam(HttpServletRequest request) {
        //获取请求参数
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");

        int age = Integer.parseInt(ageStr);
        System.out.println(name+":"+age);
        return "OK";

    }*/

    //springboot方式
    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name="name") String username, Integer age) {
        System.out.println(username+":"+age);
        return "OK";
    }

    //实体参数
    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);
        return "OK";
    }
}
