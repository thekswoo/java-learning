//마우스로 문자열 이동시키기 - 마우스 이벤트 연습
/*
    컨텐트팬의 아무 위치에 마우스 버튼을 누르면
    마우스 포인트가 있는 위치로 "hello" 문자열을 옮기는 스윙 응용프로그램을 작성
 */
package chap10_event1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10_4 extends JFrame {
    private JLabel la = new JLabel("Hello");

    public Ex10_4() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setSize(300, 300);
        setVisible(true);

        c.addMouseListener(new MyMouseListener());
        la.setLocation(50, 50);
        la.setSize(200, 20);
        c.add(la);
    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x,y);
        }
    }

    public static void main(String[] args) {
        new Ex10_4();
    }
}
