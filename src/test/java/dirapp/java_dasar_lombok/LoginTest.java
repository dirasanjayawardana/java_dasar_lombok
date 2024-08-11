package dirapp.java_dasar_lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

  @Test
  void testCreate() {
    var login1 = Login.createEmpty();

    Assertions.assertNull(login1.getUsername());
    Assertions.assertNull(login1.getPassword());

    var login2 = Login.create("dira", "testing");

    Assertions.assertEquals("dira", login2.getUsername());
    Assertions.assertEquals("testing", login2.getPassword());
  }

  @Test
  void testToString() {
    var login = Login.create("dira", "testing");
    System.out.println(login);
  }
}