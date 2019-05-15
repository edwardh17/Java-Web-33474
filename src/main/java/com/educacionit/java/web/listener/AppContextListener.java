
package com.educacionit.java.web.listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.log4j.Logger;

import com.educacionit.java.web.db.DBConnectionManager;



@WebListener
public class AppContextListener implements ServletContextListener {


	private static final Logger logger = Logger.getLogger (AppContextListener.class);


    public AppContextListener () {

        super ();
    }


    public void contextInitialized (ServletContextEvent servletContextEvent) {

		logger.debug ("STARTING CV APPLICATION...");
    	ServletContext ctx = servletContextEvent.getServletContext ();

		logger.debug ("READING DB PARAMETERS...");
    	String url = ctx.getInitParameter ("DBURL");
    	String u   = ctx.getInitParameter ("DBUSER");
    	String p   = ctx.getInitParameter ("DBPWD");
        String d   = ctx.getInitParameter ("DRIVER");

		logger.debug (String.format ("CONNECTING TO DB %s USING %s %s", url, u, p));
    	DBConnectionManager dbManager = new DBConnectionManager (url, u, p, d);
    	ctx.setAttribute ("db", dbManager);
		logger.info ("CV APPLICATION STARTED...");
    }

    public void contextDestroyed (ServletContextEvent servletContextEvent) {

		logger.debug ("STOPPING CV APPLICATION...");
    	ServletContext ctx = servletContextEvent.getServletContext ();
    	DBConnectionManager dbManager = (DBConnectionManager) ctx.getAttribute ("db");
    	dbManager.closeConnection ();
		logger.info ("CV APPLICATION STOPPED");
    }
}