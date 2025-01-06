package tech.bisew.isdb.fourteenthClass;

import java.util.Map;
import java.util.Properties;

public class SystemPropertiesDemo {
    public static void main(String[] args) {
        // Get all system properties
        Properties properties = System.getProperties();

        // Iterate through the properties and print them
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

