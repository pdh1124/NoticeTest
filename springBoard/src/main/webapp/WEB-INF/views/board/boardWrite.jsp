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
	var clicks = 0; //각 번호
	var cellCnt = 0; //셀 갯수(title,comment) 2씩 증감
	var delBtCnt = 0;
	
	//행 삭제
	function del_cell(obj) {
		
		if(clicks <= 1) {
			alert("더이상 삭제 할 수 없습니다.");
			return false;
		}
		
		console.log(obj);
		
		var dCell = $j(obj).parent().parent();
		
		dCell.prev().remove();
		dCell.remove();
		
		clicks -= 1;
		cellCnt -= 2;
			
		delBtCnt = $j(obj).data('num');	
		
		cnt_change();
			
		console.log("delBtCnt : " + delBtCnt);
		
		
		alert("clicks: "+ clicks + ", cellCnt :" + cellCnt);		
	}
	
	//삭제시 번호 초기화
	//1. service딴에서 배열 중 비어있는 배열을 제외하고 받으면 된다.
	//2. 넘길 때 배열을 다시해서 넘기면 된다.
	function cnt_change() {
		
		var ints = 0;	
		var table = document.getElementById('cell_create'); //테이블	
		clicks = 0;	
			
		for(var i = 0; i < table.rows.length-1; i+=2) {
						
			if(ints < delBtCnt) {
				var textTitle = $j("#title_text_"+ints).val();
				var textComment = $j("#comment_text_"+ints).val();
				ints += 1;
			}
			else {
				ints += 1;
				var textTitle = $j("#title_text_"+ints).val();
				var textComment = $j("#comment_text_"+ints).val();
			}
					
			console.log(textTitle);
			console.log(textComment);
			
			var boardNum = '<input name="ListBoard['+clicks+'].boardTitle" id="title_text_'+clicks+'" type="text" size="50" value="' + textTitle + '">'; //타이틀 배열 번호
			var delBnt = 'Comment<input type="button" onclick="del_cell(this)" data-num="'+clicks+'" value="행 삭제">';
			var boardComment = '<textarea name="ListBoard['+clicks+'].boardComment"  id="comment_text_'+clicks+'" rows="20" cols="55">' + textComment + '</textarea>';//내용 배열 번호
			
		
			table.rows[i].cells[1].innerHTML = boardNum;
			table.rows[i+1].cells[0].innerHTML = delBnt;
			table.rows[i+1].cells[1].innerHTML = boardComment;
			clicks++;		
		}
		
		clicks = ints;
		console.log("clicks : " + clicks);
	}
	
	//행 추가
	function add_cell() {
		
		var table = document.getElementById('cell_create');
		
		var str1 = '<tr>';
		str1 += '<td width="120" align="center">';
		str1 += 'Title';
		str1 += '</td>';
		str1 += '<td width="400">';
		str1 += '<input name="ListBoard['+clicks+'].boardTitle" id="title_text_'+clicks+'" type="text" size="50" value="${board.boardTitle}"> ';
		str1 += '</td>';
		str1 += '</tr>';
		table.insertRow(cellCnt).innerHTML = str1;
		
		
		var str2 = '<tr>';
		str2 += '<td height="300" align="center">';
		str2 += 'Comment<input type="button" onclick="del_cell(this)" data-num="'+clicks+'" value="행 삭제">';
		str2 += '</td>';
		str2 += '<td valign="top">';
		str2 += '<textarea name="ListBoard['+clicks+'].boardComment" id="comment_text_'+clicks+'" rows="20" cols="55">${board.boardComment}</textarea>';
		str2 += '</td>';
		str2 += '</tr>';
		table.insertRow(cellCnt+1).innerHTML = str2;
		
		alert("clicks: "+ clicks + ", cellCnt :" + cellCnt);
		
		clicks += 1;
		cellCnt += 2;
		
	}
	
	
	
	/*var clicks = 1;
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
	}*/
	$j(document).ready(function(){
		
		add_cell()
		
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
					//alert("작성완료");
					
					//alert("메세지:"+data.success);
						
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
<form class="boardWrite">
	<table align="center">
		<tr>
			<td align="right">
				<input type="button" onclick='add_cell()' value="행 추가">			
				<input id="submit" type="button" value="작성">
			</td>
		</tr>
		<tr>
			<td>
				<table id="cell_create" border ="1">

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