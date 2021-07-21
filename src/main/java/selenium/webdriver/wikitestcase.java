package selenium.webdriver;

public class wikitestcase {
	public static WebDriver driver;

	@BeforeClass
		public static void setup()
		{
			
	         System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (12)\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();  // maximize the browser window
			
			driver.manage().deleteAllCookies();  // delete cookies on the browser
			
		
			
			driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium		+%28software%29");
		
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			// implicit wait
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			
			
		}
		@Test(priority='1')
		public void createAccount() throws InterruptedException
		{
			// test steps to perform testcase goes here
			
	        
			driver.findElement(By.id("wpName2")).sendKeys("Username1");	
			
			Thread.sleep(3000);
			
			// Inspect password textbox and enter data in the text box
			driver.findElement(By.name("wpPassword")).sendKeys("password@123");
			
			WebElement e= driver.findElement(By.xpath("//button[@value='Create your account']"));
			
			// if we add 
		
			Thread.sleep(10000);// waiting until 10 seconds
			
			e.click();	
			
		}
		
	@AfterClass
		public void closebrowser()
		{
			driver.close();
		}
}
