package LinkStack;

public class Test {
    public static void main(String[] args) {

        LinkStack linkStack = new LinkStack();
        linkStack.push(new Node("��Ϣ",25));
        linkStack.push(new Node("Ϣ",5));
        linkStack.push(new Node("��",250));
        linkStack.push(new Node("��Ϣ��",215));
        linkStack.print();
        System.out.println(linkStack.getLength());
        System.out.println(linkStack.pop());
        System.out.println(linkStack.getLength());
        System.out.println(linkStack.peak());
    }
}
