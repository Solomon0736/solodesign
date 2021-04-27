import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {

    //public static void main(String[] args) {
        String password = "password";
 public Model(){
 /**
 * Jag har fått alternativerna på frågorna som fanns i databassen
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

                int rowCount = 0;
                while (rset.next()) {
                    String description = rset.getString("description");
                    int target_id = rset.getInt("target_id");
                    storyLinks.add(target_id);

                    System.out.println(++rowCount + " " + description);

                }

                if (rowCount == 1) {
                    currentRoom = 1;

                } else {

                    System.out.println("Make your choice: ");
                    int input = scan.nextInt();
                    // den gör om man väljer 2 då får man om frågorna
                    while (input < 1 || input > storyLinks.size()) {
                        System.out.println("Du har svarat fel" + "");
                        input = scan.nextInt();
                    }
                    currentRoom = storyLinks.get(input -1);
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