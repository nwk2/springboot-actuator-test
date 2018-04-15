package hello.Dao;

import hello.Entity.Car;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.*;

@Repository
public class CarDao {

    //JDBC connection
    private static String url = "jdbc:postgresql://localhost/CarsDb";
    private static String user = "waikit";
    private static String password = "password";

    public List<Car> getAllCars() {
        Connection conn = null;
        List<Car> list = new ArrayList<>();

        //attempt connection
        try {
            conn = DriverManager.getConnection(url, user, password);
            //System.out.println("Successful connection to PostgreSQL server");

            // Create Query Statement
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM public.\"carstable\"");
            System.out.println(rs);

            while (rs.next()) {
                Car c = new Car();
                c.setVin(rs.getString(1));
                c.setBrand(rs.getString(2));
                c.setYear(rs.getInt(3));
                c.setColor(rs.getString(4));
                list.add(c);
            }
            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;

    }
}
