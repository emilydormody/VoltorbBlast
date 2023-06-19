import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    private BoardSquare[][] board;
    public Board() {
        this.setSize(new Dimension(1100,700));
        this.setLayout(new BorderLayout());
        JPanel boardPanel = new JPanel(new GridLayout(6,6, 7,7));
        JPanel sidePanel = new JPanel(new GridLayout(2,1));
        boardPanel.setPreferredSize(new Dimension(700,700));
        boardPanel.setBackground(new Color(50, 168, 82));
        sidePanel.setPreferredSize(new Dimension(400,700));
        sidePanel.setBackground(Color.gray);
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
                if (x== 5 && y==5){}
                else{
                    boardPanel.add(square);
                    board[x][y] = square;}
                }

            }
        getContentPane().add(boardPanel, BorderLayout.CENTER);
        getContentPane().add(sidePanel, BorderLayout.EAST);
        setVisible(true);}




    public static void main(String[] argv){
        new Board();
    }
}
