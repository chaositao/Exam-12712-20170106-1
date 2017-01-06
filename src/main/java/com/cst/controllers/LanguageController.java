package com.cst.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cst.dto.Language;
import com.cst.dto.ResponseData;
import com.cst.service.LanguageService;

@Controller
@RequestMapping("/language")
public class LanguageController {

	@Autowired
	private LanguageService languageService;

	@RequestMapping("")
	@ResponseBody
	public ResponseData<Language> query() {
		return languageService.query();
	}
}
