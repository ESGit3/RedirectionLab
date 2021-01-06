
public class PigLatin {
    public static String pigLatinSimple(String s) {

        if (s.substring(0, 1).matches("^(a|e|i|o|u)")) {
            return s + "hay";
        }
        return s.substring(1) + s.substring(0, 1) + "ay";
    }

    public static String pigLatin(String s) {
        s = s.toLowerCase();
        String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        for (String i : digraphs) {
            if (s.substring(0, 2).equals(i)) {
                return s.substring(2) + s.substring(0, 2) + "ay";
            }
        }
        if (s.substring(0, 1).matches("^(a|e|i|o|u)")) {
            return s + "hay";
        }
        return s.substring(1) + s.substring(0, 1) + "ay";
    }

    public static void main(String[] args) {
        System.out.println(pigLatinSimple("mock"));
        System.out.println(pigLatinSimple("pie"));
        System.out.println(pigLatinSimple("david"));
        System.out.println(pigLatinSimple("aaron") + "\n");

        System.out.println(pigLatin("the"));
        System.out.println(pigLatin("check"));
        System.out.println(pigLatin("skee"));
        System.out.println(pigLatin("emu"));
        System.out.println(pigLatin("grade"));

    }
}