package dirapp.java_dasar_lombok;

import lombok.Value;
import lombok.With;

@Value
@With
public class Register {

  String username;

  String password;

}
