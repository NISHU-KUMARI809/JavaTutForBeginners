package JavaSwing;
//import javax.swing.*;
//public class JProgressBarx{
//    JFrame jf;JLabel l1;
//    JProgressBar p;
//    JProgressBarx(){
//        jf=new JFrame("Progress bar");
//
////        l1=new JLabel("Please wait.....");
////        l1.setBounds(200,200,100,30);
////        jf.add(l1);
//        p=new JProgressBar(0,2000);
//        p.setBounds(40,40,160,30);
//        p.setValue(0);
//        p.setStringPainted(true);
//
//        jf.add(p);
//        jf.setSize(200,300);
//        jf.setVisible(true);
//        jf.setLayout(null);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    public void repeat(){
//        for(int i=0;i<3000;i=i+25){
//            p.setValue(i);
//            try {
//                Thread.sleep(100);
//            }catch (Exception ex){
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        JProgressBarx m=new JProgressBarx();
//        m.repeat();
//    }
//}
import javax.swing.*;
public class JProgressBarx extends JFrame{
    JProgressBar jb;
    int i=0,num=0;
    JProgressBarx(){
        jb=new JProgressBar(0,2000);
        jb.setBounds(40,40,160,30);
        jb.setValue(0);
        jb.setStringPainted(true);
        add(jb);
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void iterate(){
        while(i<=2000){
            jb.setValue(i);
            i=i+20;
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
    public static void main(String[] args) {
        JProgressBarx m=new JProgressBarx();
        m.setVisible(true);
        m.iterate();
    }
}
