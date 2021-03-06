package com.example.turagency.controller.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {"/jsp/*"})

public class DirectPathFilter implements Filter {
    private static final String INDEX_JSP = "/index.jsp";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher(INDEX_JSP);
        dispatcher.forward(request, response);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}