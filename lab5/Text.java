package lab5;

public class Text {
    private Sentence[] sentences;
    public Text(String s) {
        System.out.println(":)");
        System.out.println(s);
//        String[] split = s.split("!|\\?|\\.");
        String[] split = s.split("(?<=(!|\\?|\\.)) ?");
        sentences = new Sentence[split.length];
    }
}
