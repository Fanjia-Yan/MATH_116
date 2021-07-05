import java.util.ArrayList;
import java.util.Scanner;
public class Divide {
    int a;
    int b;
    /** constructor **/
    Divide(int a, int b){
        if (b == 0){
            System.out.print("Denominator can't be 0");
            Scanner scanner = new Scanner(System.in);
            b = scanner.nextInt();
            scanner.close();
        }
        this.a = a;
        this.b = b;
    }

    /** test if a | b, i.e., if b = a * k **/
    boolean divides(){
        int temp_a = a;
        int temp_b = b;
        if (temp_a == 0) return false;
        if (temp_a < 0 || temp_b < 0) return false;
        while (temp_b != 0){
            if (temp_b < 0){
                return false;
            }
            temp_b = temp_b - temp_a;
        }
        return true;
    }

    /**return the divisor , divisor is 0 when a !/ b **/
    int factor(){
        int temp_a = a;
        int temp_b = b;
        if(!divides()){
            System.out.println("b does not divides a");
            return 0;
        }
        int count = 0;
        while (temp_b != 0){
            temp_b = temp_b - temp_a;
            count = count + 1;
        }
        return count;
    }

    /** return the common divisor **/
    ArrayList commondivisor(){
        ArrayList cd = new ArrayList<Integer>();
        ArrayList a = divisor(this.a);
        ArrayList b = divisor(this.b);
        if (b.size() <= a.size()){
            ArrayList temp = a;
            a = b;
            b = temp;
        }
        for (int i = 0; i < a.size(); i = i + 1){
            if (b.contains(a.get(i))){
                cd.add(a.get(i));
            }
        }
        return cd;
    }

    /** return a list of divisor **/
    private static ArrayList divisor(int x){
        ArrayList divisor = new ArrayList<Integer>();
        for (int i = 1; i <= x; i = i + 1){
            Divide d = new Divide(i , x);
            if (d.divides()){
                divisor.add(i);
            }
        }
        return divisor;

    }

}
