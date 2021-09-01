<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>userLogin</title>

</head>
<script type="text/javascript">
	$j(document).ready(function(){
		
		$j("#submit").on("click", function() {
			var userId = $j("#userId").val();
			var userPw = $j("#userPw").val();
			
			if(userId != "") {
				if(userPw != "") {
					$j.ajax({
					    url : "/user/loginAction.do",
					    dataType: "json",
					    type: "POST",
					    data : {
					    	userId : userId,
					    	userPw : userPw
					    },    
					    success: function(data, textStatus, jqXHR)
					    {	
					    	if(result == 0) {
					    		alert("아이디나 비밀번호가 일치하지 않습니다.");
					    	}
					    	else {
					    		location.href = "/board/boardList.do";
					    	}
					    },
					    error: function (jqXHR, textStatus, errorThrown)
					    {
					    	alert("실패");
					    }
					});
				}
				else {
					alert("비밀번호를 입력해주시기 바랍니다.");
				}
			}
			else {
				alert("아이디를 입력해주시기 바랍니다.");
			}
		});
	});
	

</script>


<body>
<form class="userlogin">
	<table align="center">
		<tr>
			<td>
				<a href="/board/boardList.do">List</a>
			</td>
		</tr>
		<tr>
			<td>
				<table id="join_table" border ="1">
					<tr>
						<td width="120" align="center">
						id
						</td>
						<td width="400">
							<input name="userId" id="userId" type="text" size="10" />
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						pw
						</td>
						<td width="400">
							<input name="userPw" id="userPw" type="password" size="20" />
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td align="right">
				<input type="button" id="submit" value="login">
			</td>
		</tr>
	</table>
</form>	
</body>
</html>