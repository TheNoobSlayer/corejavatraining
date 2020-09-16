package com.training;

public class ManageProduct {

	public Product[] calculateDiscount(Product[] productList) {
		
		double discount=0.0;
		for(Product eachProduct:productList) {
			if(eachProduct.getRatePerUnit()>500 && eachProduct.getRatePerUnit()<=1000) {
				discount=0.10;
			}else if(eachProduct.getRatePerUnit()>1000) {
				discount=0.15;
			}
			eachProduct.setDiscount(discount);
		}
		
		return productList;
		
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
	
	public void showProductsLegacy(Product[] productList) {
		for(int i=0;i<productList.length;i++) {
			//System.out.println("Product :"+i+"=>"+productList[i].getProductName());
			System.out.println(productList[i]);
		}
	}
	
	public void showProductForEach(Product[] productList) {
		for(Product eachProduct:productList) {
			System.out.println(eachProduct.getProductName()+"."+eachProduct.getRatePerUnit());
		}
	}
}
