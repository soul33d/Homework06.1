package com.homelearning.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        List<String> questions = new ArrayList<>();
        questions.add("What course are you currently studying?");
        questions.add("What is the reason for choosing this item?");
        questions.add("The complexity of the subject met your expectations?");
        questions.add("Would you sign up for another subject taught by the same lecturer?");
        questions.add("Would you recommend this item to other students?");
        questions.add("Do you have any idea how to improve the subject?");
        Form courseQualityForm = new Form
                ("Course Quality", questions, "Ivan Dulin, PM, blablabla@gmail.com");

        Form copied = courseQualityForm.copy();
        System.out.println(courseQualityForm + "\n");
        System.out.println(copied + "\n");
    }
}
