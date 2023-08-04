package mit.com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {

	public static File file;
	public static FileInputStream fileInput = null;
	public static Properties prop;

	public configReader() {

		file = new File(System.getProperty("user.dir") + "\\Configs\\Configuation.properties");

		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUsername() {
		String username = prop.getProperty("UserName");
		return username;
	}

	public String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}

	public String getScrectKey() {
		String scretkey = prop.getProperty("SecretKey");
		return scretkey;
	}
	public String getSendTo(){
		return prop.getProperty("SentTo");
	}
	public String getSendForm(){
		return prop.getProperty("SendFrom");
	}
	public String getEmailPassword(){
		return prop.getProperty("Emailpassword");
		
	}
}
