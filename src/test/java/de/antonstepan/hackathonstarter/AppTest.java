package de.antonstepan.hackathonstarter;

import static org.assertj.core.api.Assertions.*;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
 
  @Test
  public void testApp() {
    assertThat("foobar").startsWith("foo")
        .endsWith("bar")
        .isEqualTo("foobar");
  }
}
