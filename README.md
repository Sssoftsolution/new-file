import java.awt.Desktop;
import java.net.URI;

public class MeeshoLauncher {
    public static void main(String[] args) {
        try {
            URI url = new URI("https://www.meesho.com");
            Desktop.getDesktop().browse(url);
        } catch (Exception e) {
            System.out.println("Error opening browser: " + e.getMessage());
        }
    }
}
