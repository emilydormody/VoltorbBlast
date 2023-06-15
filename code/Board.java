import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    private BoardSquare[][] board;
    public Board() {
        this.setSize(new Dimension(700,700));
        this.setLayout(new FlowLayout());
        JPanel panel = new JPanel(new GridLayout(6,6));
        panel.setBackground(Color.red);
        panel.setPreferredSize(new Dimension(700,700));
        //new Color(41, 133, 66) new Color(50, 168, 82)
        // 41, 133, 66
        board = new BoardSquare[6][6];
        for (int x=0; x<6; x++){
            for (int y=0; y<6; y++){
                BoardSquare square = null;
                if (x==5 || y==5){
                    square = new BoardSquare(x,y, true);}
                else{
                    square = new BoardSquare(x,y,false);}
                square.setBackground(Color.orange);
                square.setOpaque(true);
                square.add(new JLabel(String.valueOf(x+y)));
                if (x+y%2 ==0 ){
                    square.setBorder(BorderFactory.createLineBorder(Color.white, 5));}
                else{
                    square.setBorder(BorderFactory.createLineBorder(Color.black, 5));
                }
                panel.add(square);
                board[x][y] = square;
                }

            }
        getContentPane().add(panel);
        setVisible(true);}




    public static void main(String[] argv){
        new Board();
    }
}
