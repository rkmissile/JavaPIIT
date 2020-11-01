package day7;

import java.sql.*;

public class StudentExcution {
    public static void main(String[] args) throws SQLException {


        String username ="root";
        String password ="rkmissile";
        String dbName = "peoplentech";
        String query ="select * from student;";

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

            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setLocation(resultSet.getString("location"));

            System.out.println(student.toString());


        }

    }// end of the main

}// end of class
