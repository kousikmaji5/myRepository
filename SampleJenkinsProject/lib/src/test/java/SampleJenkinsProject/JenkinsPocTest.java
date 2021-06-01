package SampleJenkinsProject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JenkinsPocTest {

	public JenkinsPoc poc;

	@BeforeEach
	public void setUp() {
		poc = new JenkinsPoc();
	}

	@Test
	public void testOdd() {
		String check = poc.oddEven(5);
		Assertions.assertEquals(check, "Odd");
	}

	@Test
	public void testEven() {
		String check = poc.oddEven(6);
		Assertions.assertEquals(check, "Even");
	}

	@AfterEach
	public void tearDown() {
		poc = null;
	}

}
