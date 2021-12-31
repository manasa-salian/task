package genericLib;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Propertyfiles implements AutoConstants {
	public String getPropertyData( String key) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(propertyFile));
		return p.getProperty(key);
	}

}
