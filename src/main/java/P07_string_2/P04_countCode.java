package P07_string_2;

public class P04_countCode {
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++)
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') count++;
        return count;
    }

}
