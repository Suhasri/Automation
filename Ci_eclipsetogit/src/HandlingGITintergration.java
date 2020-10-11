

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class HandlingGITintergration {
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"D:\\suha\\Java tutorial\\Jar\\Browser driver\\chromedriver_win32\\chromedriver.exe");
			
			//to execute the program from backend
			ChromeOptions obj1= new ChromeOptions();
			//obj1.addArguments("--headless");
			obj1.addArguments("--start-maximized");//to open the window maximized
			
			WebDriver driver = new ChromeDriver(obj1); // launch browser
			
			driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/Login.aspx");
			 WebElement username= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]"));
			 username.sendKeys("Tester");
			 WebElement password= driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]"));
			 password.sendKeys("test");
			 WebElement login=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]"));
			 login.click();
			 System.out.println(driver.getTitle());
			 System.out.println("test");
			 
		}
	}
	


