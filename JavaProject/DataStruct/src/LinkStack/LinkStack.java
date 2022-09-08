package LinkStack;

public class LinkStack {
    Node head;

    public LinkStack() {
        head=new Node();
    }

    //�ж���ջ�Ƿ�Ϊ��
    public boolean isEmpty() {
        return head.next==null?true:false;
    }

    //��ջ,ͷ�巨
    public void push(Node node) {
        node.next=head.next;
        head.next=node;
    }

    //��ջ
    public Node pop() {
       if(isEmpty()) {
           System.out.println("ջ�գ��޷�����");
           return null;
       }
       else {
           Node temp=head.next;
           head.next=head.next.next;
           return temp;
       }
    }

    //�����ջ����
    public int getLength() {
        int len=0;
        Node p=head;
        while (p.next!=null) {
            len++;
            p=p.next;
        }
        return len;
    }

    //������ջ��top----base
    public void print() {
       Node p=head;
       while (p.next!=null) {
           p=p.next;
           System.out.println(p);
       }
    }
    //�鿴��ջջ��Ԫ��
    public Node peak() {
        if(isEmpty()) {
            System.out.println("ջ��");
            return null;
        }
        else
            return head.next;
    }

}
