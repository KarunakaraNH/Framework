package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
   
	@Test(enabled=false)//to skip this method
	public void webloan(){
		System.out.println("webloan");
	}
	@Parameters({"URL"})
	@Test
	public void Webcar( String urlname){
		System.out.println("webcar");
		System.out.println(urlname);
	}
	@Test
	public void webAPI(){
		System.out.println("webapi");
	}
	
}
