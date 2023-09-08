package gaubiz.GG24.controller;

import gaubiz.GG24.model.Todo;
import gaubiz.GG24.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/todoyn")
    public ResponseEntity<?> updateTodo(
        @RequestBody Todo todo
    ){
        return todoService.updateTodo(todo);
    }
}
