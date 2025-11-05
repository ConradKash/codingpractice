import java.sql.*;

public class Main {
    public static void main (String args[]) throws Exception{
        String url = "jdbc:sqlserver://localhost:1433;databaseName=test";
        String user = "sa";
        String password = "nuvkyn-vuqhu9-Bijjim";


        String createTable =
            "IF OBJECT_ID('db.Persons', 'U') IS NOT NULL DROP TABLE dbo.Persons; " +
            "CREATE TABLE dbo.Persons (" +
            " Id INT PRIMARY KEY," +
            " FirstName NVARCHAR(50) NOT NULL," +
            " LastName NVARCHAR(50) NOT NULL," +
            " Age INT" +
            ");";

        String insert1 = "INSERT INTO dbo.Persons (Id, FirstName, LastName, Age) VALUES (1, 'Alice', 'Smith', 30);";
        String insert2 = "INSERT INTO dbo.Persons (Id, FirstName, LastName, Age) VALUES (2, 'Bob', 'Jones', 40);";
        String insert3 = "INSERT INTO dbo.Persons (Id, FirstName, LastName, Age) VALUES (3, 'Carol', 'Lee', 25);";

        try {
            // Load the SQL Server JDBC driver class
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
            e.printStackTrace();

        try (Connection con = DriverManager.getConnection(url, user, password) ) {
            try (Statement stm = con.createStatement()){
                ResultSet rs = stm.executeQuery(createTable);
            }
            catch(Exception em) {
                em.printStackTrace();
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    }
}
