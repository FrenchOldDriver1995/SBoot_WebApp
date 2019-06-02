package com.example.demo.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="story")
public class Story {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="content")
	String content;
	
	@OneToMany
	@JoinColumn(name="story_id")
	private List<Comment> comments = new ArrayList<>();

	public Story(){}
	
	public Story(String content) {
		// TODO Auto-generated constructor stub
		this.content=content;
	}
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Story{" +
				//"id=" + id +
				"content='" +  content + "}"; 
	}
}
