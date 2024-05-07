import java.io.FileWriter;
import java.io.IOException;
// import java.util.Scanner;


public class FinPro {
    public static void main(String[] args) {        
        String fileName = "FileName.java";
        if (!fileName.equals("1")) {
        try {
            // Skapar en sån kallad "FileWriter". Vilket gör att koden kan skappa en fil på din dator utan att installera det från internet.
            FileWriter writer = new FileWriter(fileName);
            // Här ät koden som skriver man utt texten
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
            // Stänger FileWriter
            writer.close(); 
            System.out.println("Txt fillen skapades: " + fileName);
        } catch (IOException e) {
            System.err.println("Ett fel uppstog: " + e.getMessage());
            e.printStackTrace();
        }
        FileName.main(null);
        }
}
}
