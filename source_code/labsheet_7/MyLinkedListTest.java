package source_code.labsheet_7;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addBeginning("First Node");
        System.out.println("Testing addBeginning()");
        System.out.println(myLinkedList);

        myLinkedList.addEnding("Second Node");
        System.out.println("Testing addEnding()");
        System.out.println(myLinkedList);

        myLinkedList.addIndex(1, "Third Node");
        System.out.println("Testing addIndex()");
        System.out.println(myLinkedList);

        System.out.println("Testing getElement()");
        System.out.println(myLinkedList.getElement(1));
        System.out.println();

        System.out.println("Testing removeBeginning()");
        System.out.println(myLinkedList.removeBeginning());
        System.out.println(myLinkedList);

        myLinkedList.addEnding("Fourth Node");
        myLinkedList.addEnding("Fifth Node");
        System.out.println(myLinkedList);

        System.out.println("Testing removeEnding()");
        System.out.println(myLinkedList.removeEnding());
        System.out.println(myLinkedList);

        System.out.println("Testing removeIndex()");
        System.out.println(myLinkedList.removeIndex(1));
        System.out.println(myLinkedList);

        System.out.println("Testing setElement()");
        System.out.println(myLinkedList.setElement(1,"Third Node"));
        System.out.println(myLinkedList);

        System.out.println("Testing indexOf()");
        System.out.println(myLinkedList.indexOf("Third Node"));
        System.out.println(myLinkedList);

        System.out.println("Testing lastIndexOf()");
        System.out.println(myLinkedList.lastIndexOf("Third Node"));
        System.out.println(myLinkedList);

        System.out.println("Testing contains()");
        System.out.println(myLinkedList.contains("Fourth Node"));
        System.out.println(myLinkedList);

        System.out.println("Testing contains()");
        System.out.println(myLinkedList.contains("Third Node"));
        System.out.println(myLinkedList);

        System.out.println("Testing isEmpty()");
        System.out.println(myLinkedList.isEmpty());
        System.out.println(myLinkedList);

        System.out.println("Testing checkElementIndex()");
        System.out.println(myLinkedList.checkElementIndex(3));
        System.out.println(myLinkedList);

        System.out.println("Testing getSize()");
        System.out.println(myLinkedList.getSize());
        System.out.println(myLinkedList);

        myLinkedList.addEnding("Fifth Node");
        myLinkedList.addEnding("Sixth Node");
        myLinkedList.addEnding("Seventh Node");
        System.out.println(myLinkedList);
        myLinkedList.reverseLinkedList();
        System.out.println("Reverse the given linked list");
        System.out.println(myLinkedList);

        System.out.println("Rotate linked list counter clockwise");
        myLinkedList.rotateCounterClockwise(4);
        System.out.println(myLinkedList);

    }
}
