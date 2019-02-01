import java.util.ArrayList;
public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return sqrth(n,tolerance,n);
    }
    private static double sqrth(double n, double tolerance, double guess){
      if(n==0){
        return 0;
      }
      if(Math.abs(guess*guess-n)>tolerance*n){
        guess = (n/guess + guess)/2;
        return sqrth(n,tolerance,guess);
      }
      return guess;
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static void main(String[] args){
      for(int i=0;i<200;i++){
      System.out.print(fib(i)+" ");
      }
    }
    public static int fib(int n){
      return fibh(n,1,1,0);
    }
    private static int fibh(int n, int i, int j, int ct){
      if(n<2){
        return 1;
      }
      if(ct==n-1){
        return j;
      }
      return fibh(n,j,i+j,ct+1);
    }
    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      if(n==0){
        ArrayList<Integer> a = new ArrayList<Integer();
        a.add(0);
      }
      return null;
    }

}
