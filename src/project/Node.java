package project;

import java.util.*;

public class Node {

	private Node[] kids;
	private String symbol;
	private boolean isEOF; // is it "$"
	private int kidsNum; //Number of kids

	public Node(String symbol){
		this.symbol = symbol;
		kids = new Node[10];
	}

	public void addKid(Node k){
		for(int i=0; i < kids.length; i++){
			if(getKids()[i] == null){
				getKids()[i] = k;
				kidsNum++;
				return;
			}
		}
	}

	public Node[] getKids(){
		return kids;
	}

	public String getSymbol(){
		return symbol;
	}



	//DEBUGGING METHODS
	public void printKids(){
		for(int i=0; i < kidsNum; i++){
			System.out.println(getKids()[i].getSymbol());
		}
		
	}

}