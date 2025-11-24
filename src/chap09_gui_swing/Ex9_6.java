//배치관리자 없는 컨테이너에 컴포넌트를 절대 위치와 크기로 지정

package chap09_gui_swing;

import javax.swing.*;
import java.awt.*;

public class Ex9_6 extends JFrame {
    public Ex9_6() {
        setTitle("Null Container Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130,50); // 절대 위치 조정
        la.setSize(200,20); // 절대 크기 조정
        c.add(la);

        for(int i=1; i<=9; i++){
            JButton b = new JButton(Integer.toString(i)); // 버튼 생성
            b.setLocation(i*15, i*15); // 절대위치 조정
            b.setSize(50,20); // 절대크기 조정
            c.add(b);
        }
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex9_6();
    }
}
