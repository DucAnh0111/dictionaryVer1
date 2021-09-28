import java.util.Objects;
import java.util.Scanner;
public class DicTest {

    public static void main(String[] args) {
        Dictionary dic1 = new Dictionary();
        Word w1 = new Word("hello","xin chao");
        Word w2 = new Word("school","truong hoc");
        dic1.list.add(w1);
        dic1.list.add(w2);
        Word w3 = new Word("kitty","con meo");
        Word w4 = new Word("attack","tan cong");
        Word w5 = new Word("year","nam");
        Word w6 = new Word("connect","ket noi");
        dic1.addWord(w3);
        dic1.addWord(w4);
        dic1.addWord(w5);
        dic1.addWord(w6);
        dic1.fixword("connect", "deo tim gi ca");
        //for (int i = 0; i < dic1.list.size(); i++) {
       //     System.out.println(dic1.list.get(i).showWord());
       // }


        while(true) {
            System.out.println("Xin moi nhap tu can tim, enter 'X' to exit");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(!Objects.equals((String) s, "X")) {
               String resault = dic1.findWord((String) s);
               if(!Objects.equals(resault, "dont found")) {
                   System.out.println(resault);
               }
               else {
                   System.out.println("do you want add word?, print enter key '1' to add, else enter '0' ");
                   int n = sc.nextInt();
                   if(n==1) {
                       System.out.println("enter your mean: ");
                       Scanner sc1 = new Scanner(System.in);
                       String mean = sc1.nextLine();
                       Word w = new Word((String) s,(String) mean);
                       dic1.addWord(w);
                       System.out.println("word was added!!!");
                   }
               }
            } else break;;
        }
        System.out.println("Dictionary - ended");
    }
}
