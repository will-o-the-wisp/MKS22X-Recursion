import java.util.ArrayList;
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static boolean closeEnough(double a, double b){
    if(a==0.0 && b==0.0)return true;
    if(a==0.0)return b < 0.00000000001;
    if(b==0.0)return a < 0.00000000001;
    return Math.abs(a-b)/a < 0.0001;//This is the normal % difference allowed

}


//testcase must be a valid index of your input/output array
public static void testFib(int testcase){
  recursion r = new recursion();
  int[] input = {0,1,2,3,5,30};
  int[] output ={0,1,1,2,5,832040};
  int max = input.length;
  if(testcase < input.length){
    int in = input[testcase];
    try{

      int ans = r.fib(in);
      int correct = output[testcase];
      if(ans == correct){
        System.out.println("PASS test fib "+in+". "+correct);
      }
      else{
        System.out.println("FAIL test fib"+in+". "+ans+" vs "+correct);

      }
    }catch(IllegalArgumentException n){
      if(in < 0){
        System.out.println("PASS test fib"+in+" IllegalArgumentException");
      }else{
        System.out.println(" FAIL IllegalArgumentException in test case:"+in);
      }
    }catch(Exception e){
      System.out.println(" FAIL Some exception in test case:"+in);
    }
  }
}


//testcase must be a valid index of your input/output array
public static void testSqrt(int testcase){
  recursion r = new recursion();
  double[] input = {0.0,1.0, 2.0, 4.0, 7.0};
  double[] output = {0.0,1.0,1.4142135623730951,2.0,2.6457513110645907};
  int max = input.length;
  if(testcase < input.length){
    double in = input[testcase];
    try{

      double ans = r.sqrt(in,.00001);
      double correct = Math.sqrt(in);
      if(closeEnough(ans,correct)){
        System.out.println("PASS test sqrt "+in+" "+ans);
      }
      else{
        System.out.println("FAIL test sqrt "+in+" "+ans+" vs "+correct);

      }
    }catch(IllegalArgumentException n){
      if(in < 0){
        System.out.println("PASS test sqrt"+in+" IllegalArgumentException");
      }else{
        System.out.println(" FAIL IllegalArgumentException in test case:"+in);
      }
    }catch(Exception e){
      System.out.println(" FAIL Some exception in test case:"+in);
    }
  }
}
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
      for(int i=0;i<5;i++){
        testFib(i);
        testSqrt(i);
      }
    }
    public static int fib(int n){
      return fibh(n,0,1,0);
    }
    private static String toString(ArrayList a){
      String ans = "[";
      for(int i=0;i<a.size();i++){
        ans+=a.get(i)+" ,";
      }
      ans+="]";
      return ans;
    }
    private static int fibh(int n, int i, int j, int ct){
      if(n==0){
        return 0;
      }
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
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0);
        return a;
      }
      ArrayList a = makeAllSums(n-1);
      ArrayList b = new ArrayList<Integer>(a);
      for(int i=0;i<b.size();i++){
        b.set(i,(int)(b.get(i))+n);

      }
      a.addAll(b);
      return a;
    }

}
