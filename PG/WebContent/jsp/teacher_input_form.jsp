<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
<title>Teacher Input</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link href="/EOLProgramGoals/jsp/style.css" rel="stylesheet" type="text/css" />
<link href="/EOLProgramGoals/jsp/loggedin.css" rel="stylesheet" type="text/css" />
<link href="/EOLProgramGoals/jsp/layout.css" rel="stylesheet" type="text/css" />

</head>
<body id="page2">

<script language="JavaScript">
/* 
 * Enable/disable functions for math questions 
 * Math questions are enabled only if the math radio button is selected
 */  
function disable()
{
	document.parent_input_form.computationalaccurately.disabled=true;
	document.parent_input_form.calculator.disabled=true;
	document.parent_input_form.retention.disabled=true;
	document.parent_input_form.formulaselection.disabled=true;
	document.parent_input_form.abstractconcepts.disabled=true;
	document.parent_input_form.logicalthought.disabled=true;
	document.parent_input_form.lowlevelproblem.disabled=true;
	document.parent_input_form.medlevelproblem.disabled=true;
	document.parent_input_form.highlevelproblem.disabled=true;
	document.parent_input_form.singlestepproblem.disabled=true;
	document.parent_input_form.multiplestepproblem.disabled=true;
}
function enable()
{
	document.parent_input_form.computationalaccurately.disabled=false;
	document.parent_input_form.calculator.disabled=false;
	document.parent_input_form.retention.disabled=false;
	document.parent_input_form.formulaselection.disabled=false;
	document.parent_input_form.abstractconcepts.disabled=false;
	document.parent_input_form.logicalthought.disabled=false;
	document.parent_input_form.lowlevelproblem.disabled=false;
	document.parent_input_form.medlevelproblem.disabled=false;
	document.parent_input_form.highlevelproblem.disabled=false;
	document.parent_input_form.singlestepproblem.disabled=false;
	document.parent_input_form.multiplestepproblem.disabled=false;
}

</script>





