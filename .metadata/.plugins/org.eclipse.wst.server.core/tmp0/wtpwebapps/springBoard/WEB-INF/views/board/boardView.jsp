<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>boardView</title>
</head>
<script type="text/javascript">
	$j(document).ready(function(){
		
		$j("#modify").on("click",function(){
			var boardType = $j('#boardType').val();
			var boardNum = $j('#boardNum').val();
			
			console.log("boardType:" + boardType);
			console.log("boardNum" + boardNum);
			
			location.href = "/board/" + boardType +  "/" + boardNum + "/boardModify.do";
			
		});
		
		$j("#delete").on("click",function(){
			var $frm = $j('input[type=hidden]');			
			var param = $frm.serialize();
		
			$j.ajax({
			    url : "/board/boardDeleteAction.do",
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
			    	alert("실패");
			    }
			});
		});
	});
	
</script>
<body>
<form class="boardView">
	<input id="boardType" name="boardType" type="hidden" value="${board.boardType}" />
	<input id="boardNum" name="boardNum" type="hidden" value="${board.boardNum}" />
	<table align="center">
		<tr>
			<td align="right">
				<input id="modify" type="button" value="수정">
				<input id="delete" type="button" value="삭제">
			</td>
		</tr>
		<tr>
			<td>
				<table border ="1">
					<tr>
						<td width="120" align="center">
						Title
						</td>
						<td width="400">
						${board.boardTitle}
						</td>
					</tr>
					<tr>
						<td height="300" align="center">
						Comment
						</td>
						<td>
						${board.boardComment}
						</td>
					</tr>
					<tr>
						<td align="center">
						Writer
						</td>
						<td>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td align="right">
				<a href="/board/boardList.do">List</a>
			</td>
		</tr>
	</table>	
</form>
</body>
</html>