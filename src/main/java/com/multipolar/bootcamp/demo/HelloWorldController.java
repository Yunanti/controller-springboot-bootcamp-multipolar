package com.multipolar.bootcamp.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

//    http://localhost:8080/api/name?yourName=Yuna
    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World");
    }

//    http://localhost:8080/api/name?yourName=Yuna
    @GetMapping("/name")
    public ResponseEntity<String> helloName(@RequestParam String yourName){
        return ResponseEntity.ok("Hello " + yourName);
    }

//    http://localhost:8080/api/name/Yuna
    @GetMapping("/name/{yourName}")
    public ResponseEntity<String> helloNameSegment(@PathVariable String yourName){
        return ResponseEntity.ok("Hello " + yourName);
    }

    //    http://localhost:8080/api/todos
    @GetMapping("/todos")
    public ResponseEntity<List<Todo>> todos(){
        List<Todo> todoList = List.of(
                new Todo(1, "Learning"),
                new Todo(2, "Coding")
        );
        return ResponseEntity.ok(todoList);
    }
}
