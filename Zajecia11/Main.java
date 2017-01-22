import frames.MyFrame;

import javax.swing.*;

/**
 * Created by rpi on 17.01.17.
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new MyFrame("Title")
        );
        System.out.println(
                Thread.currentThread().getName()
        );
    }

}
