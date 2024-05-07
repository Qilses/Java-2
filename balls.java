
import java.net.URI;
import java.awt.Desktop;
import javax.swing.*;

public class balls {
        

        public static void main(String[] args) {
                JOptionPane.showMessageDialog(null,
                "New browser tab will open", "Warning", JOptionPane.WARNING_MESSAGE);
               String url = "https://www.google.se/?hl=sv&safe=active&ssui=on";
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();

        }
}
}

