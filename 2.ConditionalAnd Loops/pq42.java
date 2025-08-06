//Reverse A String In Java
public class pq42 {
    public static void main(String[] args) {
        String str = "helloworld";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        str = new String(chars);
        System.out.println(str);

    }
}
