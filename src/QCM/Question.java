package QCM;

public class Question {
	private String Text;
	private int Difficultee = 0;
	private String [] Answers;
	private int CorrectAnswerIndex;
	
	public Question(String text) {
		super();
		Text = text;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	public int getCorrectAnswerIndex() {
		return CorrectAnswerIndex;
	}
	public void setCorrectAnswerIndex(int correctAnswerIndex) {
		CorrectAnswerIndex = correctAnswerIndex;
	}
	public void setAnswers(String[] answers) {
		Answers = answers;
	}
	public int getDifficultee() {
		return Difficultee;
	}
	public void setDifficultee(int difficultee) {
		Difficultee = difficultee;
	}
	public String[] getAnswers() {
		return Answers;
	}
	public void setAnswes(String[] answers) {
		Answers = answers;
	}

	public int getNombreDeReponse() {
		return getAnswers().length;
	}
	
	public String getAnswerByIndex(int index) {
	
		String ret = "";
		assert (index < getAnswers().length) : "Demande d'une réponse au delà du nombre de reponse";
		if (index < getAnswers().length) {
			ret = getAnswers()[index];
		}
		
		return ret;
	}
	

}
