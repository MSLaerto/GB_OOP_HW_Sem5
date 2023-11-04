import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Teacher teacher = new Teacher(1, "AAA BBB");

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Stud 1"));
        students.add(new Student(2, "Stud 2"));

        StudyGroup studyGroup = controller.createStudyGroupWithTeacherAndStudents(teacher, students);

        System.out.println("Teacher: " + studyGroup.getTeacher().getName());
        System.out.println("Students:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getName());
        }
    }
}
