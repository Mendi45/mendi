package inheritancePoliceChase;

public class Criminal extends Player {

	public Criminal(String name, int strength) {
		super(name, strength);
	}
	
	//copy CTR
	public Criminal (Criminal criminal) {
	super(criminal.name = name,criminal.strength = strength);
	}
	
	
}
