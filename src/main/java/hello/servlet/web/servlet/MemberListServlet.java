package hello.servlet.web.servlet;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "MemberListServlet", urlPatterns = "/servlet/members")
public class MemberListServlet extends HttpServlet {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Member> members = memberRepository.findAll();

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter w = response.getWriter();
        w.write("<html>");
        w.write("<head>");
        w.write("\t<meta charset=\"UTF-8\">");
        w.write("\t<title>Title</title>");
        w.write("</head>");
        w.write("<body>");
        w.write("<a href=\"/index.html\">메인</a>");
        w.write("<table>");
        w.write("\t<thead>");
        w.write("\t\t<th>id</th>");
        w.write("\t\t<th>username</th>");
        w.write("\t\t<th>age</th>");
        w.write("\t</thead>");
        w.write("\t<tbody>");

        for (Member member : members) {
            w.write("\t\t<tr>");
            w.write("\t\t\t<td>" + member.getId() + "</td>");
            w.write("\t\t\t<td>" + member.getUsername() + "</td>");
            w.write("\t\t\t<td>" + member.getAge() + "</td>");
            w.write("\t\t</tr>");
        }
        w.write("\t</tbody>");
        w.write("</table>");
        w.write("</body>");
        w.write("</html>");
    }
}
