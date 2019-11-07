package co.micol.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.dto.MemberDto;

/**
 * 
 * @author User 상위 DAO 클래스를 상속받아서 MemberDao를 생성
 *
 */
public class MemberDao extends DAO {
	private MemberDto dto;
	private ArrayList<MemberDto> list;

	public MemberDao() {
		super();
	}

	public ArrayList<MemberDto> select(MemberDto dto) { // 전체회원 목록가져오기
		list = new ArrayList<MemberDto>();
		//
		close();
		return list;
	}

	public MemberDto select(int id) { // 1명의 회원정보 가져오기
		dto = new MemberDto();
		//
		close();
		return dto;
	}

	public int insert(MemberDto dto) {
		int n = 0;
		//
		close();
		return n;
	}

	public int delete(String id) {
		int n = 0;
		//
		close();
		return n;
	}

	public int update(MemberDto dto) {
		int n = 0;
		//
		close();
		return n;
	}

	public boolean isIdCheck(String id) { // id 중복체크를 위함
		return false;
	}

	public String loginCheck(String id, String pw) { // 로그인하는 메소드
		String grant = null;
		String sql = "select membergrant from member where memberid=? and memberpw=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next())
				grant = rs.getString("membergrant");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		return grant; // 로그인 성공시 권한을 넘겨준다
	}
}
