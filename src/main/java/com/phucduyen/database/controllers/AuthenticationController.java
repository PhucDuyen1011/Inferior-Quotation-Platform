package com.phucduyen.database.controllers;

import com.phucduyen.database.models.response_models.TestResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @GetMapping("/test")
    public String testSecurity(){
        return "Hello";
    }

    @GetMapping("/hello/{message}")
    public TestResponse sayHello(@PathVariable int message){
        //@RequestBody: truyền dc dữ liệu object (dùng nhiều - che dấu thông tin - truyền dc file)
        //@RequestParam(name = "data"): ko truyền dc object, truyền từng con param
        //@RequestParam int message
        //@PathVariable int message <=> @GetMapping("/hello/{message}"): truyền thẳng trên đường dẫn, tên biến trùng tên
                                // trên dường link
        return TestResponse.builder()
                .message(message)
                .date(null)
                .build();
    }
}
