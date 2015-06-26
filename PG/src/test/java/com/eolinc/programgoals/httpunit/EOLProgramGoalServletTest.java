package com.eolinc.programgoals.httpunit;

import java.io.File;

import javax.servlet.http.HttpSession;

import junit.framework.TestCase;
import com.meterware.httpunit.GetMethodWebRequest;
import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebForm;
import com.meterware.httpunit.WebRequest;
import com.meterware.httpunit.WebResponse;
import com.meterware.servletunit.InvocationContext;
import com.meterware.servletunit.ServletRunner;
import com.meterware.servletunit.ServletUnitClient;

/**
 * Understanding HttpUnit's dependencies -
 * 
 * http://httpunit.sourceforge.net/doc/manual/installing.html
 * 
 * Note -
 * 
 * For tidy.jar, please use the one at http://sourceforge.net/projects/jtidy/files/JTidy/04aug2000r4/jtidy-04aug2000r4.zip/download.
 */
public class EOLProgramGoalServletTest extends TestCase {

	//TODO this servlet test needs to create a valid session first in setUp
	
	//change this to demo/test etc as required based on your environment
	private String parentAction = "http://localhost:8080/EOLProgramGoals/parent_input_form.action";
	private String teacherAction = "http://localhost:8080/EOLProgramGoals/teacher_input_form.action";

	public void testBadParentSubmission() throws Exception {
		WebConversation conversation = new WebConversation();
		WebRequest request = new GetMethodWebRequest(
				parentAction);

		WebResponse response = conversation.getResponse(request);
		WebForm loginForm = response.getForms()[0];
		request = loginForm.getRequest();
		request.setParameter("studentFirstName", "kevin");
		request.setParameter("studentLastName", "perez");
		request.setParameter("parentEmail", "debbie1@eol.com");
		request.setParameter("teacherFirstName", "chris");
		request.setParameter("teacherLastName", "herman");
		request.setParameter("studentsGrade", "6");
		response = conversation.getResponse(request);
		System.out.println(response.getText());
		assertTrue("Student profile error", response.getText().indexOf(
				"Exception in Updating Student Profile") != -1);
		assertTrue("Parent profile error", response.getText().indexOf(
		"Exception in Updating Parent Profile") != -1);
		assertTrue("Parent input error", response.getText().indexOf(
		"Exception while updating Parent Input") != -1);
		assertEquals("Page title error", "Parent Input", response.getTitle());
	}

	public void testBadTeacherSubmission() throws Exception {
		WebConversation conversation = new WebConversation();
		WebRequest request = new GetMethodWebRequest(
				teacherAction);

		WebResponse response = conversation.getResponse(request);
		WebForm loginForm = response.getForms()[0];
		request = loginForm.getRequest();
		request.setParameter("studentId", "0");
		request.setParameter("teacherId", "0");
		response = conversation.getResponse(request);
		System.out.println(response.getText());
		assertTrue("Student id error", response.getText().indexOf(
				"Invalid field value for field \"studentId\".") != -1);
		assertTrue("Teacher id error", response.getText().indexOf(
		"Invalid field value for field \"teacherId\".") != -1);
		assertEquals("Page title error", "Teacher Input", response.getTitle());
	}

