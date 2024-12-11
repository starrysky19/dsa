// Time O(logn) Space O(logn)

package recursion;

public class Power {
    public static double myPow(double x, int n){
        if(n<0){
            x=1/x;
            n=-n;
        }
        return power(x, n);
    }
    public static double power(double x, int n){
        if(n==0)return 1;
        double half= power(x, n/2);
        if(n%2==0){
            return half*half;
        }
        else return half*half*x;
    }
    public static void main(String[] args){
        double x=5.0;
        int n=2;
        double firstPow= myPow(x, n);
        System.out.println(firstPow);
    }
}
