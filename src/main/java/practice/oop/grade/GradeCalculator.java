package practice.oop.grade;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        // (학점수 X 교과목 평점)의 합계.
        double multipleCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        // 이수한 과목의 총 학점 수.
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return multipleCreditAndCourseGrade / totalCompletedCredit;
    }
}
