package myPackage;

import java.util.LinkedList;
import java.util.List;

public class Client {
    private static void stackOfStrings() {
        Stack<String> stack = new Stack();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        System.out.println("1. SIZE: " + stack.size());
        System.out.println("2. POP: ");

        while (!stack.isEmpty()) {
            System.out.printf("%s", stack.pop());
        }
        System.out.println("\n3. SIZE: " + stack.size());
    }

    private static void stackOfInterger() {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("2. Size :" + stack.size());
        System.out.println("2. Pop : ");

        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }
        System.out.println("2. Size : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Integer: ");
        stackOfInterger();

        System.out.println("2. String: ");
        stackOfStrings();
    }
}
