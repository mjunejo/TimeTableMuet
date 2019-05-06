package com.muet.timetable.Models;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "faculty")
@EntityListeners(AuditingEntityListener.class)

public class Faculty {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int f_id;
	
	@Column(name = "name")
	private String f_name;
	
	@Column(name = "created_at")
	private int created_at;
	
	@Column(name = "updated_at")
	private int updated_at;
	
	@Column(name = "created_by")
	private int created_by;
	
	@Column(name = "updated_by")
	private int updated_by;
	
	@Column(name = "active")
	private int active;
	

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public int getCreated_at() {
		return created_at;
	}

	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}

	public int getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(int updated_at) {
		this.updated_at = updated_at;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public int getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	

}
