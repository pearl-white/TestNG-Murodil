package testngtests;

import org.testng.annotations.Test;

public class TestNGGroups {
  
  @Test(groups={"fruits"})
  public void apples() {
	  System.out.println("Apples");
  }
  @Test(groups={"fruits"},dependsOnMethods={"apples","oranges"})
  public void grapes() {
	  System.out.println("grapes");
  }
  @Test(groups={"fruits"})
  public void oranges() {
	  System.out.println("oranges");
  }
  @Test(groups={"fruits"})
  public void cucumbers() {
	  System.out.println("cucumbers");
  }
  
  @Test(groups={"pets"})
  public void cats(){
	  System.out.println("cats");
  }
  
  @Test(groups={"pets"})
  public void fish(){
	  System.out.println("fish");
  }
  
  @Test(groups={"pets"})
  public void dogs(){
	  System.out.println("dogs");
  }
}
