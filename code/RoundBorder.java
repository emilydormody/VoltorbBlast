import javax.swing.border.Border;
import java.awt.*;

public class RoundBorder implements Border {

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, 10, 10);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(11, 11, 12, 10);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
}
