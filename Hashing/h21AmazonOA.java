import java.util.HashMap;
import java.util.Scanner;

public class h21AmazonOA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String t = scanner.next();

        HashMap<Character, Long> mp1 = new HashMap<>();
        HashMap<Character, Long> mp2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            mp1.put(c, mp1.getOrDefault(c, 0L) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            mp2.put(c, mp2.getOrDefault(c, 0L) + 1);
        }

        long cnt = (long) 1e9;

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!mp1.containsKey(c)) {
                System.out.println(0);
                return;
            }

            long val = mp1.get(c) / mp2.get(c);
            cnt = Math.min(cnt, val);
        }

        System.out.println(cnt);
    }


}