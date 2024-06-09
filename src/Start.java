import javax.swing.*;
import java.awt.*;

public class Start {

    public JFrame window;

    static Start startGame(JFrame window){
        window = new JFrame("ZeroX");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        return null;
    }

}
