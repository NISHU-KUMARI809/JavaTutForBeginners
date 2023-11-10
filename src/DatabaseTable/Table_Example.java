package DatabaseTable;
import java.sql.*;
public class Table_Example {
    public static void main(String[] args) {
        try{
            // load JDBC driver or register JDBC driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create connection or obtained connection 
            Connection conection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Nishu@123456");
 //----------------------------------------------------------------------------------------           
// for creating table 
//-----------------------------------------------------------------------------------------
//            String sql="CREATE TABLE STUDENT_DETAILS"+"(ID INTEGER not NULL,"+
//                                                     "FIRST VARCHAR(255),"+
//                                                     "SECOND_NAME VARCHAR(255),"+
//                                                     "ROLL_NUMBER INTEGER,"+
//                                                      "AGE INTEGER,"+
//                                                      "PRIMARY KEY(ID))";
            Statement stmt=conection.createStatement();
//            stmt.execute(sql);
            System.out.println("table created successfully");
//-------------------------------------------------------------------------------------------
// inserting values inside tablesd            
            //String sql1=("INSERT INTO STUDENT_DETAILS VALUES(1,'NISHU','KUMARI',1211,18)");
            //String sql12=("INSERT INTO STUDENT_DETAILS VALUES(109,'DISHA','KASHYAP',1905,9)");
//            String sql13=("INSERT INTO STUDENT_DETAILS VALUES(110,'NIDHI','KASHYAP',19024,20)");
//            String sql14=("INSERT INTO STUDENT_DETAILS VALUES(111,'NIHARIKA','KASHYAP',19090,77)");
//            String sql15=("INSERT INTO STUDENT_DETAILS VALUES(112,'DIVYA','KASHYAP',1967,27)");
            //stmt.executeUpdate(sql1);
            //stmt.executeUpdate(sql12);
//            stmt.executeUpdate(sql13);
//            stmt.executeUpdate(sql14);
//            stmt.executeUpdate(sql15);
// -----------------------------------------------------------------------------------------
// for show elements of table
            ResultSet rs=stmt.executeQuery("SELECT * FROM STUDENT_DETAILS");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
            }
            System.out.println("created table in a given database...");
            stmt.close();
            conection.close();
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
