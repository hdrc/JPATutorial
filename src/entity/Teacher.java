package entity;

import java.io.Serializable;
import java.lang.String;
import java.util.Set;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Teacher implements Serializable {
private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int tid;
	private String tname;
	private String subject;
	
	@SuppressWarnings("rawtypes")
	@ManyToMany(targetEntity = entity.Clas.class)
	private Set clasSet;
	

	@SuppressWarnings("rawtypes")
	public Teacher(int tid, String tname, String subject, Set clasSet) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.subject = subject;
		this.clasSet = clasSet;
	}
	public Teacher() {
		super();
	}   
	public int getTid() {
		return this.tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}   
	public String getTname() {
		return this.tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}   
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}   
	@SuppressWarnings("rawtypes")
	public Set getClasSet() {
		return this.clasSet;
	}
	@SuppressWarnings("rawtypes")
	public void setClasSet(Set clasSet) {
		this.clasSet = clasSet;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", subject="
				+ subject + ", clasSet=" + clasSet + "]";
	}
}