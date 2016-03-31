package service;

public class Main {
	// This piece of code works for hotmail account
	public static String USER = "your-email@hotmail.com"; //Your complete hotmail address;
	public static String PASSWORD = "your-password"; //Your password related to this address 
	public static String RECEIVER =  "any-email@any.com";//The receiver's email address;
	public static String SUBJECT = "Control computer"; //Message'subject
	
	
	public static void main(String[] args) {
		Mail mail = new Mail(USER, PASSWORD);
		ProcessConsole pro = new ProcessConsole();
		try {
			String[] to = {RECEIVER};
			mail.setTo(to);
			mail.setFrom(USER);
			mail.setSubject(SUBJECT);
			mail.setBody(pro.exec("ifconfig"));//ipconfig for windows
			mail.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
