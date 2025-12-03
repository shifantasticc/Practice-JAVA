import java.awt.BorderLayout;
import javax.swing.*;

public class Border {

    JFrame f1;

    Border() {
        f1 = new JFrame();
        
        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");

        f1.add(b1, BorderLayout.NORTH);
        f1.add(b2, BorderLayout.SOUTH);
        f1.add(b3, BorderLayout.EAST);
        f1.add(b4, BorderLayout.WEST);
        f1.add(b5, BorderLayout.CENTER);

        f1.setSize(500,500);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new Border();
    }
}
