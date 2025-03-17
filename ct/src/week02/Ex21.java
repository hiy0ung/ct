package week02;

import java.util.List;
import java.util.Vector;

public class Ex21 {
    public static void main(String[] args) {
        // 가비지 컬렉션: 어느 시점이 되면 사용하지 않는 클래스는 자동으로 삭제해 줌?
//        Board board = new Board();
//        board.
//        Board board = new Board("제목", "내용", "작성자");
        List<Board> list = new Vector<>();
        list.add(new Board("제목1", "내용1", "작성자1"));
        list.add(new Board("제목2", "내용2", "작성자2"));
        list.add(new Board("제목3", "내용3", "작성자3"));
        list.add(new Board("제목4", "내용4", "작성자4"));
        list.add(new Board("제목5", "내용5", "작성자5"));
        list.add(new Board("제목6", "내용6", "작성자6"));

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.getTitle() + "\t" + board.getContent() + "\t" + board.getWriter());
        }
    }
}
