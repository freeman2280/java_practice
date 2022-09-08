package SqStack;

public class Test {
    public static void main(String[] args) {

        SqStack sqStack = new SqStack();
        sqStack.push(new Node("’≈…∫",14));
        sqStack.push(new Node("’≈",142));
        sqStack.push(new Node("…∫",104));

        sqStack.push(new Node("…∫a",104));
        sqStack.push(new Node("…∫",104));
//        sqStack.push(new Node("…∫",104));
        System.out.println(sqStack.getLength());
        System.out.println(sqStack.peak());
        sqStack.push(new Node("…∫",104));
        sqStack.push(new Node("…∫",104));
    }
}
