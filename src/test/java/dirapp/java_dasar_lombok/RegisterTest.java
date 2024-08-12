package dirapp.java_dasar_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest {

  @Test
  void testWith() {

    var register1 = new Register("dira", "Test");
    var register2 = register1.withUsername("sanjaya");

    Assertions.assertEquals(register1.getPassword(), register2.getPassword());
    Assertions.assertNotEquals(register1.getUsername(), register2.getUsername());

  }
}