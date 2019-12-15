import java.sql.*;

public class Connectonsqlite {
    public  static void main(String[] args) {
       try {
           Class.forName("org.sqlite.JDBC");
           Connection con= DriverManager.getConnection("jdbc:sqlite:mydb.sqlite");
           PreparedStatement pre = con.prepareStatement("create table emp1(emp_id integer primary key autoincrement,emp_name char(50))");
           int rs=pre.executeUpdate();
           if(rs==0)
               System.out.println("rs table is created :"+rs);

       }catch(ClassNotFoundException | SQLException e){
           e.printStackTrace();
       }
    }
}
