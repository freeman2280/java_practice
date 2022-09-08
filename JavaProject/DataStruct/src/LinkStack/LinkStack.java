package LinkStack;

public class LinkStack {
    Node head;

    public LinkStack() {
        head=new Node();
    }

    //判断链栈是否为空
    public boolean isEmpty() {
        return head.next==null?true:false;
    }

    //入栈,头插法
    public void push(Node node) {
        node.next=head.next;
        head.next=node;
    }

    //出栈
    public Node pop() {
       if(isEmpty()) {
           System.out.println("栈空，无法操作");
           return null;
       }
       else {
           Node temp=head.next;
           head.next=head.next.next;
           return temp;
       }
    }

    //求出链栈长度
    public int getLength() {
        int len=0;
        Node p=head;
        while (p.next!=null) {
            len++;
            p=p.next;
        }
        return len;
    }

    //遍历链栈从top----base
    public void print() {
       Node p=head;
       while (p.next!=null) {
           p=p.next;
           System.out.println(p);
       }
    }
    //查看链栈栈顶元素
    public Node peak() {
        if(isEmpty()) {
            System.out.println("栈空");
            return null;
        }
        else
            return head.next;
    }

}
