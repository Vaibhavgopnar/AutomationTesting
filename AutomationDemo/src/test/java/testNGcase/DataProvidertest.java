package testNGcase;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProvidertest {
	
	@DataProvider(name="create")
	public Object[][] datatest1(Method m)
	{
		Object[][] testdata = null;		
				if(m.getName().equals("test"))
				{
					testdata = new Object[][] {{"username", "password"},
											{"username1", "password1"},
											{"username2", "password2"},
											{"username3", "password3"}};
				}
				else if(m.getName().equals("test1"))
				{
					testdata = new Object[][] {{"username", "password","test"},
						{"username1", "password1","test1"},
						{"username2", "password2","test2"},
						{"username3", "password3","test3"}};
				}		
				return testdata;
	}
	
//	@DataProvider
//	public Object[][] datatest()
//	{
//		Object[][] dataset = new Object[4][2];
//		
//		dataset[0][0] = "user1";
//		dataset[0][1] = "pass1";
//		
//		dataset[1][0] = "user2";
//		dataset[1][1] = "pass2";
//		
//		dataset[2][0] = "user3";
//		dataset[2][1] = "pass3";
//		
//		dataset[3][0] = "user4";
//		dataset[3][1] = "pass4";
//		
//		return dataset;
//	}
}
