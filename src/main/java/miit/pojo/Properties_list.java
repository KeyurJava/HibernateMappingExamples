package miit.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Properties_list {

	@Id
	private int pid;
	private String pname;

	@ManyToOne
	private OwnerDet ownerDet;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public OwnerDet getOwnerDet() {
		return ownerDet;
	}

	public void setOwnerDet(OwnerDet ownerDet) {
		this.ownerDet = ownerDet;
	}

}
