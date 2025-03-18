package contact;

import org.testng.annotations.Test;

public class UpdateContactTest 
{
	@Test
	public void updateContactTest() {
		
		System.out.println("Updated Contact1");
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
	}

}
