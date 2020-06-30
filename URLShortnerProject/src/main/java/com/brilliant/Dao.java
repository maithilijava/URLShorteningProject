package com.brilliant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class Dao {
	@Autowired
	JdbcTemplate jdbc;
	public String save(ShortenUrl URLData) {
		String sql="INSERT INTO SHORTURL(shorturl,longurl) values(?,?)";
		jdbc.batchUpdate(sql, URLData.getShort_url(),URLData.getFull_url() );
		return "data inserted successfully";
	}
	 
	public String getFullURL(String randomchar) {
		String url="http://localhost:8080/s/"+randomchar;
		String sql="Select longurl from URL where shorturl='"+url+"'";
		return jdbc.queryForObject(sql, String.class);
	}
}
