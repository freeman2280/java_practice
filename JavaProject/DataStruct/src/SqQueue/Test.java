package SqQueue;

public class Test {
    public static void main(String[] args) {
        SqQueue sqQueue = new SqQueue();
        sqQueue.push(new Node("李四",154));
        sqQueue.push(new Node("李",154));
        sqQueue.push(new Node("四",154));
        sqQueue.push(new Node("李四op",154));
        sqQueue.push(new Node("李四ll",154));
        System.out.println(sqQueue.getLength());
        System.out.println(sqQueue.isFull());
        System.out.println(sqQueue.pop());
        System.out.println(sqQueue.getLength());
        System.out.println(sqQueue.isFull());
        sqQueue.push(new Node("李四1478",154));
        System.out.println(sqQueue.isFull());
        sqQueue.push(new Node("李四1478",154));
    }
}
