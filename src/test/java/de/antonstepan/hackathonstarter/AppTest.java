package de.antonstepan.hackathonstarter;

import static org.assertj.core.api.Assertions.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
  /**
   * Create the test case
   *
   * @param testName
   *          name of the test case
   */
  public AppTest(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(AppTest.class);
  }

  public void testApp() {
    assertThat("foobar").startsWith("foo")
        .endsWith("bar")
        .isEqualTo("foobar");
  }
}
