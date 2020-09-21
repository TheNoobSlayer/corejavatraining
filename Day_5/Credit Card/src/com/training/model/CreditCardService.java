package com.training.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class CreditCardService {
	public boolean storeCardDetails(CreditCard[] card,File file) {
		boolean persisted=false;
		ObjectOutputStream outputStream=null;
		try {
			outputStream=new ObjectOutputStream(new FileOutputStream((file)));
			outputStream.writeObject(card);
			persisted=true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return persisted;
	}
	
	public CreditCard[] retrieveCard() {
		
		CreditCard[] card=null;
		ObjectInputStream inputStream=null;
	
		
			try {
				inputStream=new ObjectInputStream(new FileInputStream(new File("CreditCards.txt")));
				card=(CreditCard[]) inputStream.readObject();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return card;
		
	}
	
	public boolean storeCardWithDataStream(CreditCard[] cards,File file) {
		boolean persisted=false;
		FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file,true);    
			DataOutputStream data = new DataOutputStream(fileOutputStream);
			pw= new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
			for(CreditCard eachCard:cards) {
				data.writeUTF(eachCard.getCardHolderName());
				data.writeInt(eachCard.getCardNumber());
				data.writeUTF(eachCard.getCardType());
				data.writeDouble(eachCard.getCardBalance());
				data.writeDouble(eachCard.getCardLimit());
			}
			
			persisted=true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return persisted;
	}
	
	public CreditCard[] retrieveCardWithDataStream(File file) {
		CreditCard [] cards = new CreditCard[5];
		int index = 0;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String details = null;
			while((details=reader.readLine())!=null) {
				String[] result = details.split("[,]", 0);
				CreditCard card = new CreditCard();
				card.setCardNumber(Integer.parseInt(result[0]));
				card.setCardHolderName(result[1]);
				
				cards[index] = card;
				index++;
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cards;
	}
	
	public CreditCard[] deleteCard(CreditCard[] cards, String cardHolderName) {
		
		int posToDelete = 0;
		for(int i=0;i<cards.length;i++) {
			if(cards[i].getCardHolderName().equals(cardHolderName)) {
				posToDelete = i;
				break;
			}
		}
		CreditCard[] newCards = new CreditCard[cards.length-1];
		int count = 0;
		for(int i=0;i<cards.length;i++) {
			if(i!=posToDelete) {
				newCards[count++] = cards[i];
			}
		}
		return newCards;
	}
	
}
