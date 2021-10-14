package com.boot.enquiry.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.enquiry.entity.Enquiry;

public interface EnquiryService {

	public List<Enquiry> getEnquiryByTitle(String enqTitle);

	public List<Enquiry> getEnquiryOfToday();

	public List<Enquiry> getAllEnquiries();

	public Enquiry addEnquiry(Enquiry enq);

	public Enquiry editEnquiry(Enquiry enq);

	public Enquiry deleteById(int id);

}
