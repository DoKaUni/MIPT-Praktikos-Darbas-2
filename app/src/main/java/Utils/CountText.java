package Utils;

public class CountText {
    public static String getCharCount(String text){
        return String.valueOf(text.length());
    }
    public static String getWordCount(String text){
        String words = text.trim();
        return String.valueOf(words.split("\\s+").length);
    }
}
