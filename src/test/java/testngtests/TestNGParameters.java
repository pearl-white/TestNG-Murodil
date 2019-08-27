package testngtests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
 
  @Test
  @Parameters({"UserName","Password"})
  public void login(String userName,String password) {
	  System.out.println("Logging in using :"+userName+"/"+password );
  }
}
