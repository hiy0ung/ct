package week02;

public class a_List컬렉션 {
    /*
     * 오버로딩, 라이딩 차이 중요!!
     *
     * 검색
     * size(): 저장되어 있는 전체 객체 수 리턴
     * contains(Object o): 주어진 객체가 저장되어 있는지 여부
     *
     * 삭제
     * clear(): 저장된 모든 객체를 삭제
     * E remove(int index): 주어진 "인덱스"에 저장된 객체를 삭제
     * boolean remove(Object o): 주어진 "객체"를 삭제
     *
     * Vector (현업에서 잘 사용하지는 않지만 가끔 사용)
     * ArrayList와 동일한 내부 구조를 가지고 있음
     * ArrayList와 다른 점: Vector는 동기화 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 이 메소드를 실행할 수 없고 하나의 스레드가 실행을 완료해야만 다른 스레드 실행
     *
     * LinkedList (추가 공부 필요!!!!)
     * List 구현 클래스 - 사용 방법은 똑같음, 내부 구조 다름
     * ArrayList는 내부 배열에 객체를 저장해서 인덱스로 관리
     * LinkedList는 인접 참조를 링크해서 체인처럼 관리
     * 실제로 자리를 바꾸는 게 아니라 링크 걸어서 참조만 하게 해줌...?
     * */
}
