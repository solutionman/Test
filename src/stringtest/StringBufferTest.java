package stringtest;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append("hello");
        sb.append(" StringBuffer");
        sb.append(" world");
        System.out.println(sb);
    }
}
