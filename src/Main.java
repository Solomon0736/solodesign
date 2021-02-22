import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * skapat controller som controleral Modelen och Main
         */
        View view = new View();
       // Model model = new Model();

        //Insertdb db = new Insertdb();
        //Database database = new Database();

    }

    private class SkapaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           /* while (rset.next()) {
                String description = rset.getString("description");
                int target_id = rset.getInt("target_id");
                storyLinks.add(target_id);

                System.out.println( description);*/
        }

        private class SparaListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
            }
        }
    }
}