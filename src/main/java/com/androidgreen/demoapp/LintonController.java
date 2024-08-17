package com.androidgreen.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LintonController {

  @GetMapping
  public String index(){
    return "Linton App deployed and ready";
  }
}
