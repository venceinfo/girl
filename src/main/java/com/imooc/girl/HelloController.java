package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
//@RequestMapping(value="/hello")
@RequestMapping("/hello") // same as upper
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;
//    // get from yml file
//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    //@RequestMapping(value = {"/say/{id}", "/hi"}, method = RequestMethod.GET)
    //@RequestMapping(value="/say", method=RequestMethod.GET)
    @GetMapping("/say")
    public String say(/*@PathVariable("id") Integer id*/
            @RequestParam(value="id", required = false, defaultValue = "0") Integer id) {
        //return "Hello Spring Boot";
        //return cupSize + age;
        //return content;
        //return girlProperties.getCupSize();
       // return "index";  // use tempalte, together will @Controller

        return "id： " + id;
    }
}
