package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.Office;
import com.infy.service.OfficeService;
@RestController
@RequestMapping("/office")
public class OfficeController {
	@Autowired
	OfficeService officeService;
	
	@GetMapping("/getoffice/{id}")
	public Office getOffice(@PathVariable("id")int id) {
		Office o=officeService.getOffice(id);
		return o;
	}
	

}
