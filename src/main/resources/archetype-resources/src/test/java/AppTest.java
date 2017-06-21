package $package;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.log4j.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Unit test for simple App.
 */
@RunWith(JUnitPlatform.class)
public class AppTest {
  
  private static final Logger log = Logger.getLogger(AppTest.class);

  private App classUnderTest;

  @BeforeEach
  void setUp() {
    classUnderTest = new App();
  }

  @Test
  @DisplayName("assertAll on a bunch of Strings should succeed.")
  public void doIt() {
    log.info("Testing doIt()...");
    assertAll(
        () -> assertEquals("String", classUnderTest.doIt("String")),
        () -> assertEquals("StringToo", classUnderTest.doIt("StringToo")),
        () -> assertEquals("String2", classUnderTest.doIt("String2")),
        () -> assertEquals("StringAlso", classUnderTest.doIt("StringAlso")));
  }

}
