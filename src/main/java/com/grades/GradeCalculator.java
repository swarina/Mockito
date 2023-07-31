package com.grades;

import java.util.ArrayList;
import java.util.List;

public class GradeCalculator {
    public List<String> getGrades(List<Integer> scores) {
        List<String> grades = new ArrayList<>();
        for(int score : scores) {
            grades.add(computeGrade(score));
        }

        return grades;
    }

    private String computeGrade(int score) {
       return (score > 40) ? "pass" : "fail";
    }
}
