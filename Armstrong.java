public class Armstrong{
public static void main (String[]args){
int n=153;
int a=n;
int i=0;
int j=0;
while(a>0){
i=a%10;
j=j+(i*i*i);
a=a/10;
}
if(n==j){
System.out.println("correct number"+j);
}
else{
System.out.println("Not an armstrong number");
}
}
}