package com.example.datacollectiondemo;


import com.example.datacollectiondemo.DataCollectionModel.ShuffledUserIDRepository;
import com.example.datacollectiondemo.DataCollectionModel.ShuffledUsersID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Service
@RestController
public class TestHello {
    @GetMapping("/Hello")
    public List<String> Hello(){

        return Arrays.asList("hello", " world");
    }


}
