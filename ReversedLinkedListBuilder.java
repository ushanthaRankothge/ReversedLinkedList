
/**
 *
 * @author UR
 */
// leet code problem 
// please reverse 1,2,3,4,5 to output 
import java.util.*;
public class ReversedLinkedListBuilder {
    public static void main (String[] args)
    {
       LinkedList linkList = new LinkedList();
       linkList.add(1);
       linkList.add(2);
       linkList.add(3);
       linkList.add(4);
       linkList.add(5);
       
       StringBuilder builder = new StringBuilder();
       builder.append(linkList);
       builder.reverse();
       
       System.out.println("reversed linkedList with Stringbuilder" + builder);
       
    }
}
