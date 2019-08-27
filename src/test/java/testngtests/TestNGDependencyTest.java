package testngtests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependencyTest {
  @Test
  public void launchDriver() {
	  System.out.println("Launching driver");
	  Assert.assertTrue(true);
  }
  
  @Test(dependsOnMethods={"launchDriver"} )
  public void login() {
	  System.out.println("Logging in");
  }
  
  @Test(dependsOnMethods={"login"})
  public void logout() {
	  System.out.println("Logging out");
  }
}
