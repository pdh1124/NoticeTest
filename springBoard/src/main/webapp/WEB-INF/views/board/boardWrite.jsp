<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="/WEB-INF/views/common/common.jsp"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>boardWrite</title>

</head>
<script type="text/javascript">

	$j(document).ready(function(){
		
		
		
		//[순서대로 데이터를 받아온다.]
		$j("#submit").on("click",function(){

			var $frm = $j('#cell_create :input');
			console.log($frm);
			
			var param = $frm.serialize();
			console.log(param);
			
			$j.ajax({
			    url : "/board/boardWriteAction.do",
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
	

	var clicks = 1;
	function add_cell() {
		
		clicks += 1;
		
		//테이블 찾기
		var table = document.getElementById('cell_create');
		
		//행을 추가한다.
		var newRow1 = table.insertRow(2);
		var newRow2 = table.insertRow(3);
		
		// 새 행(Row)에 Cell 추가
		var newCell1 = newRow1.insertCell(0);
		var newCell2 = newRow1.insertCell(1);
		var newCell3 = newRow2.insertCell(0);
		var newCell4 = newRow2.insertCell(1);
		
		// Cell에 텍스트 추가
		newCell1.innerHTML = "<td class='center' width='120' align='center'>Title</td>";
		newCell2.innerHTML = "<td width='400'><input name='boardTitle[" + clicks + "]' type='text' size='50' value='${board.boardTitle}'></td>";
		newCell3.innerHTML = "<td class='center' height='300' align='center'>Comment</td>";
		newCell4.innerHTML = "<td valign='top'><textarea name='boardComment[" + clicks + "]' rows='20' cols='55'>${board.boardComment}</textarea></td>";

		alert(clicks);
	}


	var clicks = 2;
	function add_cell() {
		
		clicks += 1;
		
		var table = document.getElementById('cell_create');
		
		var str1 = '<tr>';
		str1 += '<td width="120" align="center">';
		str1 += 'Title';
		str1 += '</td>';
		str1 += '<td width="400">';
		str1 += '<input name="boardTitle" type="text" size="50" value="${board.boardTitle}">';
		str1 += '</td>';
		str1 += '</tr>';
		table.insertRow(2).innerHTML = str1;
		
		
		var str2 = '<tr>';
		str2 += '<td height="300" align="center">';
		str2 += 'Comment';
		str2 += '</td>';
		str2 += '<td valign="top">';
		str2 += '<textarea name="boardComment" rows="20" cols="55">${board.boardComment}</textarea>';
		str2 += '</td>';
		str2 += '</tr>';
		table.insertRow(3).innerHTML = str2;
		
		alert(clicks);
		
	}

	
</script>
<body>
<form class="boardWrite">
	<table align="center">
		<tr>
			<td align="right">
				<input type="button" onclick='add_cell()' value="행 추가">
				<input type="button" value="행 삭제">
				<input id="submit" type="button" value="작성">
			</td>
		</tr>
		<tr>
			<td>
				<table id="cell_create" border ="1"> 
					<tr>
						<td width="120" align="center">
						Title
						</td>
						<td width="400">
						<input name="ListBoard[0].boardTitle" type="text" size="50" value="${board.boardTitle}"> 
						</td>
					</tr>
					<tr>
						<td height="300" align="center">
						Comment
						</td>
						<td valign="top">
						<textarea  name="ListBoard[0].boardComment" rows="20" cols="55">${board.boardComment}</textarea>
						</td>
					</tr>
					<tr>
						<td width="120" align="center">
						Title
						</td>
						<td width="400">
						<input name="ListBoard[1].boardTitle" type="text" size="50" value="${board.boardTitle}"> 
						</td>
					</tr>
					<tr>
						<td height="300" align="center">
						Comment
						</td>
						<td valign="top">
						<textarea  name="ListBoard[1].boardComment" rows="20" cols="55">${board.boardComment}</textarea>
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