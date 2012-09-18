package Main;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;

import QCM.Question;

public class MyQcmRunner {

	static String TextQuestionBase = "Combien font 2+2 ?";
	Question MyTestQuestion = new Question(TextQuestionBase);
	static String[] ReponsesBase = {"Cela fait 2", "Cela fait 3", "Cela fait 4","Cela fait 5"};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
			Question MyTestQuestion = new Question(TextQuestionBase);
			assertTrue("Erreur lors : Test intialisation du Text de la question", MyTestQuestion.getText().equals(TextQuestionBase));
			MyTestQuestion.setAnswers(ReponsesBase);
			MyTestQuestion.setCorrectAnswerIndex(2);
			
			System.out.println(MyTestQuestion.getText());
			for (int i =0 ; i < MyTestQuestion.getNombreDeReponse(); i++) {
				System.out.println(i+ ") " + MyTestQuestion.getAnswerByIndex(i));
			}
			int TheAnswer = 0;
			try {
				TheAnswer = System.in.read();
			} catch (IOException e) {
				// TODO Bloc catch généré automatiquement
				e.printStackTrace();
			}
			System.out.println("reponse donnée:" + ((char)TheAnswer));
			
			if ((TheAnswer-(char)'0') == MyTestQuestion.getCorrectAnswerIndex()) {
				System.out.println("Bravo");
				
			}
			else {
				System.out.println("Perdu");
			}
	}

}


