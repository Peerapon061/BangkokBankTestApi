package bbl.testapi.bblTest.Controller;

import bbl.testapi.bblTest.Entity.User;
import bbl.testapi.bblTest.Service.UserService;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Integer userId){
        return userService.getUser(userId);
    }

    @PostMapping
    public User createUser(@Valid @RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Integer userId,@Valid @RequestBody User user){
        return userService.updateUser(userId,user);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer userId){
        userService.deleteUser(userId);
        return ResponseEntity.ok("Deleted!!!");
    }
}
