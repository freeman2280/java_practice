package SqQueue;

public class SqQueue {
    int rear;//��β
    int front;//����
    int MaxSize;
    Node[] nodes;

    public SqQueue() {
        rear=0;
        front=0;
        MaxSize=6;//ʵ���Ͽռ��Сֻ��5
        nodes=new Node[MaxSize];
    }

    //�ж�ѭ�������Ƿ��
    public boolean isEmpty() {
        if(rear==front)
            return true;
        else
            return false;
    }

    //�ж�ѭ�������Ƿ�����
    public boolean isFull() {
        return (rear+1)%MaxSize==front?true:false;
    }
    //���
    public void push(Node node) {
       if(isFull()) {
           System.out.println("�����������޷�����");
       }
       else {
           nodes[rear]=node;
           rear=(rear+1)%MaxSize;
       }
    }

    //����
    public Node pop() {
        if(isEmpty()) {
            System.out.println("����Ϊ��,�޷�����");
            return null;
        }
        else {
            Node temp=nodes[front];
            front=(front+1)%MaxSize;
            return temp;
        }
    }

    //���и���
    public int getLength() {
        if(isEmpty())
            return 0;
        else
            return (rear-front+MaxSize)%MaxSize;
    }
}
