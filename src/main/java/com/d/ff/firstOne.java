package com.d.ff;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class firstOne {
	
  @Test
  public void test1() {
	  System.out.println("first test");
  }
  
  @Test
  public void test2() {
	  System.out.println("second test");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

}
