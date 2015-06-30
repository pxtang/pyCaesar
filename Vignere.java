import java.util.Scanner;


public class Vignere extends Caesar {
    public static void main (String[] args) {
        Scanner user = new Scanner(System.in);
        
        System.out.println("Input ciphertext:");
        String ciphertext = user.nextLine();
        System.out.println("Input keyword:");
        String keyword = user.nextLine();
        System.out.println("E or D?");
        boolean e_mode = user.nextLine().toUpperCase().equals("E");
        
        int slen = ciphertext.length();
        int klen = keyword.length();
        
        // Repeats keyword to length
        // String keymatch = "";
        // for (int i = 0; i <= slen/klen; i++) {
        //     keymatch += keyword;
        // }
        // keymatch = keymatch.substring(0, slen);
        // End section
        
        String encrypted = "";
        
        for (int i = 0; i < slen; i++) {
            char c = ciphertext.charAt(i);
            // repeated keyword method
            // char k = keymatch.charAt(i);
            
            // math method
           char k = keyword.charAt(i % klen);
            
            int shift = 0;
            if (Character.isUpperCase(k)) {
                shift = k-'A';
            } else {
                shift = k-'a';
            }
            if (!e_mode)
                shift = 26-shift;
            
            encrypted += cipher(c,shift);
        }
        
        System.out.println("Your text is:\n"+encrypted);
        user.close();
    }
}
