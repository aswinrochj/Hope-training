import java.sql.*;
import java.io.FileInputStream;
import java.util.Properties;

public class JDBCConnection {
    public static void main(String[] args) {

        try {
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            props.load(fis);

            final String URL = props.getProperty("db.url");
            final String USERNAME = props.getProperty("db.username");
            final String PASSWORD = props.getProperty("db.password");
            fis.close();

            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection is successful");
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}