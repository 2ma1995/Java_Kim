package collection.list;

public class BatchProcessor {
    private final List<Integer> list;

    public BatchProcessor(List<Integer> list) {
        this.list = list;
    }
    long startTime = System.currentTimeMillis();
    public void logic(int size){
        for (int i = 0; i <size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size+", 계산시간: "+(endTime-startTime)+"ms");
    }
}
