import java.io.*;
import java.util.*;
public class candi
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int count=1;
    int flag=1;
    int a[]=new int[num];
    for(int i=0;i<num;i++)
    {
      a[i]=s.nextInt();
      if(i!=0)
      {
        if(a[i-1]<a[i])
          flag=flag+1;
        else
          flag=1;
        count+=flag;
      }
    }
    System.out.println(count);
  }
}
