//생성자 선언 및 활용 연습
//제목과 저자를 나타내는 title과 author 필드를 가진 Book class를 작성하고, 생성자를 작성하여 필드를 초기화 하라.

package chap04_class;

public class Ex4_4 {
    String title;
    String author;

    public Ex4_4(String t){
        title = t;
        author = "작자미상";
    }

    public Ex4_4(String t,String a){
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Ex4_4 littlePrince = new Ex4_4("어린왕자","생택쥐페리");
        Ex4_4 loveStory = new Ex4_4("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
