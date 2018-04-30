package handong.edu.csee.java.Lab13.Prob4;// package name of problem 4 


import java.util.Scanner;// import scanner package for keyboard input

public class Prob4 {// main class to print the result
	
	public static void main(String[] args) {
		
		String dogName;// local variable
		String catName;// local variable

		Master myMaster = new Master();// instantiate Master interface
		Cat cat = new Cat();// instantiate cat to Cat Class
		Dog dog = new Dog();// instantiate dog to Dog class 

		Scanner petName = new Scanner(System.in);// scanner keyboard from  user input
		System.out.print("Enter the cat name and dog name: "); // print out Enter the cat name and dog name:
		catName = petName.next();// input the name of Cat
		dogName = petName.next();// input name of Dog
		

		cat.setName(catName);//initialize cat name
		cat.getName();// initial getName in Animal class print out cat name  
		myMaster.feed(cat);// print the food's cat

		dog.setName(dogName);//initialize dog name
		dog.getName();// initial getName in Animal class print out dog name 
		myMaster.feed(dog);// print the food's dog
		}
		}



