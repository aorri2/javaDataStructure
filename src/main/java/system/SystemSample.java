package system;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemSample {
    public static void main(String[] args) {
        SystemSample sample = new SystemSample();
        Map<String, String> getenv = System.getenv();
        Set<Map.Entry<String, String>> entries = getenv.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String value = entry.getValue();
            System.out.println(value);
        }
    }
}
