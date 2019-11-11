package co.micol.command.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.common.Command;
import co.micol.dao.BoardDao;
import co.micol.dto.BoardDto;

public class BoardListCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao = new BoardDao();
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		list = dao.select();
				// dto서넝ㄴ
		request.setAttribute("list", list);
		// 돌려줄페이지선택
		String path = "view/boardList.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);

	}

}
