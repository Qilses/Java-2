import java.io.FileWriter;

public class test {
    public static void main(String[] args) {
       int i = 0;
       String Bibel = "Bibel.text";
       
        if (i < 100) {
                try {
                     FileWriter writer = new FileWriter(Bibel);
                  
                     writer.write("Hello world");

                     writer.close();
                } catch (Exception e) {}
            }
        }
        
    }

