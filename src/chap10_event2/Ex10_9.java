package chap10_event2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_9 extends JFrame {
    private JLabel la = new JLabel("No Mouse Event");

    public Ex10_9() {
        setTitle("Ex10_9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        c.add(la);

        setSize(350, 300);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener , MouseMotionListener {
        public void mousePressed(MouseEvent e) {
            la.setText("Mouse Pressed(" + e.getX() + "," + e.getY() + ")");
        }
        public void mouseReleased(MouseEvent e) {
            la.setText("Mouse Released(" + e.getX() + "," + e.getY() + ")");
        }
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.CYAN);
        }
        public void mouseExited(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.YELLOW);
        }
        public void mouseDragged(MouseEvent e) {
            la.setText("Mouse Dragged(" + e.getX() + "," + e.getY() + ")");
        }
        public void mouseMoved(MouseEvent e) {
            la.setText("Mouse Moved(" + e.getX() + "," + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new Ex10_9();
    }
}
