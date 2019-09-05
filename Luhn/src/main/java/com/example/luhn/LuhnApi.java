package com.example.luhn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LuhnApi {


    @GetMapping("/Add")
    public int CalculateControlNumber(@RequestParam int number) {
        return Luhn.CalculateControl(number);
    }


    @GetMapping("/Check")
    public boolean CheckNumber(@RequestParam int number) {
        return Luhn.CheckNumber(number);
    }


}
