package com.applejay.android.taskmanager.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.applejay.android.taskmanager.tasks.Task;

public class TaskListItem extends LinearLayout {

	private Task task;
	private CheckedTextView checkbox;
	private TextView description; 
	
	public TaskListItem(Context context, AttributeSet attrs) {
		super(context, attrs);
		
	}
	
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		checkbox = (CheckedTextView)findViewById(android.R.id.text1);
		description = (TextView)findViewById(android.R.id.text2);
	}
	
	public void setTask(Task task) {
		this.task = task;
		checkbox.setText(task.getName());
		checkbox.setChecked(task.isComplete());
		description.setText(task.getDescription());
	}
	public Task getTask() {
		return task;
	}


}
