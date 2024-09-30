package com.tidz.test_demo.todo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TodoJunitTest {

	@Test
	void shouldCreateNewTodo() {
		var test = new Todo("TEST", true);

		assertEquals("TEST", test.name(), "Todo name was not equal to TEST");
		assertTrue(test.completed());
	}
}
