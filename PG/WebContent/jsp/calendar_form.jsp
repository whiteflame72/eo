<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
<title>Calendar</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="/EOLProgramGoals/jsp/style.css" rel="stylesheet" type="text/css" />
<link href="/EOLProgramGoals/jsp/loggedin.css" rel="stylesheet" type="text/css" />
<link href="/EOLProgramGoals/jsp/layout.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
.style39 {font-size: small; }
-->
</style>
</head>
<body id="page2">

           <script language="JavaScript">
            function getPermission(form){
              if(confirm("press ok to Cancel")){
                document.account_creation_form.cancel()
              }
            }

            function confirmReset(){

               confirm("are you sure ?") ? document.account_creation_form.reset() : null;
            }
           </script>
           
<!-- header -->
<div id="header"> <a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/index.jsp"><img src="./jsp/images/banner/logo.jpg" id="logo" alt="" /></a> 
  
<%@ include file="nav_top.jsp" %>
</div>
<!-- content -->
<div id="content-tail">
  <div id="content">
    <div class="line-ver">
      <div class="wrapper">
        <div class="col-1">
          <div class="box">
            <div class="border-top">
              <div class="border-bot">
                <div class="border-left">
                  <div class="border-right">
                    <div class="corner-top-left">
                      <div class="corner-top-right">
                        <div class="corner-bot-left">
                          <div class="corner-bot-right">
                            <div class="box-indent">
                              <ul class="list">
                                <li class="act"><a href="#">About</a></li>
                                <li><a href="about_corp.jsp">Corporation</a></li>
                                <li><a href="about_missions.jsp">Mission Statement</a></li>
                                <li><a href="about_philosophy.jsp">Philosophy</a></li>
								<li><a href="about_methods.jsp">Methods</a></li
                                ><li><a href="about_corprelations.jsp">Corporate Relations</a></li>
                                <li><a href="about_successstories.jsp">Success Stories</a></li>
								<li><a href="about_howitworks.jsp">How it Works</a></li>
                                <li><a href="about_who&why.jsp">Who Uses It and Why</a></li>
								<li><a href="about_benefits.jsp">Benefits</a></li>
								<li><a href="about_careers.jsp">Careers</a></li>
								<li><a href="about_contactus.jsp">Contact Us</a></li>
								<li class="act"><a href="#">Guides</a></li>
								<li><a href="about_guides_parents.jsp">Guides: Parents'</a></li>
								<li><a href="about_guides_students.jsp">Guides: Students'</a></li>
								<li><a href="about_guides_tutors.jsp">Guides: Tutors; </a></li>
								<li><a href="about_guides_teachers.jsp">Guides: Admnistrator</a></li>
								<li><a href="about_guides_administrators.jsp">Guides: Administrator</a></li>
								<li><a href="about_staff.jsp">Staff</a></li>
								
                              </ul>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
         </div>
        <div class="col-2">
          <h3> Calendar</h3>
          <s:form action="calendar_form" method="post" validate="true">
		  
          <div class="formsquare"  style=" width : 594px;">

				<table border="1">
				<tr>
              	<th colspan="3"> Activities </th>
              	</tr>
              	
				<tr>
              	<th>Activity</th>&nbsp;
              	<th>Scheduled for Today</th>&nbsp;
              	<th>Upcoming</th>
				</tr>

				
				<tr>
				<td>Tutoring</td>
	            <td><s:textfield theme="simple" name="tutoringToday" value="%{tutoringToday}" /></td>
	            <td><s:textfield theme="simple" name="tutoringNext" value="%{tutoringNext}" /></td>
	            </tr>
	            <br> 
				
				<tr>
				<td>Assessments</td>
	            <td><s:textfield theme="simple" name="assessmentsToday" value="%{assessmentsToday}" /></td>
	            <td><s:textfield theme="simple" name="assessmentsNext" value="%{assessmentsNext}" /></td>
	            </tr>

				
				<tr>
				<td>Homework</td>
	            <td><s:textfield theme="simple" name="homeworkToday" value="%{homeworkToday}" /></td>
	            <td><s:textfield theme="simple" name="homeworkNext" value="%{homeworkNext}" /></td>
	            </tr>

				
				<tr>
				<td>Test Prep</td>
	            <td><s:textfield theme="simple" name="testprepToday" value="%{testprepToday}" /></td>
	            <td><s:textfield theme="simple" name="testprepNext" value="%{testprepNext}" /></td>
	            </tr>

				</table>
				
			
			
				<br>
				<strong>Reports:</strong>
				<br>
				<div style="overflow:auto;width:100%;height:150px;border:1px solid #ccc;">
				
				<a href="about_guides_students.jsp">Report 1</a>
				<br>
				<a href="about_guides_students.jsp">Report 2</a>
				<br>
				<a href="about_guides_students.jsp">Report 3</a>
				<br>
				<a href="about_guides_students.jsp">Report 4</a>
				<br>
				<a href="about_guides_students.jsp">Report 5</a>
				</div>

				<br>
				<br>
				<strong>Messages:</strong>
				<br>
				<div style="overflow:auto;width:100%;height:150px;border:1px solid #ccc;">
				
				<a href="about_guides_students.jsp">Message 1</a>
				<br>
				<a href="about_guides_students.jsp">Message 2</a>
				<br>
				<a href="about_guides_students.jsp">Message 3</a>
				<br>
				<a href="about_guides_students.jsp">Message 4</a>
				<br>
				<a href="about_guides_students.jsp">Message 5</a>
				</div>


             </div>
          </s:form>
          <br />
          <br />
          <img src="images/eol/2page-img2.jpg" class="fleft" alt="" />
        </div>
      </div>
    </div>
  </div>
</div>
<div id="content-bot"></div>
<!-- footer -->
<%@ include file="nav_bottom.jsp" %>
</body>
</html>
