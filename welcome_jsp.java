package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title> Homepage | E-shelf</title>\n");
      out.write("\t<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/homepage.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

        if(session.getAttribute("username")== null){
            response.sendRedirect("loginpage.html");
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div class=\"heading font\">\n");
      out.write("\t<h1 class=\"txt\">E-Shelf</h1>\n");
      out.write("</div>\n");
      out.write("<div id=\"navbar\" class=\"bar font\">\n");
      out.write("\t<ul>\n");
      out.write("\t  <li><a class=\"active\" href=\"homepage.html\">Home</a></li>\n");
      out.write("\t  <li><a href=\"books.html\">Books</a></li>\n");
      out.write("\t  <li><a href=\"#\">Contact</a></li>\n");
      out.write("\t  <li class=\"right\"><a href=\"logout.jsp\">logout</a></li>\n");
      out.write("\t  <li class=\"right cart\"><a href=\"cart.html\"><span class=\"fa fa-shopping-cart\"> </span>&ensp;Cart</a></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-12 body content\">\n");
      out.write("\t<div class=\"col-md-3 side_menu\">\n");
      out.write("\t\t<div class=\"year\">\n");
      out.write("\t\t\t<h2 style=\"text-align: center;\">Year Of Study</h2>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"#\">1st year</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">2nd year</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">3rd year</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">4th year</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr style=\"border-top: 1px solid #337ab7; width: 80%;\">\n");
      out.write("\t\t<div class=\"books\">\n");
      out.write("\t\t\t<h2 style=\"text-align: center;\">Most Searched books</h2>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"#\">C by Balaguru Swamy</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Java</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">OS</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">CD</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-8 content\">\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t<div class=\"col-md-4 book\">\n");
      out.write("\t\t\t\t<h4 class=\"book_heading\">C Programming By Balaguru Swamy</h4>\n");
      out.write("\t\t\t\t<p>This is the best book for beginners to get basic knowledge in C language. The terminology used in this book is very much easier for students to understand and grasp....</p>\n");
      out.write("\t\t\t\t<h4 class=\"price\">&#8377;450</h4>\n");
      out.write("\t\t\t\t<div class=\"col-md-12 buttons\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 buy_now_button\"><a href=\"#\">Add to Cart</a></div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 detail_button\"><a href=\"#\">Details</a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4 book\">\n");
      out.write("\t\t\t\t<h4 class=\"book_heading\">Java - The complete Reference</h4>\n");
      out.write("\t\t\t\t<p>This is the best book for beginners to get basic knowledge in JAVA language. The terminology used in this book is very much easier for students to understand and grasp....</p>\n");
      out.write("\t\t\t\t<h4 class=\"price\">&#8377;640</h4>\n");
      out.write("\t\t\t\t<div class=\"col-md-12 buttons\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 buy_now_button\"><a href=\"#\">Add to Cart</a></div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 detail_button\"><a href=\"#\">Details</a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t<div class=\"col-md-4 book\">\n");
      out.write("\t\t\t\t<h4 class=\"book_heading\">Operating Systems</h4>\n");
      out.write("\t\t\t\t<p>This is the best book for beginners to get basic knowledge in OS. The terminology used in this book is very much easier for students to understand and grasp....</p>\n");
      out.write("\t\t\t\t<h4 class=\"price\">&#8377;570</h4>\n");
      out.write("\t\t\t\t<div class=\"col-md-12 buttons\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 buy_now_button\"><a href=\"#\">Add to Cart</a></div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 detail_button\"><a href=\"#\">Details</a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4 book\">\n");
      out.write("\t\t\t\t<h4 class=\"book_heading\">Data Base Management System</h4>\n");
      out.write("\t\t\t\t<p>This is the best book for beginners to get basic knowledge in DBMS. The terminology used in this book is very much easier for students to understand and grasp....</p>\n");
      out.write("\t\t\t\t<h4 class=\"price\">&#8377;740</h4>\n");
      out.write("\t\t\t\t<div class=\"col-md-12 buttons\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 buy_now_button\"><a href=\"#\">Add to Cart</a></div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 detail_button\"><a href=\"#\">Details</a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-12 footer\">\n");
      out.write("\t<div class=\"col-md-2 content_left\">\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li><a>Terms & conditions</a></li>\n");
      out.write("\t\t\t<li><a>FAQs</a></li>\n");
      out.write("\t\t\t<li><a>Customer Service</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t<div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/store.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
