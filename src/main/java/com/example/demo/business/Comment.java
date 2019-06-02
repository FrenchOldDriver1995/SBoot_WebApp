package com.example.demo.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMMENT")
public class Comment {
	@Id
	//@GeneratedValue
	@Column(name="ID")
    private Integer id;
	
	@Column(name="CONTENT")
    private String content;

    public Comment() {
    }

    
    public Comment(Integer id, String content) {

        this.id = id;
        this.content = content;
    }

    public Integer getId() {
    	
        return id;
    }

    public String getContent() {
        return content;
    }
}
