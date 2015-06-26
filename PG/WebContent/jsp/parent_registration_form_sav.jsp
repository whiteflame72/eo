<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>About EOL: Contact Us</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="style.css" rel="stylesheet" type="text/css" />
<link href="loggedin.css" rel="stylesheet" type="text/css" />
<link href="layout.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
.style39 {font-size: small; }
-->
</style>
</head>
<body id="page2">
<!-- header -->
<div id="header"> <a href="/EOL_Web_Site/eol/index.jsp"><img src="./images/banner/logo.jpg" id="logo" alt="" /></a> 
  
<%@ include file="./nav_top.jsp" %>
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
          <h3> New Registration</h3>
          <br />
          <!-- <form name="account_creation_form" id="account_creation_form" method="post" action=account_creation_form"> -->
          <form name="parent_registration_form" id="parent_registration_form" action="parent_registration_form" method="post" validate="true">

          <div class="formsquare" style="width:994px;" BORDER="1">
          <table width="600px" CELLSPACING="1" CELLPADDING="1" BORDER="0">
           <tr>
             <td width="250px" colspan="4"><strong>Create an Account</strong></td>
           </tr>
           <tr>
           <td colspan="4">&nbsp;</td>
           </tr>
           <tr>
             <td width="350px" colspan="3">Create a login name and password</td>
             <td colspan="1"><a href="../help/help.html"><span><span>Help</span></span></a></td>
             <!-- <td colspan="4">&nbsp;</td> -->
           </tr>
           <tr>
             <td width="100px">Login Name:</td>
             <!-- <s:textfield name="loginname" label="Login Name"/> -->
             <td width="200px"><input type="text" size="0" name="loginname" value="<%=request.getParameter("loginName")%>" /></td>
             <td width="100px">Email Address:</td>
             <!--<s:textfield name="emailaddress" label="Email Address"/> -->
             <td colspan="1" width="200px"><input type="text" size="0" name="emailaddress" value="<%=request.getParameter("emailAddress")%>" /></td>
           </tr>
           <tr>
             <td width="100px">Password:</td>
             <!--<s:password name="loginPassword" label="Login Password"/> -->
             <td width="200px"><input type="password" size="0" name="loginpassword" value="<%=request.getParameter("loginPassword")%>" /></td>
             <td colspan="1"><input type="checkbox" size="0" name="chkboxagreement" value="<%=request.getParameter("checkboxAgreement")%>" /></td>
             <td colspan="2"><font size="1">By checking this checkbox I have agreed to the terms and conditions detailed in the registration agreement.
             Click here for information about our privacy policy.</font></td>
           </tr>
           <tr>
             <td width="100px">
             Verify
             Password:
             </td>
             <!--<s:textfield name="verifypassword" label="Verify Password"/> -->
             <td width="200px"><input type="text" size="0" name="verifypassword" value="<%=request.getParameter("verifyPassword")%>" /></td>
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
            <table width="600px" CELLSPACING="1" CELLPADDING="1" BORDER="0">
            <tr>
              <td colspan="1">&nbsp;</td>
              <td><strong>Parent Information</strong></td>
              <td colspan="1">&nbsp;</td>
              <td><strong>Student Information</strong></td>
            </tr>
            <tr>
	          <td width="130px">Last Name:</td>
              <!--<s:textfield name="parentLastname" label="Parent Last Name" value=""/>-->
   	          <td colspan="1"><input type="text" size="0" name="parentlastname" value="<%=request.getParameter("parentLastName")%>" /></td>
	          <td width="130px">Last Name:</td>
              <!--<s:textfield name="studentLastname" label="Student Last Name"/>-->
	          <td colspan="1"><input type="text" align="center" size="0" name="studentlastname" value="<%=request.getParameter("studentLastName")%>" /></td>
            </tr>
            <tr>
	          <td width="130px">First Name:</td>
              <!--<s:textfield name="parentFirstname" label="Parent First Name" value=""/>-->
   	          <td colspan="1"><input type="text" size="0" name="parentfirstname" value="<%=request.getParameter("parentFirstName")%>" /></td>
	          <td width="130px">First Name:</td>
              <!--<s:textfield name="studentfirstname" label="Student Last Name"/>-->
	          <td colspan="1"><input type="text" align="center" size="0" name="studentlastname" value="<%=request.getParameter("studentLastName")%>" /></td>
            </tr>            
            <tr>
             <td>Phone:</td>
             <!--<s:textfield name="areacode" label="phone"/> -->
             <!-- <td width="200px" size="100"> -->
             <td>
             <table  CELLSPACING="0" CELLPADDING="0" BORDER="0">
               <tr>
                <td width="70px">(<input type="text" size="1"  name="p_areacode" value="<%=request.getParameter("p_areaCode")%>" />)</td>
                <td width="50px"><input type="text" size="1" name="p_phonenumber1" value="<%=request.getParameter("p_phoneNumber1")%>" /></td>
                <td width="200px">-<input type="text" size="2" name="p_phonenumber2" value="<%=request.getParameter("p_phoneNumber2")%>" /></td>
               </tr>
              </table>
             </td>
             <td>Phone:</td>
             <!--<s:textfield name="areacode" label="phone"/> -->
             <!-- <td width="200px" size="100"> -->
             <td>
             <table  CELLSPACING="0" CELLPADDING="0" BORDER="0">
               <tr>
                <td width="70px">(<input type="text" size="1" name="s_areacode" value="<%=request.getParameter("s_areaCode")%>" />)</td>
                <td width="50px"><input type="text" size="1" name="s_phonenumber1" value="<%=request.getParameter("s_phoneNumber1")%>" /></td>
                <td width="200px">-<input type="text" size="2" name="s_phonenumber2" value="<%=request.getParameter("s_phoneNumber2")%>" /></td>
               </tr>
              </table>
             </td>
             <!-- </td> -->
           </tr>
            <tr>
	          <td width="100px">Address1:</td>
              <!--<s:textfield name="parentaddress1" label="Parent Address1" value=""/>-->
   	          <td colspan="1" width="200px"><input type="text" size="0" name="parentaddress1" value="<%=request.getParameter("parentAddress1")%>" /></td>
	          <td width="100px">Address1:</td>
              <!--<s:textfield name="studentaddress1" label="Student Address1"/>-->
	          <td colspan="1" width="200px"><input type="text" align="center" size="0" name="studentaddress1" value="<%=request.getParameter("studentaddress1")%>" /></td>
	        </tr>
	        <tr>
	          <td width="20">Address2:</td>
              <!--<s:textfield name="parentaddress2" label="Parent Address2" value=""/>-->
              <td colspan="1" width="200px"><input type="text" size="0" name="parentaddress2" value="<%=request.getParameter("parentAddress2")%>" /></td>
	          <td width="20">Address2:</td>
              <!--<s:textfield name="studentaddress2" label="Student Address2"/>-->
	          <td colspan="1" width="200px"><input type="text" align="center" size="0" name="studentaddress2" value="<%=request.getParameter("studentAddress2")%>" /></td>
	        </tr>

	        <tr>
	          <td width="20">City:</td>
              <!--<s:textfield name="parentcity" label="Parent City" value=""/>-->
              <td><input type="text" size="0" name="parentcity" value="<%=request.getParameter("parentCity")%>" /></td>
	          <td width="20">City:</td>
              <!--<s:textfield name="studentcity" label="Student City"/>-->
	          <td colspan="1"><input type="text" align="center" size="0" name="studentcity" value="<%=request.getParameter("studentCity")%>" /></td>
	        </tr>
	        <tr>
	          <td width="20">State:</td>
              <!--<s:textfield name="parentstate" label="Parent State" value=""/>-->
   	          <td colspan="1"><input type="text" size="0" name="parentstate" value="<%=request.getParameter("parentState")%>" /></td>
	          <td size="20">State:</td>
              <!--<s:textfield name="studentstate" label="Student State"/>-->
	          <td colspan="1"><input type="text" align="center" size="0" name="studentstate" value="<%=request.getParameter("studentState")%>" /></td>
	       </tr>
	       <tr>
	          <td width="20">Zip:</td>
              <!--<s:textfield name="parentzipcode" label="Parent Zip Code" value=""/>-->
              <td>
              <table>
               <tr>
   	            <td><input type="text" size="2" name="parentzipcode1" value="<%=request.getParameter("parentZipCode1")%>" /></td>
   	            <td>-<input type="text" align="center" size="4" name="parentzipcode2" value="<%=request.getParameter("parentZipCode2")%>" /></td>
   	           </tr>
   	          </table>
              </td>

	          <td size="20">Zip:</td>
	          <td>
	          <table>
	           <tr>
                 <!--<s:textfield name="studentzipcode" label="Student Zip Code"/>-->
	             <td><input type="text" size="2" name="studentzipcode1" value="<%=request.getParameter("studentZipCode1")%>" /></td>
	             <td>-<input type="text" align="center" size="4" name="studentzipcode2" value="<%=request.getParameter("studentZipCode2")%>" /></td>
               </tr>
              </table>
              </td>
	       </tr>
	       <tr>
	          <td width="20">County:</td>
              <!--<s:textfield name="parentcounty" label="Parent County" value=""/>-->
   	          <td colspan="1"><input type="text" size="0" name="parentcounty" value="<%=request.getParameter("parentCounty")%>" /></td>
	          <td size="20">County:</td>
              <!--<s:textfield name="studentcounty" label="Student County"/>-->
	          <td colspan="1"><input type="text" align="center" size="0" name="studentcounty" value="<%=request.getParameter("studentCounty")%>" /></td>
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
             </div>
          </form>
          <br />
          <br />
          <img src="./images/eol/2page-img2.jpg" class="fleft" alt="" />
        </div>
      </div>
    </div>
  </div>
</div>
<div id="content-bot"></div>
<!-- footer -->
<%@ include file="./nav_bottom.jsp" %>
</body>
</html>
