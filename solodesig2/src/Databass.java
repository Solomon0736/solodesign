import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

    public class Databass {

        String password = "password";

        public static void main(String[] args) {
            /**
             * This is a class
             * Created 2020-11-24
             *
             * @author Magnus Silverdal
             */

                JPasswordField pf = new JPasswordField();
                JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                String password = new String(pf.getPassword());

                try {
                            // Set up connection to database
                            Connection conn = DriverManager.getConnection(
                                    "jdbc:mysql://localhost:3306/exempel? " +
                                            "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                                    "solomon", password);

                    // Setup statement
                    // Setup statement
                    Statement stmt = conn.createStatement();
                    // Create query and execute
                    String SQLQuery = "select * from story";
                    ResultSet rset = stmt.executeQuery(SQLQuery);

                    // Loop through the result set and print
                    // Need to know the table-structure
                    while (rset.next()) {
                        System.out.println(
                                rset.getInt("id") + ", " +
                                        rset.getString("body") + ", "
                        );
                    }

                    Scanner in = new Scanner(System.in);
                    System.out.println("Ange titel:");
                    String body = in.nextLine();
                    System.out.println("id:");
                    String id = in.nextLine();

                    SQLQuery = "INSERT INTO story(body,id) " +
                            "VALUES ('"+body+"', '"+id+"')";
                    stmt.executeUpdate(SQLQuery);

                    SQLQuery = "UPDATE INTO story(body,id) " +
                            "VALUES ('"+body+"', '"+id+"')";
                    stmt.executeUpdate(SQLQuery);
                    stmt.close();
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
