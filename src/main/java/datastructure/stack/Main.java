package datastructure.stack;

public class Main {

    public static void main(String[] args) {

        StackTest stackTest = new StackTest(3);

        stackTest.push(10);
        stackTest.push(20);
        stackTest.push(30);
        stackTest.push(40);

        stackTest.printAll();

        System.out.println("top element is " + stackTest.pop());

        stackTest.printAll();

        System.out.println("stack size is " + stackTest.getSize());


    }
}
