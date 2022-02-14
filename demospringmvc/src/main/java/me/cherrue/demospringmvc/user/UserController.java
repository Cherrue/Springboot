package me.cherrue.demospringmvc.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    //public @ResponseBody User Create(@RequestBody User user) {
    @PostMapping("/users/create")
    public /*@ResponseBody*/ User Create(@RequestBody User user) {
        return user;
    }
}
