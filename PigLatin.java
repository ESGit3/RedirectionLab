import java.util.*;

public class PigLatin {
    public static String pigLatinSimple(String s) {

        if (s.substring(0, 1).matches("^(a|e|i|o|u)")) {
            return s + "hay";
        }
        if (s.length() == 1) {
            return s + "ay";
        }
        return s.substring(1) + s.substring(0, 1) + "ay";
    }

    public static String pigLatin(String s) {
        s = s.toLowerCase();
        if (s.length() == 1) {
            return s + "ay";
        }
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

    public static String pigLatinBest(String s) {
        s = s.toLowerCase();

        if (!Character.isLetter(s.charAt(0))) return s;

        char punctuation = '\0';
        if (!Character.isLetterOrDigit(s.charAt(s.length() - 1))) {
            punctuation = s.charAt(s.length() - 1);
            s = s.substring(0, s.length() - 1);
        }

        if (s.substring(0, 1).matches("^(a|e|i|o|u)")) {
            return s + "hay" + punctuation;
        }

        if (s.length() == 1) {
            return s + "ay" + punctuation;
        }

        String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        for (String i : digraphs) {
            if (s.substring(0, 2).equals(i)) {
                return s.substring(2) + s.substring(0, 2) + "ay" + punctuation;
            }
        }
        return s.substring(1) + s.substring(0, 1) + "ay" + punctuation;
    }

    public static void main(String[] args) {
        //initial tests
//        System.out.println(pigLatinSimple("mock"));
//        System.out.println(pigLatinSimple("pie"));
//        System.out.println(pigLatinSimple("david"));
//        System.out.println(pigLatinSimple("aaron") + "\n");
//
//        System.out.println(pigLatin("the"));
//        System.out.println(pigLatin("check"));
//        System.out.println(pigLatin("skee"));
//        System.out.println(pigLatin("emu"));
//        System.out.println(pigLatin("grade") + "\n");
//
//        System.out.println(pigLatinBest("*emu"));
//        System.out.println(pigLatinBest("4chan"));
//        System.out.println(pigLatinBest("fish!"));
//        System.out.println(pigLatinBest("fish"));
//        System.out.println(pigLatinBest("the."));
//        System.out.println(pigLatinBest("cat!"));
//        System.out.println(pigLatinBest("amazing?"));
//        System.out.println(pigLatinBest("apple%"));
        Scanner n = new Scanner(System.in);

        while (n.hasNextLine()) {
            String temp = "";
            Scanner s = new Scanner(n.nextLine());


            while (s.hasNext()) {
                temp += pigLatinBest(s.next());
                temp += " ";
            }
            temp = temp.substring(0, temp.length() - 1);
            System.out.println(temp);
        }
    }
}