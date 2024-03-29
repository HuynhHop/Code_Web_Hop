package murach.cart;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;

import murach.data.ProductIO;
import murach.business.Product;
@WebServlet("/loadProducts")

public class ProductsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String path = getServletContext().getRealPath("/WEB-INF/products.txt");
        ArrayList<Product> products = ProductIO.getProducts(path);
        session.setAttribute("products", products);

        String url = "/index_cart.jsp";
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
}