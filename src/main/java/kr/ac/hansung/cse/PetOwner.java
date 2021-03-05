package kr.ac.hansung.cse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	@Autowired
	@Qualifier(value="qf_dog")
	private AnimalType animal; //여기에 주입. interface
	
	public void play() {
		animal.sound();
	}
}
