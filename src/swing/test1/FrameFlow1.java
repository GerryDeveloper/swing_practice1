package swing.test1;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FrameFlow1 {


    JFrame frame;

    JPanel panel ;
    JPanel leftPanel;

    JLabel label1;


    public FrameFlow1() {

        String tituloJFrame = "Una Ventana Swing muy Simple";
        frame = new JFrame(tituloJFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,650);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        addPanel();

        frame.add(panel);
        frame.setVisible(true);
    }

    private void addPanel() {
        panel = new JPanel();
        LineBorder linePanel = new LineBorder(Color.red, 1);
        //panel.setLayout(new FlowLayout());
        panel.setBackground(Color.pink);
        panel.setBorder(linePanel);

        panel.add(addLeftInnerPanel(frame.getWidth(), frame.getHeight()));
        panel.add(addRightInnerPanel(frame.getWidth(), frame.getHeight()));
        //panel.setSize(800,450);

    }

    private JPanel addLeftInnerPanel(int w1, int h1) {
        leftPanel = new JPanel();
        LineBorder lineBorder = new LineBorder(Color.black, 2);

        leftPanel.setBorder(lineBorder);
        leftPanel.setPreferredSize( new Dimension( (w1/2) - 4, h1 - 4));
        leftPanel.setBackground(Color.BLUE);

        leftPanel.add(addLabel1Left());

        return leftPanel;
    }
    private JLabel addLabel1Left () {

        label1 = new JLabel();
        String panel1Text = "Texto del Panel (DNI):";
        LineBorder lineBorder = new LineBorder(Color.red, 3);
        label1.setBorder(lineBorder);
        label1.setBounds(100,50, 40,20);
        label1.setText(panel1Text);

        return label1;
    }

    private JPanel addRightInnerPanel(int w1, int h1) {
        JPanel rightPanel = new JPanel();
        LineBorder lineBorder = new LineBorder(Color.BLACK, 2);

        rightPanel.setBorder(lineBorder);
        rightPanel.setPreferredSize( new Dimension((w1/2) - 4, h1 - 4));
        rightPanel.setBackground(Color.GREEN);

        return rightPanel;
    }
}
