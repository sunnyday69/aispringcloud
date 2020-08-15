package com.southwind.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cgy
 * @version 1.0
 */
@RestController
@RequestMapping("/native")
public class NativeConfigHandler {

    @Value("${server.port}")
    private String port;

    @Value("${server.poo}")
    private String poo;

    @GetMapping("/index")
    public String index(){
        return this.port+"-"+this.poo;
    }
}
