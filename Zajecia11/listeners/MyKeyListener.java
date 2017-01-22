package listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by rpi on 17.01.17.
 */
public class MyKeyListener extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        super.keyPressed(keyEvent);

        if (keyEvent.isControlDown()) {
            if (keyEvent.getKeyCode()
                    == KeyEvent.VK_C) {
                System.out.println("Ctrl + C");
            }
        }
    }
}