	public void testNormalParentSubmission() throws Exception {
		WebConversation conversation = new WebConversation();
		WebRequest request = new GetMethodWebRequest(
				parentAction);

		WebResponse response = conversation.getResponse(request);
		WebForm loginForm = response.getForms()[0];
		request = loginForm.getRequest();
//		request.setParameter("studentId", "9");
//		request.setParameter("parentId", "2");
//		request.setParameter("teacherId", "14");
//		request.setParameter("subjectId", "0");
//		request.setParameter("studentFirstName", "kevin");
//		request.setParameter("studentLastName", "perez");
//		request.setParameter("parentFullName", "debbie wilson");
//		request.setParameter("parentEmail", "debbie1@eol.com");
//		request.setParameter("teacherFirstName", "chris");
//		request.setParameter("teacherLastName", "herman");
//		request.setParameter("gradelevelother", "");
//		request.setParameter("studentsGrade", "6");
		request.setParameter("studentId", "0");
		request.setParameter("parentId", "0");
		request.setParameter("teacherId", "0");
		request.setParameter("subjectId", "0");
		request.setParameter("studentFirstName", "");
		request.setParameter("studentLastName", "");
		request.setParameter("parentFullName", "");
		request.setParameter("parentEmail", "debbie1@eol.com");
		request.setParameter("teacherFirstName", "chris");
		request.setParameter("teacherLastName", "herman");
		request.setParameter("gradelevelother", "");
		request.setParameter("studentsGrade", "6");
		request.setParameter("gpa", "");
		request.setParameter("prevGpa", "");
		request.setParameter("targetGpa", "");
		request.setParameter("Aplus", "97");
		request.setParameter("Alower", "94");
		request.setParameter("Aupper", "96");
		request.setParameter("Aminuslower", "90");
		request.setParameter("Aminusupper", "92");
		request.setParameter("Bpluslower", "87");
		request.setParameter("Bplusupper", "89");
		request.setParameter("Blower", "83");
		request.setParameter("Bupper", "86");
		request.setParameter("Bminuslower", "80");
		request.setParameter("Bminusupper", "82");
		request.setParameter("Cpluslower", "77");
		request.setParameter("Cplusupper", "79");
		request.setParameter("Clower", "73");
		request.setParameter("Cupper", "76");
		request.setParameter("Cminuslower", "70");
		request.setParameter("Cminusupper", "72");
		request.setParameter("Dpluslower", "67");
		request.setParameter("Dplusupper", "69");
		request.setParameter("Dlower", "63");
		request.setParameter("Dupper", "66");
		request.setParameter("Dminuslower", "60");
		request.setParameter("Dminusupper", "62");
		request.setParameter("Flower", "0");
		request.setParameter("Fupper", "59");
		request.setParameter("attendCollege", "YES");
		request.setParameter("collegeYear", "2010");
		request.setParameter("collegeType", "1");
		request.setParameter("anyStyle", "0");
		request.setParameter("realWorldExamples", "0");
		request.setParameter("simplerExplanations", "0");
		request.setParameter("visual", "0");
		request.setParameter("auditory", "0");
		request.setParameter("handson", "0");
		request.setParameter("deductive", "0");
		request.setParameter("inductive", "0");
		request.setParameter("completesAssignments", "0");
		request.setParameter("showsSolution", "0");
		request.setParameter("focus", "0");
		request.setParameter("accuracy", "0");
		request.setParameter("organized", "0");
		request.setParameter("prepared", "0");
		request.setParameter("computationalAccurately", "0");
		request.setParameter("calculator", "0");
		request.setParameter("retention", "0");
		request.setParameter("formulaSelection", "0");
		request.setParameter("abstractConcepts", "0");
		request.setParameter("logicalThought", "0");
		request.setParameter("lowLevelProblem", "0");
		request.setParameter("medLevelProblem", "0");
		request.setParameter("highLevelProblem", "0");
		request.setParameter("singleStepProblem", "0");
		request.setParameter("multipleStepProblem", "0");
		request.setParameter("realWorldProblems", "0");
		request.setParameter("integratedProblems", "0");
		response = conversation.getResponse(request);
		System.out.println(response.getText());
//		assertTrue("Normal incomplete form fill response", response.getText().indexOf(
//				"Some of the information you entered was invalid. Use the \"Back\" button to correct the information") != -1);
//		assertTrue("Normal incomplete form fill response", response.getText().indexOf(
//		"Education Online") != -1);
//		assertEquals("Page title", "Parent Input", response.getTitle());
		assertTrue("Student profile error", response.getText().indexOf(
		"Exception in Updating Student Profile") != -1);
		assertTrue("Parent profile error", response.getText().indexOf(
		"Exception in Updating Parent Profile") != -1);
		assertTrue("Parent input error", response.getText().indexOf(
		"Exception while updating Parent Input") != -1);
		assertEquals("Page title error", "Parent Input", response.getTitle());
	}

