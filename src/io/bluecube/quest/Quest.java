package io.bluecube.quest;

import java.util.List;
import java.util.UUID;

public class Quest {
	
	private String title, desc;
	private UUID id;
	private List<Trackable> steps;
	
	public Quest(String title, String desc){
		this.title = title;
		this.desc = desc;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getDescription(){
		return desc;
	}
	
	public void addStep(Trackable step){
		steps.add(step);
	}
}
