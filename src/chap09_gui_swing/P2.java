package chap09_gui_swing;

import javax.swing.*;
import java.awt.*;

public class P2 extends JFrame {
    public P2() {
        setTitle("Calculator Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel panelNorth = new JPanel();
        panelNorth.add(new JLabel("Enter formula"));
        panelNorth.add(new JTextField(20));
        panelNorth.setBackground(Color.GRAY);


        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(4, 4, 10, 10));

        for (int i = 0; i < 10; i++) {
            panelCenter.add(new JButton("" + i));
        }
        panelCenter.add(new JButton("CE"));
        panelCenter.add(new JButton("RUN"));

        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        plusButton.setBackground(Color.CYAN);
        minusButton.setBackground(Color.CYAN);
        multiplyButton.setBackground(Color.CYAN);
        divideButton.setBackground(Color.CYAN);
        plusButton.setOpaque(true);
        minusButton.setOpaque(true);
        multiplyButton.setOpaque(true);
        divideButton.setOpaque(true);
        plusButton.setBorderPainted(false);
        minusButton.setBorderPainted(false);
        multiplyButton.setBorderPainted(false);
        divideButton.setBorderPainted(false);

        panelCenter.add(plusButton);
        panelCenter.add(minusButton);
        panelCenter.add(multiplyButton);
        panelCenter.add(divideButton);

        JPanel panelSouth = new JPanel();
        panelSouth.add(new JLabel("Result"));
        panelSouth.add(new JTextField(20));
        panelSouth.setBackground(Color.YELLOW);

        contentPane.add(panelNorth, BorderLayout.NORTH);
        contentPane.add(panelCenter, BorderLayout.CENTER);
        contentPane.add(panelSouth, BorderLayout.SOUTH);

        setSize(500, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new P2();
    }
}

