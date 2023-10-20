package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class JTableex {
    JFrame jf;
    JTable t;
    JTableex(){
        jf=new JFrame("JTable");
        jf.setBounds(10,10,500,500);
        String rows[]={"roll_no","Name","ID"};
        String col[][]={{"221","Nishu","121"},{"342","Riya","123"}};
        t=new JTable(col,rows);
        jf.add(new JScrollPane(t));

        jf.setVisible(true);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTableex();
    }
}
