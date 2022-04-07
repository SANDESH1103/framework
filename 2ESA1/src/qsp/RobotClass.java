package qsp;

import java.awt.AWTException;
import java.awt.Robot;

public class RobotClass {
	static {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\2ESA1\\driver\\chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("click on terminate button before the count of 25");
		Robot r1= new Robot();
        int y=50; int x=50;
        for(int i=0;i<25;i++) {
        	r1.mouseMove(x, y);
        	x=x+30;
        	y=y+30;
        	Thread.sleep(500);
        }
	}

}
