import java.math.BigInteger;

public class LargestPrime{
    public static void main(String[] args) {
        BigInteger primeNum = new BigInteger("2").pow(82589933).subtract(new BigInteger("1"));
        System.out.println(primeNum);
       
    }
}