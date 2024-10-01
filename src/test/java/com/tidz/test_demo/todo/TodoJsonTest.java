package com.tidz.test_demo.todo;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class TodoJsonTest {

	@Test
	void shouldCompareJson() throws JSONException {
		var data = getRestData();
		var expected = """
					{
					"todos": [
						{
							"name": "TEST 1",
							"completed": true
						},
						{
							"name": "TEST 2",
							"completed": true
						}
					]
				}
				""";

		JSONAssert.assertEquals(expected, data, false);

	}

	private String getRestData() {
		return """
				{
					"todos": [
						{
							"completed": true,
							"name": "TEST 1"
						},
						{
							"completed": true,
							"name": "TEST 2"
						}
					]
				}
				""";
	}

}
