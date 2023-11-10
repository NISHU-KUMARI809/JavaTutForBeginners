package DatabaseTable;
import java.sql.*;
public class Update_deletedatafromTable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Nishu@123456");
            Statement st=c.createStatement();
            String s1="update Nishu_Info1 set Name='Riya',ROLL_NUMBER=114 where  SNO=3";
            //st.executeUpdate(s1);
            String s2="delete from Nishu_Info1 where SNO=4";
            //st.executeUpdate(s2);
            System.out.println("updated Succesfully...");
            ResultSet rs=st.executeQuery("SELECT * FROM Nishu_Info1");
            while(rs.next()){
                System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4)+"  "+rs.getString(5)+"  "+rs.getDate(6));
            }
            st.close();
            c.close();
        }
        catch(Exception exe){
            System.out.println(exe);
            
        }
    }
    
}
