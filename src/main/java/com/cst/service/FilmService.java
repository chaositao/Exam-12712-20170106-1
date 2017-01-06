package com.cst.service;

import com.cst.dto.Film;
import com.cst.dto.Pager;
import com.cst.dto.ResponseData;

public interface FilmService {
	public ResponseData<Film> query(Pager<Film> pager);

	public void del(int filmId);

	public void update(Film film);

	public void add(Film film);
}
