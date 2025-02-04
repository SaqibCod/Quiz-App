package com.saq.quizapp.service;

import com.saq.quizapp.dao.QuestionDao;
import com.saq.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {


    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestion() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }

    public String deleteQuestion(Integer questionId) {
        questionDao.deleteById(questionId);
        return "delete";
    }
}
