package string_1;

public class P26_frontAgain {
    public boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        return str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

}
