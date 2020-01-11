package cn.itcast.spring.boot.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {



    @GetMapping("show")
    public String test() {
        return "hello springboot 1";
    }

}
