public class PigLatin {
    public static String pigLatinSimple(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char i : vowels) {
            if (i == s.charAt(0)) {
                return s + "hay";
            }
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