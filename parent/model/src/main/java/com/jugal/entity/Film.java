package com.jugal.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Film {
	private String name;
	private String actor;
	private String producer;
	private String director;
	private Date releaseDate;

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	@XmlElement
	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getProducer() {
		return producer;
	}

	@XmlElement
	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getDirector() {
		return director;
	}

	@XmlElement
	public void setDirector(String director) {
		this.director = director;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	@XmlElement
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

}
