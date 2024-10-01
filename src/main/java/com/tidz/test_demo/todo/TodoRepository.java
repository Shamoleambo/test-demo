package com.tidz.test_demo.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {

	List<Todo> todos = new ArrayList<>();

	public TodoRepository() {
		todos = List.of(new Todo("test 1", true), new Todo("test 2", true));
	}

	List<Todo> findAll() {
		return todos;
	}

}
