import java.util.ArrayList;

public class GCD {
    int a;
    int b;
    /** Constructor **/
    GCD(int a , int b){
        this.a = a;
        this.b = b;
    }

    /** dumb method of GCD iterating through respective common divisor **/
    int dumbGCD(){
        Divide gcd_tuple = new Divide(a,b);
        int gcd = gcd_tuple.greatestcommondivisor();
        return gcd;
    }

    /** Euclidean gcd **/
    int euclideanGCD(){
        return euclideanGCD(a,b);
    }

    /** Euclidean gcd helper method **/
    private int euclideanGCD(int a, int b){
        if (b == 0){
            return a;
        }
        return euclideanGCD(b, a % b);
    }

    /** return the extended Euclidean GCD of a and b
     * return an int[] with a size of 3
     * int[0] = gcd
     * int[1] = multiplicative inverse of a
     * int[2] = multiplicative inverse of b
     * **/
    int[] extendedEuclideanGCD(){
        return extendedEuclideanGCD(a,b);
    }

    /** eGCD helper method **/
    private int[] extendedEuclideanGCD(int a, int b){
        int[] temp;
        if (b == 0){
            temp =  new int[]{a, 1, 0};
            return temp;
        }else{
            temp = extendedEuclideanGCD(b, a % b);
        }
        int[] temp2 = new int[]{temp[0],temp[2], temp[1] - Math.floorDiv(a,b) * temp[2]};
        return temp2;
    }
}
