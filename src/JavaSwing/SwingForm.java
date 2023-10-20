package JavaSwing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingForm {
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2;
    JRadioButton r1,r2,r3;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JComboBox cbx;
    JButton b1,b2;
    JTextArea a1;

    ButtonGroup bgp= new ButtonGroup();
    SwingForm(){
        JFrame jf=new JFrame("Student Form");
        jf.setBounds(10,10,900,600);
        l1=new JLabel("Name:");
        l1.setBounds(20,10,200,30);
        jf.add(l1);
        l2=new JLabel("Mobile Number:");
        l2.setBounds(20,40,100,30);
        jf.add(l2);
        l3=new JLabel("Gender:");
        l3.setBounds(20,80,100,30);
        jf.add(l3);
        l4=new JLabel("Subject:");
        l4.setBounds(20,120,100,30);
        jf.add(l4);
        l5=new JLabel("Hobbies:");
        l5.setBounds(20,180,100,30);
        jf.add(l5);
        t1=new JTextField();
        t1.setBounds(120,10,270,30);
        jf.add(t1);
        t2=new JTextField();
        t2.setBounds(120,40,270,30);
        jf.add(t2);
        r1=new JRadioButton("Female");
        r1.setBounds(120,80,80,30);
        jf.add(r1);
        r2=new JRadioButton("Male");
        r2.setBounds(200,80,80,30);
        jf.add(r2);

        r3=new JRadioButton("TransGender");
        r3.setBounds(280,80,150,30);
        jf.add(r3);
        bgp.add(r1);
        bgp.add(r2);
        bgp.add(r3);
        c1=new JCheckBox("COA");
        c1.setBounds(120,120,80,30);
        jf.add(c1);
        c2=new JCheckBox("Automata");
        c2.setBounds(200,120,80,30);
        jf.add(c2);
        c3=new JCheckBox("Microprocessor");
        c3.setBounds(280,120,120,30);
        jf.add(c3);
        c4=new JCheckBox("DBMS");
        c4.setBounds(120,150,80,30);
        jf.add(c4);
        c5=new JCheckBox("AA");
        c5.setBounds(200,150,80,30);
        jf.add(c5);
        c6=new JCheckBox("EIT");
        c6.setBounds(280,150,80,30);
        jf.add(c6);
        cbx=new JComboBox();
        cbx.addItem(" ");
        cbx.addItem("Cricket");
        cbx.addItem("Football");
        cbx.addItem("Hockey");
        cbx.addItem("Cheese");
        cbx.addItem("Reading books");
        cbx.addItem("Singing");
        cbx.addItem("Dancing");
        cbx.setBounds(120,180,270,25);
        jf.add(cbx);
        b1=new JButton("Submit");
        b1.setBounds(120,400,80,30);
        jf.add(b1);

        b2=new JButton("Clear");
        b2.setBounds(300,400,80,30);
        jf.add(b2);
        l6=new JLabel("");
        l6.setBounds(300,500,190,30);
        jf.add(l6);
        a1=new JTextArea();
        a1.setBounds(450,10,400,450);
        a1.setLineWrap(true);
        String text1= t1.getText();
        a1.append(text1);
        jf.add(a1);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                String text1 =t1.getText();
                a1.append("Name: "+text1 + "\n"); // Append the text to the text area
                String text2= t2.getText();
                a1.append("Mobile :"+text2 + "\n");
                String selectedOption = "None";
                if (r1.isSelected()) {
                    selectedOption = "Female";
                } else if (r2.isSelected()) {
                    selectedOption = "Male";
                } else if (r3.isSelected()) {
                    selectedOption = "Transgender";
                }
                a1.append("Gender: "+selectedOption+"\n");

                String selectedOption1= " ";
                if(c1.isSelected()){
                    selectedOption1="COA ";
                }
                if(c2.isSelected()){
                    selectedOption1+="Automata ";
                }
                if(c3.isSelected()){
                    selectedOption1+="MicroProcessor ";
                }
                if(c4.isSelected()){
                    selectedOption1+="DBMS a";
                }
                if(c5.isSelected()){
                    selectedOption1+="AA ";
                }
                if(c6.isSelected()){
                    selectedOption1+="EIT ";
                }
                a1.append("Subject are : "+selectedOption1+"\n");

                String selected = (String) cbx.getSelectedItem();
                a1.append("Hobby: " + selected+"\n");

            }
        });

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                bgp.clearSelection();
                c1.setSelected(false);
                c2.setSelected(false);
                c3.setSelected(false);
                c4.setSelected(false);
                c5.setSelected(false);
                c6.setSelected(false);
                cbx.setSelectedItem(null);

                a1.setText("");//TO CLEAR TEXTAREA DONE H



            }
        });
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new SwingForm();
    }
}
