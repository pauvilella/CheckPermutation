import java.util.*;

public class Main {
    String original = "abcdefg";
    String other = "agdefcb";

    boolean increaseValue(HashMap<Character, Integer> h, char key, int x) {
        if(h.get(key) == null)
            h.put(key, 1);
        else {
            int actualValue = h.get(key);
            int newValue = actualValue + x;
            if(newValue < 0)
                return false;
            h.put(key, newValue);
        }
        return true;
    }

    boolean isPermutation(String a, String b) {
        if(a.length() != b.length())
            return false;
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        for(int i = 0; i < a.length(); i++) {
            increaseValue(letters, a.charAt(i), 1);
        }
        for(int i = 0; i < b.length(); i++) {
            if(!increaseValue(letters, b.charAt(i), -1))
                return false;
        }
        for(Map.Entry<Character, Integer> pair : letters.entrySet()) {
            if(pair.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Main program = new Main();
        boolean result = program.isPermutation(program.original, program.other);
        System.out.println(result);
    }
}
