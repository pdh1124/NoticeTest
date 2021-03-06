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
	$j(document).ready(function(){
		
		//아이디 작성체크
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
							$j("#id_text").text("중복확인을 해주시기 바랍니다.");
						}
						else if(data == 0) {
							document.getElementById("idCheckVal").value="Y";
							$j("#id_text").text("중복확인을 해주시기 바랍니다.");
						}
						
				    },
				    error: function (jqXHR, textStatus, errorThrown)
				    {
				    	alert("실패");
				    }
				});
			}
			else {
				document.getElementById("idCheckVal").value="N";
			}
		});
		
		//아이디 중복 체크
		$j("#id_check_bt").on("click", function (){
			if(document.getElementById("idCheckVal").value == "Y") {
				$j("#id_text").text("가입이 가능한 아이디 입니다.");
				alert("가입이 가능한 아이디 입니다.");
			} 
			else if(document.getElementById("idCheckVal").value == "N") {
				$j("#id_text").text("사용이 불가한 아이디 입니다.");
				alert("아이디 사용이 불가 합니다.");
			}
		});
		
		var pwReg = /^.*(?=.{6,12})(?=.*[0-9])(?=.*[a-zA-Z]).*$/;
		//영문 숫자 조합 6~12글자
		
		//비밀번호 유효성
		$j("#userPw").keyup(function() {
			var userPw = $j("#userPw").val();
			var userPwCheck = $j("#userPwCheck").val();
			
			//console.log("비밀번호 체크");
			if(userPw != ""){
				if(pwReg.test(userPw)) {
					document.getElementById("pwCheckVal").value="Y";
					$j("#pw_text").text("비밀번호 사용이 가능합니다.");
					if(userPw != userPwCheck) {
						document.getElementById("pwcCheckVal").value="N";
						$j("#pwc_text").text("비밀번호가 일치하지 않습니다.");
					} else {
						document.getElementById("pwcCheckVal").value="Y";
						$j("#pwc_text").text("비밀번호가 일치합니다.");
					}
				}
				else if(!pwReg.test(userPw)) {
					document.getElementById("pwCheckVal").value="N";
					document.getElementById("pwcCheckVal").value="N";
					$j("#pw_text").text("6~12자리의 영문/숫자 조합입니다.");
					$j("#pwc_text").text("비밀번호가 일치하지 않습니다.");
				}
			}
		});
		
		//비밀번호 확인 
		$j("#userPwCheck").keyup(function() {
			var userPw = $j("#userPw").val();
			var userPwCheck = $j("#userPwCheck").val();
			
			//console.log("비밀번호확인 체크");
			if(userPw != "" || userPwCheck != "") {
				if(userPw != userPwCheck) {
					document.getElementById("pwcCheckVal").value="N";
					$j("#pwc_text").text("비밀번호가 일치하지 않습니다.");
				} 
				else {
					document.getElementById("pwcCheckVal").value="Y";
					$j("#pwc_text").text("비밀번호가 일치합니다.");
				}
			}
		});
		
		//이름 검사
		var naReg = /^[\uac00-\ud7a3+]*$/;
		//가-힣 까지

		$j("#userName").keyup(function() {
			var userName = $j("#userName").val();
			
			if(naReg.test(userName)) {
				document.getElementById("nameCheckVal").value="Y";
				$j("#na_text").text("이름을 사용할 수 있습니다.");
			}
			else if(!naReg.test(userName)) {
				document.getElementById("nameCheckVal").value="N";
				$j("#na_text").text("이름의 유효성이 맞지 않습니다.");
			}
		});
		
		
		//폰 검사
		var phoReg1 = /^[0-9]{3,4}$/;
		var phoReg2 = /^[0-9]{4}$/;
		
		$j("#userPhone3, #userPhone2, #userPhone1").change(function() {
			var userPhone1 = $j("#userPhone1").val();
			var userPhone2 = $j("#userPhone2").val();
			var userPhone3 = $j("#userPhone3").val();
			
			if(phoReg2.test(userPhone3)) {
				if(phoReg1.test(userPhone2)) {
					$j.ajax({
					    url : "/user/userPhoneCheak.do",
					    dataType: "json",
					    type: "POST",
					    data : {
					    	userPhone1 : userPhone1,
					    	userPhone2 : userPhone2,
					    	userPhone3 : userPhone3
					    },    
					    success: function(data, textStatus, jqXHR)
					    {
							if(data == 1) {
								document.getElementById("phoneCheckVal").value="N";
								$j("#ph_text").text("이미 가입된 번호입니다.");
							}
							else if(data == 0) {
								document.getElementById("phoneCheckVal").value="Y";
								$j("#ph_text").text("가입 가능한 번호 입니다.");
							}
							
					    },
					    error: function (jqXHR, textStatus, errorThrown)
					    {
					    	alert("실패");
					    }
					});
				}
				else if (!phoReg1.test(userPhone2)) {
					document.getElementById("phoneCheckVal").value="N";
					$j("#ph_text").text("핸드폰 유효성이 맞지 않습니다.");
				}
			}
			else if (!phoReg2.test(userPhone3)) {
				document.getElementById("phoneCheckVal").value="N";
				$j("#ph_text").text("핸드폰 유효성이 맞지 않습니다.");
			}
		});
		
		//우편번호 유효성
		var pnReg = /^[0-9]{3}-[0-9]{3}$/;
		
		$j("#userAddr1").keyup(function() {
			var userAddr1 = $j("#userAddr1").val();
			
			if(pnReg.test(userAddr1)) {
				document.getElementById("ua1CheckVal").value="Y";
				$j("#pn_text").text("사용가능한 우편번호 입니다.");
			}
			else if(!pnReg.test(userAddr1)) {
				document.getElementById("ua1CheckVal").value="N";
				$j("#pn_text").text("000-000형식으로 작성해주시길 바랍니다.");
			}
		});
		
		//주소 작성 여부
		$j("#userAddr2").keyup(function() {
			var userAddr2 = $j("#userAddr2").val();
			
			if(userAddr2 != "") {
				document.getElementById("ua2CheckVal").value="Y";
			}
			else if(userAddr2 == "") {
				document.getElementById("ua2CheckVal").value="N";
			}
		});

		//회사
		$j("#userCompany").keyup(function() {
			var userCompany = $j("#userCompany").val();
			
			if(userCompany != "") {
				document.getElementById("ucCheckVal").value="Y";
			}
			else if(userCompany == "") {
				document.getElementById("ucCheckVal").value="N";
			}
		});
		
		
		//회원가입 완료
		$j("#submit").on("click",function(){
			
			var $frm = $j('#join_table :input');
			console.log($frm);
			
			var param = $frm.serialize();
			console.log(param);
			
			if(document.getElementById("idCheckVal").value == 'N') {
				alert("아이디를 제대로 입력해 주시기 바랍니다.");
				$("#userId").focus;
				return false;
			}
			
			if(document.getElementById("pwCheckVal").value == 'N') {
				alert("비밀번호를 제대로 입력해 주시기 바랍니다.");
				$("#userPw").focus;
				return false;
			}
			
			if(document.getElementById("pwcCheckVal").value == 'N') {
				alert("비밀번호 확인을 제대로 입력해 주시기 바랍니다.");
				$("#userPwCheck").focus;
				return false;
			}
			
			if(document.getElementById("nameCheckVal").value == 'N') {
				alert("이름을 한글로 입력해주시기 바랍니다.");
				$("#userName").focus;
				return false;
			}
			
			if(document.getElementById("phoneCheckVal").value == 'N') {
				alert("핸드폰 번호를 제대로 입력해주시기 바랍니다.");
				$("#userPhone2").focus;
				return false;
			}
			
			if(document.getElementById("ua1CheckVal").value == 'N') {
				alert("우편번호를 제대로 입력해 주시기 바랍니다.");
				$("#userAddr1").focus;
				return false;
			}
			
			/*
			if(document.getElementById("ua2CheckVal").value == 'N') {
				alert("주소를 입력해주시기 바랍니다.");
				$("#userAddr2").focus;
				return false;
			}
			
			if(document.getElementById("ucCheckVal").value == 'N') {
				alert("회사를 입력해주시기 바랍니다.");
				$("#userCompany").focus;
				return false;
			}
			*/
			
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
							<input name="userId" id="userId" type="text" size="10" />
							<input type="button" id="id_check_bt" value="중복확인" />
							<input type="hidden" id="idCheckVal" value="N" />
							<div id="id_text"></div>
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						pw
						</td>
						<td width="400">
							<input name="userPw" id="userPw" type="password" size="20" />
							<input type="hidden" id="pwCheckVal" value="N" />
							<div id="pw_text"></div>
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						pw check
						</td>
						<td width="400">
							<input name="userPwCheck" id="userPwCheck" type="password" size="20" />
							<input type="hidden" id="pwcCheckVal" value="N" />
							<div id="pwc_text"></div>
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						name
						</td>
						<td width="400">
							<input name="userName" id="userName" type="text" size="20" />
							<input type="hidden" id="nameCheckVal" value="N" />
							<div id="na_text"></div>
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						phone
						</td>
						<td width="400">
							<select name="userPhone1" id="userPhone1">
								<option value="1">010</option>
								<option value="2">011</option>
								<option value="3">016</option>
								<option value="4">017</option>
								<option value="5">019</option>
							</select>
							-
							<input name="userPhone2" id="userPhone2" type="text" size="4">
							-
							<input name="userPhone3" id="userPhone3" type="text" size="4">
							<input type="hidden" id="phoneCheckVal" value="N" />
							<div id="ph_text"></div>
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						postNo
						</td>
						<td width="400">
							<input name="userAddr1" id="userAddr1" type="text" size="20">
							<input type="hidden" id="ua1CheckVal" value="N" />
							<div id="pn_text"></div>
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						address
						</td>
						<td width="400">
							<input name="userAddr2" id="userAddr2" type="text" size="20">
							<!-- input type="hidden" id="ua2CheckVal" value="N" / -->
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						company
						</td>
						<td width="400">
							<input name="userCompany" id="userCompany" type="text" size="20">
							<!-- input type="hidden" id="ucCheckVal" value="N" / -->
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