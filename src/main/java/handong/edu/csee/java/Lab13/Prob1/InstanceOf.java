package handong.edu.csee.java.Lab13.Prob1;// package name of Lab13 problem 1

public class InstanceOf {// this class 

	// method 
	public static void myFriend(Friend friend) // friend stand for Friend_Class 
	{
		if(friend instanceof ClassFriend) // this condition mean ClassFriend extend from friend (Friend Class) and it will true
			((ClassFriend) friend).classFriend();// friend is casting ClassFriend

		else if(friend instanceof SchoolFriend)// if SchoolFriend extend from friend(Friend class) and it will true
			((SchoolFriend) friend).schoolFriend(); //friend( friend = class Friend) is casting SchoolFriend  
		else
			friend.JustFriend();// it mean (class friend).JustFriend() 
	}


}
