
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", value = "/pizzaOrder")
public class PizzaOrderServlet extends HttpServlet {
    // GET METHOD //
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // FORWARD TO THANK YOU PAGE //
        request.getRequestDispatcher("/pizzaOrder.jsp").forward(request, response);
    }

    // POST METHOD //
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");

        // Print order details to console
        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("Size: " + size);
        System.out.print("Toppings: ");
        for (String topping : toppings) {
            System.out.print(topping + " ");
        }
        System.out.println("\nAddress: " + address);

    }
}