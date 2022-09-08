package LinkQueue;

public class LinkQueue {
    Node head;

    public LinkQueue() {
        head=new Node();
        head.next=null;
    }

    //判断是否为空
    public boolean isEmpty() {
        return head.next==null?true:false;
    }

    //入队,尾插法
    public void push(Node node) {
        Node p=head;
        while (p.next!=null)
            p=p.next;
        node.next=p.next;
        p.next=node;
    }

    //出队
    public Node pop() {
        if(isEmpty()){
            System.out.println("队列为空，无法操作");
            return null;
        }
        else {
            Node temp=head.next;
            head.next=head.next.next;
            return temp;
        }
    }

    //统计元素个数
    public int getLength() {
        int len=0;
        Node p=head;
        while (p.next!=null) {
            p=p.next;
            len++;
        }
        return len;
    }

}
