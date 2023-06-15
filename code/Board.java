import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    private BoardSquare[][] board;
    public Board() {
        this.setSize(new Dimension(700,700));
        this.setLayout(new GridLayout(6,6));
        this.setBackground(new Color(41, 133, 66));
        // 41, 133, 66
        board = new BoardSquare[6][6];
        for (int x=0; x<6; x++){
            for (int y=0; y<6; y++){
                BoardSquare square = null;
                if (x==5 || y==5){
                    square = new BoardSquare(x,y, true);}
                else{
                    square = new BoardSquare(x,y,false);}
                square.setBackground(new Color(50, 168, 82));
                square.add(new JLabel(String.valueOf(x+y)));
                square.setBorder(new RoundBorder());
                getContentPane().add(square);
                board[x][y] = square;
                }

            }
        setVisible(true);}




    public static void main(String[] argv){
        new Board();
    }
}
