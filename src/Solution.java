class Solution {
    public static void reverseString(char[] s) {
        int n = s.length;
       //char[] d = new char[s.length];

        for (int i = 0; i < n; i++) {

            var temp = s[n -i -1];
            s[n -i -1] = s[i];
            s[i] = temp;


        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
}

