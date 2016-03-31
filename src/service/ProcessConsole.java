package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessConsole {
	
	public String exec(String command) {
		StringBuilder toSend = new StringBuilder();
		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			InputStream s = p.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(s));
			String temp;
			while ((temp = in.readLine()) != null) {
			    toSend.append(temp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return toSend.toString();
	}
}
