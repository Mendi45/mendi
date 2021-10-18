package inheritancePoliceChase;

import java.util.Random;

public class PoliceChaseMain {

	public static void main(String[] args) {
		// 
		Random rand = new Random();
		
		Criminal[] criminals = new Criminal[6];
		criminals[0] = new Criminal("criminal 0", rand.nextInt(50));
		criminals[1] = new Criminal("criminal 1", rand.nextInt(50));
		criminals[2] = new Criminal("criminal 2", rand.nextInt(50));
		criminals[3] = new Criminal("criminal 3", rand.nextInt(50));
		criminals[4] = new Criminal("criminal 4", rand.nextInt(50));
		criminals[5] = new Criminal("criminal 5", rand.nextInt(50));
		
		
		PoliceMan[] policemans = new PoliceMan[3];
		policemans[0] = new PoliceMan("police man 0" , rand.nextInt(50));
		policemans[1] = new PoliceMan("police man 1", rand.nextInt(50));
		policemans[2] = new PoliceMan("police man 2", rand.nextInt(50));

	
			// random number for MaxNumCriminals of this policeman
		
		
		for (int i = 0; i < policemans.length; i++) {
			policemans[i].setMaxNumCriminals(rand.nextInt(6));
			if (policemans[i].arrestedALL()) {
				System.out.println("police man arrested all");
				break;
			}else {
				for (int j = 0; j < criminals.length; j++) {
					if (policemans[i].arrest(criminals[j])) {
						System.out.println(policemans[i] + "arreset the criminal: " + criminals[j]);
					}
				}
			}	
		}
		
		//show arrested criminals by each policeman
		for (int i = 0; i < policemans.length; i++) {
			policemans[i].showArrestedCriminal();
		}
	}

	
}
