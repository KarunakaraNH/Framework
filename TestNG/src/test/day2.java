package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day2 {
@Test
	public void demo3(){
		System.out.println("I can become false");
	Assert.assertTrue(false);
		
	}
@Test(groups={"smoke"})
	public void demo4(){
		System.out.println("this is demo4");
	}
@Test(groups={"Regression"})

public void demo77(){
	System.out.println("this is 77 demo");
}
}
