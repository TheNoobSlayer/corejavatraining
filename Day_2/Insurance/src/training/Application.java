package training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance holderOne=new Insurance(123,"Aditya",10,5000);
		double premiumCalculated=holderOne.calculatePremium();
		System.out.println(holderOne.getPolicyHolderName()+"'s insured amount ="+premiumCalculated);
		
		Insurance holderTwo=new Insurance(123,"Bob",70,7000);
		premiumCalculated=holderTwo.calculatePremium();
		System.out.println(holderTwo.getPolicyHolderName()+"'s insured amount ="+premiumCalculated);
	}

}
