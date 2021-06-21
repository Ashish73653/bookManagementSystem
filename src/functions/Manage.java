package functions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import functions.cp;

public class Manage {
	public static boolean insertBookToShelf(BookClasses bk) {
		boolean f = false;
		try {
			// jdbc code
			Connection con = cp.createC();
			String q = "insert into booktable (id,Name,authorName) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the values of paramenter
			pstmt.setString(1, bk.getBookId());
			pstmt.setString(2, bk.getBookName());
			pstmt.setString(3, bk.getAuthorName());
			
			// execute
			pstmt.executeUpdate();
			f = true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void showAll() {
		// TODO Auto-generated method stub
		try {
			//jdbc code..
			Connection con = cp.createC();
			String q="select * from booktable";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while(set.next()){
				int no = set.getInt(1);
				String ID = set.getString(2);
				String Name = set.getString(3);
				String authorName = set.getString(4);
				System.out.println("no : "+no);
				System.out.println("ID : "+ID);
				System.out.println("Name : "+ Name);
				System.out.println("authorName : "+ authorName);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static boolean removeBookFromShelf(int no) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			//jdbc code..
			Connection con = cp.createC();
			String q="delete from booktable where no=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the values of parameter
			pstmt.setInt(1, no);
			
			// execute
			pstmt.executeUpdate();
			f = true;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean updation(int no,BookClasses bo) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = cp.createC();
			String q = "update booktable set ID=?,Name=?,authorName=? where no=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the values of paramenter
			pstmt.setInt(4, no);
			pstmt.setString(1, bo.getBookId());
			pstmt.setString(2, bo.getBookName());
			pstmt.setString(3, bo.getAuthorName());
			
			// execute
			pstmt.executeUpdate();
			f = true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean searchInShelf(int no) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = cp.createC();
			String q = "select ID,Name,authorName from booktable where no=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1,no);
			ResultSet result = pstmt.executeQuery();
			while(result.next()) {
				String ID = result.getString("ID");
				String Name = result.getString("Name");
				String authorName = result.getString("authorName");
				System.out.println("ID :"+ID);
				System.out.println("Name :"+Name);
				System.out.println("authorName :"+authorName);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
