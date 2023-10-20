package JavaSwing;
import javax.swing.*;
public class Progress {
    JFrame jf;
    JProgressBar pb;
    Progress(){
        jf=new JFrame("Progress");
        pb=new JProgressBar(0,3000);
        pb.setBounds(20,30,190,30);
        pb.setValue(0);
        pb.setStringPainted(true);
        jf.add(pb);
        jf.setSize(300,300);
        JLabel l1=new JLabel("Please wait....");
        l1.setBounds(60,90,100,30);
        jf.add(l1);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void repeat(){
        for(int i=0;i<=3000;i=i+25){
            pb.setValue(i);
            try{
                Thread.sleep(150);

            }catch(Exception ex){

            }
        }
    }

    public static void main(String[] args) {
        Progress n=new Progress();
        n.repeat();

    }

}
