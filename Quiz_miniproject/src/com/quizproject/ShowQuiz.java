package com.quizproject;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ShowQuiz {

	Connection connection = null;
	PreparedStatement ps = null;

	public void getQuiz() {
		Scanner sc = new Scanner(System.in);
		DatabaseConnection con = new DatabaseConnection();
		connection = con.getConnection();
		try {

			int correctAnswerCount = 0;
			int wrongAnswerCount = 0;

			System.out.println("Enter your name : ");
			String Name = sc.nextLine();
			System.out.println("Enter your id : ");
			String ID = sc.nextLine();

			ps = connection.prepareStatement("select * from quiz_questions where No = 1 ");
			ResultSet rs1 = ps.executeQuery();
			while (rs1.next()) {
				System.out.println(rs1.getString(2));
				System.out.println(rs1.getString(3));
				System.out.println(rs1.getString(4));
				System.out.println(rs1.getString(5));
				System.out.println(rs1.getString(6));
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 1");
			ResultSet rsanswer1 = ps.executeQuery();
			while (rsanswer1.next()) {
				System.out.println("Enter your answer : ");
				String ans = sc.next();
				String str = rsanswer1.getString(7);
				if (ans.equals(str)) {
					//System.out.println("Correct");
					correctAnswerCount++;
				} else {
					//System.out.println("Wrong");
					wrongAnswerCount++;
				}
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 2 ");
			ResultSet rs2 = ps.executeQuery();
			while (rs2.next()) {
				System.out.println(rs2.getString(2));
				System.out.println(rs2.getString(3));
				System.out.println(rs2.getString(4));
				System.out.println(rs2.getString(5));
				System.out.println(rs2.getString(6));
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 2");
			ResultSet rsanswer2 = ps.executeQuery();
			while (rsanswer2.next()) {
				System.out.println("Enter your answer : ");
				String ans = sc.next();
				String str = rsanswer2.getString(7);
				if (ans.equals(str)) {
					//System.out.println("Correct");
					correctAnswerCount++;
				} else {
					//System.out.println("Wrong");
					wrongAnswerCount++;
				}
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 3 ");
			ResultSet rs3 = ps.executeQuery();
			while (rs3.next()) {
				System.out.println(rs3.getString(2));
				System.out.println(rs3.getString(3));
				System.out.println(rs3.getString(4));
				System.out.println(rs3.getString(5));
				System.out.println(rs3.getString(6));
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 3 ");
			ResultSet rsanswer3 = ps.executeQuery();
			while (rsanswer3.next()) {
				System.out.println("Enter your answer : ");
				String ans = sc.next();
				String str = rsanswer3.getString(7);
				if (ans.equals(str)) {
					//System.out.println("Correct");
					correctAnswerCount++;
				} else {
					//System.out.println("Wrong");
					wrongAnswerCount++;
				}
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 4 ");
			ResultSet rs4 = ps.executeQuery();
			while (rs4.next()) {
				System.out.println(rs4.getString(2));
				System.out.println(rs4.getString(3));
				System.out.println(rs4.getString(4));
				System.out.println(rs4.getString(5));
				System.out.println(rs4.getString(6));
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 4 ");
			ResultSet rsanswer4 = ps.executeQuery();
			while (rsanswer4.next()) {
				System.out.println("Enter your answer : ");
				String ans = sc.next();
				String str = rsanswer4.getString(7);
				if (ans.equals(str)) {
					//System.out.println("Correct");
					correctAnswerCount++;
				} else {
					//System.out.println("Wrong");
					wrongAnswerCount++;
				}
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 5 ");
			ResultSet rs5 = ps.executeQuery();
			while (rs5.next()) {
				System.out.println(rs5.getString(2));
				System.out.println(rs5.getString(3));
				System.out.println(rs5.getString(4));
				System.out.println(rs5.getString(5));
				System.out.println(rs5.getString(6));
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 5 ");
			ResultSet rsanswer5 = ps.executeQuery();
			while (rsanswer5.next()) {
				System.out.println("Enter your answer : ");
				String ans = sc.next();
				String str = rsanswer5.getString(7);
				if (ans.equals(str)) {
					//System.out.println("Correct");
					correctAnswerCount++;
				} else {
					//System.out.println("Wrong");
					wrongAnswerCount++;
				}
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 6 ");
			ResultSet rs6 = ps.executeQuery();
			while (rs6.next()) {
				System.out.println(rs6.getString(2));
				System.out.println(rs6.getString(3));
				System.out.println(rs6.getString(4));
				System.out.println(rs6.getString(5));
				System.out.println(rs6.getString(6));
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 6 ");
			ResultSet rsanswer6 = ps.executeQuery();
			while (rsanswer6.next()) {
				System.out.println("Enter your answer : ");
				String ans = sc.next();
				String str = rsanswer6.getString(7);
				if (ans.equals(str)) {
					//System.out.println("Correct");
					correctAnswerCount++;
				} else {
					//System.out.println("Wrong");
					wrongAnswerCount++;
				}
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 7 ");
			ResultSet rs7 = ps.executeQuery();
			while (rs7.next()) {
				System.out.println(rs7.getString(2));
				System.out.println(rs7.getString(3));
				System.out.println(rs7.getString(4));
				System.out.println(rs7.getString(5));
				System.out.println(rs7.getString(6));
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 7 ");
			ResultSet rsanswer7 = ps.executeQuery();
			while (rsanswer7.next()) {
				System.out.println("Enter your answer : ");
				String ans = sc.next();
				String str = rsanswer7.getString(7);
				if (ans.equals(str)) {
					//System.out.println("Correct");
					correctAnswerCount++;
				} else {
					//System.out.println("Wrong");
					wrongAnswerCount++;
				}
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 8 ");
			ResultSet rs8 = ps.executeQuery();
			while (rs8.next()) {
				System.out.println(rs8.getString(2));
				System.out.println(rs8.getString(3));
				System.out.println(rs8.getString(4));
				System.out.println(rs8.getString(5));
				System.out.println(rs8.getString(6));
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 8 ");
			ResultSet rsanswer8 = ps.executeQuery();
			while (rsanswer8.next()) {
				System.out.println("Enter your answer : ");
				String ans = sc.next();
				String str = rsanswer8.getString(7);
				if (ans.equals(str)) {
					//System.out.println("Correct");
					correctAnswerCount++;
				} else {
					//System.out.println("Wrong");
					wrongAnswerCount++;
				}
			}
			ps = connection.prepareStatement("select * from quiz_questions where No = 9 ");
			ResultSet rs9 = ps.executeQuery();
			while (rs9.next()) {
				System.out.println(rs9.getString(2));
				System.out.println(rs9.getString(3));
				System.out.println(rs9.getString(4));
				System.out.println(rs9.getString(5));
				System.out.println(rs9.getString(6));
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 9 ");
			ResultSet rsanswer9 = ps.executeQuery();
			while (rsanswer9.next()) {
				System.out.println("Enter your answer : ");
				String ans = sc.next();
				String str = rsanswer9.getString(7);
				if (ans.equals(str)) {
					//System.out.println("Correct");
					correctAnswerCount++;
				} else {
					//System.out.println("Wrong");
					wrongAnswerCount++;
				}
			}
			ps = connection.prepareStatement("select * from quiz_questions where No = 10 ");
			ResultSet rs10 = ps.executeQuery();
			while (rs10.next()) {
				System.out.println(rs10.getString(2));
				System.out.println(rs10.getString(3));
				System.out.println(rs10.getString(4));
				System.out.println(rs10.getString(5));
				System.out.println(rs10.getString(6));
			}

			ps = connection.prepareStatement("select * from quiz_questions where No = 10 ");
			ResultSet rsanswer10 = ps.executeQuery();
			while (rsanswer10.next()) {
				System.out.println("Enter your answer : ");
				String ans = sc.next();
				String str = rsanswer10.getString(7);
				if (ans.equals(str)) {
					//System.out.println("Correct");
					correctAnswerCount++;
				} else {
					//System.out.println("Wrong");
					wrongAnswerCount++;
				}
			}

			System.out.println("--------------------Your Result Is Here : -----------------------");
			ps = connection.prepareStatement("select count(No) from quiz_questions");
			ResultSet set = ps.executeQuery();
			while (set.next()) {
				System.out.println("Total Questions : " + set.getString(1));
				//System.out.println("Correct Answered : " + correctAnswerCount);
				//System.out.println("Wrong Answered : " + wrongAnswerCount);
				System.out.println("Your Score : " + correctAnswerCount + " out of " + set.getString(1));
			}
			if (correctAnswerCount >= 8 && correctAnswerCount <= 10) {
				System.out.println("Your Grade : Class A ");
			} else if (correctAnswerCount >= 6 && correctAnswerCount < 8) {
				System.out.println("Your Grade : Class B ");
			} else if (correctAnswerCount == 5) {
				System.out.println("Your Grade : Class C ");
			} else {
				System.out.println("Your Grade : Class D");
			}

			ps = connection.prepareStatement("insert into student_data (ID,Name,student_score) values(?,?,?)");
			ps.setString(1, ID);
			ps.setString(2, Name);
			ps.setInt(3, correctAnswerCount);
			ps.executeUpdate();

		}

		catch (Exception e) {

			e.printStackTrace();
		}

	}

}

