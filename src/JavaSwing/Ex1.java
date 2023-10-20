package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1 extends JFrame implements ActionListener {
    JFrame jf;
    JLabel l;
    JTextField t1,t2,t3;
    JButton b;
    Ex1(){
        setTitle("Demo");
        setSize(400,400);
        t1=new JTextField();
        t1.setBounds(10,10,170,30);
        t2=new JTextField();
        t2.setBounds(10,50,170,30);
        t3=new JTextField();
        t3.setBounds(10,100,170,30);
        add(t1);
        add(t2);
        add(t3);
        b=new JButton("OK");
        b.setBounds(10,150,70,30);
        add(b);
        b.addActionListener(this);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Ex1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n;
        //String num1=t1.getText();
        //String num2=t2.getText();
        //str1=Integer.parseInt(num1);
        //str2=Integer.parseInt(num2);
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        if(e.getSource()==b){
            n=n1+n2;
            t3.setText(String.valueOf(n));
            t3.setEditable(false);


        }
    }
}
