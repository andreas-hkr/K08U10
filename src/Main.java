import java.util.Scanner;

public class Main {
    static int count (String s, char c) {
        int n = 0;
        for (int i=0; i<s.length(); i++)
            if (s.charAt(i)== c)
                n++;
        return n;
    }

    static String removeSpace(String text) {
        String r = "";
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                r += text.charAt(i);
            }
        }
        return r;
    }

    static boolean isAnagram(String s1, String s2) {
        s1 = removeSpace(s1);
        s2 = removeSpace(s2);

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i=0; i < s1.length(); i++) {
            if (count(s1, s1.charAt(i)) != count(s2, s1.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Kontrollera om två texter är anagram av varandra. Till vår hjälp har vi:
        //   - count       --> räknar antalet av bokstaven X i en text
        //   - removeSpace --> tar bort mellanslag i en text

        Scanner input = new Scanner(System.in);
        System.out.print("Ange text 1: ");
        String s1 = input.nextLine();
        System.out.print("Ange text 2: ");
        String s2 = input.nextLine();

        if (isAnagram(s1, s2)) {
            System.out.println("Detta var ett anagram.");
        } else {
            System.out.println("Detta var inte ett anagram.");
        }
    }
}