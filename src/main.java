import java.util.logging.Level;

public class main {
    public static void main(String[] args) {
        try {
            files min =new files("files.txt");

            min.logger.setLevel(Level.WARNING);
            min.logger.info("infp msg");
            min.logger.warning("warning msg");
        }catch (Exception e){

        }
    }
}
