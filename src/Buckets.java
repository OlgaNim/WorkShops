public class Buckets {
    public boolean isValid(String s) {

        return (s.indexOf('(') < s.indexOf(')') && (s.indexOf('(') >= 0 && s.indexOf(')') >= 0)
                || s.indexOf('[') < s.indexOf(']') && (s.indexOf('[') >= 0 && s.indexOf(']') >= 0)
                || s.indexOf('{') > s.indexOf('}')) && (s.indexOf('{') >= 0 && s.indexOf('}') >= 0);
    }
    public static void main(String[] args) {
    }
}

