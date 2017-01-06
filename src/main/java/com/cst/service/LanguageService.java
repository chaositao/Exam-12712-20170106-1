package com.cst.service;

import com.cst.dto.Language;
import com.cst.dto.ResponseData;

public interface LanguageService {
	public ResponseData<Language> query();
}
