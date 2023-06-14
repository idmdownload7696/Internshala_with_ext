package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseFile;

public class Utility extends BaseFile{
		
		static ExtentTestNGITestListener extent_test_listener;
		public static void CaptureScreenShot(String path) throws IOException {
			extent_test_listener = new ExtentTestNGITestListener();
			TakesScreenshot takescreenshot= (TakesScreenshot) driver;
			FileUtils.copyFile(takescreenshot.getScreenshotAs(OutputType.FILE), new File(path));
			
		}

}
