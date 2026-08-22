package com.Bharath.learntogether.dto;

public class UserResponse {
	  private long id;
	    private String name;
	    private String email;
	    private String college;
	    private String branch;
	    private int year;
	    private String role;

	    public UserResponse() {
	    }

	    public UserResponse(long id, String name, String email,
	                        String college, String branch,
	                        int year, String role) {

	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.college = college;
	        this.branch = branch;
	        this.year = year;
	        this.role = role;
	    }

	    public long getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getCollege() {
	        return college;
	    }

	    public String getBranch() {
	        return branch;
	    }

	    public int getYear() {
	        return year;
	    }

	    public String getRole() {
	        return role;
	    }

}
