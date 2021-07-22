package com.cqupt.education_01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*该注释返回字符串
* Controller返回的是页面
* */
@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;
/**
 * Get Post Delete Put
 * RequestMapping 可以返回上面四种方式的请求
 **特定方式有GetMapping PostMapping 等
 * @return
 * */

//@RequestMapping(value = "/hello" ,method = RequestMethod.GET)
//还可以以上述方式指定请求方式
    @RequestMapping("/hello")
    public  String hello(){
        return  "hello "+testHello;
    }
    @PostMapping("/hello/post")
    public  String helloPost(String name){
        return  "Hello  World !Post,"+name;
    }
}
