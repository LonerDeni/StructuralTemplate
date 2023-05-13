package Facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        System.out.println(bins.mult("101", "100"));
        System.out.println(bins.sum("100", "110"));
    }
}