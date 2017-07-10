
import java.io.*;
import java.util.*;

public class Armstrong11
{
public static void main(String args[])
{
int i,j,k;
for(i=101;i<10000l;i++) 
{
         k=0;
         for(j=2;j<i;j++)
         {
                  if(i%j==0)
                  k++;
         }
         if(k==0)
         System.out.print(i+"   ");
}
}
}
