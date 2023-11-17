import java.util.Scanner;

public class CEZARA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word to encode:");
        String wordToCode = input.nextLine();
        System.out.println("Enter the key for encoding:");
        int codeKey = input.nextInt();
        input.nextLine();

        System.out.println(code(wordToCode, codeKey));

        System.out.println("Enter the word to decode:");
        String wordToDecode = input.nextLine();
        System.out.println("Enter the key for decoding:");
        int decodeKey = input.nextInt();
        input.nextLine();

        System.out.println(decode(wordToDecode, decodeKey));
    }

    public static String code(String word,int key){
        StringBuilder bobbudowniczy = new StringBuilder();
        for(int i = 0;i<=word.length()-1;i++){
            int oldChar = word.charAt(i);
            char newChar = (char) (oldChar+key);
            bobbudowniczy.append(newChar);
        }
        return bobbudowniczy.toString();
    }
    public static String decode(String word,int key){
        StringBuilder bobbudowniczy = new StringBuilder();
        for(int i = 0;i<=word.length()-1;i++){
            int oldChar = word.charAt(i);
            char newChar = (char) (oldChar-key);
            bobbudowniczy.append(newChar);
        }
        return bobbudowniczy.toString();
    }
}


