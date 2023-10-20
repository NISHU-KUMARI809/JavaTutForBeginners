package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
public class JMenuBarex implements ActionListener {
    JList famlist, stylist, szlist;

    String familyval[] = { "Agency  FB", "Antiqua", "Architect", "Arial", "Calibri", "Comic Sans", "Courier", "Cursive", "Impact", "Serif" };
    String sizeval[] = { "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70" };
    int[] styleval = { Font.PLAIN, Font.BOLD, Font.ITALIC };
    String[] stylevals = { "PLAIN", "BOLD", "ITALIC" };
    String ffamily, fsstr, fstylestr;
    int fstyle;
    Font ft1;
    //ft1 = new Font("Arial", Font.PLAIN, 17);
    static int fs = 17;
    private File currentFile;
    JMenu m3,m2,m1;
    JMenuItem m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25;
    JFrame jf=new JFrame();
    JTextArea jt=new JTextArea();
    JScrollPane p ;
    JMenuBarex(){
        famlist = new JList(familyval);
        stylist = new JList(stylevals);
        szlist = new JList(sizeval);
        JMenuBar mb=new JMenuBar();
        ft1 = new Font("Arial", Font.PLAIN, 17);
        famlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        szlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        stylist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        m1=new JMenu("File");
        m2=new JMenu("Edit");
        m3=new JMenu("Format");
        m22=new JMenuItem("New");
        m11=new JMenuItem("Open");
        m12=new JMenuItem("Save as");
        m23=new JMenuItem("Save");
        m13=new JMenuItem("Exit");
        m14=new JMenuItem("Print");
        m15=new JMenuItem("Cut");
        m16=new JMenuItem("Copy");
        m17=new JMenuItem("Paste");
        m18=new JMenuItem("Select all");
        //m19=new JMenuItem("Undo");
        //m20=new JMenuItem("Redo");
        m21=new JMenuItem("Font Family");
        m24=new JMenuItem("Font style");
        m25=new JMenuItem("Font size");
        m1.add(m22);
        m1.add(m11);
        m1.add(m12);
        m1.add(m23);
        m1.add(m14);
        m1.add(m13);
        m2.add(m15);
        m2.add(m16);
        m2.add(m17);
        m2.add(m18);
        //m2.add(m19);
        //m2.add(m20);
        m3.add(m21);
        m3.add(m24);
        m3.add(m25);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        jf.setJMenuBar(mb);
        jf.setBounds(10,10,500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jt.setBounds(10,10,500,500);
        jf.add(jt);
        // for scrollbar
        p=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //p.setBounds(10,10,500,500);
        p.getViewport().add(jt);
        jf.add(p);
        m11.addActionListener( this);
        m12.addActionListener(this);
        m13.addActionListener(this);
        m14.addActionListener(this);
        m15.addActionListener(this);
        m16.addActionListener(this);
        m17.addActionListener(this);
        m18.addActionListener(this);
        //m19.addActionListener(this);
        //m20.addActionListener(this);
        m21.addActionListener(this);
        m22.addActionListener(this);
        m23.addActionListener(this);
        m24.addActionListener(this);
        m25.addActionListener(this);
    }
    public static void main(String[] args) {
        new JMenuBarex();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==m15){
            jt.cut();
        }
        else if(e.getSource()==m16){
            jt.copy();
        }
        else if(e.getSource()==m17){
            jt.paste();;
        }
        else if (e.getSource()==m18) {
            jt.selectAll();
        } else if (e.getSource()==m22) {
            jt.setText(" ");
        }
        else if(e.getSource()==m11){
            JFileChooser fileChooser=new JFileChooser();
            int option =fileChooser.showOpenDialog(jf);
            File f=fileChooser.getSelectedFile();
            try{
                Scanner sc=new Scanner(f);
                while(sc.hasNextLine()){
                    jt.append("\n"+sc.nextLine());
                }
            }
            catch(Exception exception){}
        }
        // Save as implementation
        else if(e.getSource()==m12){
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.setDialogTitle("Specify a file to save");
            int op=fileChooser.showSaveDialog(jf);
            if(op==JFileChooser.APPROVE_OPTION){
                try{
                    File f=fileChooser.getSelectedFile();
                    String text=jt.getText();
                    FileWriter myw=new FileWriter(f);
                    myw.write(text);
                    myw.close();
                    System.out.println("Successful");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        else if(e.getSource()==m23){
            if (currentFile == null) {
                // If no file is currently associated, perform "Save As"
                JFileChooser fileChooser = new JFileChooser();
                int op = fileChooser.showSaveDialog(jf);
                if (op == JFileChooser.APPROVE_OPTION) {
                    try {
                        File f = fileChooser.getSelectedFile();
                        String text = jt.getText();
                        FileWriter myw = new FileWriter(f);
                        myw.write(text);
                        myw.close();
                        currentFile = f; // Set the currentFile to the saved file
                        System.out.println("Successful");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }else{
                try{
                    String tx_t= jt.getText();
                    FileWriter myw=new FileWriter(currentFile);
                    myw.write(tx_t);
                    myw.close();
                    System.out.println("Saved");
                }catch(Exception exs){
                    throw new RuntimeException(exs);
                }
            }
        }
        else if (e.getSource()==m14) {
            try{
                jt.print();
            }catch (Exception ez){}
        }
        else if (e.getSource()==m13) {
            jf.dispose();
        } else if (e.getSource()==m21) {
            JOptionPane.showConfirmDialog(null, famlist, "Choose Font Family", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            ffamily = String.valueOf(famlist.getSelectedValue());
            ft1 = new Font(ffamily, fstyle, fs);
            jt.setFont(ft1);

        } else if (e.getSource()==m24) {
            JOptionPane.showConfirmDialog(null, stylist, "Choose Font Style", JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            fstyle = styleval[stylist.getSelectedIndex()];
            ft1 = new Font(ffamily, fstyle, fs);
            jt.setFont(ft1);
        } else if (e.getSource()==m25) {
            JOptionPane.showConfirmDialog(null, szlist, "Choose Font Size", JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            fsstr = String.valueOf(szlist.getSelectedValue());
            fs = Integer.parseInt(fsstr);
            ft1 = new Font(ffamily, fstyle, fs);
            jt.setFont(ft1);
        }
    }
}
