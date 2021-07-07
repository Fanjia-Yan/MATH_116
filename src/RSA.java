public class RSA {
    /** fast powering n^pow (mod) **/
    public static int fast_powering(int n, int pow, int mod){
        String binary = Integer.toBinaryString(pow);
        int result = 1;
        for (int i = binary.length() - 1; i >= 0 ; i = i - 1){
            if (binary.charAt(i) == '1') result = result * n % mod;
            n = n % mod  * n % mod;
        }
        return result % mod;
    }
    static int fast_exponentiation(int a,int b,int c) {
        long x=1;
        long y=a;
        while(b > 0){
            if(b%2 == 1){
                x=(x*y)%c;
            }
            y = (y%c * y%c)%c; // squaring the base
            b /= 2;
        }
        return (int) x%c;
    }
    public static void main(String[] args){
        long fast_1 = System.nanoTime();
        int x =fast_powering(1234112356,123456789,1203);
        long fast_2 = System.nanoTime();
        System.out.println(fast_2- fast_1);
        System.out.println(x);
        long slow_1 = System.nanoTime();
        int y = fast_exponentiation(1234112356,123456789,1203);
        long slow_2 = System.nanoTime();
        System.out.println(slow_2- slow_1 );
        System.out.println(y);
    }
}
