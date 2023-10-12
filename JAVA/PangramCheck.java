import java.util.*;

public class PangramCheck {
    public static boolean isPangram(String input)
    {
        input = input.toLowerCase();
        boolean[] alp = new boolean[26];
        for (int i=0;i<input.length();i++) {
            char ch=input.charAt(i);
            if (ch>='a' && ch<='z') {
                alp[ch-'a']=true;
            }
        }
        for (boolean letter:alp) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input=sc.nextLine();
        boolean isPangram=isPangram(input);
        if (isPangram) 
        {
            System.out.println("it's Pangram");
        } else {
            System.out.println("it's Not a Pangram");
        }
    }
}
