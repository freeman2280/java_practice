package SqStack;

public class SqStack {
    int base;//栈顶
    int top;//栈底
    int MAXValue;//最大容量
    Node[] nodes;
    public SqStack() {
        initSqStack();
    }

    //顺序栈的初始化
    public void initSqStack() {
        base=0;
        top=0;
        MAXValue=5;
        nodes=new Node[MAXValue];
    }

    //判断栈是否为空
    public boolean isEmpty() {
        if(top==base)
           return true;
        else
            return false;
    }

    //判断栈是否满了
    public boolean isFull() {
        if(top==MAXValue)
            return true;
        else
            return false;
    }

    //得到栈的长度
    public int getLength() {
        return (top-base);
    }
    //入栈
    public void push(Node node) {
        if(isFull()) {
            System.out.println("栈满，无法添加");
        }
        else {
            nodes[top++]=node;
        }
    }

    //出栈
    public Node pop() {
        if(isEmpty()) {
            System.out.println("栈空，无法操作");
            return null;
        }

        else
            return nodes[--top];
    }

    //查看栈顶元素
    public Node peak() {
        if(isEmpty()) {
            System.out.println("栈空，无法操作");
            return null;
        }

        else {
            int t=top-1;
            return  nodes[t];
        }

    }
}
