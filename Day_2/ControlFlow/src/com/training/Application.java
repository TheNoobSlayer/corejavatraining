package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product tv=new Product(1010,"LED TV",23000.00,3,4);
		ManageProduct mgr=new ManageProduct();
		//double discount=mgr.calculateDiscount(tv);
		int tax=mgr.calculateTax(tv);		
		//System.out.println("Discount:==>"+discount);
		//System.out.println("Tax:==>"+tax);
		Product fridge=new Product(1010,"Whirpool",50000.00,6,9);
		
		Product[] productList=new Product[2];
		productList[0]=tv;
		productList[1]=fridge;
		mgr.showProductForEach(productList);
		mgr.showProductsLegacy(productList);
		Product[] newArray=mgr.calculateDiscount(productList);
		for(Product eachProduct:newArray) {
			double price=eachProduct.getRatePerUnit()-(eachProduct.getRatePerUnit()*eachProduct.getDiscount());
			System.out.println(eachProduct.getProductName()+" discount= "+eachProduct.getDiscount()+" Price="+price);
		}
	}

}
