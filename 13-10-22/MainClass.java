package view;
import java.util.HashMap;
import java.util.Scanner;

import model.UserDetails;
public class MainClass {
	Scanner scanner = new Scanner(System.in);
	int input;
	HashMap<Integer, UserDetails> map = new HashMap<Integer, UserDetails>();
	int id = 1;
	UserDetails userDetails = new UserDetails();

	public UserDetails getUserDetails() {
		UserDetails userDetails = new UserDetails();
		System.out.println("Enter the UserName");
		userDetails.setUserName(scanner.next());
		System.out.println("Enter the Password");
		userDetails.setPassword(scanner.next());
		System.out.println("Enter the DataOfBirth");
		userDetails.setDateOfBirth(scanner.next());
		System.out.println("Enter the mobile Number");
		userDetails.setMobile(scanner.nextLong());
		System.out.println("Your userid is:" + id++);
		return userDetails;
	}

	public void addFriend() {
		System.out.println("Enter the user Id");
		int userId = scanner.nextInt();
		if (map.containsKey(userId)) {
			System.out.println("Enter  your friend Id");
			int friendId = scanner.nextInt();
			if (map.containsKey(friendId)) {
				if (map.get(userId).friendsList.contains(friendId)) {
					System.out.println("\nYou are Already Friends!");
					return;
				} else {
					map.get(userId).friendsList.add(map.get(friendId));
					map.get(friendId).friendsList.add(map.get(userId));
					System.out.println("\nyour Friend list updated");
				}

			} else {
				System.out.println("\nYour Friend UserID Not Found");
			}
		} else {
			System.out.println("\nYour User Not Found");
		}
	}

	public void showFriends() {
		System.out.println("Enter the UserId ");
		int userId1 = scanner.nextInt();
		if (map.containsKey(userId1)) {

			for (UserDetails val : map.get(userId1).friendsList) {
				System.out.println(val.getUserName());
			}
		} else {
			System.out.println("The UserId Not Found");
		}

	}

	public void showMutualFriends() {
		System.out.println("Enter the First UserId ");
		int userId1 = scanner.nextInt();
		System.out.println("Enter the second UserId ");
		int userId2 = scanner.nextInt();
		for (UserDetails value : map.get(userId1).friendsList) {

			if (map.get(userId2).friendsList.contains(value)) {
				System.out.println(value.getUserName());
				break;
			}
		}

	}
	public void signupUser() {
		System.out.println("1.Signup");
		System.out.println("2.addfriend");
		System.out.println("3.showfriend");
		System.out.println("4.showMutualfriends");
		input = scanner.nextInt();
		switch (input) {
		case 1:
			map.put(id, getUserDetails());
			signupUser();
			break;
		case 2:
			addFriend();
			signupUser();
			break;
		case 3:
			showFriends();
			signupUser();
			break;
		case 4:
			showMutualFriends();
			signupUser();
			break;
		}
	}

	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		mainClass.signupUser();
	}
}
