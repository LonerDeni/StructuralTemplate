package Facade;

public class BinOps {

    public String sum(String a, String b) {
        int numOne = Integer.parseInt(a, 2);
        int numTwo = Integer.parseInt(b, 2);
        int sum = numOne + numTwo;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int numOne = Integer.parseInt(a, 2);
        int numTwo = Integer.parseInt(b, 2);
        int sum = numOne * numTwo;
        return Integer.toBinaryString(sum);
    }
}