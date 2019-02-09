package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	@Test(dataProvider="getdata")//method name of the data provider annotation
	public void weblogin(String Uname, String Pwd){
		System.out.println("weblogin");
		System.out.println(Uname);
		System.out.println(Pwd);
	}
	@Test
	public void Mobilelogin(){
		System.out.println("mobilelogin");
	}
	@Test(dependsOnMethods={"weblogin"})
	public void APIlogin(){
		System.out.println("APIlogin");
	}
	
	//we need to create data provider set with@data provider annotation
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="user1";
		data[0][1]="pwd1";
		
		//2nd set
		data[1][0]="user2";
		data[1][1]="pwd2";
		
		//2nd set
		data[2][0]="user3";
		data[2][1]="pwd3";
		return data;
		
		
	}
}
