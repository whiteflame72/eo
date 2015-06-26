<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Recommended Activities</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="loggedin.css" rel="stylesheet" type="text/css" />
<link href="layout.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
.style39 {
	font-size: small;
}
-->
</style>

</head>
<body id="page2">
<!-- header -->
<div id="header"><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/index.jsp"><img
	src="./images/banner/logo.jpg" id="logo" alt="" /></a>

<ul>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/index.jsp"><span><span>Home</span></span></a></li>
    <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/about/about.jsp"><span><span>About Us</span></span></a></li>
    <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/students/students_home.jsp"><span><span>Students</span></span></a></li>
    <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents.jsp"><span><span>Parents</span></span></a></li>
    <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators.jsp"><span><span>Educators</span></span></a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/press/press_room.jsp"><span>Press Room</span></a></li>
    <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/help/help.jsp"><span><span>Help</span></span></a></li>
    <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/about/about_contactus.jsp"><span><span>Contact Us</span></span></a></li>
</ul>
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
	<li class="act"><a href="#">Student Assessment</a></li>
	<li><a href="#">Recommended Activities</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_readiness_prepareachild.jsp">Prepare My Child</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_readiness_tutoring.jsp">Readiness for Tutoring</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_readiness_beinginvolved.jsp">Involvement in My Child's Education</a></li>
	<li class="act"><a href="#">Learning Aids</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_learnaid_resources.jsp">Learning Resources</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_learnaid_assessment.jsp">	Assessment</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_learnaid_tutorial.jsp">Tutoring Tutorial</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_learnaid_homework.jsp">Homework Help</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_learnaid_testprep.jsp">Test Preparation</a></li>
	<li class="act"><a href="#">Technology</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_tech_howtos.jsp">How-To's</a></li>
	<li class="act"><a href="#">Reports</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_rpts_diagnosisprescript.jsp">Diagnostic and Prescriptive</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_rpts_studentprogress.jsp">Student Progress</a></li>
	<li class="act"><a href="#">Help</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_help_childsacademics.jsp">My Child with Academics </a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_help_childlearnstyle.jsp">Students Learning Styles</a></li>
	<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/parents/parents_help_academicplan.jsp">Academic Plan</a></li>
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
<div class="title"><img src="../images/eol/2page-title1.gif" alt="" /></div>

<p><img src="../images/eol/2page-img1.jpg" alt="" /></p>
<div class="clear"></div>
</div>
<div class="col-2">

<h3>Recommended Activities</h3>

<s:form name="form1" id="form1" method="post" action="/jsp/recommended_activities.jsp">
	<div class="formsquare">
		<strong>Recommended Activities</strong><br/>
		<table width="600">
		<tr>
			<td>Monthly assessment:</td>
			<td><s:textfield name="monthlyAssessment" value="Recommended" readonly="true"></s:textfield></td>		
		</tr>
		
		<tr>
			<td>Homework help:</td>
			<td><s:textfield name="homeworkHelp" value="Recommended" readonly="true"></s:textfield></td>			
		</tr>
		
		<tr>
			<td>Tutoring:</td>
			<td><s:textfield name="tutoring" value="activities.tutoring" readonly="true"></s:textfield></td>			
		</tr>
		<tr>
			<td>Tutoring Schedule:</td>
			<td><s:textfield name="tutoringSchedule" value="activities.schedule" readonly="true"></s:textfield></td>
		</tr>	
		<tr>
			<td colspan="2" align="center">
				<s:submit value="OK"></s:submit>
										
			</td>
		</tr>	
		</table>		
	</div>	
	
	
</s:form>

<div class="two-blocks">
<div class="left-block">
</div>
<div class="right-block">
</div>
</div>
<div class="line-hor"></div>

<img src="../images/eol/2page-img2.jpg" class="fleft" alt="" />
<div class="clear"></div>
<img src="../images/eol/2page-img3.jpg" class="fleft" alt="" />
<div class="clear"></div>
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
<div class="wrapper">
<div class="clear"></div>
<br />
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
</div>
</div>
</div>
</div>
</div>
<div id="content-bot"></div>
<!-- footer -->
<div id="footer">
<div align="center" class="style39">About EOL | Programs &amp;
Services | Research &amp; Statistics | Policy &amp; Guidance | Legal
Terms | Affiliates | Other Links | Help</div>
<div align="center" class="style39">| Feedback | Contact Us |
Careers | Advertise at EOL | Choose Your Edition | Site Map</div>
<p>&nbsp;</p>
</div>
</body>
</html>
