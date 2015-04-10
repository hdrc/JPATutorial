package entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity
@Table
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Staff implements Serializable {
private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	private String sname;
	

	public Staff(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Staff() {
		super();
	}   
	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}   
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Staff [sid=" + sid + ", sname=" + sname + "]";
	}
   
}
