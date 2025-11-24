//BoardLayout 배치관리자를 사용하는 예
/*
    BoardLayout 배치관리자를 사용하여 컨텐츠팬에 다음과 같이 5개의 버튼 컴포넌트를 삽입하라.
 */

package chap09_gui_swing;

import javax.swing.*;
import java.awt.*;

public class Ex9_4 extends JFrame {
    public Ex9_4() {
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new BorderLayout(0,0)); //수평 간격 30, 수직 간격 20
        c.add(new JButton("Calculate"), BorderLayout.CENTER);
        c.add(new JButton("add"),BorderLayout.NORTH);
        c.add(new JButton("sub"),BorderLayout.SOUTH);
        c.add(new JButton("mul"),BorderLayout.EAST);
        c.add(new JButton("div"),BorderLayout.WEST);

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex9_4();
    }
}
