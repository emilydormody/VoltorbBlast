import javax.swing.*;
import java.awt.*;

public class BoardSquare extends JButton {
    private int x,y;

    public BoardSquare(int x, int y, boolean edge){
        this.x = x;
        this.y = y;
        this.setSize(25,25);
        this.setOpaque(true);
        this.setBorder(BorderFactory.createLineBorder(Color.white, 5));
        if (edge){
            setColor();}
        else{this.setBackground(new Color(41, 133, 66));}

    }
    private void setColor(){
        if ((x==0 && y==5) || (y==0 && x ==5)){
            this.setBackground(new Color(245, 110, 69));
        }
        else if ((x==1 && y==5) || (y==1 && x==5)){
            this.setBackground(new Color(53, 194, 14));
        }
        else if ((x==2 && y==5) || (y==2 && x==5)){
            this.setBackground(new Color(245, 210, 69));
        }
        else if ((x==3 && y==5) || (y==3 && x==5)){
            this.setBackground(new Color( 69, 157, 245));
        }
        else if ((x==4 && y==5) || (y==4 && x==5)){
            this.setBackground(new Color( 192, 69, 245));
        }
    }
}
