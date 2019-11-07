package co.micol.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.command.IndexCommand;
import co.micol.command.member.LoginCommand;
import co.micol.command.member.LoginOkCommand;
import co.micol.command.member.LoginOutCommand;
import co.micol.common.Command;

/**
 * Servlet implementation class NewController
 */
@WebServlet(description = "메인컨트롤러", urlPatterns = { "/NewController" })
public class NewFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, Command> cont = new HashMap<String, Command>();

	public NewFrontController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		// 해쉬맵 구조를 put()로 적어준다
		cont.put("/index.do", new IndexCommand()); // 홈페이지 호출
		cont.put("/login.do", new LoginCommand()); //로그인
		cont.put("/loginOk.do", new LoginOkCommand()); //로그인 체크
		cont.put("/logOut.do", new LoginOutCommand()); //로그아웃
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());
//		cont.put("/index.do", new IndexCommand());

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 실행할 class 객체를 찾아주는 부문 get()

		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length());

		Command commandImpl = cont.get(path); // 실행 클래스를 선택한다.
		commandImpl.excute(request, response);
	}

}