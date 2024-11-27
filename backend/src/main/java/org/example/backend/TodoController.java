package org.example.backend;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @GetMapping
    List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }
}