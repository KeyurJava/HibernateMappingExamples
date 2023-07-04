package miit.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "Qst_master")
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qst_id;
	private String qst_dec;

	@OneToOne
	private Answers answers;

	public int getQst_id() {
		return qst_id;
	}

	public void setQst_id(int qst_id) {
		this.qst_id = qst_id;
	}

	public String getQst_dec() {
		return qst_dec;
	}

	public void setQst_dec(String qst_dec) {
		this.qst_dec = qst_dec;
	}

	public Answers getAnswers() {
		return answers;
	}

	public void setAnswers(Answers answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Questions [qst_id=" + qst_id + ", qst_dec=" + qst_dec + ", answers=" + answers + "]";
	}

}
