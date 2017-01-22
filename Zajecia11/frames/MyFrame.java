package frames;

import listeners.MyKeyListener;
import listeners.MyMouseListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by rpi on 17.01.17.
 */
public class MyFrame extends JFrame {

    private JButton btnPointer;

    public MyFrame(String s)
            throws HeadlessException {
        super(s);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buildGui();
        setVisible(true);
    }

    private void buildGui() {
        btnPointer = new JButton("Click Me!");
        btnPointer.addActionListener(
                (e) -> System.out.println(
                        Thread.currentThread().getName()
                )
        );
        btnPointer.addMouseListener(new MyMouseListener());
        btnPointer.addKeyListener(new MyKeyListener());
        add(btnPointer);
        pack();
    }

}
