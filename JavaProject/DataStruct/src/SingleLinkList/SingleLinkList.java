package SingleLinkList;

public class SingleLinkList {
    Node head;


    //��ʼ������ͷ���
    public SingleLinkList() {
       head=new Node();
        head.next=null;
    }
    //�жϵ������Ƿ�Ϊ��
    public boolean isEmpty() {
        if(head.next==null)
            return true;
        else
            return false;
    }
    //ͳ�Ƶ�������
    public int getLength() {
        if(isEmpty())
            return 0;
        int length=0;
        Node p=head;
        while (p.next!=null) {
            length++;
            p=p.next;
        }
        return length;
    }
    //���ӽڵ�,β�巨
    public void addNode(int data) {
        Node node = new Node(data);
        //ͨ�������ڵ�p�ҵ�����ĩβ�ڵ�
        Node p=head;
        while(p.next!=null)
            p=p.next;
        p.next=node;
        node.next=null;
    }

    //��nλ�ò���ڵ㣬���ҵ�n-1�ڵ㼴��
    //�����û������±��Ǵ�1��ʼ�ģ����Գ���ĵ�һ���ڵ�Ԫ�أ�����head���ļ����±�Ҳ����1��������i=n-1����
    public void insertByIndex(int n,int data) {
        if(isEmpty()||n<1||n>getLength()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("�Ƿ�����");
            }
        }
        else {
            int i=0;
            Node p=head;
            //�ҵ�λ��
            while (p.next!=null){
                p=p.next;
                i++;
                if(i==n-1)
                    break;
            }
            //����
            Node node=new Node(data);
            node.next=p.next;
            p.next=node;
        }
    }

    //��λ��ɾ��Ԫ�أ�Ҳ���ҵ�n-1λ�ü���
    public void removeByIndex(int n) {
        if(isEmpty()||n<1||n>getLength()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("�Ƿ�ɾ��");
            }
        }
        else {
            int i=0;
            Node p=head;
            //�ҵ�λ��
            while (p.next!=null){
                p=p.next;
                i++;
                if(i==n-1)
                    break;
            }
            //ɾ��
            p.next=p.next.next;
        }
    }

    //�޸Ľڵ�ֵ,�ҵ�nλ�ü���
    public void setNode(int n,int data) {
        if(isEmpty()||n<1||n>getLength()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("�Ƿ��޸�");
            }
        }
        else {
            int i=0;
            Node p=head;
            //�ҵ�λ��
            while (p.next!=null){
                p=p.next;
                i++;
                if(i==n)
                    break;
            }
            //�޸�
            p.data=data;
        }
    }

//���ҽڵ�
    public void findNode(int n) {
        if(isEmpty()||n<1||n>getLength()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("�Ƿ�����");
            }
        }
        else {
            int i=0;
            Node p=head;
            //�ҵ�λ��
            while (p.next!=null){
                p=p.next;
                i++;
                if(i==n)
                    break;
            }
            //���
            System.out.println(p.data);
        }
    }
    //ɾ��ĩβ�ڵ�,����ĩβԪ��ǰ��һ���ڵ��ÿ�
    public void removeNode() {
        if(isEmpty()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("����Ϊ�գ�");
            }
        }
        else {
            Node p=head;
            while (p.next.next!=null)
                p=p.next;
            p.next=null;
        }

    }


    //����������
    public void printLinkList() {
        if(isEmpty()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("����Ϊ�գ�");
            }
        }
        else {
           Node p=head;
           while (p.next!=null)
           {
               p=p.next;
               System.out.print(p.data+"\t");
           }
            System.out.println();
        }
    }


}
