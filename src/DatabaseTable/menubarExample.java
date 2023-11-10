package DatabaseTable;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class menubarExample implements ActionListener{
    JFrame jf;
        JTextArea t;
        JScrollPane jp;
        JMenuBar m;
        JMenu m1,m2;
        JMenuItem m11,m12,m13,m14,m15,m16,m17,m18,m19,m20; 
        private File currentFile;
    menubarExample(){ 
        jf=new JFrame("Nishu's_Notepad");
        jf.setBounds(10, 10, 500, 400);
        t=new JTextArea();
        t.setBounds(10,10,500,400);
        jf.add(t);
        m=new JMenuBar();
        m1=new JMenu("File");
        m2=new JMenu("Edit");
        //m3=new JMenu("Format");
        m.add(m1);
        m.add(m2);
        //m.add(m3);
        jf.setJMenuBar(m);
        m11=new JMenuItem("New");
        m12=new JMenuItem("Open");
        m13=new JMenuItem("Save as");
        m14=new JMenuItem("Save");
        m15=new JMenuItem("Print");
        m16=new JMenuItem("Exit");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);
        m1.add(m16);
        m17=new JMenuItem("cut");
        m18=new JMenuItem("Copy");
        m19=new JMenuItem("Paste");
        m20=new JMenuItem("Select all");
        m2.add(m17);
        m2.add(m18);
        m2.add(m19);
        m2.add(m20);
        jp=new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jf.add(jp);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);
        m14.addActionListener(this);
        m15.addActionListener(this);
        m16.addActionListener(this);
        m17.addActionListener(this);
        m18.addActionListener(this);
        m19.addActionListener(this);
        m20.addActionListener(this);
        
    }
    public static void main(String[] args) {
        new menubarExample();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==m11){
            t.setText(" ");
        }
        else if(e.getSource()==m12){
            JFileChooser filechooser =new JFileChooser();
            int option=filechooser.showOpenDialog(jf);
            File f=filechooser.getSelectedFile();
            try{
                Scanner sc=new Scanner(f);
                while(sc.hasNextLine()){
                    t.append("\n"+sc.nextLine());
                }
                
            }catch(Exception ex){
                
            }
        }
        else if(e.getSource()==m13){
            JFileChooser filechooser=new JFileChooser();
            int op=filechooser.showSaveDialog(jf);
            try{
                File f=filechooser.getSelectedFile();
                String str=t.getText();
                FileWriter fw=new FileWriter(f);
                fw.write(str);
                fw.close();
                
            }catch(Exception exe){
                throw new RuntimeException(exe);
                
            }
        }
        else if(e.getSource()==m14){
            if(currentFile==null){
                JFileChooser filechooser=new JFileChooser();
                int op=filechooser.showSaveDialog(jf);
                try{
                    File f=filechooser.getSelectedFile();
                        String str=t.getText();
                        FileWriter wr=new FileWriter(f);
                        wr.write(str);
                        wr.close(); 
                        currentFile=f; 
                }
                catch(Exception ex){  
                    throw new RuntimeException(ex);
                }   
                
//                String str=t.getText();
//                FileWriter fw=new FileWriter();   
            }
            else{
                try{
                    String s=t.getText();
                    FileWriter w=new FileWriter(currentFile);
                    w.write(s);
                    w.close();
                }catch(Exception ex){
                    throw new RuntimeException(ex);
                }
            }
            
        }
        else if(e.getSource()==m15){
            try {
                t.print();
            } catch (PrinterException ex) {
                
            }
        }
        else if(e.getSource()==m16){
            try{
                jf.dispose();
                
            }catch(Exception x){ 
            }
        }
        else if(e.getSource()==m17){
            try{
                t.cut();
            }
            catch(Exception exe){}
        }else if(e.getSource()==m18){
            try{
                t.copy();
            }catch(Exception exe){}
        }else if(e.getSource()==m19){
            try{
                t.paste();
                
            }catch(Exception es){}
        }else if(e.getSource()==m20){
            try{
                t.selectAll();
                
            }catch(Exception exs){
                
            }
        }
    }
    
}
