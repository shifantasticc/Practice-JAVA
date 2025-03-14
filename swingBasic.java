import javax.swing.*;

public class swingBasic extends JFrame{
    swingBasic(String s) {
        super(s);
    }
    swingBasic() {

    }

    public static void main(String[] args) {
        // 2: extending JFrame in Class
        swingBasic s1 = new swingBasic("WELCOME TO X");
        s1.setSize(500, 500);
        s1.setVisible(true);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // 1: using JFrame object
    // public static void main(String[] args) {
    //     JFrame j1 = new JFrame("WELCOME TO X");
    //     j1.setSize(500, 500);
    //     j1.setVisible(true);
    //     j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // }
}
