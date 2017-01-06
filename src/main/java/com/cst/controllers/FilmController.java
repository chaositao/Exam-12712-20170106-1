package com.cst.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cst.dto.Film;
import com.cst.dto.Pager;
import com.cst.dto.ResponseData;
import com.cst.service.FilmService;

@Controller
@RequestMapping("/film")
public class FilmController {
	@Autowired
	private FilmService filmService;

	@RequestMapping("")
	public String toIndex() {
		return "/WEB-INF/view/index.html";
	}

	@RequestMapping("/query")
	@ResponseBody
	public ResponseData<Film> query(@RequestParam(name = "title", required = false, defaultValue = "") String title,
			@RequestParam(name = "description", required = false, defaultValue = "") String description,
			@RequestParam(name = "page", required = false, defaultValue = "1") int page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
		Pager<Film> pager = new Pager<Film>();
		Film film = new Film();
		film.setTitle(title).setDescription(description);
		pager.setPage(page).setPageSize(pageSize).setEntity(film);
		return filmService.query(pager);
	}

	@RequestMapping("/del")
	@ResponseBody
	public ResponseData<Film> del(@RequestParam(name = "filmId", required = false, defaultValue = "") int filmId) {
		filmService.del(filmId);
		return new ResponseData<Film>();
	}

	@RequestMapping("/update")
	@ResponseBody
	public ResponseData<Film> update(@RequestParam(name = "filmId", required = false, defaultValue = "") int filmId,
			@RequestParam(name = "title", required = false, defaultValue = "") String title,
			@RequestParam(name = "description", required = false, defaultValue = "") String description,
			@RequestParam(name = "languageId", required = false, defaultValue = "") int languageId) {
		Film film = new Film();
		film.setFilmId(filmId).setTitle(title).setDescription(description).setLanguageId(languageId);
		filmService.update(film);
		return new ResponseData<Film>();
	}

	@RequestMapping("/add")
	@ResponseBody
	public ResponseData<Film> add(@RequestParam(name = "title", required = false, defaultValue = "") String title,
			@RequestParam(name = "description", required = false, defaultValue = "") String description,
			@RequestParam(name = "languageId", required = false, defaultValue = "") int languageId){
		Film film = new Film();
		film.setTitle(title).setDescription(description).setLanguageId(languageId);
		filmService.add(film);
		return new ResponseData<Film>();
	}
}
