package com.quizproject;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class QuestionsTable {
	PreparedStatement ps = null;
	Connection connection = null;

	public void insertQuestions() {
		try {
			DatabaseConnection con = new DatabaseConnection();
			connection = con.getConnection();
			ps = connection.prepareStatement(
					"insert into quiz_questions (No,Questions,Option1,Option2,Option3,Option4,Correct_ans) values (?,?,?,?,?,?,?)");
			ps.setInt(1, 1);
			ps.setString(2, "Q) Which of the follwing below live on the heap in java?");
			ps.setString(3, "A) Class");
			ps.setString(4, "B) Instance Variable");
			ps.setString(5, "C) Methods");
			ps.setString(6, "D) Objects");
			ps.setString(7, "D");
			ps.executeUpdate();

			ps.setInt(1, 2);
			ps.setString(2, "Q) Which of the following interface is used to declare core methods in java?");
			ps.setString(3, "A) Set");
			ps.setString(4, "B) EventListener");
			ps.setString(5, "C) Collection");
			ps.setString(6, "D) Comparator");
			ps.setString(7, "C");
			ps.executeUpdate();

			ps.setInt(1, 3);
			ps.setString(2, "Q) Which of these interface handle sequences?");
			ps.setString(3, "A) Set");
			ps.setString(4, "B) List");
			ps.setString(5, "C) Comparator");
			ps.setString(6, "D) Collection");
			ps.setString(7, "B");
			ps.executeUpdate();

			ps.setInt(1, 4);
			ps.setString(2, "Q) Which of this interface must contain a unique element?");
			ps.setString(3, "A) Set");
			ps.setString(4, "B) List");
			ps.setString(5, "C) Array");
			ps.setString(6, "D) Collection");
			ps.setString(7, "A");
			ps.executeUpdate();

			ps.setInt(1, 5);
			ps.setString(2, "Q) Automatic type conversion is not possible in which of the possible cases?");
			ps.setString(3, "A) byte to int");
			ps.setString(4, "B) int to long");
			ps.setString(5, "C) long to int");
			ps.setString(6, "D) short to int");
			ps.setString(7, "C");
			ps.executeUpdate();

			ps.setInt(1, 6);
			ps.setString(2, "Q) Which component is used to compile, debug and execute the java programs?");
			ps.setString(3, "A) JRE");
			ps.setString(4, "B) JIT");
			ps.setString(5, "C) JDK");
			ps.setString(6, "D) JVM");
			ps.setString(7, "C");
			ps.executeUpdate();

			ps.setInt(1, 7);
			ps.setString(2, "Q) Which environment variable is used to set the java path?");
			ps.setString(3, "A) MAVEN_Path");
			ps.setString(4, "B) JAVA");
			ps.setString(5, "C) JavaPATH");
			ps.setString(6, "D) JAVA_HOME");
			ps.setString(7, "D");
			ps.executeUpdate();

			ps.setInt(1, 8);
			ps.setString(2, "Q) Which of these keywords is used to define interfaces in Java?");
			ps.setString(3, "A) intf");
			ps.setString(4, "B) Intf");
			ps.setString(5, "C) interface");
			ps.setString(6, "D) Interface");
			ps.setString(7, "C");
			ps.executeUpdate();

			ps.setInt(1, 9);
			ps.setString(2, "Q) Which one of the following is not an access modifier?");
			ps.setString(3, "A) protected");
			ps.setString(4, "B) void");
			ps.setString(5, "C) public");
			ps.setString(6, "D) private");
			ps.setString(7, "B");
			ps.executeUpdate();

			ps.setInt(1, 10);
			ps.setString(2, "Q) Which of these packages contains the exception Stack Overflow in Java?");
			ps.setString(3, "A) java.io");
			ps.setString(4, "B) java.util");
			ps.setString(5, "C) java.lang");
			ps.setString(6, "D) java.system");
			ps.setString(7, "C");
			ps.executeUpdate();

			connection.close();
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
