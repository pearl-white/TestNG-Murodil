package testngtests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {
 
  @Test
  public void assertionTest() {
	  System.out.println("Before hard assertion");
	  Assert.assertEquals(10, 10);
	  System.out.println("After hard assertion");
  }
  
  @Test
  public void softAssertionTest(){
	  SoftAssert softAssert=new SoftAssert();
	  System.out.println("Before soft assertion");
	  softAssert.assertEquals(30, 300);
	  System.out.println("After soft assertion");
	  
	  softAssert.assertAll();
  }
  
}
