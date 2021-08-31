<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>userJoin</title>

</head>
<script type="text/javascript">
	function idFind() {
		alert("아이디 작동 여부");
		var userId = $j("#userId").val();
		
		$j.ajax({
		    url : "/user/userIdFind.do",
		    dataType: "json",
		    type: "POST",
		    data : {
		    	userId : userId
		    },    
		    success: function(data, textStatus, jqXHR)
		    {
		    	if(data == 1) {
		    		pwFind();
		    	}
	            else {
	            	alert('등록되지 않는 아이디 입니다.');
	            }	
		    },
		    error: function (jqXHR, textStatus, errorThrown)
		    {
		    	alert("실패");
		    }
		});
	}
	
	
	function pwFind() {
		alert("비밀번호 작동 여부");
		var userId = $j("#userId").val();
		var userPw = $j("#userPw").val();
		
		$j.ajax({
		    url : "/user/userPwFind.do",
		    dataType: "json",
		    type: "POST",
		    data : {
		    	userId : userId,
		    	userPw : userPw
		    },    
		    success: function(data, textStatus, jqXHR)
		    {
		    	alert(data);
		    	if(data != 1) {
	                alert("비밀번호가 일치 하지 않습니다.");
		    	}
		    },
		    error: function (jqXHR, textStatus, errorThrown)
		    {
		    	alert("실패");
		    }
		});
	}


	$j(document).ready(function(){
		
		$j("#submit").on("click", function() {
			var userId = $j("#userId").val();
			var userPw = $j("#userPw").val();
			
			if(userId != "") {
				if(userPw != "") {
					$j.ajax({
					    url : "/user/userLoginAction.do",
					    dataType: "json",
					    type: "POST",
					    data : {
					    	userId : userId,
					    	userPw : userPw
					    },    
					    success: function(data, textStatus, jqXHR)
					    {
					    	if(data == false) {
					    		idFind();
					    	}
		                    else {
		                    	alert("로그인 성공");
		                    	location.href = "/board/boardList.do"; // home.do로 돌아가시면 됩니다.
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