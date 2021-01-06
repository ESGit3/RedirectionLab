public class PigLatin {
    public static String pigLatinSimple(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        if (vowels.contains(s.charAt(0))) {
            return s + "hay";
        }
        return s.substring(1) + s.substring(0, 1) + "ay";
    }
}