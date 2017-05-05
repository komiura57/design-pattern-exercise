import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    private Properties properties = new Properties();

    public void readFromFile(String filename) throws IOException {
        File file = new File(filename);
        InputStream in = new FileInputStream(file);
        properties.load(in);
    }

    public void writeToFile(String filename) throws IOException {
        File file = new File(filename);

        OutputStream out = new FileOutputStream(file);

        String header = "written by FileProperties";
        properties.store(out,header);

    }
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
