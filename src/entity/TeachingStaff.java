package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Teaching_staff")

public class TeachingStaff extends Staff implements Serializable {
private static final long serialVersionUID = 1L;
	
	public TeachingStaff(int sid, String sname, String qualification,
		String subjectexpertise) {
	super(sid, sname);
	this.qualification = qualification;
	this.subjectexpertise = subjectexpertise;
}
	private String qualification;
	private String subjectexpertise;
	
	public TeachingStaff() {
		super();
	}   
	public String getQualification() {
		return this.qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}   
	public String getSubjectexpertise() {
		return this.subjectexpertise;
	}
	public void setSubjectexpertise(String subjectexpertise) {
		this.subjectexpertise = subjectexpertise;
	}
	@Override
	public String toString() {
		return "TeachingStaff [qualification=" + qualification
				+ ", subjectexpertise=" + subjectexpertise + "]";
	} 
}