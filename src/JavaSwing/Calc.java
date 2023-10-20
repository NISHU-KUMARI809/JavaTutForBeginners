package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calc implements ActionListener {
    JFrame j;
    JTextArea t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,bdivide,bmultiply,badd,bminus,b15,b16,b17,bclr;
    String s1,s2,s3,s4,s5;
    int c,n;
    Calc(){
        j=new JFrame("Calculator");
        j.setLayout(null);
        j.setVisible(true);
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b10=new JButton("0");
        bdivide=new JButton("/");
        bmultiply=new JButton("*");
        badd=new JButton("+");
        bminus=new JButton("-");
        b15=new JButton("%");
        b16=new JButton(".");
        b17=new JButton("=");
        t=new JTextArea();
        t.setBounds(10,10,470,90);
        j.add(t);
        b1.setBounds(10,110,90,50);
        j.add(b1);
        b2.setBounds(110,110,90,50);
        j.add(b2);
        b3.setBounds(215,110,90,50);
        j.add(b3);
        b4.setBounds(320,110,90,50);
        j.add(b4);
        bdivide.setBounds(420,110,59,110);
        j.add(bdivide);
        b5.setBounds(10,170,90,50);
        j.add(b5);
        b6.setBounds(110,170,90,50);
        j.add(b6);
        b7.setBounds(215,170,90,50);
        j.add(b7);
        b8.setBounds(320,170,90,50);
        j.add(b8);
        b9.setBounds(10,230,90,50);
        j.add(b9);
        b10.setBounds(110,230,90,50);
        j.add(b10);
        bmultiply.setBounds(215,230,90,50);
        j.add(bmultiply);
        badd.setBounds(320,230,90,50);
        j.add(badd);
        bminus.setBounds(420,230,59,110);
        j.add(bminus);
        b15.setBounds(10,290,90,50);
        j.add(b15);
        b16.setBounds(110,290,90,50);
        j.add(b16);
        b17.setBounds(215,290,90,50);
        j.add(b17);
        bclr=new JButton("CLR");
        bclr.setBounds(320,290,90,50);
        j.add(bclr);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        bdivide.addActionListener(this);
        bmultiply.addActionListener(this);
        badd.addActionListener(this);
        bminus.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        bclr.addActionListener(this);
        j.getContentPane().setBackground(Color.orange);
        j.setBounds(10,10,500,400);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calc();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            s3=t.getText();
            s4="1";
            s5=s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b2)
        {
            s3=t.getText();
            s4="2";
            s5=s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b3)
        {
            s3=t.getText();
            s4="3";
            s5=s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b4)
        {
            s3=t.getText();
            s4="4";
            s5=s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b5)
        {
            s3=t.getText();
            s4="5";
            s5=s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b6)
        {
            s3=t.getText();
            s4="6";
            s5=s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b7)
        {
            s3=t.getText();
            s4="7";
            s5=s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b8)
        {
            s3=t.getText();
            s4="8";
            s5=s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b9)
        {
            s3=t.getText();
            s4="9";
            s5=s3+s4;
            t.setText(s5);
        }
        if(e.getSource()==b10)
        {
            s3=t.getText();
            s4="0";
            s5=s3+s4;
            t.setText(s5);
        }

        if(e.getSource()==bdivide)
        {
            s1= t.getText();
            t.setText("");
            c=4;// flag set ho raha h taaki aage jaake use kar paye iska /
        }
        if(e.getSource()==bmultiply)
        {
            s1= t.getText();
            t.setText("");
            c=3;// flag set ho raha h taaki aage jaake use kar paye iska *
        }
        if(e.getSource()==badd)
        {
            s1= t.getText();// jaise hi user  plus ke button ko press karega vaise hi jitna likha hoga text field ke andar vaise hi s1 string variable me store ho jaega
            t.setText("");// text firld ko blank kar dena h
            c=1;// flag set ho raha h taaki aage jaake use kar paye iska +
        }
        if(e.getSource()==bminus)
        {
            s1= t.getText();
            t.setText("");
            c=2;// flag set ho raha h taaki aage jaake use kar paye iska -
        }
        if(e.getSource()==b15)
        {
            s1= t.getText();
            t.setText("");
            c=1;// flag set ho raha h taaki aage jaake use kar paye iska
        }
        if(e.getSource()==bclr)
        {
            t.setText("");
        }
        if(e.getSource()==b17)
        {
            s2=t.getText();// jitna text operator ke baad likha higa vo s2 ke andar stire ho jaega
            if(c==1) // c agar 1 hoga toh plus ka operatiojn perform higa
            {
               n= Integer.parseInt(s1) +  Integer.parseInt(s2);
               t.setText(String.valueOf(n));
            }
            if(c==2)
            {
                n= Integer.parseInt(s1) -  Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            if(c==3)
            {
                n= Integer.parseInt(s1) *  Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }
            if(c==4)
            {
                n= Integer.parseInt(s1) /  Integer.parseInt(s2);
                t.setText(String.valueOf(n));
            }

        }
    }
}
