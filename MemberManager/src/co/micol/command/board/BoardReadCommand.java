package co.micol.command.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.common.Command;
import co.micol.dao.BoardDao;
import co.micol.dto.BoardDto;

public class BoardReadCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		int id = Integer.parseInt(request.getParameter("id"));

		request.setAttribute("dto", dto);  // DB에서 조회된 글 담기
		String path = "view/boardRead.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);

	}

}
