/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-08-29 09:25:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userJoin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("jar:file:/C:/testBoard/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springBoard/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/testBoard/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springBoard/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1630227661960L));
    _jspx_dependants.put("jar:file:/C:/testBoard/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springBoard/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar", Long.valueOf(1630227662003L));
    _jspx_dependants.put("/WEB-INF/views/common/common.jsp", Long.valueOf(1630227662007L));
    _jspx_dependants.put("jar:file:/C:/testBoard/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/springBoard/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1329370132000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"/resources/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	var $j = jQuery.noConflict();\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>userJoin</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$j(document).ready(function(){\r\n");
      out.write("		\r\n");
      out.write("		//엔터키 누르면 넘어가는 이벤트 방지\r\n");
      out.write("		$('input').keydown(function() {\r\n");
      out.write("			if (event.keyCode === 13) {\r\n");
      out.write("				event.preventDefalut();\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$j(\"#submit\").on(\"click\",function(){\r\n");
      out.write("			var $frm = $j('#join_table :input');\r\n");
      out.write("			console.log($frm);\r\n");
      out.write("			\r\n");
      out.write("			var param = $frm.serialize();\r\n");
      out.write("			console.log(param);\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			$j.ajax({\r\n");
      out.write("			    url : \"/user/userJoinAction.do\",\r\n");
      out.write("			    dataType: \"json\",\r\n");
      out.write("			    type: \"POST\",\r\n");
      out.write("			    data : param,\r\n");
      out.write("			    success: function(data, textStatus, jqXHR)\r\n");
      out.write("			    {\r\n");
      out.write("					alert(\"작성완료\");\r\n");
      out.write("					\r\n");
      out.write("					alert(\"메세지:\"+data.success);\r\n");
      out.write("						\r\n");
      out.write("					location.href = \"/board/boardList.do\";\r\n");
      out.write("			    },\r\n");
      out.write("			    error: function (jqXHR, textStatus, errorThrown)\r\n");
      out.write("			    {\r\n");
      out.write("			    	console.log(\"jqXHR: \"+jqXHR);\r\n");
      out.write("			    	console.log(\"textStatus: \"+textStatus);\r\n");
      out.write("			    	console.log(\"errorThrown: \"+errorThrown);\r\n");
      out.write("			    	alert(\"실패\");\r\n");
      out.write("			    }\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		$j(\"#userId\").keyup(function(){\r\n");
      out.write("			\r\n");
      out.write("			var id = $j('#userId').val();\r\n");
      out.write("			console.log(id);\r\n");
      out.write("			\r\n");
      out.write("			if($j('#userId').val() != \"\") {\r\n");
      out.write("				$j.ajax({\r\n");
      out.write("				    url : \"/user/userIdCheak.do\",\r\n");
      out.write("				    dataType: \"json\",\r\n");
      out.write("				    type: \"POST\",\r\n");
      out.write("				    data : {\r\n");
      out.write("				    	\"userId\": id\r\n");
      out.write("				    },		    \r\n");
      out.write("				    success: function(data, textStatus, jqXHR)\r\n");
      out.write("				    {\r\n");
      out.write("						if(data == 1) {\r\n");
      out.write("							document.getElementById(\"idCheckVal\").value=\"N\";\r\n");
      out.write("						}\r\n");
      out.write("						else if(data == 0) {\r\n");
      out.write("							document.getElementById(\"idCheckVal\").value=\"Y\";\r\n");
      out.write("						}\r\n");
      out.write("						\r\n");
      out.write("				    },\r\n");
      out.write("				    error: function (jqXHR, textStatus, errorThrown)\r\n");
      out.write("				    {\r\n");
      out.write("				    	console.log(\"jqXHR: \"+jqXHR);\r\n");
      out.write("				    	console.log(\"textStatus: \"+textStatus);\r\n");
      out.write("				    	console.log(\"errorThrown: \"+errorThrown);\r\n");
      out.write("				    	alert(\"실패\");\r\n");
      out.write("				    }\r\n");
      out.write("				});\r\n");
      out.write("			}\r\n");
      out.write("			else {\r\n");
      out.write("				document.getElementById(\"idCheckVal\").value=\"N\";\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		$j(\"#id_check_bt\").on(\"click\", function (){\r\n");
      out.write("			if(document.getElementById(\"idCheckVal\").value == \"Y\") {\r\n");
      out.write("				alert(\"가입이 가능한 아이디 입니다.\");\r\n");
      out.write("			} \r\n");
      out.write("			else if(document.getElementById(\"idCheckVal\").value == \"N\") {\r\n");
      out.write("				alert(\"아이디 사용이 불가 합니다.\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		var pwReg = /^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{6,12}$/\r\n");
      out.write("		\r\n");
      out.write("		$j(\"#userPw\").keyup(function() {\r\n");
      out.write("			var userPw = $j(\"#userPw\").val();\r\n");
      out.write("			\r\n");
      out.write("			if(userPw != \"\"){\r\n");
      out.write("				if(pwReg.test(userPw)) {\r\n");
      out.write("					document.getElementById(\"pwCheckVal\").value=\"Y\";	\r\n");
      out.write("				}\r\n");
      out.write("				else if(!pwReg.test(userPw)) {\r\n");
      out.write("					document.getElementById(\"pwCheckVal\").value=\"N\";	\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form class=\"userJoin\">\r\n");
      out.write("	<table align=\"center\">\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>\r\n");
      out.write("				<a href=\"/board/boardList.do\">List</a>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td>\r\n");
      out.write("				<table id=\"join_table\" border =\"1\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						id\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userId\" id=\"userId\" type=\"text\" size=\"10\">\r\n");
      out.write("							<input type=\"button\" id=\"id_check_bt\" value=\"중복확인\" />\r\n");
      out.write("							<input type=\"hidden\" id=\"idCheckVal\" value=\"N\" /> \r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						pw\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userPw\" id=\"userPw\" type=\"password\" size=\"20\">\r\n");
      out.write("							<input type=\"hidden\" id=\"pwCheckVal\" value=\"N\" />\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						pw check\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userPwCheck\" id=\"userPwCheck\" type=\"password\" size=\"20\">\r\n");
      out.write("							<input type=\"hidden\" id=\"pwcCheckVal\" value=\"N\" />\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						name\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userName\" type=\"text\" size=\"20\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						phone\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<select name=\"userPhone1\">\r\n");
      out.write("								<option value=\"010\">010</option>\r\n");
      out.write("								<option value=\"011\">011</option>\r\n");
      out.write("								<option value=\"016\">016</option>\r\n");
      out.write("								<option value=\"017\">017</option>\r\n");
      out.write("								<option value=\"019\">019</option>\r\n");
      out.write("							</select>\r\n");
      out.write("							-\r\n");
      out.write("							<input name=\"userPhone2\" type=\"text\" size=\"4\">\r\n");
      out.write("							-\r\n");
      out.write("							<input name=\"userPhone3\" type=\"text\" size=\"4\">\r\n");
      out.write("							\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						postNo\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userAddr1\" type=\"text\" size=\"20\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						address\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userAddr2\" type=\"text\" size=\"20\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						company\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userCompany\" type=\"text\" size=\"20\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td align=\"right\">\r\n");
      out.write("				<input type=\"button\" id=\"submit\" value=\"join\">\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("</form>	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
