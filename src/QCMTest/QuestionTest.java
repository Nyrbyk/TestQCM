package QCMTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import QCM.Question;

public class QuestionTest  {

	String TextQuestionBase = "Combien font 2+2 ?";
	Question MyTestQuestion = new Question(TextQuestionBase);
	String[] ReponsesBase = {"Cela fait 2", "Cela fait 3", "Cela fait 4","Cela fait 5"};
	
	@Before
	public void setUp() throws Exception {
		String TextQuestionBase = "Combien font 2+2 ?";
		Question MyTestQuestion = new Question(TextQuestionBase);
		assertTrue("Erreur lors : Test intialisation du Text de la question", MyTestQuestion.getText().equals(TextQuestionBase));
		MyTestQuestion.setAnswers(ReponsesBase);
		MyTestQuestion.setCorrectAnswerIndex(2);
	}

	@After
	public void tearDown() throws Exception {
		MyTestQuestion = null;
	}

	@Test
	public void testQuestion() {
		assertTrue("Nb answer", MyTestQuestion.getNombreDeReponse() == 4);
		
	}
	
	@Test
	public void testGetAnserByIndex() {
		assertTrue("Get 1st answer", MyTestQuestion.getAnswerByIndex(0).equals(ReponsesBase[0]));
		assertTrue("Get 2nd answer", MyTestQuestion.getAnswerByIndex(1).equals(ReponsesBase[1]));
		assertTrue("Get 3rd answer", MyTestQuestion.getAnswerByIndex(2).equals(ReponsesBase[2]));
		assertTrue("Get 4th answer", MyTestQuestion.getAnswerByIndex(3).equals(ReponsesBase[3]));
		assertTrue("Access out of Bound", MyTestQuestion.getAnswerByIndex(4).equals(""));
		assertTrue("Access out of Bound", MyTestQuestion.getAnswerByIndex(-1).equals(""));
		assertTrue("Access out of Bound", MyTestQuestion.getAnswerByIndex(10).equals(""));

		
	}

}
