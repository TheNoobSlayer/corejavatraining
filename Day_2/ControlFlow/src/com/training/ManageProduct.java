package com.training;

public class ManageProduct {

	public double calculateDiscount(Product product) {
		
		double discount=0.0;
		if(product.getRatePerUnit()>500 && product.getRatePerUnit()<=1000) {
			discount=0.10;
		}else if(product.getRatePerUnit()>1000) {
			discount=0.15;
		}
		return discount;
		
	}
	
	public void showNumbers() {
		for(int i=0;i<10;i++) {
			System.out.println("Product");
		}
	}
	
	public int calculateTax(Product product) {
		int totalTax=0;
		double rate=product.getRatePerUnit();
		switch(product.getProductType()) {
			case 1:
				totalTax=(int)(rate*0.05);
				return totalTax;
			case 2:
				totalTax=(int)(rate*0.1);
				return totalTax;
			case 3:
				totalTax=(int)(rate*0.15);
				return totalTax;
			default:
				totalTax=(int)(rate*0.28);
				return totalTax;
		}
			
				
	}
}
