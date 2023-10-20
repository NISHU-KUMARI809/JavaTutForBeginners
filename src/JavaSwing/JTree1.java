package JavaSwing;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTree1 {
    JFrame jf;
    JTree1(){
        jf=new JFrame("Testing");
        jf.setBounds(10,10,500,500);
        DefaultMutableTreeNode file=new DefaultMutableTreeNode("File");
        DefaultMutableTreeNode edit=new DefaultMutableTreeNode("Edit");
        DefaultMutableTreeNode open=new DefaultMutableTreeNode("Open");
        DefaultMutableTreeNode save=new DefaultMutableTreeNode("Save");
        DefaultMutableTreeNode saveas=new DefaultMutableTreeNode("Save as");
        DefaultMutableTreeNode cut=new DefaultMutableTreeNode("Cut");
        DefaultMutableTreeNode copy=new DefaultMutableTreeNode("Copy");
        DefaultMutableTreeNode paste=new DefaultMutableTreeNode("Paste");
        file.add(open);
        file.add(save);
        file.add(saveas);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        JTree j=new JTree(file);
        JTree j1=new JTree(edit);
        jf.add(j);
        jf.add(j1);
        jf.setLayout(new BorderLayout());
        jf.add(j, BorderLayout.WEST);
        jf.add(j1, BorderLayout.EAST);
        //jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTree1();
    }
}
