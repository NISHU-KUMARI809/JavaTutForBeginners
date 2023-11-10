package DatabaseTable;
import java.sql.*;
public class JavATable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Nishu@123456");
            Statement stmt=con.createStatement();
//            String sql="CREATE TABLE Students"+"(id INTEGER not NULL,"+
//                                                 "First VARCHAR(255),"+
//                                                 "Last VARCHAR(255),"+
//                                                  "age INTEGER,"+
//                                                  "PRIMARY KEY(id))";
//            stmt.execute(sql);
//            System.out.println("Table created if not Exist");
//            String sql1="INSERT INTO Students VALUES(102,'NISHU','SINGH',18)";
            //stmt.executeUpdate(sql1);
//            String sql1="INSERT INTO Students VALUES(101,'NISH1','SINGH',18)";
//            stmt.executeUpdate(sql1);
            ResultSet rs=stmt.executeQuery("select * from Students");  
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(3)); 
            System.out.println("created table in a given database...");
            stmt.close();
            con.close();
            
            
        }
        catch(Exception ex){
            System.out.println(ex);
            
        }
        
    }
    
    
}
