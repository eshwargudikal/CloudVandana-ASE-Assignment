import java.util.*;
public class RomanToInteger {
 
   public static int convertRI(String str) 
   {
       if(str==null||str.length()==0) 
       {
           return 0;
       }
       Map<Character, Integer> m = new HashMap<>();
       m.put('I', 1);
       m.put('V', 5);
       m.put('X', 10);
       m.put('L', 50);
       m.put('C', 100);
       m.put('D', 500);
       m.put('M', 1000);
 
       int res = 0;
       for(int i=0;i<str.length()-1;i++) 
       {
            if(m.get(str.charAt(i))>=m.get(str.charAt(i+1)))
              {
                res=res+ m.get(str.charAt(i));
              }
              else
              {
                res=res-m.get(str.charAt(i));
              } 
        }
         res= res+ m.get(str.charAt(str.length()-1));
        return res;
   }
 public static void main(String[] args)
   {
     Scanner sc= new Scanner(System.in);
         System.out.print("Enter Roman numbers:");
          String str =sc.next();
          int result=convertRI(str);
          System.out.println("Integer:"+result);
    }
}
