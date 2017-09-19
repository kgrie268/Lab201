/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 742227
 */

public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
        // retrieves age from the form
        String age = request.getParameter("age");
        String button = request.getParameter("button");
        
        //request.setAttribute("age2", age);
        // validation
        if(button != null){
        if (age == null || age.isEmpty()) {
            // set error message
            request.setAttribute("errorMessage", "You must give your current age. Dont lie now");
            

            // forward the request back to index.jsp
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            // stop other execution of code
            return;
        }
        try {
        int numAge= Integer.parseInt(age);
        //String regex = "^[0-9]";
        
           request.setAttribute("yourAge", "Your age next birthday will be " +(numAge+1)); 
        }
        catch(Exception e){
        request.setAttribute("errorMessage", "You must enter a number");
        
        
        }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            // stop other execution of code
           
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    }

  

}
