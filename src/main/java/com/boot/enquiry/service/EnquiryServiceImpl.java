package com.boot.enquiry.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.boot.enquiry.entity.Enquiry;
import com.boot.enquiry.repository.EnquiryRepository;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private EnquiryRepository erepo;

	@Override
	public List<Enquiry> getEnquiryByTitle(String enqTitle) {

		return erepo.getEnquiryByTitle(enqTitle);
	}

	@Override
	public List<Enquiry> getEnquiryOfToday() {

		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String strDate = formatter.format(java.util.Calendar.getInstance().getTime());
			Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
			List<Enquiry> e = erepo.getEnquiryOfToday(date);
			if (e != null)
				return e;
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		return null;

	}

	@Override
	public List<Enquiry> getAllEnquiries() {

		return erepo.getAllEnquiries();
	}

	@Override
	public Enquiry addEnquiry(Enquiry enq) {

		return erepo.addEnquiry(enq);
	}

	@Override
	public Enquiry editEnquiry(Enquiry enq) {

		return erepo.editEnquiry(enq);
	}

	@Override
	public Enquiry deleteById(int id) {

		return erepo.deleteById(id);
	}

}
