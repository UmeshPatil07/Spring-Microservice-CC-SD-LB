package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.Office;
import com.infy.repository.OfficeRepository;

@Service
public class OfficeService {
	@Autowired
	OfficeRepository officeRepo;
	
	public Office getOffice(int id) {
		Office o=officeRepo.findById(id).get();
		return o;
	}
	
	

}
