package practice.oop.grade;

import java.util.List;

/**
 * 1 급 컬렉션 : List 형태로 된 필드만 가진 클래스.
 */
public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
//        double multipleCreditAndCourseGrade = 0;
//
//        for (Course course : courses) {
//            multipleCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//
//        return multipleCreditAndCourseGrade;

        // 아래와 같이 stream으로 리펙토링 가능.
        return courses.stream().mapToDouble(Course::multiplyCreditAndCourseGrade).sum();
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream().mapToInt(Course::getCredit).sum();
    }
}
