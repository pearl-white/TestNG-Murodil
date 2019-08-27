package testngtests;

import static org.testng.Assert.fail;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGPrioritizingTests {
	
  @Test(priority=0)
  @Parameters({"UserName"})
  public void one(String arg) {
	  System.out.println("One-"+arg);
	  //fail();
  }
  
  @Test(priority=1,dependsOnMethods={"one"})
  public void two() {
	  System.out.println("Two");
  }
  
  @Test(priority=2,enabled=false)
  public void three() {
	  System.out.println("Three");
  }
  
  @Test(priority=3)
  public void four() {
	  System.out.println("Four");
  }
}
