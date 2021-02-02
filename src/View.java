import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class View extends Model {
    private JButton val1;
    private JButton val2;
    private JTextArea soläventyrTextArea;
    private JPanel tabel;

    public View() {
        /**
         * Jag har skapat två click knappar som kommer vara alternativena för projektet
         */
        JFrame frame = new JFrame("Main");
        //frame.setTitle(" loggboken projekt");
        frame.setContentPane(tabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 300);
        frame.setVisible(true);

        val1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        val2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        soläventyrTextArea.addContainerListener(new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent containerEvent) {
                super.componentAdded(containerEvent);
            }
        });
    }
}