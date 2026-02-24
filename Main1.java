import java.util.*;

class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        for(char i :str.toCharArray())
        {
            flag=flag|(1<<(i-'a'));
        }
        System.out.println(flag==((1<<26)-1));
    }
}
