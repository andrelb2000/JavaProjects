package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ProdutoJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 private double totalLucro = 0;
            private double totalVenda = 0; 
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
      response.setContentType("text/html;charset=UTF-8");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>Mostrando os dados:</h1>\n");
      out.write("        <h3> Nome do Produto:  ");
      out.print( request.getParameter("NomeProduto")  );
      out.write(" </h3>\n");
      out.write("        <h4> Preco do Produto: R$ ");
      out.print( request.getParameter("PrecoProduto")  );
      out.write("</h4>\n");
      out.write("        <h4>Custo do Produto: R$ ");
      out.print( request.getParameter("CustoProduto")  );
      out.write("</h4>\n");
      out.write("        <h4>Unidades do Produto ");
      out.print( request.getParameter("QdeProduto")  );
      out.write("</h4>\n");
      out.write("        ");
  
            double preco = Double.parseDouble(request.getParameter("PrecoProduto"));
            double custo = Double.parseDouble(request.getParameter("CustoProduto"));
            int    qde   = Integer.parseInt(request.getParameter("QdeProduto"));
            totalVenda = preco * qde;
            totalLucro = totalVenda - (qde*custo);
        
      out.write("\n");
      out.write("        <h4>Total Venda:");
      out.print(totalVenda );
      out.write("</h4>\n");
      out.write("        <h4>Total Lucro:");
      out.print(totalLucro );
      out.write("</h4>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
