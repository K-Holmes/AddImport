import java.util.*;
import javax.swing.*;

public class AddImport {

    public static void main(String args[]) {
        JLabel label = new javax.swing.JLabel("hello");
        //seems to run just fine

        //shows that import works
        JFrame check = new JFrame();
        check.add(label);
        check.setVisible(true);


    }

}
