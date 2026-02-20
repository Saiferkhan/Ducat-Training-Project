package utils;
import org.apache.maven.surefire.shared.utils.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	
	public static String takeScreenshot(WebDriver driver,String testName) {
		
		String timestamp = new SimpleDateFormat("YYYYMMDD_HHMMSS").format(new Date());
		String path="Screenshot/"+testName +" "+timestamp +".png";
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyDirectory(src, new File(path));
		}catch(IOException e){
			e.printStackTrace();
			
		}
		
		return path;
	}

}
