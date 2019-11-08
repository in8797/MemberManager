package co.micol.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.BoardDto;
import co.micol.dto.NoticeDto;

public class NoticeDao extends DAO {
	private NoticeDto dto;
	private ArrayList<NoticeDto> list;

	public NoticeDao() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public ArrayList<NoticeDto> select() { // 전체리스트 또는 한개 리스트 가져오기
		list = new ArrayList<NoticeDto>(); // id = 0 이면 전체 아니면 그룹전체
		String sql = "select * from notice";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				dto = new NoticeDto();
				dto.setId(rs.getInt("nid"));
				dto.setTitle(rs.getString("ntitle"));
				dto.setContents(rs.getString("ncontents"));
				dto.setnDate(rs.getDate("ndate"));
				dto.setHit(rs.getInt("nhit"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return list;
	}

	public int insert(BoardDto dto) {
		int n = 0;
		String sql = "insert into notice(nid,ntitle,ncontents,ndate,nhit) values(?,?,";
		
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

}
