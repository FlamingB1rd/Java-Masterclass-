package com.company;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\Java Masterclass\\Database\\" + DB_NAME;

    public static final String TABLE = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {

        Connection conn = null;
        Statement statement = null;

        try
        {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE +
                                   "(" + COLUMN_NAME + " TEXT," +
                                        COLUMN_PHONE + " INTEGER," +
                                        COLUMN_EMAIL + " TEXT" +
                                    ")");

            insertContact(statement,"Ivo", 1541115, "IvoN@abv.bg");
            insertContact(statement,"Mama", 54521967, "MamaD@abv.bg");
            insertContact(statement,"Tati", 8493755, "TatiD@abv.bg");
            insertContact(statement,"Fido", 9452372, "DogHa@abv.bg");

            statement.execute("UPDATE " + TABLE + " SET " + COLUMN_PHONE + " = 0886386772" +
                                   " WHERE " + COLUMN_NAME + " = 'Ivo'");

            statement.execute("DELETE FROM " + TABLE +
                                  " WHERE " + COLUMN_NAME + " = 'Fido'");

            statement.execute("SELECT * FROM " + TABLE);


            ResultSet results = statement.getResultSet();
            System.out.println("name\tphone\temail");
            while(results.next())
            {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                                    results.getInt(COLUMN_PHONE) + " " +
                                    results.getString(COLUMN_EMAIL));
            }


            statement.close();
            conn.close();
        }
        catch(SQLException e)
        {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void insertContact(Statement statement, String name, int phone, String email) throws SQLException
    {
        statement.execute("INSERT INTO " + TABLE +
                "(" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL +
                ")" +
                "VALUES ('" + name + "', '" + phone + "', '" + email + "')");
    }

}
