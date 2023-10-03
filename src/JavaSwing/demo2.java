package JavaSwing;
import javax.swing.*;
import java.awt.*;
public class demo2 extends JFrame {
    demo2(){
        setTitle("Testing");
        getContentPane().setBackground(Color.black);
        JButton b=new JButton("click");
        add(b);
        b.setBounds(300,100,300,50);
        setBounds(100,100,600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new demo2();

    }
}
