package com.outh2.integration.github_integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class GithubIntegrationApplicationTests {

	class Calculator {
		int add(int a, int b) {
			return a+ b;
		}
	}

	Calculator calculator = new Calculator();

	@Test
	void itShouldAddNumbers() {
	  int numOne = 10;
	  int numTwo = 20;

	  int result = calculator.add(numOne, numTwo);
	  Assertions.assertThat(result).isEqualTo(30);
	}

}
