import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class NoButtonMouseListener implements MouseListener {

    public void mouseEntered(MouseEvent e) {
        Random random = new Random();
        int x = random.nextInt(200);
        int y = random.nextInt(200);
        Example.NO_BUTTON.setBounds(x, y, 85, 20);
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}