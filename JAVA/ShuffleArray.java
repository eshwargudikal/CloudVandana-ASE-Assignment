import java.util.*;
public class shufflearray 
{
    public static void main(String[] args)
    {
        Integer[] ar = {1, 2, 3, 4, 5};
        List<Integer> li = Arrays.asList(ar);
        Collections.shuffle(li);
        li.toArray(ar);
        for (int i = 0; i < ar.length; i++)
        {
           System.out.print(ar[i]+" ");
        }
    }
}
