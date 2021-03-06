<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript">
var root ="${root}";
var doc_type = "${doc_type_name}";
var controller="";
if(doc_type=="기안서"){
	controller="/proposal";
}else if(doc_type=="품의서"){
	controller="/consultation";
}else if(doc_type=="지출결의서"){
	controller="/payment";
}else if(doc_type=="출장신청서"){
	controller="/btripApplication";
}else if(doc_type=="출장보고서"){
	controller="/btripReport";
}else if(doc_type=="휴가신청서"){
	controller="/vacation";
}else if(doc_type=="업무일지"){
	controller="/journal";
}
</script>  

<!-- 첨부파일 -->
<table class="eword_maincolumn eword_meta mar10b">
	<col class="eword_th_width">
	<col>
	<tr>
		<th>첨부파일</th>
		<td>
			<textarea rows="10" cols="90" style="height: 100px; overflow: auto;"></textarea>
				
			<div class="form-inline" style="padding-top: 4px; padding-bottom: 4px;">
				<div class="form-group" style="padding-top: 4px"><input type="file" value="첨부파일"></div>
				<div class="form-group" style="padding-top: 4px"><input type="reset" value="삭제"></div>
			</div>
		</td>
	</tr>
</table>

<!-- 안내 -->
<div class="eword_maincolumn mar10b black">
	<b>※ 한번에 올릴 수 있는 파일용량은 최대 10MB 입니다.</b><br>
	※ 파일 업로드시 파일명을 되도록 영문 또는 숫자로 해주시고, 한글로 할 경우에는 파일열기가 안될경우도 있습니다.<br>

</div>

</div>
</form>
</div>
<!-- Page Content -->
</div>
<!-- wrapper -->


<script type="text/javascript" src="http://js.whoisdesk.net/Src/WebCommon/Script/preventDuplicateSubmit.js"></script>
<script type="text/javascript" src="${root}/js/jquery.DOMWindow.js"></script>



</body>
</html>