<!-- header -->
<div id="header"> <a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/index.jsp"><img src="./jsp/images/banner/logo.jpg" id="logo" alt="" /></a> 
  <!--   URLs are hard coded for demo purposes only -->
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
                                <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_studassess_admin_assign.jsp">Administration of assignments</a></li>
                                <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_studassess_correct_assign.jsp">Correction of assignments</a></li>
                                <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_studassess_assign.jsp">Assessments of assignments</a></li>
								<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_studassess_feedback.jsp">Feedback and Suggestions</a></li>
								<li class="act"><a href="#">Student Performance </a></li>
                                <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_studperform_lesson_overview.jsp">Lesson Overview</a></li>
                                <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_studperform_tools.jsp">Tools and Practices </a></li>
								<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_studperform_remedial_instruction.jsp">Remedial Instruction</a></li>
                                <li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_studperform_parents_interaction.jsp">Parents Interaction </a></li>
								<li class="act"><a href="#">Reports</a></li>
								<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_rpts_record_keeping.jsp">Record Keeping</a></li>
								<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_rpts_reporting_individuals.jsp">Reporting for individuals </a></li>
								<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_rpts_reporting_groups.jsp">Reporting for groups</a></li>
								<li class="act"><a href="#">Technology</a></li>
								<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_tech_howtos.jsp">How-To's</a></li>
								<li class="act"><a href="#">Use Technology</a></li>
								<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_usetech_contentmgmt.jsp">Content Management</a></li>
								<li class="act"><a href="#">Help</a></li>
								<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_help_child_academics.jsp">Children Academics </a></li>
								<li><a href="http://eoldev2.eoldevsite.com:9090/EOL_Web_Site/eol/educators/educators_help_learning_styles.jsp">Students Learning Styles</a></li>
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
          <div class="title"><img src="/EOLProgramGoals/jsp/images/eol/2page-title1.gif" alt="" /></div>
          <p><img src="/EOLProgramGoals/jsp/images/eol/2page-img1.jpg" alt="" /></p>
          <div class="clear"></div>
        </div>
        <div class="col-2">
        <h3>	Teacher Questionnaire  </h3>
          		 		 
       	<font color="red"><s:actionerror /><s:fielderror /></font>
          <s:form action="teacher_input_form" method="post" validate="true">
          <s:hidden name="parentId" value="%{parentId}" /> 
          <s:hidden name="subjectId" value="%{subjectId}" /> 
		  <div class="formsquare" style=" width : 594px;">
            <p><strong>Student Information</strong><br>  
                 
			<!-- Student's First Name <s:textfield theme="simple" name="studentFirstName" value="%{studentFirstName}" /> -->
			Student's Name <s:textfield theme="simple" name="studentFullName" value="%{studentFullName}" /><br>  
			Student's ID <s:textfield theme="simple" name="studentId" value="%{studentId}" /> <br>
			<!-- Parent's First Name <s:textfield theme="simple" name="parentFirstName" value="%{parentFirstName}" /> -->
			Parent's Name <s:textfield theme="simple" name="parentFullName" value="%{parentFullName}"/><br> 
            </p>
         </div>
			<br>
		 <div class="formsquare">
			 <strong>Teacher's Information</strong><br>
			 <!-- Teacher's First Name <s:textfield theme="simple" name="teacherFirstName" value="%{teacherFirstName}" />-->
	 		 Teacher's Name <s:textfield theme="simple" name="teacherFullName" value="%{teacherFullName}"/><br>
         	 Teacher ID  (If you have an ID from a previous student enter here)
         	 <s:textfield theme="simple" name="teacherId" value="%{teacherId}"/><br>
		 </div>
	 		<br>

		 <div class="formsquare">
		 <strong>Student Enrollment and Grading Scale</strong>
		 <br>
		 <table width="600">
           <tr>
             <td valign="top">Student Subject<br>
             <table width="200">
               <tr>
                 <td><input name="subject" type="radio" value="1" onclick="enable()" /></td>
                 <td>Math</td>
               </tr>
 <!--               <tr>
                 <td><input name="subject" type="radio" value="2" onclick="disable()" /></td>
                 <td>English</td>
               </tr>
               <tr>
                 <td><input name="subject" type="radio" value="3" onclick="disable()" /></td>
                 <td>Science</td>
               </tr>
               <tr>
                 <td><input name="subject" type="radio" class="list-1" value="4" onclick="disable()" /></td>
                 <td>History/Social Studies </td>
               </tr>
 -->
             </table>
               <br>
               Grade Level of Course<br>
               <table width="200">
                 <tr>
                   <td><input name="gradelevel" type="radio" value="6" /></td>
                   <td>6</td>
                 </tr>
                 <tr>
                   <td><input name="gradelevel" type="radio" value="7" /></td>
                   <td>7</td>
                 </tr>
                 <tr>
                   <td><input name="gradelevel" type="radio" value="8" /></td>
                   <td>8</td>
                 </tr>
                 <tr>
                   <td><input name="gradelevel" type="radio" value="9" /></td>
                   <td>9</td>
                 </tr>
                 <tr>
                   <td><input name="gradelevel" type="radio" value="10" /></td>
                   <td>10</td>
                 </tr>
                 <tr>
                   <td><input name="gradelevel" type="radio" value="other" /></td>
                   <td>Other 
                     <input name="gradelevelother" type="text" id="gradelevelother" size="6" /></td>
                 </tr>
               </table>               <br> </td>
             <td>Student's Grade
             	<s:textfield theme="simple" name="studentsGrade" value="%{studentsGrade}"/>
               <br>
               Please input your school's grading scale:
               <table width="200"> 
               	 
                 <tr>
                   <td>A+</td>
                   <td><input name="Aplus" type="text" size="5" value="97" />
                     %</td>
                   <td> to  100%</td>
                 </tr>
                 <tr>
                   <td>A</td>
                   <td><input name="Alower" type="text" size="5" value="94"/>
                     %</td>
                   <td>to 
                     <input name="Aupper" type="text" size="5" value="96"/> 
                     %</td>
                 </tr>
                 <tr>
                   <td>A-</td>
                   <td><input name="Aminuslower" type="text" size="5" value="90"/>
                     %</td>
                   <td>to
                     <input name="Aminusupper" type="text" size="5" value="92"/>
                     %</td>
                 </tr>
                 <tr>
                   <td colspan="3"><hr size="1" align="left" width="100%" color="blue"/></td>
                   </tr>
                 <tr>
                   <td>B+</td>
                   <td><input name="Bpluslower" type="text" size="5" value="87"/>
                     %</td>
                   <td>to
                     <input name="Bplusupper" type="text" size="5" value="89"/>
                     %</td>
                 </tr>
                 <tr>
                   <td>B</td>
                   <td><input name="Blower" type="text" size="5" value="83"/>
                     %</td>
                   <td>to
                     <input name="Bupper" type="text" size="5" value="86"/>
                     %</td>
                 </tr>
                 <tr>
                   <td>B-</td>
                   <td><input name="Bminuslower" type="text" size="5" value="80"/>
                     %</td>
                   <td>to
                     <input name="Bminusupper" type="text" size="5" value="82"/>
                     % </td>
                 </tr>
                 <tr>
                   <td colspan="3"><hr size="1" align="left" width="100%" color="blue"/></td>
                   </tr>
                 <tr>
                   <td>C+</td>
                   <td><input name="Cpluslower" type="text" size="5" value="77"/>
                     %</td>
                   <td>to
                     <input name="Cplusupper" type="text" size="5" value="79"/>
                     %</td>
                 </tr>
                 <tr>
                   <td>C</td>
                   <td><input name="Clower" type="text" size="5" value="73"/>
                     %</td>
                   <td>to
                     <input name="Cupper" type="text" size="5" value="76"/>
                     %</td>
                 </tr>
                 <tr>
                   <td>C-</td>
                   <td><input name="Cminuslower" type="text" size="5" value="70"/>
                     %</td>
                   <td>to
                     <input name="Cminusupper" type="text" size="5" value="72"/>
                     %</td>
                 </tr>
                 <tr>
                   <td colspan="3"><hr size="1" align="left" width="100%" color="blue"/></td>
                   </tr>
                 <tr>
                   <td>D+</td>
                   <td><input name="Dpluslower" type="text" size="5" value="67"/>
                     %</td>
                   <td>to
                     <input name="Dplusupper" type="text" size="5" value="69" />
                     %</td>
                 </tr>
                 <tr>
                   <td>D</td>
                   <td><input name="Dlower" type="text" size="5" value="63"/>
                     %</td>
                   <td>to
                     <input name="Dupper" type="text" size="5" value="66"/>
                     %</td>
                 </tr>
                 <tr>
                   <td>D-</td>
                   <td><input name="Dminuslower" type="text" size="5" value="60" />
                     %</td>
                   <td>to
                     <input name="Dminusupper" type="text" size="5" value="62"/>
                     %</td>
                 </tr>
                 <tr>
                   <td colspan="3"><hr size="1" align="left" width="100%" color="blue"/></td>
                   </tr>
                 <tr>
                   <td>F</td>
                   <td><input name="Flower" type="text" size="5" value="0"/>
                     %</td>
                   <td>to
                     <input name="Fupper" type="text" size="5" value="59" />
                     %</td>
                 </tr>
               </table></td>
           </tr>
         </table>
		 </div>
		 
		 <div class="formsquare"><strong>
		 </strong>
		   <table width="600" border="1">
		   

             <tr>
               <td colspan="2"><strong>Learning Style <br>
               </strong>1 2 3 4 5 (5 is excellent, 3 is average, 1 is poor, leave blank if not sure)</td>
               </tr>
             <tr>
               <td> Learns well with any style </td>
               <td><s:select name="anyStyle" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Learns best with real world examples </td>
               <td><s:select name="realWorldExamples" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Learns best when given simpler forms of explanations </td>
               <td><s:select name="simplerExplanations" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Visual </td>
               <td><s:select name="visual" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Auditory </td>
               <td><s:select name="auditory" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Hands-on (learning by doing) </td>
              <td><s:select name="handson" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Deductive (abstract principles followed by concrete examples) </td>
               <td><s:select name="deductive" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
            </tr>
             <tr>
               <td> Inductive (concrete examples followed by abstraction to general principles) </td>
              <td><s:select name="inductive" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td colspan="2"><strong>Work habits and process</strong><br>
                 1 2 3 4 5 (5 is excellent, 3 is average, 1 is poor, leave blank if not sure) </td>
               </tr>
             <tr>
               <td> Completes all assignments; meets deadlines </td>
              <td><s:select name="completesAssignments" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Shows all critical steps in the solution; demonstrates competency in the solution process </td>
              <td><s:select name="showsSolution" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td>Exemplary focus; on task and not easily distracted</td>
              <td><s:select name="focus" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Takes accurate and complete class notes </td>
              <td><s:select name="accuracy" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Well-organized </td>
              <td><s:select name="organized" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td>Prepared for class</td>
              <td><s:select name="prepared" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td colspan="2"><strong>Skill sets and learning curve </strong>  (Math students only) <br>
                 1 2 3 4 5 (5 is excellent, 3 is average, 1 is poor-leave blank if not sure)
                 </td>
               </tr>
             <tr>
               <td> Performs computations accurately </td>
              <td><s:select name="computationalAccurately" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
            </tr>
             <tr>
               <td> Proficient in use of calculator </td>
             <td><s:select name="calculator" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Retains basic math facts and definitions </td>
             <td><s:select name="retention" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Selects and applies appropriate formulas </td>
             <td><s:select name="formulaSelection" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Demonstrates an understanding of abstract concepts and principals </td>
             <td><s:select name="abstractConcepts" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Exhibits logical thought process in solving problems </td>
             <td><s:select name="logicalThought" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Demonstrates a high degree of proficiency with low level problems </td>
             <td><s:select name="lowLevelProblem" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Demonstrates a high degree of proficiency with intermediate level problems </td>
             <td><s:select name="medLevelProblem" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Demonstrates a high degree of proficiency with high level problems </td>
             <td><s:select name="highLevelProblem" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Solves single step problems efficiently and accurately </td>
             <td><s:select name="singleStepProblem" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Solves multiple step problems efficiently and accurately </td>
             <td><s:select name="multipleStepProblem" emptyOption="false" theme="simple" disabled="disabled"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td colspan="2"><strong> Integration and application of knowledge<br> 
                 </strong>1 2 3 4 5 (5 is excellent, 3 is average, 1 is poor-leave blank if not sure) 
                 </td>
               </tr>
             <tr>
               <td> Applies knowledge and concepts to real world and word problems </td>
             <td><s:select name="realWorldProblems" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             <tr>
               <td> Proficient at solving problems that integrate math and other subjects </td>
             <td><s:select name="integratedProblems" emptyOption="false" theme="simple"
               		list="#{'0':' ', '1':'1', '2':'2', '3':'3', '4':'4', '5':'5'}"/></td>
             </tr>
             
             
               
             <tr>
               <td colspan="2" align="center">
                 <s:submit theme="simple" method="updateForm"/> 
                 <s:reset theme="simple" value="Reset" />
               </td>
             </tr>
           </table>
		   <BR>
		   <strong>           </strong></div>
          </s:form>
          <div class="line-hor"></div>
          
          <img src="/EOLProgramGoals/jsp/images/eol/2page-img2.jpg" class="fleft" alt="" />
          <div class="clear"></div>
          <img src="/EOLProgramGoals/jsp/images/eol/2page-img3.jpg" class="fleft" alt="" />
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
