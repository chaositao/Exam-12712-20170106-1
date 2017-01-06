package com.cst.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cst.dto.Film;
import com.cst.dto.Pager;
import com.cst.dto.ResponseData;
import com.cst.mapper.FilmMapper;
import com.cst.service.FilmService;

@Service
@Transactional
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmMapper filmMapper;

	@Override
	public ResponseData<Film> query(Pager<Film> pager) {
		List<Film> films = filmMapper.query(pager);
		int n = filmMapper.queryCount(pager);
		int total = n % pager.getPageSize() == 0 ? n / pager.getPageSize() : n / pager.getPageSize() + 1;
		ResponseData<Film> responseData = new ResponseData<Film>();
		responseData.setRows(films).setTotal(total);
		return responseData;
	}

	@Override
	public void del(int filmId) {
		filmMapper.del(filmId);
	}

	@Override
	public void update(Film film) {
		filmMapper.update(film);
	}

	public void add(Film film){
		filmMapper.add(film);
	}

}
