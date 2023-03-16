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

    public static void main(String[] args) {
        // Kontrollera om två texter är anagram av varandra. Till vår hjälp har vi:
        //   - count       --> räknar antalet av bokstaven X i en text
        //   - removeSpace --> tar bort mellanslag i en text
    }
}