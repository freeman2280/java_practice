package LinkQueue;

public class LinkQueue {
    Node head;

    public LinkQueue() {
        head=new Node();
        head.next=null;
    }

    //�ж��Ƿ�Ϊ��
    public boolean isEmpty() {
        return head.next==null?true:false;
    }

    //���,β�巨
    public void push(Node node) {
        Node p=head;
        while (p.next!=null)
            p=p.next;
        node.next=p.next;
        p.next=node;
    }

    //����
    public Node pop() {
        if(isEmpty()){
            System.out.println("����Ϊ�գ��޷�����");
            return null;
        }
        else {
            Node temp=head.next;
            head.next=head.next.next;
            return temp;
        }
    }

    //ͳ��Ԫ�ظ���
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
