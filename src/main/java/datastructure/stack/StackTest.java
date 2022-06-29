package datastructure.stack;

import datastructure.array.ArrayTest;

public class StackTest {

    int top;
    ArrayTest arrayTest;

    public StackTest() {
        this.top = 0;
        this.arrayTest = new ArrayTest();
    }

    public StackTest(int size) {
        this.arrayTest = new ArrayTest(size);
    }

    public void push(int data) {
        if (this.isFull()) {
            System.out.println("stack is full");
            return;
        }

        arrayTest.addElement(data);
        this.top++;
    }

    public int pop() {
        if (this.top == 0) {
            System.out.println("stack is empty");
            return this.arrayTest.ERROR_NUM;
        }
        return arrayTest.removeElement(--this.top);
    }

    public int peek() {
        if (this.top == 0) {
            System.out.println("stack is empty");
            return this.arrayTest.ERROR_NUM;
        }
        return arrayTest.getElement(this.top - 1);
    }

    public int getSize() {
        return this.top;
    }

    public boolean isFull() {
        if (this.top == this.arrayTest.ARRAY_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printAll() {
        arrayTest.printAll();
    }
}
