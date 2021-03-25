public class Swap{
public static void main(String[]args){
int a=4;
int b=5;
b=b+a;
a=b-a;
b=b-a;
System.out.println("Given value of a is 4"+"After swapping the value of a is"+a);
System.out.println("Given value of b is 5"+"After swapping the value of b is"+b);
}
}