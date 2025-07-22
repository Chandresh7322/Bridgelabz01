import java.util.*;

abstract class CourseType {
    String title;
    CourseType(String title) {
        this.title = title;
    }
    String getTitle() {
        return title;
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String title) {
        super(title);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) {
        super(title);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String title) {
        super(title);
    }
}

class Course<T extends CourseType> {
    T type;
    Course(T type) {
        this.type = type;
    }
    T getType() {
        return type;
    }
}

class CourseManager {
    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getTitle());
        }
    }
}

public class Course Management System {
    public static void main(String[] args) {
        List<ExamCourse> examCourses = new ArrayList<>();
        examCourses.add(new ExamCourse("Mathematics"));
        examCourses.add(new ExamCourse("Physics"));

        List<AssignmentCourse> assignmentCourses = new ArrayList<>();
        assignmentCourses.add(new AssignmentCourse("History"));
        assignmentCourses.add(new AssignmentCourse("Sociology"));

        List<ResearchCourse> researchCourses = new ArrayList<>();
        researchCourses.add(new ResearchCourse("AI Research"));
        researchCourses.add(new ResearchCourse("Quantum Computing"));

        System.out.println("Exam-Based Courses:");
        CourseManager.displayCourses(examCourses);

        System.out.println("Assignment-Based Courses:");
        CourseManager.displayCourses(assignmentCourses);

        System.out.println("Research-Based Courses:");
        CourseManager.displayCourses(researchCourses);
    }
}
