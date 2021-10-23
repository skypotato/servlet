package hello.servlet.basic.request;

import org.springframework.cglib.core.DefaultNamingPolicy;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@WebServlet(name = "requestMultipartServlet", urlPatterns = "/request-multipart")
public class RequestMultipartServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        MultipartRequest multipartRequest = new MultipartRequest() {
            @Override
            public Iterator<String> getFileNames() {
                return null;
            }

            @Override
            public MultipartFile getFile(String name) {
                return null;
            }

            @Override
            public List<MultipartFile> getFiles(String name) {
                return null;
            }

            @Override
            public Map<String, MultipartFile> getFileMap() {
                return null;
            }

            @Override
            public MultiValueMap<String, MultipartFile> getMultiFileMap() {
                return null;
            }

            @Override
            public String getMultipartContentType(String paramOrFileName) {
                return null;
            }
        };

        System.out.println("[전체 파라미터 조회] - start");

        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println( paramName + " = " + request.getParameter(paramName)));

        System.out.println("[전체 파라미터 조회] - end");
        System.out.println();

        System.out.println("[단일 파라미터 조회]");

        String username = request.getParameter("username");
        String age = request.getParameter("age");

        System.out.println("username = " + username);
        System.out.println("age = " + age);
        System.out.println();
    }
}
