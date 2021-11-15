package hello.servlet.basic.request;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet(name = "requestMultipartServlet", urlPatterns = "/request-multipart")
public class RequestMultipartServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getHeader("");
    }
}
