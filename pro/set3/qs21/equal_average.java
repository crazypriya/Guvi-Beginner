import java.io.*;
import java.util.*;
public class equal_average
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new Int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
       int avg1=0;
       int avg2=0;
       for(j=0;j<i+1;j++)
       {
          int sum1=sum1+a[i];
         avg1=sum/(j+1);
       }
       for(k=i+1;k<n;k++)
       {
          int sum2=sum2+a[k];
         avg1=sum/(k-i); 
       }
      if(avg1==avg2)
      {
        System.println("yes");
        break;
      }
      else
       int count=j;
    }
    if(count>=n)
      System.println("no");
  }
}
