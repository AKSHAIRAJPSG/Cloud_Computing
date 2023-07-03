import java.util.*;

class cc{
public static void main(String[] agrs){
int n,m,i;
Scanner temp=new Scanner(System.in);
System.out.print("ENTER THE SIZE ARRAY 1:");
n=temp.nextInt();
System.out.print("ENTER THE SIZE ARRAY 2:");
m=temp.nextInt();
int[] a=new int[n];
int[] b=new int[m];
System.out.print("ENTER THE ARRAY 1 ELEMENTS:");
for(i=0;i<n;i++){
a[i]=temp.nextInt();
}
System.out.print("ENTER THE ARRAY 2 ELEMENTS:");
for(i=0;i<m;i++){
b[i]=temp.nextInt();
}
if(n>m){
int[] sum=new int[n];
for(i=0;i<m;i++){
sum[i]=a[i]+b[i];
}
for(;i<n;i++){
sum[i]=a[i];
}
System.out.print("SUM ELEMENTS:");
for(i=0;i<n;i++){
System.out.print(sum[i]+"\n");
}
}else{
int[] sum=new int[m];
for(i=0;i<n;i++){
sum[i]=a[i]+b[i];
}
for(;i<m;i++){
sum[i]=b[i];
}
for(i=0;i<m;i++){
System.out.print(sum[i]+"\n");
}
}
}
}