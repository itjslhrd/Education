<%@ page contentType="text/html; charset=UTF-8" %>



<html>
   <head><title>질문과 답변</title>
    <link rel="stylesheet" type="text/css" href="/stylesheet.css">

</head>
 <body topmargin="0" leftmargin="0">
 <table border="0" width="800">
 <tr>
   <td width="20%" height="500" bgcolor="#ecf1ef" valign="top">

   <!-- 다음에 추가할 부분 -->

   </td>

   <td width="80%" valign="top">&nbsp;<br>
     <img src="/QnA/img/bullet-01.gif"><font size="3" face="돋움" color="blue"> <b>반갑습니다</b></font>
     <font size="2"> 질문 글쓰기</font><p>
     <img src="/QnA/img/bullet-03.gif"><font size="2" face="돋움" color="orange"> 잠깐</font> &nbsp;
     <img src="/QnA/img/bullet-02.gif"><font size="2" face="돋움">는 필수 입력 사항입니다.</font><p>
     <form >
     <table border="0">
       <tr>
         <td width="5%" align="right"><img src="/QnA/img/bullet-02.gif"></td>
         <td width="15%"><font size="2" face="돋움">공개유무</font></td>
         <td width="80%">
         <input type="radio" size="20" name="q_open" value="y">공개
         <input type="radio" size="20" name="q_open" value="n">비공개
         </td>
       </tr>
       <tr>
         <td width="5%" align="right"><img src="/QnA/img/bullet-02.gif"></td>
         <td width="15%"><font size="2" face="돋움">질문종류</font></td>
         <td width="80%">
         <input type="radio" size="20" name="q_gubun" value="Java">Java
         <input type="radio" size="20" name="q_gubun" value="JSP">Servlet&JSP
         <input type="radio" size="20" name="q_gubun" value="DB">DB(oracle)
         <input type="radio" size="20" name="q_gubun" value="기타">기타(oracle)
         </td>
       </tr>
       <tr>
         <td width="5%" align="right"><img src="/QnA/img/bullet-02.gif"></td>
         <td width="15%"><font size="2" face="돋움">글쓴이</font></td>
         <td width="80%">
         <input type="text" size="20" name="q_name"></td>
       </tr>
        <tr>
         <td align="right"><img src="/QnA/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">제목</font></td>
         <td><input type="text" size="60" name="q_subject" ></td>
       </tr>
       <tr>
         <td align="right"><img src="/QnA/img/bullet-02.gif"></td>
         <td><font size="2" face="돋움">내용</font></td>
         <td><textarea wrap="physical" rows="15" name="q_contents" cols="62"></textarea></td>
       </tr>
       <tr>
         <td align="right"></td>
         <td><font size="2" face="돋움">연락처</font></td>
          <td>
              <select name="phone1" >
	          <option value="010">010</option>
	          <option value="02">02</option>
	          <option value="031">031</option>
	          <option value="032">032</option>
	          <option value="041">041</option>
	          <option value="042">042</option>
	          <option value="043">043</option>
                  </select>
                   -
                  <input type="text" size="4" name="phone2" >-
                  <input type="text" size="4" name="phone3" >
           </td>
        </tr>
        <tr></tr>
         <tr>
          <td align="right">&nbsp;</td>
          <td><font size="2">&nbsp;</font></td>
          <td>
             <img src="/QnA/img/save.gif" border=0>&nbsp;&nbsp;&nbsp;
             <img src="/QnA/img/cancle.gif" border=0>
          </td>
        </tr>
      </table>
      </form>
    </td>
  </tr>
  </table>
  </body>
  </html>
