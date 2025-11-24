//GridLayout으로 입력 폼 만들기
/*
    아래 화면과 같이 사용자로부터 입력 받는 폼을 스윙 응용프로그램을 작성하라.
 */

package chap09_gui_swing;

import javax.swing.*;
import java.awt.*;

public class Ex9_5 extends JFrame {
    public Ex9_5(){
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //사용자가 창을 닫으면 완전히 닫힘

        GridLayout grid = new GridLayout(4, 2); //4행 2열 크기의 표 형태 레이아웃
        grid.setVgap(5); //각 행의 수직 간격을 5픽셀로 설정

        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JLabel(" 이름"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학번"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 학과"));
        c.add(new JTextField(""));
        c.add(new JLabel(" 과목"));
        c.add(new JTextField(""));
        setSize(300, 300); //창의 크기 설정
        setVisible(true); //창이 보이게 설정
    }

    public static void main(String[] args) {
        new Ex9_5();
    }
}
