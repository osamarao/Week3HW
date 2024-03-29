package com.applejay.android.taskmanager.tasks;

public class Task {
	
	private String name;
	private boolean complete;
	private long id;
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String n) {
		name = n;
		
	}
	
	public String getName() {
		return name;
	}
	
	public Task(String n){
		name = n;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	public boolean isComplete() {
		
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public void toggleComplete() {
		complete = !complete;
		
	}

	public void setId(long id) {
		this.id = id;
		
	}

	public long getId() {
		return id;
	}

}
