package com.jugal.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jugal.entity.Film;
import com.jugal.entity.Movie;

@Controller
@RequestMapping("/movie")
public class MovieController {

	@RequestMapping(value = "json/{movieName}", method = RequestMethod.GET)
	public @ResponseBody Movie getMovieInJSON(@PathVariable String movieName) {

		Movie movie = new Movie();
		movie.setName(movieName);
		movie.setDirector("director");
		movie.setActor("actor");
		movie.setProducer("producer");
		movie.setReleaseDate(new Date());

		return movie;

	}

	@RequestMapping(value = "xml/{filmName}", method = RequestMethod.GET)
	public @ResponseBody Film getFilmInXML(@PathVariable String filmName) {

		Film film = new Film();
		film.setName(filmName);
		film.setDirector("director");
		film.setActor("actor");
		film.setProducer("producer");
		film.setReleaseDate(new Date());

		return film;

	}
}
