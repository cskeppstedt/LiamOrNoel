package com.LiamOrNoel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class LiamOrNoelApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "LIAM OR NOEL";
    }

    public static void main(String[] args) {
        SpringApplication.run(LiamOrNoelApplication.class, args);
    }
}
