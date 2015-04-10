package entity;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;


@Entity

public class Clas implements Serializable {
private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int cid;
	private String cname;
	
	@SuppressWarnings("rawtypes")
	@ManyToMany(targetEntity = entity.Teacher.class)
	private Set teacherSet;

	public Clas(int cid, String cname, @SuppressWarnings("rawtypes") Set teacherSet) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.teacherSet = teacherSet;
	}
	public Clas() {
		super();
	}   
	public int getCid() {
		return this.cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}   
	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	@SuppressWarnings("rawtypes")
	public Set getTeacherSet() {
		return teacherSet;
	}
	@SuppressWarnings("rawtypes")
	public void setTeacherSet(Set teacherSet) {
		this.teacherSet = teacherSet;
	}
	@Override
	public String toString() {
		return "Clas [cid=" + cid + ", cname=" + cname + ", teacherSet="
				+ teacherSet + "]";
	}
   
}
