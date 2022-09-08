package SingleLinkList;

public class Test {
    public static void main(String[] args) {
        SingleLinkList singleLinkList = new SingleLinkList();
        singleLinkList.addNode(5);
        singleLinkList.addNode(2);
        singleLinkList.addNode(4);
        singleLinkList.printLinkList();
        singleLinkList.insertByIndex(2,10);
        singleLinkList.printLinkList();
        singleLinkList.removeByIndex(2);
        singleLinkList.printLinkList();
//        System.out.println(singleLinkList.getLength());
//        singleLinkList.findNode(3);
        singleLinkList.setNode(1,500);
        singleLinkList.printLinkList();
    }
}
