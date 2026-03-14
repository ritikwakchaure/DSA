public class RemoveVowels {
    public boolean isVowels(char c) {
        return c == 'a' || c == 'e' ||
                c == 'i' || c == 'o' ||
                c == 'u' ||
                c == 'A' || c == 'E' ||
                c == 'I' || c == 'O' ||
                c == 'U';
    }

    public String reverseVovels(String s) {
        int n = s.length() - 1;
        char[] ch = s.toCharArray();

        int i = 0, j = ch.length - 1;

        while (i < j) {
            if (!isVowels(ch[i]))
                i++;
            else if (!isVowels(ch[j]))
                j--;
            else {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }

        }
        return new String(ch);
    }

    public static void main(String[] argc){
        RemoveVowels obj = new RemoveVowels();
        String  s = "hello";

        String result = obj.reverseVovels(s);

        System.out.println("String: " + s);
        System.out.println("String Reverse: "+ result);


    }
}
