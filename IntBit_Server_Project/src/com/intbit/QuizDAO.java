package com.intbit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class QuizDAO {
   @SuppressWarnings("unchecked")
public List<Quiz> getAllQuestions(){
      List<Quiz> QuizList = null;
      Quiz quiz = new Quiz("my name is?", "Mahesh", "Akash", "Saurabh", "pandit", "C");
      Quiz quiz1 = new Quiz("my friends name is?", "Mahesh", "Akash", "Saurabh", "pandit", "A");
      QuizList = new ArrayList<Quiz>();
      QuizList.add(quiz);
      QuizList.add(quiz1);
         
      return QuizList;
   }
   
}