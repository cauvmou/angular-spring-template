package com.example.demo;

import java.net.URI;
import org.springframework.beans
    .factory.annotation.Autowired;
import org.springframework.http
    .ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind
    .annotation.GetMapping;
import org.springframework.web.bind
    .annotation.PostMapping;
import org.springframework.web.bind
    .annotation.RequestBody;
import org.springframework.web.bind
    .annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind
    .annotation.RestController;
import org.springframework.web.servlet
    .support.ServletUriComponentsBuilder;

@Controller
@RequestMapping(path = "/")
public class TestController {

    private class ResponseMessage {
        public String message;
        public ResponseMessage(String message) {
            this.message = message;
        }
    }
    
    @GetMapping(path = "/test", produces = "application/json")
    public @ResponseBody ResponseMessage getTest() {
        return new ResponseMessage("Hello From Java!");
    }

}
