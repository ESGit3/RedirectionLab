import java.util.*;

public class MakeStars {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        while (n.hasNextLine()) {
            String temp = "";
            Scanner s = new Scanner(n.nextLine());


            while (s.hasNext()) {
                int wordLength = s.next().length();
                for (int i = 0; i < wordLength; i++) {
                    temp += "*";
                }
                temp += " ";
            }
            System.out.println(temp);
        }
    }
}