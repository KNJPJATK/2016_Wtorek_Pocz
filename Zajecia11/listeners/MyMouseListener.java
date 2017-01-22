package listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by rpi on 17.01.17.
 */
public class MyMouseListener extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        super.mouseClicked(mouseEvent);

        if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
            System.out.println("MyMouseListener.mouseClicked");
        }
    }
}
