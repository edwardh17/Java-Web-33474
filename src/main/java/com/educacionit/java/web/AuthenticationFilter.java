
package com.educacionit.java.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;


@WebFilter (filterName = "/authenticationFilter",
            urlPatterns = "/*")
public class AuthenticationFilter implements Filter {


	private ServletContext context;

	private static final Logger logger = Logger.getLogger (AuthenticationFilter.class);


	public AuthenticationFilter () {

		super ();
	}


	public void init (FilterConfig fConfig) {

	    this.context = fConfig.getServletContext();
	}
	
	public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {


		HttpServletRequest  req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String uri = req.getRequestURI ();
		
		HttpSession session = req.getSession (false);

		logger.debug (String.format ("Accessing to URI %s", uri));
        if (uri.contains("/resources/")) {
            chain.doFilter (request, response);
        }


		if (session == null && !(uri.equals ("/educacionit/") ||
                                 uri.endsWith("index.jsp") ||
                                 uri.endsWith ("signIn"))){

            res.sendRedirect("index.jsp");

		} else {

            chain.doFilter (request, response);
		}
	}

	public void destroy () {}
}