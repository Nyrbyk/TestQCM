package QCMTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import QCM.Questionnaire;

public class QuestionnaireTest {


	private static final String[] NomsQuestionnairesDeTest = {"MonPremierQCM", "MonSecondQCM"};

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Questionnaire MyQuestionaire = new Questionnaire("MonPremierQCM");
		assertTrue("Good Name", MyQuestionaire.getName().equals(NomsQuestionnairesDeTest[0]));
	}

}
