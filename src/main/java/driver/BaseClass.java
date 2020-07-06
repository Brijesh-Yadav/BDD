package driver;


public class BaseClass extends Driver{
	
	public void launchBrowser(String url){
		initializeDriver();
		System.out.println("launching "+url);
		driver.get(url);
	}
	
	public void closeBrowser(){
		driver.close();
	}

}
