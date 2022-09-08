package SqQueue;

public class SqQueue {
    int rear;//对尾
    int front;//队首
    int MaxSize;
    Node[] nodes;

    public SqQueue() {
        rear=0;
        front=0;
        MaxSize=6;//实际上空间大小只有5
        nodes=new Node[MaxSize];
    }

    //判断循环队列是否空
    public boolean isEmpty() {
        if(rear==front)
            return true;
        else
            return false;
    }

    //判断循环队列是否满了
    public boolean isFull() {
        return (rear+1)%MaxSize==front?true:false;
    }
    //入队
    public void push(Node node) {
       if(isFull()) {
           System.out.println("队列已满，无法操作");
       }
       else {
           nodes[rear]=node;
           rear=(rear+1)%MaxSize;
       }
    }

    //出队
    public Node pop() {
        if(isEmpty()) {
            System.out.println("队列为空,无法操作");
            return null;
        }
        else {
            Node temp=nodes[front];
            front=(front+1)%MaxSize;
            return temp;
        }
    }

    //队列个数
    public int getLength() {
        if(isEmpty())
            return 0;
        else
            return (rear-front+MaxSize)%MaxSize;
    }
}
