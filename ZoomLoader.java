import java.io.IOException;
//import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
//import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 


public class ZoomLoader extends LoaderGUI {
	public static String username;
	public static String password;
	public static ArrayList<String> links;
	public static ArrayList<String> time = new ArrayList<String>();

	public ZoomLoader(String un, String pwd, ArrayList<String> l) throws IOException, InterruptedException, AWTException {
		ZoomLoader.username = un;
		ZoomLoader.password = pwd;
		ZoomLoader.links = l;
	}
	
	//open zoom link change to method open link
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		//make sure that perm to open zoom is allowed
		//main method that runs code
		LoaderGUI gui = new LoaderGUI();
		gui.run();
		Thread.sleep(17000);
		new ZoomLoader(unm, pw, linkks);
		dailyZoomOpen();
	
	}
	//method for first time opening zoom which will log you in
	public static void firstLogin() throws IOException, InterruptedException, AWTException {
		openZoom(0);
		Thread.sleep(5000);
		//ssoOpener();
		Thread.sleep(5000);
		loginLoginer();
	}
	
	public static void openZoom(int period) throws IOException, AWTException, InterruptedException {
		if (links.get(period) != null){
		String test = links.get(period);
		java.awt.Desktop.getDesktop().browse(java.net.URI.create(test));
		Thread.sleep(3000);
		enterPress();
		}
	}
	
	//programming different button press/interactions
	public static void enterPress() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void tabPress() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	public static void pastePress() throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
//necesary with certain versions of the browser/zoom
/*	//open zoom app from link - goes to Rapid Identity
	public static void ssoOpener() throws AWTException, InterruptedException {	
		enterPress();
		Thread.sleep(2000);
		for (int i = 0; i < 4; i++) {
			tabPress();
	}
		enterPress();
		enterPress();
	}*/

	//pastes username and password into RapidId allowing you to log in
	public static void loginLoginer() throws AWTException, InterruptedException {
		StringSelection userSelection = new StringSelection(username);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(userSelection, null);
		Thread.sleep(3000);
		ZoomLoader.pastePress();
		ZoomLoader.enterPress();	
		Thread.sleep(1000);
		StringSelection passSelection = new StringSelection(password);
		Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard2.setContents(passSelection, null);
		ZoomLoader.pastePress();
		ZoomLoader.enterPress();	
	}
	
	//Method that runs through all code and checks the time and date to open certain links
	public static void dailyZoomOpen() throws IOException, InterruptedException, AWTException{

        Date day = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); 
        if (simpleDateformat.format(day).equals("Mon")){
        	    	
			while (true){
				time.add("09:59");
	        	time.add("10:39");
	        	time.add("11:19");
	        	time.add("11:59");
	        	time.add("13:14");
	        	time.add("13:54");
	        	time.add("14:34");    
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
				LocalDateTime now = LocalDateTime.now();  
				if (dtf.format(now).equals(time.get(0))) {
					System.out.println("test");
					firstLogin();
					Thread.sleep(60000);
				}
				for (int i = 1; i < 7; i++) {
					if (dtf.format(now).equals(time.get(i))) {
						openZoom(i);
						Thread.sleep(60000);
					}
				}
				time.clear();
			}
        }
        else if (simpleDateformat.format(day).equals("Tues") || simpleDateformat.format(day).equals("Thurs")){
        	time.add("08:59");
        	time.add("10:24");
        	time.add("12:19");
        	time.add("13:49");        	
			while (true){
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
				LocalDateTime now = LocalDateTime.now();  
				System.out.println(dtf.format(now)); 
				if (dtf.format(now).equals(time.get(0))) {
					firstLogin();
					Thread.sleep(60000);
				}
				for (int i = 1; i < 4; i++) {
					if (dtf.format(now) == time.get(i)) {
						openZoom(i);
						Thread.sleep(60000);
					}
				}
				time.clear();
			}
        }
        else if (simpleDateformat.format(day).equals("Wed")){
        	time.add("09:39");
        	time.add("12:19");
        	time.add("13:49");        	
			while (true){
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
				LocalDateTime now = LocalDateTime.now();  
				System.out.println(dtf.format(now)); 
				if (dtf.format(now).equals(time.get(0))) {
					firstLogin();
					Thread.sleep(60000);
				}
				for (int i = 1; i < 3; i++) {
					if (dtf.format(now).equals(time.get(i))) {
						openZoom(i+4);
						Thread.sleep(60000);
					}
				}
				time.clear();
			}
        }
        
        else if (simpleDateformat.format(day).equals("Fri")){
        	time.add("09:39");
        	time.add("11:04");
        	time.add("12:19");
        	time.add("13:49");        	
			while (true){
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
				LocalDateTime now = LocalDateTime.now();  
				System.out.println(dtf.format(now)); 
				if (dtf.format(now).equals(time.get(0))) {
					firstLogin();
					Thread.sleep(60000);
				}
				if (dtf.format(now).equals(time.get(7))) {
					openZoom(8);
					Thread.sleep(60000);
				}
				for (int i = 2; i < 3; i++) {
					if (dtf.format(now).equals(time.get(i))) {
						openZoom(i+4);
						Thread.sleep(60000);
					}
				}
				time.clear();
			}
        }
        


	}
	}

