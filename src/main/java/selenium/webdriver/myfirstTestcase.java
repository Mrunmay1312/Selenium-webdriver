package selenium.webdriver;

public class myfirstTestcase {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
	        WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("wpName2")).sendKeys("sonal");
	 
	           //   Now use XPATH to write the locator value.

	           // Add wait time
			By.xpath("//a[@class='myfirstTestcase']"
			WebDriverWait wait = new WebDriverWait(driver, 10);
		}
	}
