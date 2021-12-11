import javax.swing.*;

public class Example {
    public static JButton YES_BUTTON = new JButton("Да");
    public static JButton NO_BUTTON = new JButton("Нет");
    public static JLabel TEXT = new JLabel("Ты гей?");
    public static JFrame FRAME = new JFrame();

    public static void main(String args[]) {
        TEXT.setBounds(60, 50, 85, 20);

        YesButtonListener yesButtonListener = new YesButtonListener();
        YES_BUTTON.addActionListener(yesButtonListener);
        YES_BUTTON.setBounds(30, 90, 85, 20);

        NoButtonMouseListener noButtonMouseListener = new NoButtonMouseListener();
        NO_BUTTON.addMouseListener(noButtonMouseListener);
        NO_BUTTON.setBounds(150, 90, 85, 20);

        initFrame();
    }

    private static void initFrame() {
        FRAME.add(TEXT);
        FRAME.add(YES_BUTTON);
        FRAME.add(NO_BUTTON);
        FRAME.setSize(300, 300);
        FRAME.setLayout(null);
        FRAME.setVisible(true);
    }

}
