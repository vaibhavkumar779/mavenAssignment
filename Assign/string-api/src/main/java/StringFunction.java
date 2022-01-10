
public class StringFunction {
    public static void reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void lengthOfString(String str) {
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.length());
    }
}

