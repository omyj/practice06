package prob6;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		
		// Database 에서 데이터를 가져와서
		// Board 객체를 만들고 리스트 저장
		Board board = new Board();
		board.setTitle( "제목1" );
		board.setContent( "내용1" );
		list.add( board );
		
		board = new Board();
		board.setTitle( "제목2" );
		board.setContent( "내용2" );
		list.add( board );
		
		board = new Board();
		board.setTitle( "제목3" );
		board.setContent( "내용3" );
		list.add( board );

		return list;
	}
}
