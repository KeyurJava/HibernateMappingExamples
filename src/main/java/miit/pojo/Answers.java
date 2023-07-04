package miit.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Ans_master")
public class Answers {

	@Id
	private int ans_id;
	private String ans_dec;

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAns_dec() {
		return ans_dec;
	}

	public void setAns_dec(String ans_dec) {
		this.ans_dec = ans_dec;
	}

	@Override
	public String toString() {
		return "Answers [ans_id=" + ans_id + ", ans_dec=" + ans_dec + "]";
	}

}
