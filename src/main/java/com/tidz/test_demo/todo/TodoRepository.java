package com.tidz.test_demo.todo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {

	private static final Logger log = LoggerFactory.getLogger(TodoRepository.class);
	List<Todo> todos = new ArrayList<>();

	public TodoRepository() {
		todos = List.of(new Todo("test 1", true), new Todo("test 2", true));
	}

	List<Todo> findAll() {
		log.info("TodoRepository findAll called");
		return todos;
	}

}
