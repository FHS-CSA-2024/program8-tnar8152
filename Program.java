import java.util.Scanner;
//import stuff here

//Your code here
public class program8{
public static void main(String[] args){
    Scanner int1 = new Scanner(System.in);
    Scanner int2 = new Scanner(System.in);
    System.out.println("enter integer 1");
    int a = int1.nextInt();
    System.out.println(" enter integer 2");
    int b = int2.nextInt();
    
    if(a>b){
    int min=b;
    int max=a;
    int sum = a + b;
    int product = a*b;
    int difference = a-b;
    int distance = Math.abs(difference);
    double average = (double) (a+b)/2;
    System.out.println("sum = "+ sum);    
System.out.println("product = "+ product);
System.out.println("difference = "+ difference);
System.out.println("distance = "+ distance);
System.out.println("minimum = "+ min) ;
System.out.println("maximum = "+ max);
System.out.println("average = "+ average);

    
    }
    else{ 
        int min =a;
    int max =b;
     int sum = a + b;
    int product = a*b;
    int difference = a-b;
    int distance = Math.abs(difference);
    double average = (double) (a+b)/2;
    System.out.println("sum = "+ sum);    
System.out.println("product = "+ product);
System.out.println("difference = "+ difference);
System.out.println("distance = "+ distance);
System.out.println("minimum = "+ min) ;
System.out.println("maximum = "+ max);
System.out.println("average = "+ average);
    }


}
    }
//Paste console output below:
/*


*/
//import stuff here

//Your code here

//Paste console output below:
/*
sum = 33
product = 260
difference = -7
distance = 7
minimum = 13
maximum = 20
average = 16.5

*/
