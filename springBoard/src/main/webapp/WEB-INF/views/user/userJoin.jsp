<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>userJoin</title>

</head>
<script type="text/javascript">
	$j(document).ready(function(){
		
		//엔터키 누르면 넘어가는 이벤트 방지
		$('input').keydown(function() {
			if (event.keyCode === 13) {
				event.preventDefalut();
			}
		});
		
		$j("#submit").on("click",function(){
			var $frm = $j('#join_table :input');
			console.log($frm);
			
			var param = $frm.serialize();
			console.log(param);
			
			
			$j.ajax({
			    url : "/user/userJoinAction.do",
			    dataType: "json",
			    type: "POST",
			    data : param,
			    success: function(data, textStatus, jqXHR)
			    {
					alert("작성완료");
					
					alert("메세지:"+data.success);
						
					location.href = "/board/boardList.do";
			    },
			    error: function (jqXHR, textStatus, errorThrown)
			    {
			    	console.log("jqXHR: "+jqXHR);
			    	console.log("textStatus: "+textStatus);
			    	console.log("errorThrown: "+errorThrown);
			    	alert("실패");
			    }
			});
		});
		
		
		$j("#userId").keyup(function(){
			
			var id = $j('#userId').val();
			console.log(id);
			
			if($j('#userId').val() != "") {
				$j.ajax({
				    url : "/user/userIdCheak.do",
				    dataType: "json",
				    type: "POST",
				    data : {
				    	"userId": id
				    },		    
				    success: function(data, textStatus, jqXHR)
				    {
						if(data == 1) {
							document.getElementById("idCheckVal").value="N";
						}
						else if(data == 0) {
							document.getElementById("idCheckVal").value="Y";
						}
						
				    },
				    error: function (jqXHR, textStatus, errorThrown)
				    {
				    	console.log("jqXHR: "+jqXHR);
				    	console.log("textStatus: "+textStatus);
				    	console.log("errorThrown: "+errorThrown);
				    	alert("실패");
				    }
				});
			}
			else {
				document.getElementById("idCheckVal").value="N";
			}
		});
		
		$j("#id_check_bt").on("click", function (){
			if(document.getElementById("idCheckVal").value == "Y") {
				alert("가입이 가능한 아이디 입니다.");
			} 
			else if(document.getElementById("idCheckVal").value == "N") {
				alert("아이디 사용이 불가 합니다.");
			}
		});
		
		var pwReg = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{6,12}$/
		
		$j("#userPw").keyup(function() {
			var userPw = $j("#userPw").val();
			
			if(userPw != ""){
				if(pwReg.test(userPw)) {
					document.getElementById("pwCheckVal").value="Y";	
				}
				else if(!pwReg.test(userPw)) {
					document.getElementById("pwCheckVal").value="N";	
				}
			}
		});
	});
</script>


<body>
<form class="userJoin">
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
							<input name="userId" id="userId" type="text" size="10">
							<input type="button" id="id_check_bt" value="중복확인" />
							<input type="hidden" id="idCheckVal" value="N" /> 
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						pw
						</td>
						<td width="400">
							<input name="userPw" id="userPw" type="password" size="20">
							<input type="hidden" id="pwCheckVal" value="N" />
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						pw check
						</td>
						<td width="400">
							<input name="userPwCheck" id="userPwCheck" type="password" size="20">
							<input type="hidden" id="pwcCheckVal" value="N" />
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						name
						</td>
						<td width="400">
							<input name="userName" type="text" size="20">
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						phone
						</td>
						<td width="400">
							<select name="userPhone1">
								<option value="010">010</option>
								<option value="011">011</option>
								<option value="016">016</option>
								<option value="017">017</option>
								<option value="019">019</option>
							</select>
							-
							<input name="userPhone2" type="text" size="4">
							-
							<input name="userPhone3" type="text" size="4">
							
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						postNo
						</td>
						<td width="400">
							<input name="userAddr1" type="text" size="20">
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						address
						</td>
						<td width="400">
							<input name="userAddr2" type="text" size="20">
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						company
						</td>
						<td width="400">
							<input name="userCompany" type="text" size="20">
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td align="right">
				<input type="button" id="submit" value="join">
			</td>
		</tr>
	</table>
</form>	
</body>
</html>