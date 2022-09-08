package SqStack;

public class Node {
    String name;
    int age;

    public Node() {
    }

    public Node(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name+"\t"+age;
    }
}
