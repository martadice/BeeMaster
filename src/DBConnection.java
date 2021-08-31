import java.sql.*;

public class DBConnection {

    private Connection connection;

    public void DBConnection() {
        try {
            String dbURL = "jdbc:sqlite:beemaster.db";
            connection = DriverManager.getConnection(dbURL);
//          Create table colony
            Statement statement = connection.createStatement();
            String sqlStatement = "CREATE TABLE IF NOT EXISTS colonies" +
                    " (colony_id INTEGER PRIMARY KEY NOT NULL, " +
                    "hive_id INTEGER NOT NULL, " +
                    "colony_origin TEXT NOT NULL, " +
                    "queen_breed TEXT NOT NULL, " +
                    "queen_year INTEGER NOT NULL, " +
                    "supers INTEGER NOT NULL, " +
                    "frames INTEGER NOT NULL, " +
                    "bees INTEGER NOT NULL, " +
                    "brood INTEGER NOT NULL, " +
                    "honey INTEGER NOT NULL, " +
                    "pollen INTEGER NOT NULL, " +
                    "varroa_treatment TEXT NOT NULL, " +
                    "food_added TEXT NOT NULL, " +
                    "next_visit TEXT NOT NULL)";
            statement.execute(sqlStatement);
        } catch (
                SQLException exception) {
            System.out.println("Database issues: " + exception);
        }

    }
}
