package com.cst.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cst.dto.Film;
import com.cst.dto.Pager;

public interface FilmMapper {
	public List<Film> query(Pager<Film> pager);

	public int queryCount(Pager<Film> pager);

	public void del(@Param("filmId") int filmId);

	public void update(Film film);

	public void add(Film film);
}
