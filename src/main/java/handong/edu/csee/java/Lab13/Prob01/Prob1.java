package handong.edu.csee.java.Lab13.Prob01; // package name of Lab13 problem 1

public class Prob1 { // the main class for  problem 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Friend friend1 = new Friend(); // instantiation
		SchoolFriend friend2 = new SchoolFriend();// instantiation
		ClassFriend friend3 = new ClassFriend();// instantiation

		InstanceOf.myFriend(friend1);// if friend1 is stand for Friend Class then print the result
		InstanceOf.myFriend(friend2);// if friend2 is stand for SchoolFriend then print the result 
		InstanceOf.myFriend(friend3);//if friend3 is stand for Class friend then print the result

	}

}
