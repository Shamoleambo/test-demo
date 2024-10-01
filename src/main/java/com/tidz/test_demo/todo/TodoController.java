package com.tidz.test_demo.todo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	private final TodoRepository todoRepository;

	public TodoController(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	@GetMapping("/api/todos")
	public ResponseEntity<List<Todo>> findAll() {
		return new ResponseEntity<>(todoRepository.findAll(), HttpStatus.OK);
	}

}
