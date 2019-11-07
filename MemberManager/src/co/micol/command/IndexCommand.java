package co.micol.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.common.Command;

public class IndexCommand implements Command {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "view/main.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);

//		response.sendRedirect(path); path 페이지를 .do로 적어주면.do로 돌려준다
		// 단순하게 페이지만 전달하면 되는 부분 //request.di~ 는 requ객체를 담아서 보낼때

	}

}
