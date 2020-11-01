package day7;

import java.sql.*;
import java.util.Scanner;

public class DBC3 {

    public static void main(String[] args) throws SQLException {
        String username ="root";
        String password ="rkmissile";
        String dbName = "hr";
        //String query ="select * from employees;";

        Scanner scanQuery= new Scanner(System.in);
        System.out.println("plz enter your query for hr database:");
        String query=scanQuery.nextLine();

        String url = "jdbc:mysql://localhost:3306/" + dbName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);


        while (resultSet.next()) {
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String salary = resultSet.getString("salary");

            System.out.println( firstName+ " " + lastName + " " + salary);
        }
    }





}
