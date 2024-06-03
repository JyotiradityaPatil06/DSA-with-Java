package Recursion.Permutations;

import java.util.ArrayList;

/**
 * permute
 */
public class permute {

    public static void main(String[] args) {
        // permutations("", "abc");
        ArrayList<String> ans = permutatList("", "abc");
        System.out.println(ans);
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String fStr = p.substring(0, i);
            String sStr = p.substring(i, p.length());
            permutations(fStr + ch + sStr, up.substring(1));
        }
    }

    static ArrayList<String> permutatList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < p.length(); i++) {
            String fStr = p.substring(0, i);
            String sStr = p.substring(i, p.length());
            ans.addAll(permutatList(fStr + ch + sStr, up.substring(1)));
        }

        return ans;
    }
}