package bookShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import functions.BookClasses;
import functions.Manage;

public class Start {

	public static void main (String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to book management..");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to add a book in shelf..");
			System.out.println("Press 2 to remove a book from shelf..");
			System.out.println("Press 3 to update data by using id..");
			System.out.println("Press 4 to search a book by id..");
			System.out.println("Press 5 to display all books..");
			System.out.println("Press 6 to exit...");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				// add 
				System.out.println("Enter bookID :");
				String bookID = br.readLine();
				System.out.println("Enetr bookName :");
				String bookName = br.readLine();
				System.out.println("Enter authorName :");
				String authorName = br.readLine();
				
				// create book object to store the info
				BookClasses bk = new BookClasses(bookID,bookName,authorName);
				boolean answer = Manage.insertBookToShelf(bk);
				if(answer) {
					System.out.println("Book added successfully..");
				}else {
					System.out.println("Something went wrong try again...");
				}
			} else if(c==2) {
				// remove
				System.out.println("Enter no :");
				int no = Integer.parseInt(br.readLine());
				boolean f = Manage.removeBookFromShelf(no);
				if(f) {
					System.out.println("removed successfully..");
				} else {
					System.out.println("something went wrong...");
				}
			} else if(c==3) {
				// update
				System.out.println("Enter no :");
				int no = Integer.parseInt(br.readLine());
				System.out.println("Enter new bookID :");
				String bookID = br.readLine();
				System.out.println("Eneter new bookName :");
				String bookName = br.readLine();
				System.out.println("Enter new authorName :");
				String authorName = br.readLine();
				BookClasses bo = new BookClasses(no,bookID,bookName,authorName);
				boolean f = Manage.updation(no,bo);
				if(f) {
					System.out.println("updated successfully..");
				} else {
					System.out.println("something went wrong...");
				}
				
			} else if(c==4) {
				//search
				System.out.println("Enter the no :");
				int no = Integer.parseInt(br.readLine());

				boolean f = Manage.searchInShelf(no);
				if(f) {
					System.out.println("founded..");
				} else {
					System.out.println("something went wrong...");
				}
			} else if(c==5) {
				//display
				Manage.showAll();
			} else if(c==6) {
				System.out.println("Thanks for using application...");
				//exit
				break;
			}
		}
	}

}
