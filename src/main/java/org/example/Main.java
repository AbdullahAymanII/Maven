package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main.print("abdullah ayman");
        int x = Main.add(1, 2);
        int y =Main.subtract(10, 5);
        int z =Main.multiply(10, 5);
        int l =Main.divide(10, 5);
        Main.print(String.format("Addition: %d", x));
    }
    public static void print(String s) {
        System.out.println(s);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a , int b) {
        return a / b;
    }
}