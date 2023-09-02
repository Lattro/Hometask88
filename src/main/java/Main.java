import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main
{
    public static void main(String[] args) throws ClassNotFoundException {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2","root","546");
            System.out.println("Соединение с БД установлено");
        }
        catch (ClassNotFoundException exception)
        {
            System.out.println(exception.getMessage());
        }
        catch (SQLException exception)
        {
            System.out.println(exception.getMessage());
        }

    }
}
