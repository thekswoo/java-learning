package chap08_stream;

import java.io.FileReader;
import java.io.IOException;

public class Ex8_4 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        FileWriter fout = null;
//        int c;
//        try {
//            fout = new FileWriter("./test.txt");
//            while (true) {
//                String line = sc.nextLine();
//                if (line.length() == 0) {
//                    break;
//                }
//                fout.write(line, 0, line.length());
//                fout.write("\r\n", 0, 2);
//            }
//            fout.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//        sc.close();

        FileReader fin = null;
        try{
            fin = new FileReader("./Temp/test.txt");
            int c_;
            while((c_ = fin.read()) != -1){
                System.out.print((char)c_);
            }
            fin.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
