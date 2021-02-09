import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {
    //public static void main(String[] args) {
        public Model(){
        String password = "password";
/**
 * Jag har fått alternativerna på frågorna som fanns i databassen
 *
 */
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exempel? " +
                    "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "solomon", password);
            Statement stmt = conn.createStatement();

            Scanner scan = new Scanner(System.in);
            int currentRoom = 1;

            while (currentRoom != 0) {
                String strSelect = "select body from story where id = " + currentRoom;

                ResultSet rset = stmt.executeQuery(strSelect);
                while (rset.next()) {
                    String body = rset.getString("body");
                    System.out.println(body);
                }

                strSelect = "select description, story_id,target_id from links where story_id = " + currentRoom;

                rset = stmt.executeQuery(strSelect);
                ArrayList<Integer> storyLinks = new ArrayList();

                int rowCount = 1;
                while (rset.next()) {
                    String description = rset.getString("description");
                    int story_id = rset.getInt("story_id");
                    storyLinks.add(story_id);

                    System.out.println(++rowCount + " " + description);

                }

                if (rowCount == 1) {
                    System.out.println("Thanks for playing...");
                    currentRoom = 7;

                } else {

                    System.out.println("Make your choice: ");
                    int input = scan.nextInt();
                    // den gör om man väljer 2 då får man om frågorna
                    while (input < 2 || input > storyLinks.size()) {
                        System.out.println("Illegal choice, try again");
                        input = scan.nextInt();
                    }
                    currentRoom = storyLinks.get(input -1);
                }

                if (rowCount == 2) {

                    while (rset.next()) {
                        String description = rset.getString("description");
                        int story_id = rset.getInt("story_id");
                        storyLinks.add(story_id);

                        System.out.println(++rowCount + " " + description);


                        System.out.println("Thanks for playing...");
                       // String strSelect = "select body from story where id = " + currentRoom;

                        currentRoom = 4;
                    }
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