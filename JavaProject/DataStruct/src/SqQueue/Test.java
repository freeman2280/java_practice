package SqQueue;

public class Test {
    public static void main(String[] args) {
        SqQueue sqQueue = new SqQueue();
        sqQueue.push(new Node("����",154));
        sqQueue.push(new Node("��",154));
        sqQueue.push(new Node("��",154));
        sqQueue.push(new Node("����op",154));
        sqQueue.push(new Node("����ll",154));
        System.out.println(sqQueue.getLength());
        System.out.println(sqQueue.isFull());
        System.out.println(sqQueue.pop());
        System.out.println(sqQueue.getLength());
        System.out.println(sqQueue.isFull());
        sqQueue.push(new Node("����1478",154));
        System.out.println(sqQueue.isFull());
        sqQueue.push(new Node("����1478",154));
    }
}
