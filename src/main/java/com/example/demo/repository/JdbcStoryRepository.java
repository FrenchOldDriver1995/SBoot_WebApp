package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.business.Story;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JdbcStoryRepository implements StoryRepository{

	javax.sql.DataSource dataSource;
	
	
	public JdbcStoryRepository(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.dataSource = dataSource;
	}
	@Override
	public List<Story> findAll() {
		// TODO Auto-generated method stub
		List<Story> results = new ArrayList<>();
		try {//需要看一下jdbc相关的
			//GET CONNECTION 
			Connection connection = dataSource.getConnection();
			String sql = "SELECT * FROM STORY";
			//execute query
			ResultSet resultSet = connection.createStatement().executeQuery(sql);
			//for each row in data base
			while(resultSet.next()) {
				//get the content column
				String content = resultSet.getString("CONTENT");
				Story story = new Story(content);
				//add the story to the result
				results.add(story);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void save(Story story) {
		// TODO Auto-generated method stub
		try {
			//GET CONNECTION
			Connection connection = dataSource.getConnection();
			String sql = "SELECT * FROM STORY";
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
