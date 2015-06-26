<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
<title>Parent Registration</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="loggedin.css" rel="stylesheet" type="text/css" />
<link href="layout.css" rel="stylesheet" type="text/css" />

</head>
<body id="page2">



<!-- header -->
<div id="header"> <a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/index.jsp"><img src="./images/banner/logo.jpg" id="logo" alt="" /></a> 
  
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
                                <li class="act"><a href="#">Readiness</a></li>
                                <li><a href="#">Parent Input</a></li>
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
          <div class="title"><img src="/EOLProgramGoals/images/eol/2page-title1.gif" alt="" /></div>
          <p><img src="/EOLProgramGoals/images/eol/2page-img1.jpg" alt="" /></p>
          <div class="clear"></div>
        </div>
        <div class="col-2">
        <h3>	Registration  </h3>
          		 		 
          <s:form action="parent_registration_form" method="post" validate="true">
          <s:hidden name="studentId" value="%{studentId}" /> 
		  <div class="formsquare" style=" width : 594px;">
            
        	<font color="red"><s:fielderror /></font>
            
          <table width="600" CELLSPACING="1" CELLPADDING="1" BORDER="0">
           <tr>
             <td width="250" colspan="4"><strong>Create an Account</strong></td>
           </tr>
           <tr>
           <td colspan="4">&nbsp;</td>
           </tr>
           <tr>
             <td width="350" colspan="3">Create a login name and password</td>
             <td colspan="1"><a href="../help/help.html"><span><span>Help</span></span></a></td>
             <!-- <td colspan="4">&nbsp;</td> -->
           </tr>
           <tr>
             <td width="100">Login Name:</td>
             <!-- <s:textfield name="loginname" label="Login Name"/> -->
             <td width="200"><input type="text" size="0" name="loginName" value="<%=request.getParameter("loginName")%>" /></td>
             <td width="100"> Parent Email Address:</td>
             <!--<s:textfield name="emailAddress" label="Email Address"/> -->
             <td colspan="1" width="200px"><input type="text" size="0" name="emailAddress" value="<%=request.getParameter("emailAddress")%>" /></td>
           </tr>
           <tr>
             <td width="100">Password:</td>
             <!--<s:password name="loginPassword" label="Login Password"/> -->
             <td width="200"><input type="password" size="0" name="loginPassword" value="<%=request.getParameter("loginPassword")%>" /></td>
             <td colspan="1"><input type="checkbox" size="0" name="chkboxAgreement" value="<%=request.getParameter("checkboxAgreement")%>" /></td>
             <td colspan="2"><font size="1">By checking this checkbox I have agreed to the terms and conditions detailed in the registration agreement.
             Click here for information about our privacy policy.</font></td>
           </tr>
           <tr>
             <td width="100">
             Verify
             Password:
             </td>
             <!--<s:textfield name="verifypassword" label="Verify Password"/> -->
             <td width="200"><input type="text" size="0" name="verifyPassword" value="<%=request.getParameter("verifyPassword")%>" /></td>
             <td colspan="1"><input type="checkbox" align="center" size="0" name="chkboxagreement" value="<%=request.getParameter("checkboxAgreement")%>" />
             <td colspan="1"><font size="1">I would like to receive the Education
             Online monthly newsletter.</font></td>
             </td>
           </tr>
           <tr>
             <td colspan="4">(password should be at least 8 characters)</td>
           </tr>
          </table>
          </div>
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
           <div class="formsquare" border="1" style="width:994px;" BORDER="1">
            <table width="600" CELLSPACING="1" CELLPADDING="1" BORDER="0">
            <tr>
              <td colspan="1">&nbsp;</td>
              <td><strong>Parent Information</strong></td>
              <td colspan="1">&nbsp;</td>
              <td><strong>Student Information</strong></td>
            </tr>
            <tr>
	          <td width="130px">Last Name:</td>
              <!--<s:textfield name="parentLastname" label="Parent Last Name" value=""/>-->
   	          <td colspan="1"><input type="text" size="0" name="parentLastName" value="<%=request.getParameter("parentLastName")%>" /></td>
	          <td width="130px">Last Name:</td>
              <!--<s:textfield name="studentLastname" label="Student Last Name"/>-->
	          <td colspan="1"><input type="text" align="center" size="0" name="studentLastName" value="<%=request.getParameter("studentLastName")%>" /></td>
            </tr>
            <tr>
	          <td width="130px">First Name:</td>
              <!--<s:textfield name="parentFirstname" label="Parent First Name" value=""/>-->
   	          <td colspan="1"><input type="text" size="0" name="parentFirstName" value="<%=request.getParameter("parentFirstName")%>" /></td>
	          <td width="130px">First Name:</td>
              <!--<s:textfield name="studentfirstname" label="Student Last Name"/>-->
	          <td colspan="1"><input type="text" align="center" size="0" name="studentFirstName" value="<%=request.getParameter("studentLastName")%>" /></td>
            </tr>    
            <tr>
                    
             <td>Phone:</td>
             <!--<s:textfield name="areacode" label="phone"/> -->
             <!-- <td width="200" size="100"> -->
             <td>
             <table  CELLSPACING="0" CELLPADDING="0" BORDER="0">
               <tr>
                <td width="70">(<input type="text" size="1" name="p_areaCode" value="<%=request.getParameter("s_areaCode")%>" />)</td>
                <td width="50"><input type="text" size="1" name="p_phoneNumber1" value="<%=request.getParameter("s_phoneNumber1")%>" /></td>
                <td width="200">-<input type="text" size="2" name="p_phoneNumber2" value="<%=request.getParameter("s_phoneNumber2")%>" /></td>
               </tr>
              </table>
             </td>
             <!-- </td> -->
           </tr>
            <tr>
	          <td width="100">Address1:</td>
              <!--<s:textfield name="parentaddress1" label="Parent Address1" value=""/>-->
   	          <td colspan="1" width="200px"><input type="text" size="0" name="parentAddress1" value="<%=request.getParameter("parentAddress1")%>" /></td>
	          <td width="100">Address1:</td>
              <!--<s:textfield name="studentaddress1" label="Student Address1"/>-->
	          <td colspan="1" width="200px"><input type="text" align="center" size="0" name="studentAddress1" value="<%=request.getParameter("studentaddress1")%>" /></td>
	        </tr>
	        <tr>
	          <td width="20">Address2:</td>
              <!--<s:textfield name="parentaddress2" label="Parent Address2" value=""/>-->
              <td colspan="1" width="200px"><input type="text" size="0" name="parentAddress2" value="<%=request.getParameter("parentAddress2")%>" /></td>
	          <td width="20">Address2:</td>
              <!--<s:textfield name="studentaddress2" label="Student Address2"/>-->
	          <td colspan="1" width="200px"><input type="text" align="center" size="0" name="studentAddress2" value="<%=request.getParameter("studentAddress2")%>" /></td>
	        </tr>

	        <tr>
	          <td width="20">City:</td>
              <!--<s:textfield name="parentcity" label="Parent City" value=""/>-->
              <td><input type="text" size="0" name="parentCity" value="<%=request.getParameter("parentCity")%>" /></td>
	          <td width="20">City:</td>
              <!--<s:textfield name="studentcity" label="Student City"/>-->
	          <td colspan="1"><input type="text" align="center" size="0" name="studentCity" value="<%=request.getParameter("studentCity")%>" /></td>
	        </tr>
	        <tr>
	          <td width="20">State:</td>
              <!--<s:textfield name="parentstate" label="Parent State" value=""/>-->
   	          <td colspan="1"><input type="text" size="0" name="parentState" value="<%=request.getParameter("parentState")%>" /></td>
	          <td size="20">State:</td>
              <!--<s:textfield name="studentstate" label="Student State"/>-->
	          <td colspan="1"><input type="text" align="center" size="0" name="studentState" value="<%=request.getParameter("studentState")%>" /></td>
	       </tr>
	       <tr>
	          <td width="20">Zip:</td>
              <!--<s:textfield name="parentzipcode" label="Parent Zip Code" value=""/>-->
              <td>
              <table>
               <tr>
   	            <td><input type="text" size="2" name="parentZipcode1" value="<%=request.getParameter("parentZipCode1")%>" /></td>
   	            <td>-<input type="text" align="center" size="4" name="parentZipcode2" value="<%=request.getParameter("parentZipCode2")%>" /></td>
   	           </tr>
   	          </table>
              </td>

	          <td size="20">Zip:</td>
	          <td>
	          <table>
	           <tr>
                 <!--<s:textfield name="studentzipcode" label="Student Zip Code"/>-->
	             <td><input type="text" size="2" name="studentZipcode1" value="<%=request.getParameter("studentZipCode1")%>" /></td>
	             <td>-<input type="text" align="center" size="4" name="studentZipcode2" value="<%=request.getParameter("studentZipCode2")%>" /></td>
               </tr>
              </table>
              </td>
	       </tr>
	       <tr>
	          <td width="20">County:</td>
              <!--<s:textfield name="parentcounty" label="Parent County" value=""/>-->
   	          <td colspan="1"><input type="text" size="0" name="parentCounty" value="<%=request.getParameter("parentCounty")%>" /></td>
	          <td size="20">County:</td>
              <!--<s:textfield name="studentcounty" label="Student County"/>-->
	          <td colspan="1"><input type="text" align="center" size="0" name="studentCounty" value="<%=request.getParameter("studentCounty")%>" /></td>
	        </tr>
	        <tr>
	           <td colspan="3">&nbsp;</td>
	           <td colspan="1" width="380px">
	             <button type="cancel" size="4" name="Cancel" value="Cancel" onClick="getPermission(this.form)">Cancel</button>/> />
                 <button name="Clear" size="4" type="reset" id="Clear" value="Reset" onclick="confirmReset()">Reset</button>/> />
                 <button name="Next" size="4" type="next" id="Next" value="Next">Next></button>/>
               </td>
               </tr>
              </table>
          </s:form>
          <div class="line-hor"></div>
          
          <img src="/EOLProgramGoals/images/eol/2page-img2.jpg" class="fleft" alt="" />
          <div class="clear"></div>
          <img src="/EOLProgramGoals/images/eol/2page-img3.jpg" class="fleft" alt="" />
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
  <div align="center" class="style39">About EOL | Programs &amp; Services | Research &amp; Statistics | Policy &amp; Guidance | Legal Terms | Affiliates | Other Links | Help </div>
  <div align="center" class="style39">| Feedback | Contact Us | Careers | Advertise at EOL | Choose Your Edition | Site Map </div>
  <p>&nbsp;</p>
</div>
</body>
</html>
