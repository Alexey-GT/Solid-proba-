package SOLID;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    public static void logData(String msg) {
        Date currentTime = new Date();
        try (FileWriter writer = new FileWriter("C:\\Users\\Alexey\\Desktop\\SOLID\\src\\main\\java\\SOLID\\Log.log", true)) {
            StringBuilder sb = new StringBuilder();
            sb.append(currentTime.toString() + ": " + msg + "\n");
            writer.append(sb);
            writer.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
