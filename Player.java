package inheritancePoliceChase;

public abstract class Player {
	protected static String name;
	protected static int strength;
	
	public Player(String name, int strength) {
		
		this.name = name;
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", strength=" + strength + "]";
	}
	
	
	protected boolean isAlive() {
		if ( strength > 0) {
			return true;
		}else return false;
	}

	
	
	protected int knockOut() {
		int tempPower = strength;
		strength = 0;
		return tempPower;
	}
}
