//FlowLayout 배치관리자 활용
/*
    수평 간격이 30, 수직 간격을 40픽셀로 하고
    LEFT로 정렬 배치하는 FlowLayout 배치 관리자를 가진 컨텐트팬에
    5개의 버튼 컴포넌트를 부착한 스윙 응용프로그램을 작성하라.
 */
package chap09_gui_swing;

import javax.swing.*;
import java.awt.*;

public class Ex9_3 extends JFrame {
    public Ex9_3() {
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        c.add(new JButton("add"));
        c.add(new JButton("sub"));
        c.add(new JButton("mul"));
        c.add(new JButton("div"));
        c.add(new JButton("Calculate"));

        setSize(400, 300); //바꾼 size 크기
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex9_3();
    }
}
