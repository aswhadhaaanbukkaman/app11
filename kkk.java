import java.io.*;
import java.util.*;

public class kkk{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int[] n=new int[v];
        for(int i=0;i<v;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i=0;i<v;i++)
        {
            if(n[i]==i)
            {
             System.out.print(n[i]);
            }
        }
        
     
        
            
        }
}
