// Thomas Huber 8/29/17

import java.util.Scanner;
// jacob kys, get better feggit

public class Vowels {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word you for which would like the number of lowercase vowels of which word that is!?... pls good sir: ");
        String input = sc.nextLine();
        int a,e,i,o,u,c;
        a = e = i = o = u = c = 0;
        
        for(int n = 0; n < input.length(); n++) {
            if (input.charAt(n) == 'a') {
                a++;
            } else if (input.charAt(n) == 'e') {
                e++;
            }  else if (input.charAt(n) == 'i') {
                i++;
            }  else if (input.charAt(n) == 'o') {
                o++;
            }  else if (input.charAt(n) == 'u') {
                u++;
            } else {
                c++;
            }
        }
        System.out.printf("\nThese are the characters in " + input + " a:%d e:%d i:%d o:%d u:%d and %d consonants", a,e,i,o,u,c);
    }
}
