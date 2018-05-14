package DataGameKahoot;

import java.util.List;

public class KahootEntity {
	private String question;
	private List<String> option;
	private String answer;
	public KahootEntity() {
		// TODO Auto-generated constructor stub
	}
	public KahootEntity(String question, List<String> option, String answer) {
		super();
		this.question = question;
		this.option = option;
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getOption() {
		return option;
	}
	public void setOption(List<String> option) {
		this.option = option;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
