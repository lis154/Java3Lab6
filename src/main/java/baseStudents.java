import java.sql.*;

/**
 * Created by i.lapshinov on 28.08.2018.
 */
public class baseStudents {

   public static Connection connection = null;
   public static Statement statement = null;

    public static void main(String[] args) throws SQLException {


        connect();
        resultSt();

        statement.close();
        connection.close();
    }

    public static void connect()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:students.db");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void resultSt() throws SQLException {
        String sql = "Select * from students where id = '2'";

        ResultSet resultSet = statement.executeQuery(sql);


        while (resultSet.next())
        {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("lastname"));
            System.out.println(resultSet.getInt("ball"));
        }

        resultSet.close();
    }

}
