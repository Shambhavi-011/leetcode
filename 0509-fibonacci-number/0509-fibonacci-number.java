import java.util.Scanner;

public class Solution{

    static int fib(int n){
      if ( n<= 1)
        return n;
   return fib(n-1) + fib(n-2);  
    }

   public static void main(String[] args){
    Scanner sc = new Scanner (System.in);

    System.out.print("enter the no. of terms:");
    int n = sc.nextInt();

    System.out.print("Fibonacci Series:");
    for(int i= 0; i<n; i++){
    System.out.print(fib(i)+" ");
    }

  sc.close();
  }
}