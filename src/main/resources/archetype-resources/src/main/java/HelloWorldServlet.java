package ${package};

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorld")
public class HelloWorldServlet extends HttpServlet {

    static String PAGE_HEADER = "<html><head><title>Hello World Jakarta</title></head><body>";
    static String PAGE_FOOTER = "</body></html>";

    @Inject
    private HelloWorldService ejb;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println(PAGE_HEADER);

        try {
            writer.println(ejb.createHelloMessage("Jakarta EE 9.0"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        writer.println(PAGE_FOOTER);
        writer.close();
    }
}