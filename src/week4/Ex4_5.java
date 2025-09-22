//this()로 다른 생성자 호출
//예제 4-4에사 직상힌 Book class의 생성자를 this()를 이용하려 수정하라
package week4;

public class Ex4_5 {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Ex4_5() {
        this("","");
        System.out.println("생성자 호출됨");
    }

    public Ex4_5(String title) {
        this(title, "작자미상");
    }

    public Ex4_5(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Ex4_5 littlePrince = new Ex4_5("어린왕자", "생택쥐페리");
        Ex4_5 loveStory = new Ex4_5("춘향전");
        Ex4_5 emptyBook = new Ex4_5();
        loveStory.show();
        emptyBook.show();
        littlePrince.show();
    }
}
