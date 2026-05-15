/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalsystem1;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Shahd Mohamed
 */
public class DBConnection {
        public static Connection connect() {

        try {

            Class.forName("org.sqlite.JDBC");

            return DriverManager.getConnection(
                    "jdbc:sqlite:hospital.db"
            );

        }

        catch (Exception e) {

            e.printStackTrace();

        }

        return null;

    }


    
}
