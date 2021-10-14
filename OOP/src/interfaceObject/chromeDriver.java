package interfaceObject;

public class chromeDriver implements WebDriver {

	@Override
	public void findElements() {
		
		System.out.println("findElements in Chrome");
		
	}

	@Override
	public void sendKeys() {
		
		System.out.println("sendKeys in Chrome");
		
	}

	@Override
	public void getText() {
		
		System.out.println("getText in Chrome");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
