package array;

public class arrayExample {

	public static void main(String[] args) {
		facebookCustomer[] allcus = new facebookCustomer[5];
		allcus[0]= new facebookCustomer();
		allcus[1]= new facebookCustomer();
		allcus[2]= new facebookCustomer();
		allcus[3]= new facebookCustomer();
		allcus[4]= new facebookCustomer();
		
		//System.out.println(allcus[0]);
		//System.out.println(allcus[1]);
		//System.out.println(allcus[2]);
		
		
		
		facebookCustomer[] allcus1 = new facebookCustomer[5];
		for(int i=0; i<allcus1.length; i++)
		{
			allcus1[i] = new facebookCustomer();
			//System.out.println(allcus[i]);
		}
		
		facebookCustomer[][] multi = new facebookCustomer[4][2];
		for(int i =0; i<4; i++) {
			for(int j=0; j<2; j++) {
				multi[i][j]= new facebookCustomer();
				//System.out.println(multi[i][j]);
			}
		}
		facebookCustomer[] fb = {new facebookCustomer(), new facebookCustomer()};
		//System.out.println(fb[0]);
		//System.out.println(fb[1]);
		
		
		
		//arraycopy
		
		int[] score = {20,30, 40, 50, 60};
		int[] score2 = new int[3];
		System.arraycopy(score, 2, score2, 0, 2);
		for (int i:score2) {
		System.out.println(i);}

	}

}
