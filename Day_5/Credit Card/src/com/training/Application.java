package com.training;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.training.model.CreditCard;
import com.training.model.CreditCardService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardService service=new CreditCardService();
		File file=new File("CreditCards.txt");
		
		CreditCard[] cards = new CreditCard[5];
		
		cards[0] = new CreditCard("Rick Sanchez",2000,"Regular",10000,5000);
		cards[1] = new CreditCard("Morty Smith",2000,"Regular",10000,5000);
		cards[2] = new CreditCard("Summer Smith",2000,"Regular",10000,5000);
		cards[3] = new CreditCard("Beth Smith",2000,"Regular",10000,5000);
		cards[4] = new CreditCard("Jerry Smith",2000,"Regular",10000,5000);
		
		Scanner s=new Scanner(System.in);
		System.out.print("Do you want to store Object(1) or Character(2)? ");
		int type = s.nextInt();
		boolean result;
		if(type==1) {
			result=service.storeCardDetails(cards, file);
		}else {
			result=service.storeCardWithDataStream(cards, file);
		}
		
		if(result) {
			System.out.println("Book Persisted");
		}
		else {
			System.out.println("Error");
		}
		CreditCard[] updatedCards = null;
		updatedCards = service.retrieveCard();
		for(CreditCard newCard: updatedCards) {
			System.out.println(newCard);
		}
		
		CreditCard[] latestDB = service.deleteCard(updatedCards,"Jerry Smith");
		System.out.println("Updated Database");
		for(CreditCard card: latestDB) {
			System.out.println(card);
		}

		
		
		
		
	}

}
