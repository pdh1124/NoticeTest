/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2021-08-30 07:02:38 UTC
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>userJoin</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$j(document).ready(function(){\r\n");
      out.write("		\r\n");
      out.write("		//????????? ????????????\r\n");
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
      out.write("							$j(\"#id_text\").text(\"??????????????? ???????????? ????????????.\");\r\n");
      out.write("						}\r\n");
      out.write("						else if(data == 0) {\r\n");
      out.write("							document.getElementById(\"idCheckVal\").value=\"Y\";\r\n");
      out.write("							$j(\"#id_text\").text(\"??????????????? ???????????? ????????????.\");\r\n");
      out.write("						}\r\n");
      out.write("						\r\n");
      out.write("				    },\r\n");
      out.write("				    error: function (jqXHR, textStatus, errorThrown)\r\n");
      out.write("				    {\r\n");
      out.write("				    	alert(\"??????\");\r\n");
      out.write("				    }\r\n");
      out.write("				});\r\n");
      out.write("			}\r\n");
      out.write("			else {\r\n");
      out.write("				document.getElementById(\"idCheckVal\").value=\"N\";\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//????????? ?????? ??????\r\n");
      out.write("		$j(\"#id_check_bt\").on(\"click\", function (){\r\n");
      out.write("			if(document.getElementById(\"idCheckVal\").value == \"Y\") {\r\n");
      out.write("				$j(\"#id_text\").text(\"????????? ????????? ????????? ?????????.\");\r\n");
      out.write("				alert(\"????????? ????????? ????????? ?????????.\");\r\n");
      out.write("			} \r\n");
      out.write("			else if(document.getElementById(\"idCheckVal\").value == \"N\") {\r\n");
      out.write("				$j(\"#id_text\").text(\"????????? ????????? ????????? ?????????.\");\r\n");
      out.write("				alert(\"????????? ????????? ?????? ?????????.\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		var pwReg = /^.*(?=.{6,12})(?=.*[0-9])(?=.*[a-zA-Z]).*$/;\r\n");
      out.write("		//?????? ?????? ?????? 6~12??????\r\n");
      out.write("		\r\n");
      out.write("		//???????????? ?????????\r\n");
      out.write("		$j(\"#userPw\").keyup(function() {\r\n");
      out.write("			var userPw = $j(\"#userPw\").val();\r\n");
      out.write("			var userPwCheck = $j(\"#userPwCheck\").val();\r\n");
      out.write("			\r\n");
      out.write("			//console.log(\"???????????? ??????\");\r\n");
      out.write("			if(userPw != \"\"){\r\n");
      out.write("				if(pwReg.test(userPw)) {\r\n");
      out.write("					document.getElementById(\"pwCheckVal\").value=\"Y\";\r\n");
      out.write("					$j(\"#pw_text\").text(\"???????????? ????????? ???????????????.\");\r\n");
      out.write("					if(userPw != userPwCheck) {\r\n");
      out.write("						document.getElementById(\"pwcCheckVal\").value=\"N\";\r\n");
      out.write("						$j(\"#pwc_text\").text(\"??????????????? ???????????? ????????????.\");\r\n");
      out.write("					} else {\r\n");
      out.write("						document.getElementById(\"pwcCheckVal\").value=\"Y\";\r\n");
      out.write("						$j(\"#pwc_text\").text(\"??????????????? ???????????????.\");\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("				else if(!pwReg.test(userPw)) {\r\n");
      out.write("					document.getElementById(\"pwCheckVal\").value=\"N\";\r\n");
      out.write("					document.getElementById(\"pwcCheckVal\").value=\"N\";\r\n");
      out.write("					$j(\"#pw_text\").text(\"6~12????????? ??????/?????? ???????????????.\");\r\n");
      out.write("					$j(\"#pwc_text\").text(\"??????????????? ???????????? ????????????.\");\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//???????????? ?????? \r\n");
      out.write("		$j(\"#userPwCheck\").keyup(function() {\r\n");
      out.write("			var userPw = $j(\"#userPw\").val();\r\n");
      out.write("			var userPwCheck = $j(\"#userPwCheck\").val();\r\n");
      out.write("			\r\n");
      out.write("			//console.log(\"?????????????????? ??????\");\r\n");
      out.write("			if(userPw != \"\" || userPwCheck != \"\") {\r\n");
      out.write("				if(userPw != userPwCheck) {\r\n");
      out.write("					document.getElementById(\"pwcCheckVal\").value=\"N\";\r\n");
      out.write("					$j(\"#pwc_text\").text(\"??????????????? ???????????? ????????????.\");\r\n");
      out.write("				} \r\n");
      out.write("				else {\r\n");
      out.write("					document.getElementById(\"pwcCheckVal\").value=\"Y\";\r\n");
      out.write("					$j(\"#pwc_text\").text(\"??????????????? ???????????????.\");\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//?????? ??????\r\n");
      out.write("		var naReg = /^[\\uac00-\\ud7a3+]*$/;\r\n");
      out.write("		//???-??? ??????\r\n");
      out.write("\r\n");
      out.write("		$j(\"#userName\").keyup(function() {\r\n");
      out.write("			var userName = $j(\"#userName\").val();\r\n");
      out.write("			\r\n");
      out.write("			if(naReg.test(userName)) {\r\n");
      out.write("				document.getElementById(\"nameCheckVal\").value=\"Y\";\r\n");
      out.write("				$j(\"#na_text\").text(\"????????? ????????? ??? ????????????.\");\r\n");
      out.write("			}\r\n");
      out.write("			else if(!naReg.test(userName)) {\r\n");
      out.write("				document.getElementById(\"nameCheckVal\").value=\"N\";\r\n");
      out.write("				$j(\"#na_text\").text(\"????????? ???????????? ?????? ????????????.\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		//??? ??????\r\n");
      out.write("		var phoReg1 = /^[0-9]{3,4}$/;\r\n");
      out.write("		var phoReg2 = /^[0-9]{4}$/;\r\n");
      out.write("		\r\n");
      out.write("		$j(\"#userPhone3, #userPhone2, #userPhone1\").change(function() {\r\n");
      out.write("			var userPhone1 = $j(\"#userPhone1\").val();\r\n");
      out.write("			var userPhone2 = $j(\"#userPhone2\").val();\r\n");
      out.write("			var userPhone3 = $j(\"#userPhone3\").val();\r\n");
      out.write("			\r\n");
      out.write("			if(phoReg2.test(userPhone3)) {\r\n");
      out.write("				if(phoReg1.test(userPhone2)) {\r\n");
      out.write("					$j.ajax({\r\n");
      out.write("					    url : \"/user/userPhoneCheak.do\",\r\n");
      out.write("					    dataType: \"json\",\r\n");
      out.write("					    type: \"POST\",\r\n");
      out.write("					    data : {\r\n");
      out.write("					    	userPhone1 : userPhone1,\r\n");
      out.write("					    	userPhone2 : userPhone2,\r\n");
      out.write("					    	userPhone3 : userPhone3\r\n");
      out.write("					    },    \r\n");
      out.write("					    success: function(data, textStatus, jqXHR)\r\n");
      out.write("					    {\r\n");
      out.write("							if(data == 1) {\r\n");
      out.write("								document.getElementById(\"phoneCheckVal\").value=\"N\";\r\n");
      out.write("								$j(\"#ph_text\").text(\"?????? ????????? ???????????????.\");\r\n");
      out.write("							}\r\n");
      out.write("							else if(data == 0) {\r\n");
      out.write("								document.getElementById(\"phoneCheckVal\").value=\"Y\";\r\n");
      out.write("								$j(\"#ph_text\").text(\"?????? ????????? ?????? ?????????.\");\r\n");
      out.write("							}\r\n");
      out.write("							\r\n");
      out.write("					    },\r\n");
      out.write("					    error: function (jqXHR, textStatus, errorThrown)\r\n");
      out.write("					    {\r\n");
      out.write("					    	alert(\"??????\");\r\n");
      out.write("					    }\r\n");
      out.write("					});\r\n");
      out.write("				}\r\n");
      out.write("				else if (!phoReg1.test(userPhone2)) {\r\n");
      out.write("					document.getElementById(\"phoneCheckVal\").value=\"N\";\r\n");
      out.write("					$j(\"#ph_text\").text(\"????????? ???????????? ?????? ????????????.\");\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("			else if (!phoReg2.test(userPhone3)) {\r\n");
      out.write("				document.getElementById(\"phoneCheckVal\").value=\"N\";\r\n");
      out.write("				$j(\"#ph_text\").text(\"????????? ???????????? ?????? ????????????.\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//???????????? ?????????\r\n");
      out.write("		var pnReg = /^[0-9]{3}-[0-9]{3}$/;\r\n");
      out.write("		\r\n");
      out.write("		$j(\"#userAddr1\").keyup(function() {\r\n");
      out.write("			var userAddr1 = $j(\"#userAddr1\").val();\r\n");
      out.write("			\r\n");
      out.write("			if(pnReg.test(userAddr1)) {\r\n");
      out.write("				document.getElementById(\"ua1CheckVal\").value=\"Y\";\r\n");
      out.write("				$j(\"#pn_text\").text(\"??????????????? ???????????? ?????????.\");\r\n");
      out.write("			}\r\n");
      out.write("			else if(!pnReg.test(userAddr1)) {\r\n");
      out.write("				document.getElementById(\"ua1CheckVal\").value=\"N\";\r\n");
      out.write("				$j(\"#pn_text\").text(\"000-000???????????? ?????????????????? ????????????.\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//?????? ?????? ??????\r\n");
      out.write("		$j(\"#userAddr2\").keyup(function() {\r\n");
      out.write("			var userAddr2 = $j(\"#userAddr2\").val();\r\n");
      out.write("			\r\n");
      out.write("			if(userAddr2 != \"\") {\r\n");
      out.write("				document.getElementById(\"ua2CheckVal\").value=\"Y\";\r\n");
      out.write("			}\r\n");
      out.write("			else if(userAddr2 == \"\") {\r\n");
      out.write("				document.getElementById(\"ua2CheckVal\").value=\"N\";\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		//??????\r\n");
      out.write("		$j(\"#userCompany\").keyup(function() {\r\n");
      out.write("			var userCompany = $j(\"#userCompany\").val();\r\n");
      out.write("			\r\n");
      out.write("			if(userCompany != \"\") {\r\n");
      out.write("				document.getElementById(\"ucCheckVal\").value=\"Y\";\r\n");
      out.write("			}\r\n");
      out.write("			else if(userCompany == \"\") {\r\n");
      out.write("				document.getElementById(\"ucCheckVal\").value=\"N\";\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		//???????????? ??????\r\n");
      out.write("		$j(\"#submit\").on(\"click\",function(){\r\n");
      out.write("			\r\n");
      out.write("			var $frm = $j('#join_table :input');\r\n");
      out.write("			console.log($frm);\r\n");
      out.write("			\r\n");
      out.write("			var param = $frm.serialize();\r\n");
      out.write("			console.log(param);\r\n");
      out.write("			\r\n");
      out.write("			if(document.getElementById(\"idCheckVal\").value == 'N') {\r\n");
      out.write("				alert(\"???????????? ????????? ????????? ????????? ????????????.\");\r\n");
      out.write("				$(\"#userId\").focus;\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if(document.getElementById(\"pwCheckVal\").value == 'N') {\r\n");
      out.write("				alert(\"??????????????? ????????? ????????? ????????? ????????????.\");\r\n");
      out.write("				$(\"#userPw\").focus;\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if(document.getElementById(\"pwcCheckVal\").value == 'N') {\r\n");
      out.write("				alert(\"???????????? ????????? ????????? ????????? ????????? ????????????.\");\r\n");
      out.write("				$(\"#userPwCheck\").focus;\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if(document.getElementById(\"nameCheckVal\").value == 'N') {\r\n");
      out.write("				alert(\"????????? ????????? ?????????????????? ????????????.\");\r\n");
      out.write("				$(\"#userName\").focus;\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if(document.getElementById(\"phoneCheckVal\").value == 'N') {\r\n");
      out.write("				alert(\"????????? ????????? ????????? ?????????????????? ????????????.\");\r\n");
      out.write("				$(\"#userPhone2\").focus;\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if(document.getElementById(\"ua1CheckVal\").value == 'N') {\r\n");
      out.write("				alert(\"??????????????? ????????? ????????? ????????? ????????????.\");\r\n");
      out.write("				$(\"#userAddr1\").focus;\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			/*\r\n");
      out.write("			if(document.getElementById(\"ua2CheckVal\").value == 'N') {\r\n");
      out.write("				alert(\"????????? ?????????????????? ????????????.\");\r\n");
      out.write("				$(\"#userAddr2\").focus;\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if(document.getElementById(\"ucCheckVal\").value == 'N') {\r\n");
      out.write("				alert(\"????????? ?????????????????? ????????????.\");\r\n");
      out.write("				$(\"#userCompany\").focus;\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("			*/\r\n");
      out.write("			\r\n");
      out.write("			$j.ajax({\r\n");
      out.write("			    url : \"/user/userJoinAction.do\",\r\n");
      out.write("			    dataType: \"json\",\r\n");
      out.write("			    type: \"POST\",\r\n");
      out.write("			    data : param,\r\n");
      out.write("			    success: function(data, textStatus, jqXHR)\r\n");
      out.write("			    {\r\n");
      out.write("					alert(\"????????????\");\r\n");
      out.write("					\r\n");
      out.write("					alert(\"?????????:\"+data.success);\r\n");
      out.write("						\r\n");
      out.write("					location.href = \"/board/boardList.do\";\r\n");
      out.write("			    },\r\n");
      out.write("			    error: function (jqXHR, textStatus, errorThrown)\r\n");
      out.write("			    {\r\n");
      out.write("			    	console.log(\"jqXHR: \"+jqXHR);\r\n");
      out.write("			    	console.log(\"textStatus: \"+textStatus);\r\n");
      out.write("			    	console.log(\"errorThrown: \"+errorThrown);\r\n");
      out.write("			    	alert(\"??????\");\r\n");
      out.write("			    }\r\n");
      out.write("			});\r\n");
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
      out.write("							<input name=\"userId\" id=\"userId\" type=\"text\" size=\"10\" />\r\n");
      out.write("							<input type=\"button\" id=\"id_check_bt\" value=\"????????????\" />\r\n");
      out.write("							<input type=\"hidden\" id=\"idCheckVal\" value=\"N\" />\r\n");
      out.write("							<div id=\"id_text\"></div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						pw\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userPw\" id=\"userPw\" type=\"password\" size=\"20\" />\r\n");
      out.write("							<input type=\"hidden\" id=\"pwCheckVal\" value=\"N\" />\r\n");
      out.write("							<div id=\"pw_text\"></div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						pw check\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userPwCheck\" id=\"userPwCheck\" type=\"password\" size=\"20\" />\r\n");
      out.write("							<input type=\"hidden\" id=\"pwcCheckVal\" value=\"N\" />\r\n");
      out.write("							<div id=\"pwc_text\"></div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						name\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userName\" id=\"userName\" type=\"text\" size=\"20\" />\r\n");
      out.write("							<input type=\"hidden\" id=\"nameCheckVal\" value=\"N\" />\r\n");
      out.write("							<div id=\"na_text\"></div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						phone\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<select name=\"userPhone1\" id=\"userPhone1\">\r\n");
      out.write("								<option value=\"1\">010</option>\r\n");
      out.write("								<option value=\"2\">011</option>\r\n");
      out.write("								<option value=\"3\">016</option>\r\n");
      out.write("								<option value=\"4\">017</option>\r\n");
      out.write("								<option value=\"5\">019</option>\r\n");
      out.write("							</select>\r\n");
      out.write("							-\r\n");
      out.write("							<input name=\"userPhone2\" id=\"userPhone2\" type=\"text\" size=\"4\">\r\n");
      out.write("							-\r\n");
      out.write("							<input name=\"userPhone3\" id=\"userPhone3\" type=\"text\" size=\"4\">\r\n");
      out.write("							<input type=\"hidden\" id=\"phoneCheckVal\" value=\"N\" />\r\n");
      out.write("							<div id=\"ph_text\"></div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						postNo\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userAddr1\" id=\"userAddr1\" type=\"text\" size=\"20\">\r\n");
      out.write("							<input type=\"hidden\" id=\"ua1CheckVal\" value=\"N\" />\r\n");
      out.write("							<div id=\"pn_text\"></div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						address\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userAddr2\" id=\"userAddr2\" type=\"text\" size=\"20\">\r\n");
      out.write("							<!-- input type=\"hidden\" id=\"ua2CheckVal\" value=\"N\" / -->\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td width=\"120\" align=\"center\">\r\n");
      out.write("						company\r\n");
      out.write("						</td>\r\n");
      out.write("						<td width=\"400\">\r\n");
      out.write("							<input name=\"userCompany\" id=\"userCompany\" type=\"text\" size=\"20\">\r\n");
      out.write("							<!-- input type=\"hidden\" id=\"ucCheckVal\" value=\"N\" / -->\r\n");
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
