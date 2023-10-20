package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator implements ActionListener {

    JFrame jf;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;

    Calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setBounds(5,30,450,450);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1=new JLabel("First Number:");
        l2=new JLabel("Second Number:");
        l3=new JLabel("Result:");
        l1.setBounds(10,20,200,30);
        l1.setFont(new Font("Verdana", Font.BOLD, 14));
        jf.add(l1);
        l2.setBounds(10,45,200,30);
        l2.setFont(new Font("Verdana",Font.BOLD,14));
        jf.add(l2);
        l3.setBounds(10,70,200,30);
        l3.setFont(new Font("Verdana",Font.BOLD,14));
        jf.add(l3);
        t1=new JTextField();
        t1.setBounds(150,20,210,30);
        jf.add(t1);
        t2=new JTextField();
        t2.setBounds(150,50,210,30);
        jf.add(t2);
        t3=new JTextField();
        t3.setBounds(150,80,210,30);
        jf.add(t3);
        b1=new JButton("Addition");
        b1.setBounds(150,120,100,30);
        jf.add(b1);
        b2=new JButton("Subtraction");
        b2.setBounds(260,120,100,30);
        jf.add(b2);
        b3=new JButton("Multiply");
        b3.setBounds(150,160,100,30);
        jf.add(b3);
        b4=new JButton("Divide");
        b4.setBounds(260,160,100,30);
        jf.add(b4);
        jf.getContentPane().setBackground(Color.blue);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public static void main(String[] args) {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
            int num1,num2,num3;
            String str1=t1.getText();
            String str2=t2.getText();
            num1=Integer.parseInt(str1);
            num2=Integer.parseInt(str2);
            if(e.getSource()==b1)
            {
                num3 = num1 + num2;
                //t3.setText(" "+num3);
                t3.setText(String.valueOf(num3));
                t3.setEditable(false);
            }
            if(e.getSource()==b2)
            {
                num3 = num1 - num2;
                t3.setText(String.valueOf(num3));
                t3.setEditable(false);
            }
            if(e.getSource()==b3)
            {
                num3 = num1 * num2;
                t3.setText(String.valueOf(num3));
                t3.setEditable(false);
            }
            if(e.getSource()==b4)
            {
                num3=num1/num2;
                t3.setText(String.valueOf(num3));
                t3.setEditable(false);
            }
    }
}