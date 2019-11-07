package co.micol.dao;
/**
 * 
 * @author User
 *상위 DAO클래스를 상속받아서 BoardDao를 생성
 */

import java.util.ArrayList;

import co.micol.dto.BoardDto;

public class BoardDao extends DAO {
	private BoardDto dto;
	private ArrayList<BoardDto> list;

	public BoardDao() {
		super();
	}

	public ArrayList<BoardDto> select(int id) { // 전체리스트 또는 한개 리스트 가져오기
		list = new ArrayList<BoardDto>(); // id = 0 이면 전체 아니면 그룹전체
		String sql = "select * from mvc_board";
		if (id != 0)
			sql = sql + " where bgroup = ?";
		close();
		return list;
	}

	public int insert(BoardDto dto) {
		int n = 0;

		return n;
	}

	public int update(BoardDto dto) {
		int n = 0;

		return n;
	}

	public int delete(int id) {
		int n = 0;

		return n;
	}

}
