package com.tidz.test_demo.todo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class TodoAssertJTest {

	@Test
	void shouldCreateNewTodo() {
		var test = new Todo("TEST", true);

		assertThat(test.name()).isEqualTo("TEST");
		assertThat(test.name()).startsWithIgnoringCase("t").endsWith("T").contains("ES").isEqualToIgnoringCase("test");
	}

}
