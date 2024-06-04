package swing.test1;

import javax.swing.*;

public class ButtonDemo1 {

    public static void main(String[] args) {
        System.out.println("Testeamos agregar imagen a botones");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ButtonTest1 frame1 = new ButtonTest1();
            }
        });
    }
}
