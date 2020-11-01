package SDET.JDBC;



import java.sql.*;

/**
 * 1) Create a connection
 * 2) Create statement/Query
 * 3) Execute statement/Query
 * 4) close connection
 */

public class JDBCDemo1 {

    public static void main(String[] args) throws SQLException {
        //1) Create a connection
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mentoring","root","rkmissile");

        //2) Create statement/Query

        Statement stmnt = connect.createStatement();

        String query = "select * from attendee";

       // 3) Execute statement/Query >>> get result

        ResultSet result = stmnt.executeQuery(query);

        while(result.next()){

            String sno = result.getString("sno");
            String name = result.getString("name");
            String id = result.getString("location");
            String contact = result.getString("contact");

            System.out.println(sno+" "+ name+" "+id+" "+contact);


        }

        //4) close connection

        connect.close();

        System.out.println("Connection is closed  after executing query");




    }

}
