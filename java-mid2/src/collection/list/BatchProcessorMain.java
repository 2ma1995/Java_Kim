package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        MyLinkedList<Integer> list = new MyLinkedList<>();
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
