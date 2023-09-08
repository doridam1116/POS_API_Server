package gaubiz.GG24.service.logic;

import gaubiz.GG24.model.Todo;
import gaubiz.GG24.repository.TodoRepository;
import gaubiz.GG24.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceLogic implements TodoService {
    private final TodoRepository todoRepository;

    public TodoServiceLogic(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public ResponseEntity<?> updateTodo(Todo todo) {
        int result = todoRepository.updateTodo(todo);
        if(result > 0) {
            return ResponseEntity.ok().body("성공");
        }else {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("실패");
        }
    }
}
