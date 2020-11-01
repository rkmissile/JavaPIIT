package SDET.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) throws SQLException {

        //1) Create a connection
        Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/mentoring","root","rkmissile");

        //2) Create statement/Query
        Statement stmnt=connect.createStatement();

        String query="insert into attendee values(6, 'Robin', 1357, 'Manhattan', 123456);";

        //3) Execute statement/Query
        stmnt.execute(query);


        //4) close connection
        connect.close();

        System.out.println("Query is executed");
    }





}//end of class
