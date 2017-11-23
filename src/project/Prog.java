package project;

import java.util.*;

public class Prog{
	public static void main(String[] args){

		//INPUT:
		//kprog main{}

		Node kprog = new Node("kprog");
		Node stmt = new Node("stmt");
		kprog.addKid(stmt);

		Node import = new Node("import");
		

		Node vargroup = new Node("vargroup");
		Node fdefs = new Node("fdefs");
		kprog.addKid(vargroup);
		kprog.addKid(fdefs);
		kprog.printKids();
	}
}