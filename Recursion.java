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
    public static int fib(int n){
      return fibh(n,0);
    }
    private static int fibh(int n, int i){
      return 0;
    }
    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
      return null;
    }

}
