//check if all lowercase is present
//^ is used for counting odd and even counts
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        for(char i :str.toCharArray())
        {
            flag=flag^(1<<(i-'a'));
        }
        System.out.println((flag&(flag-1))==0);
    }
}
