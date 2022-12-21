//package com.example;
//
//import java.sql.Date;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@EnableAutoConfiguration
//public class SampleWebJspController extends SpringBootServletInitializer {
//
//    @Value("${application.message:Hello World}")
//    private String message = "Hello World";
//
//    @RequestMapping("/")
//    public String welcome(Map<String, Object> model) {
//        model.put("time", new Date(0));
//        model.put("message", this.message);
//        return "welcome";
//    }
//
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SampleWebJspController.class, args);
//    }
//}