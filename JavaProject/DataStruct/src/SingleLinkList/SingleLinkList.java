package SingleLinkList;

public class SingleLinkList {
    Node head;


    //初始化创建头结点
    public SingleLinkList() {
       head=new Node();
        head.next=null;
    }
    //判断单链表是否为空
    public boolean isEmpty() {
        if(head.next==null)
            return true;
        else
            return false;
    }
    //统计单链表长度
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
    //增加节点,尾插法
    public void addNode(int data) {
        Node node = new Node(data);
        //通过辅助节点p找到链表末尾节点
        Node p=head;
        while(p.next!=null)
            p=p.next;
        p.next=node;
        node.next=null;
    }

    //在n位置插入节点，即找到n-1节点即可
    //对于用户而言下标是从1开始的，所以程序的第一个节点元素（不是head）的计数下标也得是1，遍历到i=n-1即可
    public void insertByIndex(int n,int data) {
        if(isEmpty()||n<1||n>getLength()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("非法插入");
            }
        }
        else {
            int i=0;
            Node p=head;
            //找到位置
            while (p.next!=null){
                p=p.next;
                i++;
                if(i==n-1)
                    break;
            }
            //插入
            Node node=new Node(data);
            node.next=p.next;
            p.next=node;
        }
    }

    //按位置删除元素，也是找到n-1位置即可
    public void removeByIndex(int n) {
        if(isEmpty()||n<1||n>getLength()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("非法删除");
            }
        }
        else {
            int i=0;
            Node p=head;
            //找到位置
            while (p.next!=null){
                p=p.next;
                i++;
                if(i==n-1)
                    break;
            }
            //删除
            p.next=p.next.next;
        }
    }

    //修改节点值,找到n位置即可
    public void setNode(int n,int data) {
        if(isEmpty()||n<1||n>getLength()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("非法修改");
            }
        }
        else {
            int i=0;
            Node p=head;
            //找到位置
            while (p.next!=null){
                p=p.next;
                i++;
                if(i==n)
                    break;
            }
            //修改
            p.data=data;
        }
    }

//查找节点
    public void findNode(int n) {
        if(isEmpty()||n<1||n>getLength()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("非法搜索");
            }
        }
        else {
            int i=0;
            Node p=head;
            //找到位置
            while (p.next!=null){
                p=p.next;
                i++;
                if(i==n)
                    break;
            }
            //输出
            System.out.println(p.data);
        }
    }
    //删除末尾节点,即把末尾元素前面一个节点置空
    public void removeNode() {
        if(isEmpty()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("链表为空！");
            }
        }
        else {
            Node p=head;
            while (p.next.next!=null)
                p=p.next;
            p.next=null;
        }

    }


    //遍历单链表
    public void printLinkList() {
        if(isEmpty()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("链表为空！");
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
