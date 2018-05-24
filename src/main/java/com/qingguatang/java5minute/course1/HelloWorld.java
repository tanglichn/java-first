package com.qingguatang.java5minute.course1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LI
 * @date 2018/5/24
 */
@Controller
public class HelloWorld {
    @RequestMapping(value = "/")
    @ResponseBody
    public String hello(){
        String message = "Hello";
        return message;
    }
}
