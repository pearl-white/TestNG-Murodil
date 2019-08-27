package testngselenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.ExcelUtils;

public class GoogleSearch {
  
  @Test
  public void search() {
		System.out.println("SEARCHING....");
  }
  
  @Test(dataProvider="data")
  //@Parameters({"UserName","Password"})
  public void loginToGoogleAccount(String userName,String password){
	  System.out.println("Login to account using: "+userName+"/"+password);
  }
  
 
  @DataProvider(name="data")
  public Object[][] getData(){
	  ExcelUtils.openExcelFile("./src/test/resources/GoogleTestData.xlsx", "Users");
	  int rowsCount=ExcelUtils.getUsedRowsCount();
	  
	  String[][] users=new String[rowsCount-1][2];
	  
	  for(int rowNum=1;rowNum<rowsCount;rowNum++){
		  for(int colNum=0;colNum<2;colNum++){
			  users[rowNum-1][colNum]=ExcelUtils.getCellData(rowNum, colNum);
		  }
	  }
	  
	  
	  return users;
  }
  
}
