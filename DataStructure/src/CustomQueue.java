import java.util.LinkedList;
import java.util.Queue;

public class CustomQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // 1. 데이터 추가
        q.add(1);
        q.add(4);
        q.offer(2);
        q.offer(3);
        System.out.println("q 데이터 추가 후 : " + q);

        // 2. 데이터 삭제
        q.remove();
        q.poll();
        System.out.println("큐 데이터 삭제 후 : " + q);

        // 3. 데이터 읽기
        Integer element = q.element();
        System.out.println("element 메서드 결과 : " + element);

        Integer peeked = q.peek();
        System.out.println("peek 메서드 결과 : " + peeked);
        
        // 4. 기타 함수
        boolean isEmpty = q.isEmpty();
        System.out.println("isEmpty 메서드 결과 : " + isEmpty);

        q.clear();
        System.out.println("clear 메서드 결과 : " + q);
    }
}
