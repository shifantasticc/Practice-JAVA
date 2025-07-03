import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout {

    JFrame f1;

    FlowLayout() {
        f1 = new JFrame("Flow Layout Example");
        
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");

        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);        
        f1.add(b6);
        
        f1.setLayout(new FlowLayout(FlowLayout.CENTER));

        f1.setSize(300, 300);
        f1.setVisible(true);

        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public static void main(String[] args) {
        new FlowLayout();
    }
}
