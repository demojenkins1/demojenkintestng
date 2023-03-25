package demo.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoTest {
  
	
		
  @BeforeTest
  public void beforeTest() {
     System.out.println("Before Test ....");
      
  }
  
  
  @Test
  public void test1() throws InterruptedException {
	  System.out.println("Executing Test ....");
	  Assert.assertEquals(false,false);
	  
	  System.out.println("Executing Test without any sleep....");
	  Assert.assertEquals(false,false);
  
  }
  
  
  
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test ....");
  }

}
