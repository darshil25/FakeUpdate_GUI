import javax.swing.*;
import java.awt.*;

public class FakeUpdate {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a JFrame
            JFrame frame = new JFrame();
            frame.setUndecorated(true); // Set frame decoration to none

            // Load the GIF file
            ImageIcon gifIcon = new ImageIcon("./FUpdate5.gif");

            // Create a JLabel to display the GIF
            JLabel gifLabel = new JLabel(gifIcon);

            // Set JLabel size to screen size
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            gifLabel.setSize(screenSize.width, screenSize.height);

            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.getContentPane().setBackground(Color.BLACK);

            // Add the JLabel to the frame's content pane
            frame.getContentPane().add(gifLabel, BorderLayout.CENTER);

            // Hide the cursor
            Cursor invisibleCursor = Toolkit.getDefaultToolkit().createCustomCursor(
                    new ImageIcon(new byte[0]).getImage(),
                    new Point(0, 0),
                    "InvisibleCursor");
            frame.setCursor(invisibleCursor);

            // Show the frame
            frame.setVisible(true);
        });
    }
}