package gaubiz.GG24.service;

import gaubiz.GG24.model.Todo;
import org.springframework.http.ResponseEntity;

public interface TodoService {
    ResponseEntity<?> updateTodo(Todo todo);
}
