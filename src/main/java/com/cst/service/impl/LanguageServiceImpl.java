package com.cst.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cst.dto.Language;
import com.cst.dto.ResponseData;
import com.cst.mapper.LanguageMapper;
import com.cst.service.LanguageService;

@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	private LanguageMapper languageMapper;

	@Override
	public ResponseData<Language> query() {
		List<Language> languages = languageMapper.queryAll();
		ResponseData<Language> responseData = new ResponseData<Language>();
		responseData.setRows(languages);
		return responseData;
	}

}
