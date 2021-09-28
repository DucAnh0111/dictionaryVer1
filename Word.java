public class Word {
    private String newWord;
    private String meanWord;

    public String getMeanWord() {
        return meanWord;
    }

    public void setNewWord(String newWord) {
        this.newWord = newWord;
    }

    public String getNewWord() {
        return newWord;
    }

    public void setMeanWord(String meanWord) {
        this.meanWord = meanWord;
    }

    public String showWord() {
        return newWord + " : " + meanWord;
    }

    public Word(String newWord, String meanWord) {
        this.newWord = newWord;
        this.meanWord = meanWord;
    }

}
