package LinkStack;

public class Test {
    public static void main(String[] args) {

        LinkStack linkStack = new LinkStack();
        linkStack.push(new Node("利息",25));
        linkStack.push(new Node("息",5));
        linkStack.push(new Node("利",250));
        linkStack.push(new Node("利息就",215));
        linkStack.print();
        System.out.println(linkStack.getLength());
        System.out.println(linkStack.pop());
        System.out.println(linkStack.getLength());
        System.out.println(linkStack.peak());
    }
}
