import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dictionary {
    List<Word> list = new ArrayList<Word> ();


    /**
     * Them tu vao danh sach theo dung vi tri
     * @param word
     */
    public void addWord(Word word) {
        String newword = word.getNewWord();
        if(!compare(list.get(0).getNewWord(), newword)) {
            list.add(0,word);
        }
        else if(compare(list.get(list.size()-1).getNewWord(), newword)) {
            list.add(word);
        }
        else {
            for (int i = 0;i<list.size();i++) {
                if(compare(list.get(i).getNewWord(), newword) && compare(newword, list.get(i + 1).getNewWord())) {
                    list.add(i+1,word);
                }
            }
        }

    }

    /**
     * kiem tra s1 co nho hon s2 hay khong?.
     * @param s1
     * @param s2
     * @return
     */
    public static boolean compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len = Math.min(len1,len2);
        for(int i = 0;i < len;i++) {
            if(s1.charAt(i) < s2.charAt(i)) {
                 return true;
            }
            if (s1.charAt(i) > s2.charAt(i)) {
                return false;
            }
        }

        if(len1 < len2) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Tim kiem tu trong danh sach, thong bao neu khong tim thay
     * @param word
     * @return
     */
    public String findWord(String word) {
        for (int i = 0; i < list.size(); i++) {
            if(Objects.equals(word, list.get(i).getNewWord())) {
                return list.get(i).getMeanWord();
            }
        }
        return "dont found";
    }

    /**
     *
     * @param word
     */
    public void remove(String word) {
        for (int i = 0; i < list.size(); i++) {
            if(Objects.equals(word, list.get(i).getNewWord())) {
                list.remove(i);
                break;
            }
        }
    }

    /**
     * Sua tu
     */
    public void fixword(String word, String mean) {
        for (int i = 0; i < list.size(); i++) {
            if(Objects.equals(word, list.get(i).getNewWord())) {
                list.get(i).setMeanWord(mean);
                break;
            }
        }
    }

    /**
     * main
     * @param args
     */
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
        System.out.println(dic1.findWord("connect"));
    }
}
