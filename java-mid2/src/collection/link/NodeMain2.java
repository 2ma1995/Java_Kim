package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
//    노드 생성하고 연결하기: A -> B -> C
    Node first = new Node("A");
    first.next = new Node("B");
    first.next.next = new Node("C");

        System.out.println("연결된 노드 출력");
        System.out.println(first);
//      참고 b부터 찍고 싶을때, 예시
        Node nodeB = first.next;
        System.out.println(nodeB);
    }
}
