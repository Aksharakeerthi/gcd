# gcd
import java.io.*;
import java.util.*;
public class gcd{
public static void main(String args[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the 1st number");
int k= Integer.parseInt(br.readLine());
System.out.println("Enter the 2nd number");
int m=Integer.parseInt(br.readLine());
int gcd=0;
int min = math.min(k,m);
for(int i=min;i>=1;--i){
if(k%i==0 && m%i==0){
gcd=i;
break;
}
}
System.out.println("The gcd of"+gcd);
}
}
