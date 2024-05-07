import java.io.FileWriter;
import java.io.IOException;

public class test3{
    public static void main(String[] args) {
                String fileName = "FileName.java";

        try {
            // Create a FileWriter object
            FileWriter writer = new FileWriter(fileName);

            // Write some text to the file
            writer.write("\r\n" + //
                                "import java.net.URI;\r\n" + //
                                "import java.awt.Desktop;\r\n" + //
                                "import javax.swing.*;\r\n" + //
                                "\r\n" + //
                                "public class FileName {\r\n" + //
                                "        \r\n" + //
                                "\r\n" + //
                                "        public static void main(String[] args) {\r\n" + //
                                "                JOptionPane.showMessageDialog(null,\r\n" + //
                                "                \"New browser tab will open\", \"Warning\", JOptionPane.WARNING_MESSAGE);\r\n" + //
                                "               String url = \"https://www.google.se/?hl=sv&safe=active&ssui=on\";\r\n" + //
                                "        try {\r\n" + //
                                "            Desktop.getDesktop().browse(new URI(url));\r\n" + //
                                "        } catch (Exception e) {\r\n" + //
                                "            e.printStackTrace();\r\n" + //
                                "\r\n" + //
                                "        }\r\n" + //
                                "}\r\n" + //
                                "}\r\n" + //
                                "\n");
            
            // Close the FileWriter
            writer.close();
            
            System.out.println("Text file created successfully: " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}