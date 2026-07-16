import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://students.grayfrost.app/login?organizationId=18876027-0be7-4fa9-afd2-4b9334a6e1c7");
		driver.findElement(By.name("emailOrMobile")).sendKeys("Tejasva@gail.com");
		driver.findElement(By.name("password")).sendKeys("Joshi");
		driver.findElement(By.className("sc-a8a157a3-2")).click();
			

	}

		
	}


