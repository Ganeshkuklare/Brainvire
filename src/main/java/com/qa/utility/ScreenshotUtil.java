package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
    private static final String SCREENSHOT_DIR = "screenshots/";

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        // Ensure screenshot directory exists
        File screenshotDir = new File(SCREENSHOT_DIR);
        if (!screenshotDir.exists()) {
            screenshotDir.mkdir();
        }

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File(SCREENSHOT_DIR + screenshotName + ".png");

        try {
            Files.copy(srcFile.toPath(), destination.toPath());
            System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Failed to save screenshot: " + e.getMessage());
            e.printStackTrace();
        }
    }
}