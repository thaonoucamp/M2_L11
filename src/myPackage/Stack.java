package myPackage;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> stack = new LinkedList<>();

    public Stack(LinkedList<T> stack) {
        this.stack = stack;
    }

    public Stack() {

    }

    public LinkedList<T> getStack() {
        return stack;
    }

    public void setStack(LinkedList<T> stack) {
        this.stack = stack;
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }


}
