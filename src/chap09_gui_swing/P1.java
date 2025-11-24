package chap09_gui_swing;

import javax.swing.*;
import java.awt.*;

public class P1 extends JFrame {
    public P1() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        GridLayout grid = new GridLayout(1, 10);
        c.setLayout(grid);

        for(int i = 0 ; i < 10 ; i ++) {
            JButton button =new JButton(Integer.toString(i));

            // 0.0 ~ 1.0 미만의 실수 반환
            int r = (int)(Math.random() * 256);
            int g = (int)(Math.random() * 256);
            int b = (int)(Math.random() * 256);

            button.setBackground(new Color(r,g,b));
            button.setOpaque(true);
            button.setBorderPainted(false);
            c.add(button);
        }

        setSize(600,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P1();
    }
}
