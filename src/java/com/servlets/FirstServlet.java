/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
/**
 *
 * @author dhrubodeep
 */
public class FirstServlet implements Servlet{
        
    ServletConfig  conf;
    @Override
    public void init(ServletConfig conf) throws ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.conf=conf;
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
       return this.conf;
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       System.out.println("service..........");
       res.setContentType("text/html");
       PrintWriter out=res.getWriter();
       out.println("today date"+ new.Date().toString());
               
    }

    @Override
    public String getServletInfo() {
        return "servlet created by dhrubodeep";
//    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy() {
       System.out.println("going........");
//       System.out.println("service................");
      
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   // 
}
