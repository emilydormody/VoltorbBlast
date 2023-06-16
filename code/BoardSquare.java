import javax.swing.*;
import java.awt.*;

public class BoardSquare extends JButton {

    public BoardSquare(int x, int y, boolean edge){
        this.setBackground(new Color(41, 133, 66));
        this.setSize(25,25);
        this.setOpaque(true);
        this.setText(String.valueOf(x+y));
        this.setBorder(BorderFactory.createLineBorder(Color.white, 5));

    }
}
