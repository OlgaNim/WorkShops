public class Buckets {
    public static boolean isValid(String s) {
        int count1 = 0; int count2 = 0; int count3 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {count1 = count1 +1;}
            else if (s.charAt(i) == ')') {count1 = count1 -1;}
            else if (s.charAt(i) == '[') {count2 = count2 +1;}
            else if (s.charAt(i) == ']') {count2 = count2 -1;}
            else if (s.charAt(i) == '{') {count3 = count3 +1;}
            else if (s.charAt(i) == '}') {count3 = count3 -1;}

            if (count1  < 0 || count2 < 0 || count3 < 0) {
                break;
            }
        }
        if (count1  == 0 && count2 == 0 && count3 == 0) {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        isValid(")]");
    }
}
