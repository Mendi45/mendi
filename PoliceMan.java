package inheritancePoliceChase;

public class PoliceMan extends Player {

	
	protected Criminal[] arrestedCriminals;
	protected int totalArrested;
	protected int MaxNumCriminals;
	
	
	
	public void setMaxNumCriminals(int maxNumCriminals) {
		MaxNumCriminals = maxNumCriminals;
	}

	public PoliceMan(String name, int strength) {
		super(name, strength);
		// TODO Auto-generated constructor stub
	}
	
	public boolean arrestedALL() {
		if (totalArrested == MaxNumCriminals) {
			return true;
		}else return false;
	}
	
	

	public boolean arrest(Criminal criminal) {
		if (PoliceMan.super.isAlive()== true && criminal.isAlive() == true ) {
			if (PoliceMan.this.arrestedALL() == false) {
				if (PoliceMan.this.strength > criminal.strength) {
					PoliceMan.strength = criminal.knockOut();
					PoliceMan.this.arrest(criminal);
					
					//when arrested
					arrestedCriminals[totalArrested] = criminal;
					totalArrested++;
					
					return true;
				}else if (  criminal.strength > PoliceMan.this.strength) {
					criminal.strength -= PoliceMan.this.strength;
					PoliceMan.this.knockOut();
					

					// power of policeman and criminal are equal
				}else {
					criminal.knockOut();
					PoliceMan.this.knockOut();
					}
			}
		}
		//if  (PoliceMan.super.isAlive()== true && criminal.isAlive() == true ) == false
		return false;
	}

	public void showArrestedCriminal() {
		if (PoliceMan.this.totalArrested > 0) {
			System.out.println("the policeMan name is: " +PoliceMan.name + " arrest this criminals: \n " + arrestedCriminals );
		}else {
			System.out.println("the policeMan name is: " +PoliceMan.name + " this is a Dirty policeMan!");
		}
	}

}
