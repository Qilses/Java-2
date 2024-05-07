import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

public class test2 {
    public static void main(String[] args) {
         try { 
         URL url = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");  // Input URL
         FileOutputStream out = new FileOutputStream(new File("out.png"));  // Output file
         out.write(url.openStream().readAllBytes());
         out.close();
        }
        catch (Exception e) {
            
        }
    }
}