	public void testBadParentValidation() throws Exception {
		WebConversation conversation = new WebConversation();
		WebRequest request = new GetMethodWebRequest(
				parentAction);
		WebResponse response = conversation.getResponse(request);
	
ServletRunner sr = new ServletRunner(new File("WebContent/WEB-INF/web.xml"));
ServletUnitClient client = sr.newClient();
//WebResponse response = client.getResponse(parentAction);
//now get an invocation context using the same URL used to invoke the servlet
InvocationContext ic = client.newInvocation(parentAction);
// obain the session just used. Note: pass false to avoid creating it if it does not already exist
HttpSession session = ic.getRequest().getSession(false);

		WebForm loginForm = response.getForms()[0];
		request = loginForm.getRequest();
//		session.setAttribute("User", "jt");

		
//		request.setParameter("studentFirstName", "kevin");
//		request.setParameter("studentLastName", "perez");
//		request.setParameter("parentFullName", "debbie wilson");//no first name, last name
//		request.setParameter("parentEmail", "debbie1@eol.com");
//		request.setParameter("teacherFirstName", "chris");
//		request.setParameter("teacherLastName", "herman");
//		request.setParameter("studentsGrade", "6");//consists of many parts

//		request.setParameter("studentId", "9");
//		request.setParameter("parentId", "2");
//		request.setParameter("teacherId", "14");
//		request.setParameter("subjectId", "0");
		request.setParameter("studentId", "0");
		request.setParameter("parentId", "0");
		request.setParameter("teacherId", "0");
		request.setParameter("subjectId", "0");
//		request.setParameter("studentFirstName", "");
//		request.setParameter("studentLastName", "");
//		request.setParameter("parentFullName", "");
//		request.setParameter("parentEmail", "debbie1@eol.com");
//		request.setParameter("teacherFirstName", "chris");
//		request.setParameter("teacherLastName", "herman");
//		request.setParameter("gradelevelother", "");
		request.setParameter("studentsGrade", "6");
		request.setParameter("gpa", "");
		request.setParameter("prevGpa", "");
		request.setParameter("targetGpa", "");
		request.setParameter("Aplus", "97");
		request.setParameter("Alower", "94");
		request.setParameter("Aupper", "96");
		request.setParameter("Aminuslower", "90");
		request.setParameter("Aminusupper", "92");
		request.setParameter("Bpluslower", "87");
		request.setParameter("Bplusupper", "89");
		request.setParameter("Blower", "83");
		request.setParameter("Bupper", "86");
		request.setParameter("Bminuslower", "80");
		request.setParameter("Bminusupper", "82");
		request.setParameter("Cpluslower", "77");
		request.setParameter("Cplusupper", "79");
		request.setParameter("Clower", "73");
		request.setParameter("Cupper", "76");
		request.setParameter("Cminuslower", "70");
		request.setParameter("Cminusupper", "72");
		request.setParameter("Dpluslower", "67");
		request.setParameter("Dplusupper", "69");
		request.setParameter("Dlower", "63");
		request.setParameter("Dupper", "66");
		request.setParameter("Dminuslower", "60");
		request.setParameter("Dminusupper", "62");
		request.setParameter("Flower", "0");
		request.setParameter("Fupper", "59");
		request.setParameter("attendCollege", "YES");
		request.setParameter("collegeYear", "2010");
		request.setParameter("collegeType", "1");
		request.setParameter("anyStyle", "0");
		request.setParameter("realWorldExamples", "0");
		request.setParameter("simplerExplanations", "0");
		request.setParameter("visual", "0");
		request.setParameter("auditory", "0");
		request.setParameter("handson", "0");
		request.setParameter("deductive", "0");
		request.setParameter("inductive", "0");
		request.setParameter("completesAssignments", "0");
		request.setParameter("showsSolution", "0");
		request.setParameter("focus", "0");
		request.setParameter("accuracy", "0");
		request.setParameter("organized", "0");
		request.setParameter("prepared", "0");
		request.setParameter("computationalAccurately", "0");
		request.setParameter("calculator", "0");
		request.setParameter("retention", "0");
		request.setParameter("formulaSelection", "0");
		request.setParameter("abstractConcepts", "0");
		request.setParameter("logicalThought", "0");
		request.setParameter("lowLevelProblem", "0");
		request.setParameter("medLevelProblem", "0");
		request.setParameter("highLevelProblem", "0");
		request.setParameter("singleStepProblem", "0");
		request.setParameter("multipleStepProblem", "0");
		request.setParameter("realWorldProblems", "0");
		request.setParameter("integratedProblems", "0");

response = conversation.getResponse(request);
		
		
		System.out.println(response.getText());
		assertTrue("Student profile error", response.getText().indexOf(
		"Exception in Updating Student Profile") != -1);
		assertTrue("Parent profile error", response.getText().indexOf(
		"Exception in Updating Parent Profile") != -1);
		assertTrue("Parent input error", response.getText().indexOf(
		"Exception while updating Parent Input") != -1);
		assertEquals("Page title error", "Parent Input", response.getTitle());
	}
}