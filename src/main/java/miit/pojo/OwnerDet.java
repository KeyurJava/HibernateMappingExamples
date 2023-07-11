package miit.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OwnerDet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ow_id;
	private String ow_name;

	@OneToMany(mappedBy = "ownerDet")
	private List<Properties_list> p_list;

	public int getOw_id() {
		return ow_id;
	}

	public void setOw_id(int ow_id) {
		this.ow_id = ow_id;
	}

	public String getOw_name() {
		return ow_name;
	}

	public void setOw_name(String ow_name) {
		this.ow_name = ow_name;
	}

	public List<Properties_list> getP_list() {
		return p_list;
	}

	public void setP_list(List<Properties_list> p_list) {
		this.p_list = p_list;
	}

}
