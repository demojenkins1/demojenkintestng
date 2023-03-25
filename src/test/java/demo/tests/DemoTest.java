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
  public void f() {
	  System.out.println("Executing Test ....");
	  Assert.assertEquals(false,false);
  }
  
  
  
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test ....");
  }

}
