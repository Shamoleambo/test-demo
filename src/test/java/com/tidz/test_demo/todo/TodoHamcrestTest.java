package com.tidz.test_demo.todo;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

public class TodoHamcrestTest {

	@Test
	void shouldCreateNewTodo() {
		var test1 = new Todo("TEST", true);
		var test2 = new Todo("TEST", true);

		assertThat(test1, equalTo(test2));
	}

}
