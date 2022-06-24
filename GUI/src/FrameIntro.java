import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
public class FrameIntro {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("This is a JFrame window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(400, 400);
        frame.setVisible(true);
//        ImageIcon image = new ImageIcon("path");
//        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(100, 200, 110));
    }
}
