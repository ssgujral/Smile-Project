package com.example.smileproject.Smile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SmileController {
  @GetMapping("/home")
  public Smile create() {

    Smile smile = new Smile(1, true, true);
    return smile;

  }
  
}
