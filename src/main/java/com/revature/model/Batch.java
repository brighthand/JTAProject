package com.revature.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BATCH")
public class Batch { //implements Serializable {
		
		//private static final long serialVersionUID = 7570906930843536924L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqname")
		@SequenceGenerator(name="seqname", sequenceName="batch_seq_name", initialValue=1,allocationSize=1)
		@Column(name="BATCH_ID", nullable=false)
		private int batchid;
		
		//@Column(name="NAME", length=10)   --automatically created and therefore not necessary
		//private String name;
		
		@Column(name="CURRICULUM", length=10)
		private String curriculum;
		
		@Column(name="FOCUS", length=10)
		private String focus;
		
		@Column(name="SKILLS", length=10)
		private String skills;
		
		//@Column(name="NUMBEROFWEEKS")   --automatically calculated by webapp, therefore excluded from table
		//private String numberOfWeeks;
		
		@Column(name="TRAINER", length=10)
		private String trainer;
		
		@Column(name="COTRAINER", length=10)
		private String cotrainer;
		
		@Column(name="LOCATION", length=10)
		private String location;
		
		@Column(name="BUILDING", length=10)
		private String building;
		
		@Column(name="ROOM", length=10)
		private int room;
		
		@Column(name="STARTDATE", length=10)
		private String startdate;     //format must be mm/dd/yyyy
		
		@Column(name="ENDDATE", length=10)
		private String enddate;       //format must be mm/dd/yyyy
		
		public Batch() {
			super();
		}
		
		
		public Batch(String curriculum, String focus, String skills, String trainer, String cotrainer, String location, String building, int room, String startdate, String enddate) {
		super();
		
		//this.name = name;
		this.curriculum = curriculum;
		this.focus = focus;
		this.skills = skills;
		//this.numberOfWeeks = numberOfWeeks;
		this.trainer = trainer;
		this.cotrainer = trainer;
		this.location = location;
		this.building = building;
		this.room = room;
		this.startdate = startdate;
		this.enddate = enddate;
		
		
	}
		
		/*public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;	
			}*/
		
		
		public String getCurriculum() {
			return curriculum;
		}
		
		public void setCurriculum() {
			this.curriculum = curriculum;
		}
		
		public String getFocus() {
			return focus;
		}
		
		public void setFocus() {
			this.focus = focus;
		}
		
		public String getSkills() {
			return skills;
		}
		
		public void setSkills() {
			this.skills = skills;
		}
		
		/*public String getNumberOfWeeks() {
			return numberOfWeeks;
		}
		
		public void setNumberOfWeeks() {
			this.numberOfWeeks = numberOfWeeks;
		}*/
		
		
		public String getTrainer() {
			return trainer;
		}
		
		public void setTrainer() {
			this.trainer = trainer;
		}
		
		public String getLocation() {
			return location;
		}
		
		public void setLocation() {
			this.location = location;
		}
		
		public String getBuilding() {
			return building;
		}
		
		public void setBuilding() {
			this.building = building;
		}
		
		
		public int getRoom() {
			return room;
		}
		
		public void setRoom() {
			this.room = room;
		}
		
		public String getStratDate() {
			return startdate;
		}
		
		public void setStartDate() {
			this.startdate = startdate;
		}
		
		public String getEndDate() {
			return enddate;
		}
		
		public void setEndDate() {
			this.enddate = enddate;
		}
		
		
		
		
		
}
