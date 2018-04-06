/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author DELL
 */
public class Android extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public String u="";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            
      
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Json object............
        JSONObject json = new JSONObject();
        PrintWriter out=response.getWriter();
        //get value on android.......
        String u=request.getParameter("k1");
        System.out.println("Text is "+"'"+u+"'");
        
        
        
        try {
            
        if(u.equals("admin")){
           // Jesson convert.
        json.put("info", "Hi Masum");
        json.put("Name", u);
        }
        else{
        json.put("info", " Not UserId "+u);
        }
        
        //Write jeson with jason value...............
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
       // response.getWriter().write(json.toString());
        } catch (Exception e) {
            System.out.println("Not ok Jason");
        }
        
        
        //Nothing....try for convert jesson with code.........
       
       
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
        PrintWriter out=response.getWriter();
       doGet(request, response);
       
//        processRequest(request, response);
//        String u=request.getParameter("k1");
//        if(u.equals("hi")){
//        System.out.println("Text is "+"'"+u+"'");}
//        else{
//         System.out.println("Text is "+" not HI");
//        }
//        PrintWriter out=response.getWriter();
//        out.print("<html>");
//         out.print("<body>");
//          out.print("<h1 "+u+"</br>");
//           out.print("</body>");
//            out.print("</html>");
            JSONObject json = new JSONObject();
            //JSONArray jsarry=new JSONArray();
        
         try {
            
        
            //Jesson convert........
        json.put("info","secsess");
        //jsarry.put("route"," Head east on Rayer Bazar Staf");
        
        
        
        
        //Write jeson with jason value...............
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
       response.getWriter().write(json.toString());
         
        } catch (Exception e) {
            System.out.println("Not ok Jason");
        }
       
         
         
//        response.setContentType("text/html");
//         out.println("<html>");
//            out.println("<head>");
//            
//          
//            out.print("<script src='new.js' type='text/javascript'></script>");
//            out.print("<script src='https://maps.googleapis.com/maps/api/js?key= AIzaSyCXacNxNEMAREbql4V1o5Rkh4VerZjztoE&callback=initMap'></script>");
//            
//            out.println("</head>");
//            
//            out.println("<body onload='initialize(); calculateAndDisplayRoute(directionsService); '>");
//            
//            
//             out.print("<p id=\"result\"></p>");
//
//            out.println("</body>");
//            out.println("</html>");
           
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
