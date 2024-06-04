package swing.test1;

import javax.swing.*;

public class ButtonTest1 {

    JFrame frame;
    JPanel panel;
    JButton button;
    ImageIcon image;

    public ButtonTest1 () {
        initialice();
    }

    private void initialice() {
        frame = new JFrame();

        frame.setSize(800,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        //addButton();
        button = createButton1();

        panel.add(button);

        frame.add(panel); // if only add element, CENTER by default

        frame.setVisible(true);
    }

    public void addButton() {
        button = new JButton("Esto es un botón");
        button.setFocusable(false);

        this.panel.add(button);
    }

    public JButton createButton1() {
        button = new JButton();
        button.setText("Print"); // Esto es un boton en swings
        //button.setSize(100,40);
        button.setFocusable(false);

        //sImageIcon icon = new ImageIcon(ButtonTest1.class.getResource("logo1.png"));
        ImageIcon printIcon = new ImageIcon(ButtonTest1.class.getResource("\\logo1.png"));
        // "\\logo1.png" works, also "logo1.png" works!
        //ImageIcon printIcon = new ImageIcon("logo1.png"); // this does not work

        button.setIconTextGap(16);
        button.setToolTipText("Esto es toolTiptext de un JButton");
        button.setIcon(printIcon);

        return button;
    }

}
/**
 *
 *package swing.test1;
 *
 * import javax.swing.*;
 *
 * public class ButtonTest1 {
 *
 *     JFrame frame;
 *     JPanel panel;
 *     JButton button;
 *     ImageIcon image;
 *
 *     public ButtonTest1 () {
 *         initialice();
 *     }
 *
 *     private void initialice() {
 *         frame = new JFrame();
 *
 *         frame.setSize(800,300);
 *         frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 *         frame.setLocationRelativeTo(null);
 *
 *         panel = new JPanel();
 *
 *         //addButton();
 *         button = createButton1();
 *
 *         panel.add(button);
 *
 *         frame.add(panel); // if only add element, CENTER by default
 *
 *         frame.setVisible(true);
 *     }
 *
 *     public void addButton() {
 *         button = new JButton("Esto es un botón");
 *         button.setFocusable(false);
 *
 *         this.panel.add(button);
 *     }
 *
 *     public JButton createButton1() {
 *         button = new JButton();
 *         button.setText("Print"); // Esto es un boton en swings
 *         //button.setSize(100,40);
 *         button.setFocusable(false);
 *
 *         //sImageIcon icon = new ImageIcon(ButtonTest1.class.getResource("logo1.png"));
 *         ImageIcon printIcon = new ImageIcon(ButtonTest1.class.getResource("logo1.png"));
 *         //ImageIcon printIcon = new ImageIcon("logo1.png"); // this does not work
 *
 *         button.setIconTextGap(16);
 *         button.setToolTipText("Esto es toolTiptext de un JButton");
 *         button.setIcon(printIcon);
 *
 *         return button;
 *     }
 *
 * }
 */

