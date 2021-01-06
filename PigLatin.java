
public class PigLatin {
    public static String pigLatinSimple(String s) {

        if (s.substring(0, 1).matches("^(a|e|i|o|u)")) {
            return s + "hay";
        }
        return s.substring(1) + s.substring(0, 1) + "ay";
    }

    public static void main(String[] args) {
        System.out.println(pigLatinSimple("mock"));
        System.out.println(pigLatinSimple("pie"));
        System.out.println(pigLatinSimple("david"));
        System.out.println(pigLatinSimple("aaron"));
    }
}