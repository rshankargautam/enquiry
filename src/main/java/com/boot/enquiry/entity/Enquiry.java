package com.boot.enquiry.entity;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class Enquiry {
	@Id
	private int id;
	private String enqTitle;
	private String enqDesc;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date enqDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User users;
	public Enquiry() {
		super();
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Enquiry(int id, String enqType, String enqTitle, String enqDesc, Date enqDate) {
		super();
		this.id = id;
		this.enqTitle = enqTitle;
		this.enqDesc = enqDesc;
		this.enqDate = enqDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnqTitle() {
		return enqTitle;
	}

	public void setEnqTitle(String enqTitle) {
		this.enqTitle = enqTitle;
	}

	public String getEnqDesc() {
		return enqDesc;
	}

	public void setEnqDesc(String enqDesc) {
		this.enqDesc = enqDesc;
	}

	public Date getEnqDate() {
		return enqDate;
	}

	public void setEnqDate(Date enqDate) {
		this.enqDate = enqDate;
	}

	@Override
	public String toString() {
		return "Enquiry [id=" + id + ", enqType=" + ", enqTitle=" + enqTitle + ", enqDesc=" + enqDesc
				+ ", enqDate=" + enqDate + "]";
	}
}
