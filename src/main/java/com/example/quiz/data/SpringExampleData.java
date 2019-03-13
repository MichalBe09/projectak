package com.example.quiz.data;

import com.example.quiz.repository.TestRepository;
import com.example.quiz.model.Question;
import com.example.quiz.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // sprawia ze klasa bedzie zarzadzana przez kontener springa
public class SpringExampleData implements CommandLineRunner {

    @Autowired
    private TestRepository testRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
        Test test = new Test("Test wiedzy z Javy");

        test.addQuestion(new Question("Czy java ma klasy ?", true));
        test.addQuestion(new Question("Czy java ma intejfejsy ?", true));
        test.addQuestion(new Question("Czy java ma klase integer ?", false));
        test.addQuestion(new Question("Czy java ma destruktor ?", false));
        testRepository.save(test);
    }
}