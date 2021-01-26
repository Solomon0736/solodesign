import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {
    String password = "password";

    //public Model() {
        public static void main (String[]args){
            String password = "password";

            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exempel? " +
                        "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "solomon", password);
                Statement stmt = conn.createStatement();

                Scanner scan = new Scanner(System.in);
                int currentRoom = 1;

                while (currentRoom != 0) {
                    String strSelect = "select body from story where id = " + currentRoom;

                    ResultSet rset = stmt.executeQuery(strSelect);

                    // Loop through the result set and print
                    //System.out.println("The records selected are:");
                    while (rset.next()) {
                        String body = rset.getString("body");
                        System.out.println(body);
                    }

                    strSelect = "select description, story_id from links where storyId = " + currentRoom;
                    //System.out.println("The SQL statement is: " + strSelect + "\n");

                    rset = stmt.executeQuery(strSelect);
                    ArrayList<Integer> story_id = new ArrayList();

                    int rowCount = 1;
                    while (rset.next()) {
                        String description = rset.getString("description");
                      //  int target_id = rset.getInt("target_id");
                      //  target_id.add(target_id);
                        int story_id = rset.getInt("story_id");
                        story_id.add(story_id);
                        System.out.println(rowCount + " " + description);
                        ++rowCount;
                    }

                    if (rowCount == 1) {
                        System.out.println("Thanks for playing...");
                        currentRoom = 0;

                    } else {

                        System.out.println("Make your choice: ");
                        int input = scan.nextInt();
                        while (input < 1 || input > storyLinks.size()) {
                            System.out.println("Illegal choice, try again");
                            input = scan.nextInt();
                        }
                        currentRoom = storyLinks.get(input - 1);
                    }
                }
                // Close conn and stmt
                conn.close();
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
