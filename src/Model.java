/*import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.*;
import java.util.ArrayList;

public class Model {
    private JPanel tabel;
    private JButton val1;
    String password = "password";
    private JTextField textField;

    public Model() {
/**
 * Jag har fått alternativerna på frågorna som fanns i databassen
 */
     /*   textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                    try {

                        JFrame frame = new JFrame("Main");
                        frame.setContentPane(new Model().tabel);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.pack();
                        frame.setSize(400, 300);
                        frame.setVisible(true);

                        Connection conn = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/exempel? " +
                                        "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                                "solomon", password);
                        Statement stmt = conn.createStatement();
                        String SQLQuery = "select body from story";

                        //String strSelect = "select body from story where id ";
                        ResultSet rset = stmt.executeQuery(SQLQuery);
                        while (rset.next()) {
                            String body = rset.getString("body");
                            System.out.println(body);

                          // SQLQuery = "select description, story_id,target_id from links where story_id = ";
                              rset = stmt.executeQuery(SQLQuery);
                        }

                        conn.close();
                        stmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();

                }

                // Close conn and stmt

            }
         });

    }
}*/

//   ArrayList<Integer> storyLinks = new ArrayList();

                        /*while (rset.next()) {
                            String description = rset.getString("description");
                            int target_id = rset.getInt("target_id");
                            storyLinks.add(target_id);

                            System.out.println( description);
                        }*/

                        //if (rowCount == 1) {
                        // currentRoom = 4;

                        // } else {
                        /*int input = scan.nextInt();
                        // den gör om man väljer 2 då får man om frågorna
                        while (input < 1 || input > storyLinks.size()) {

                            input = scan.nextInt();
                        }
                        currentRoom = storyLinks.get(input - 1);*/
                        // }
