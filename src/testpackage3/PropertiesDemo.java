package testpackage3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
  public static void printOutSysytemProperties() {
    Properties properties = System.getProperties();
    Enumeration<String> keys = (Enumeration<String>) properties.propertyNames();
    while (keys.hasMoreElements()) {
      String key = keys.nextElement();
      System.out.println(key + " : " + properties.getProperty(key));
    }
  }

  public static void main(String[] args) {
    printOutSysytemProperties();
  }
}
