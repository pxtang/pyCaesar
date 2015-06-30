import java.util.Scanner;


public class Caesar {
    
    public static char cipher(char input, int shift) {
        if ((input > 'Z' || input < 'A') && (input > 'z' || input < 'a')) {
            return input;
        }
        char output = (char)(input + shift);
        if (Character.isUpperCase(input)) {
            if (output > 'Z')
                output -= 26;
        } else {
            if (output > 'z')
                output -= 26;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        
        System.out.println("Input ciphertext:");
        String ciphertext = user.nextLine();
        System.out.println("Input shift amount:");
        int shift = Integer.parseInt(user.next());
        String encrypted = "";
        
        int slen = ciphertext.length();
        for (int i = 0; i < slen; i++) {
            char c = ciphertext.charAt(i);
            encrypted += cipher(c,shift);
        }
        
        System.out.println("Your text is:\n"+encrypted);
        user.close();
    }

}
