//palindrome with length 3
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        
        String str=sc.nextLine();
        
        HashMap<Character,Integer> left=new HashMap<>();
        HashMap<Character,Integer> right=new HashMap<>();
        
        for(char i:str.toCharArray())
        {
            right.put(i,right.getOrDefault(i,0)+1);
            left.put(i,0);
        }
        long ans=0;
        for(char i:str.toCharArray())
        {
            right.put(i,right.get(i)-1);
            for(char j:right.keySet())
            {
                if(right.get(j)!=0 && left.get(j)!=0)
                {
                    ans+=(right.get(j)*left.get(j));
                }
            }
            left.put(i,left.get(i)+1);
        }
        System.out.println(ans);
        
        
    }
}
