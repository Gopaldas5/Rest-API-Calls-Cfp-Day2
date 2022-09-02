package com.bridgelabz.hello_rest_api_call_day2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

//    http://localhost:8080/hell
    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello From BridgeLabz";
    }
//    http://localhost:8080/hello/query?name=Gopal
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello"+ " " + name + "!";
    }
//    http://localhost:8080/hello/param/Gopal
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello" + " " + name + "!";

    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello" + user.getFirstName() + " " + user.getLastName() + "!";

    }
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello" + firstName + " " + lastName + "!";
    }
}
