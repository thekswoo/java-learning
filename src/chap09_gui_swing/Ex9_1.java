//300*300 크기의 스윙 프레임 만들기
/*
    300*300 크기의 스윙 프레임을 작성하라.
 */
package chap09_gui_swing;

import javax.swing.*;

public class Ex9_1 extends JFrame{
    public Ex9_1(){
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ex9_1 frame = new Ex9_1();
    }
}
