<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
<title>EOL Registration</title>
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
<div id="header"> <a href="/EOL_Web_Site/eol/index.jsp"><img src="images/banner/logo.jpg" id="logo" alt="" /></a> 
  
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
          <h3> New Registration</h3>
          <br>
          <s:form action="Registration" method="post" validate="true">	  
          <div class="formsquare" style="width:694px;">
            <table width="600px" CELLSPACING="0" CELLPADDING="0" BORDER="0">
              <tr>
              <td width="250px" colspan="4"><strong>Create an Account</strong></td>
              </tr>
            <tr>
           <td colspan="4">&nbsp;</td>
           </tr>             
              <tr>
 			<td colspan="3">Create a login name and password</td>
             <td><a href="../help/help.html"><span><span>Help</span></span></a></td>
             </tr>
             <tr>
			 <td width="100px" colspan="1" >Login-Name:</td> 
			 <td colspan="1"><s:textfield theme="simple" name="loginname" value="%{loginname}" /></td>
			 <td width="130px" colspan="1">Email Address:</td> 
			 <td colspan="1"><s:textfield theme="simple" name="emailaddress" label="Email Address" value="%{emailaddress}" /></td>
            </tr>
            <tr>
			 <td width="100px" colspan="1">Password:</td>
			 <td><s:password theme="simple" name="loginPassword" value="%{loginPassword}" /></td>
			 <td colspan="2"><s:checkbox theme="simple" name="chkboxagreement" value="true"/>
              <font size="1">By checking this checkbox I have agreed to the terms and conditions detailed in the registration agreement.
             Click here for information about our privacy policy.</font></td>
 			</tr>
 			<tr>
             <td width="100px" colspan="1">
             Verify
             Password:
             <font size="1">(password should be at least 8 characters)</font>
             </td>
             <td><s:textfield theme="simple" name="verifypassword"  value="%{verifypassword}" /></td>
             <td colspan="2"><s:checkbox theme="simple" name="chkboxagreement2" value="true"/>
             <font size="1">I would like to receive the Education
             Online monthly newsletter.</font></td>
			</tr>
		</table>
		<!--</div>
		 <div class="formsquare"  border="3" style="width:694px;"> -->		
				<table width="600px" CELLSPACING="0" CELLPADDING="0" BORDER="0">
				<tr>
              	<td colspan="2"><strong>Parent Information</strong></td>
              	<td colspan="2"><strong>Student Information</strong></td>
				</tr>
				<tr>
				<td>Last Name:</td>
				<td><s:textfield theme="simple" name="parentLastname" value="%{parentLastname}" /></td>
	            <td>Last Name:</td>
	            <td><s:textfield theme="simple" name="studentLastname" value="%{studentLastname}" /></td>
	            </tr>
				<tr>
				<td>First Name:</td>
				<td><s:textfield theme="simple" name="parentFirstname"  value="%{parentFirstname}" /></td>
				<td>First Name:</td>
				<td><s:textfield theme="simple" name="studentfirstname" value="%{studentfirstname}" /></td>
				</tr>
				<tr>
				<td>Phone:</td>
				<td>
				 <table>
				 <tr>								
				  <td>(<s:textfield theme="simple" name="p_areacode" size="3" value="%{p_areacode}" />)</td>
                  <td><s:textfield theme="simple" name="p_phonenumber1" size="3" value="%{p_phonenumber1}" /></td>
                  <td><s:textfield theme="simple" name="p_phoneNumber2" size="4" value="%{p_phoneNumber2}" /> </td>
                 </tr>
                 </table>
                 </td>
              	<td>Phone:</td>
              	<td>
              	 <table>
              	  <tr>
              	   <td>(<s:textfield theme="simple" name="s_areacode" size="3" value="%{s_areacode}" />)</td>
                   <td><s:textfield theme="simple" name="s_phonenumber1" size="3" value="%{s_phonenumber1}" /></td>
                   <td><s:textfield theme="simple" name="s_phoneNumber2" size="4" value="%{s_phoneNumber2}" /></td>
                  </tr>
                 </table>
                 </td>          
				</tr>
				<tr>
				<td>Address1:</td>
				<td><s:textfield theme="simple" name="parentaddress1" value="%{parentaddress1}" /> </td>
 				<td>Address1:</td>
 				<td><s:textfield theme="simple" name="studentaddress1" value="%{studentaddress1}" /></td>
				</tr>
				<tr>
				<td>Address2:</td>
				<td><s:textfield theme="simple" name="parentaddress2" value="%{parentaddress2}" /></td>
              	<td>Address2:</td>
              	<td><s:textfield theme="simple" name="studentaddress2" value="%{studentaddress2}" /></td>
				</tr>
				<tr>
				<td>City:</td>
				<td><s:textfield theme="simple" name="parentcity" value="%{parentcity}" /></td>
 				<td>City:</td>
 				<td><s:textfield theme="simple" name="studentcity" value="%{studentcity}" /></td>
				</tr>
				<tr>
				<td>State:</td>
				<td><s:textfield theme="simple" name="parentstate" size="2" value="%{parentstate}" /></td>
				<td>State:</td>
				<td><s:textfield theme="simple" name="studentstate" size="2" value="%{studentstate}" /></td>
				</tr>
				<tr>
				<td>Zip:</td>
				<td>
				 <table>
				 <tr>
				  <td><s:textfield theme="simple" name="parentzipcode1" size="5" value="%{parentzipcode1}" /></td>
                  <td><s:textfield theme="simple" name="parentzipcode2" size="4" value="%{parentzipcode2}" /> </td>
                  </tr>
                </table>
                </td>
				<td>Zip:</td>
				 <td>
				  <table>
				   <tr>
				    <td><s:textfield theme="simple" name="studentzipcode1" size="5" value="%{studentzipcode1}" /></td>
                    <td><s:textfield theme="simple" name="studentzipcode2" size="4" value="%{studentzipcode2}" /></td>
                   </tr>
                  </table>
                 </td>          
				</tr>
				<tr>
				<td>County:</td>
				<td><s:textfield theme="simple" name="parentcounty" value="%{parentcounty}" /> </td>
				<td>County:</td>
				<td><s:textfield theme="simple" name="studentcounty" value="%{studentcounty}" /></td>
				</tr>
				<tr>
				 <td colspan="2">&nbsp;</td>
	             <td colspan="2">
	              <table CELLSPACING="0" CELLPADDING="0" BORDER="0">
	               <tr>
	                <td><button type="cancel" size="1" name="Cancel" value="Cancel" onClick="getPermission(this.form)">Cancel</button></td>
                    <td><s:reset theme="simple" value="Reset" /></td>
                    <td><s:submit theme="simple" method="updateForm" /></td>
                   </tr>
                  </table>
                 </td>
                 </tr>
               </table>
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
