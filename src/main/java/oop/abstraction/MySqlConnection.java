package oop.abstraction;

// MySqlConnection.java (implements DatabaseConnection)
public class MySqlConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL database.");
    }

    @Override
    public void query(String sql) {
        System.out.println("Executing MySQL query: " + sql);
    }
}
