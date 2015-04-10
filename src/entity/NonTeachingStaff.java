package entity;

import entity.Staff;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
@Table(name="Non_teaching_staff")
public class NonTeachingStaff extends Staff implements Serializable {
private static final long serialVersionUID = 1L;
	
	private String areaexpertise;
	
	public NonTeachingStaff(int sid, String sname, String areaexpertise) {
		super(sid, sname);
		this.areaexpertise = areaexpertise;
	}
	public NonTeachingStaff() {
		super();
	}   
	public String getAreaexpertise() {
		return this.areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}
	@Override
	public String toString() {
		return "NonTeachingStaff [areaexpertise=" + areaexpertise + "]";
	}
}