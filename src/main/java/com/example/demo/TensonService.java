package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TensonService {
  


      public RequestModel info()
      {
           RequestModel MODEL = new RequestModel();
           MODEL.setFirmId("1234567890");
           MODEL.setSoftwareId("1234567890");
           return MODEL;
      }




}
