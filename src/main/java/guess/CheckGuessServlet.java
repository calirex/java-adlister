package guess;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/guess")
public class CheckGuessServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int guess = Integer.parseInt(request.getParameter("guess"));
        if (guess >= 1 && guess <= 3) {
            response.sendRedirect(guess == (int) (Math.random() * 3 + 1) ? "/correct" : "/incorrect");
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Guess must be between 1 and 3.");
        }
    }
}

