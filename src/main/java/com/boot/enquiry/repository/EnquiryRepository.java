package com.boot.enquiry.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.boot.enquiry.entity.Enquiry;

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Integer>{

	public List<Enquiry> getEnquiryByTitle(String enqTitle);
		
	public List<Enquiry> getEnquiryOfToday(Date d);

	public List<Enquiry> getAllEnquiries();

	public Enquiry addEnquiry(Enquiry enq);

	public Enquiry editEnquiry(Enquiry enq);

	public Enquiry deleteById(int id);

}
