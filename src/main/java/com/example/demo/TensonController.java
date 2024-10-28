package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("TENSON/Auth")
public class TensonController {
  @Autowired
  private TensonService service; 
  
@GetMapping("info")
public ResponseEntity<RequestModel> getInfo() {
  RequestModel MODEL =  service.info();
  return ResponseEntity.status(HttpStatus.ACCEPTED).body(MODEL);
}


  
  
}
