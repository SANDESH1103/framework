package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class KeyboardControl {
	
	public static void main(String[] args) throws IOException, AWTException {
		Runtime.getRuntime().exec("notepad");
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_Q);
		r1.keyPress(KeyEvent.VK_S);

       r1.keyRelease(KeyEvent.VK_SHIFT);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyPress(KeyEvent.VK_1);
		
		
		

	}

}
