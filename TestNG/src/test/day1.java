package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
   
	@BeforeTest
	public void demo1(){
		System.out.println("I will exicute 1st");
	}
	@Test(groups={"smoke"})
	public void demo2(){
		System.out.println("demo2");
	}
}
