package task2;

import java.sql.*;

/**
 * Created by user on 28.07.2016.
 */
public class DateBaseMain {
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/task2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456789q";

    private Connection connection;

    private static Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DATABASE_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("000");
        }
        try {
            dbConnection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("111");
        }
        return dbConnection;
    }

    public static void main(String[] args) throws SQLException {
//        selectDbCountry("SELECT a.name " +
//                "FROM country a JOIN city b ON a.CountryID=b.CountryID " +
//                "GROUP BY b.CountryID HAVING MIN(b.Population)>400000 ");

        selectDbCountry("SELECT DISTINCT a.name " +
                "FROM country a JOIN city b ON a.CountryID=b.CountryID " +
                "JOIN building c ON b.CityID=c.CityID  " +
                "WHERE b.CityID=c.CityID");
    }


    private static void selectDbCountry(String select) throws SQLException {
        Connection dbConnection = null;
        Statement statement = null;

        String selectTableSQL = select;
        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();

            // select date with BD
            ResultSet rs = statement.executeQuery(selectTableSQL);

            while (rs.next()) {
                String name = rs.getString("name");

                System.out.println("name : " + name);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
