package co.micol.dao;
/**
 * 
 * @author User
 *상위 DAO클래스를 상속받아서 BoardDao를 생성
 */

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.BoardDto;

public class BoardDao extends DAO {
	private BoardDto dto;
	private ArrayList<BoardDto> list;

	public BoardDao() {
		super();
	}

	public ArrayList<BoardDto> select() { // 전체리스트 또는 한개 리스트 가져오기
		list = new ArrayList<BoardDto>(); // id = 0 이면 전체 아니면 그룹전체
		String sql = "select * from mvc_board";
//		if (id != 0)
//			sql = sql + " where bgroup = ?";

		try {
			psmt = conn.prepareStatement(sql);
//			if (id != 0)
//				psmt.setInt(1, id);
			rs = psmt.executeQuery();

			while (rs.next()) {
				dto = new BoardDto();
				dto.setId(rs.getInt("bid"));
				dto.setWriter(rs.getString("bname"));
				dto.setTitle(rs.getString("btitle"));
				dto.setContents(rs.getString("bcontent"));
				dto.setwDate(rs.getDate("bdate"));
				dto.setHit(rs.getInt("bhit"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return list;
	}

	public int insert(BoardDto dto) { // 글쓰기
		int n = 0;
		String sql = "insert into mvc_board(bid,bname,btitle,bcontent,bdate,bhit) values(b_num.nextval,?,?,?,sysdate,0)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getWriter());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getContents());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return n;
	}

	public int update(BoardDto dto) {
		int n = 0;

		close();
		return n;
	}

	public int delete(int id) {
		int n = 0;

		close();
		return n;
	}
	// 조회수 증가
		private void viewCountUpdate(int id) {
			String sql = "update mvc_board set bhit = bhit + 1 where bid =" + id;

			try {
				psmt = conn.prepareStatement(sql);
				psmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

}
