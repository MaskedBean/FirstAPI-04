package com.example.FirstAPI04.Controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "")
public class HeaderController {

    @GetMapping(value = "/headers")
    public String getHeader(@RequestHeader HttpHeaders headers){
        return headers.getHost().toString();
    }
}
