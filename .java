import java.awt.Desktop;
import java.net.URI;

public class MeeshoLauncher {
    public static void main(String[] args) {
        try {
            Desktop.getDesktop().browse(new URI("https://www.meesho.com"));
        } catch (Exception e) {
            System.err.println("Unable to open browser: " + e.getMessage());
        }
    }
}
