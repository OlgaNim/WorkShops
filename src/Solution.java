class Solution {
    public static void reverseString(char[] s) {
        int indexOfChar = 0;
        int arraysLength = s.length;
        char[] d = new char[arraysLength];
        for (int i = arraysLength - 1; i >= 0; i--) {
            d[indexOfChar] = s[i];
            indexOfChar += 1;
        }
        s = d;
        System.out.println(s);
    }

    public static void test() {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
    public static void main(String[] args) {
        test();
    }
}


