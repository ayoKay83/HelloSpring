package com.example.demo.controllers;

import com.example.demo.services.DayOfTheWeekCalc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FridayController {
    DayOfTheWeekCalc dayOfTheWeekCalc = new DayOfTheWeekCalc();

    @ResponseBody
    @GetMapping("isItFriday")

    public String isItFriday() {

       return dayOfTheWeekCalc.isItFridayCalc();
    }


}
