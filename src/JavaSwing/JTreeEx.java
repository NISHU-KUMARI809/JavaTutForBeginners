package JavaSwing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeEx {
    JFrame jf;
    JTreeEx(){
        jf=new JFrame("JTree");
        jf.setBounds(10,10,500,500);
        DefaultMutableTreeNode webpage=new DefaultMutableTreeNode("WebPage");
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
        DefaultMutableTreeNode t1=new DefaultMutableTreeNode("TimesNewRoman");
        DefaultMutableTreeNode t2=new DefaultMutableTreeNode("Tahema");
        webpage.add(color);
        webpage.add(font);
        color.add(red);
        color.add(green);
        color.add(blue);
        font.add(t1);
        font.add(t2);
        JTree e=new JTree(webpage);
        jf.add(e);

        jf.setVisible(true);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTreeEx();
    }
}
