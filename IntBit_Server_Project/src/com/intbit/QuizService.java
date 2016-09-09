package com.intbit;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/QuizService")
public class QuizService {
	
	QuizDAO quizDao = new QuizDAO();

	   @GET
	   @Path("/quiz")
	   @Produces(MediaType.APPLICATION_XML)
	   public List<Quiz> getQuiz(){
	      return quizDao.getAllQuestions();
	   }	

}
