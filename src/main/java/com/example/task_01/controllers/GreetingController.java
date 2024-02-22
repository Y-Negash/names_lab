package com.example.task_01.controllers;
import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")

 /*  GREETING AS STRING METHOD

 public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(){
        return "Good Afternoon!";
    }
    */
public class GreetingController{

    @GetMapping()
    public String greeting(@RequestParam String timeOfDay){
        Greeting greeting = new Greeting("Anna", timeOfDay);
        return  greeting.getName() + " " + greeting.getTimeOfDay();
    }

    @GetMapping("/summer")
    public Celebration message(){
        return new Celebration("Happy summer solstice");
    }

}



