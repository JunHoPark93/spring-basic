import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Jun Ho Park on 2017-04-30.
 */

public class HelloServlet extends HttpServlet {
    public HelloServlet() {
        System.out.println("===>Hello Servlet 객체 생성");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet()메소드 호출");
    }
}
