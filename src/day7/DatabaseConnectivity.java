package day7;

import java.sql.*;

public class DatabaseConnectivity {
    public static void main(String[] args) throws SQLException {

        String username ="root";
        String password ="rkmissile";
        String dbName = "peoplentech";
        String query ="select * from student;";

        //jdbc:mysql -- drivername
        //localhost -- host of the db
        //3306 -- port number of the db
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
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String location = resultSet.getString("location");

            System.out.println(id + " " + name + " " + location);
        }







    }//end of main method
}//end of class
