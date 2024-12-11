package recursion;
//problem link: https://www.geeksforgeeks.org/problems/factorial5739/1
// Time O(n) Space O(n)
class Factorial{
    static int factorial(int num){
        //base case
        if(num==0 || num==1){
            return 1;
        }
        //recursive call
        return num * factorial(num-1);
    }
    public static void main(String[] args){
        int num1= 5;
        System.out.println("Factorial of " +num1 +" is: "+ factorial(num1));
    }
}