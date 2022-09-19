package com.quizproject;

import java.sql.SQLException;


public class Main
  {

        public static void main(String[] args) throws SQLException 
        {
        QuestionsTable qt = new QuestionsTable();
        qt.insertQuestions();
		ShowQuiz sq = new ShowQuiz();
		sq.getQuiz();

	    }

}
