import java.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
    private int studentId;
    private String studentName;
    private int courseId;

    public Student(int studentId, String studentName, int courseId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", courseId=" + courseId +
                '}';
    }

    public static Set<Student> findDuplicateEntries(List<Student> students) {
        Set<Integer> seenStudentIds = new HashSet<>();
        Set<Student> duplicateStudents = new HashSet<>();

        for (Student student : students) {
            if (!seenStudentIds.add(student.getStudentId())) {
                duplicateStudents.add(student);
            }
        }

        return duplicateStudents;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1001, "Dean", 111));
        students.add(new Student(1002, "Harley", 112));
        students.add(new Student(1003, "Franklin", 113));
        students.add(new Student(1005, "Arden", 113));
        students.add(new Student(1100, "Juliet", 112));
        students.add(new Student(1003, "Franklin", 111));
        students.add(new Student(1001, "Dean", 114));

        Set<Student> duplicateStudents = findDuplicateEntries(students);

        System.out.println("Students who have applied for re-evaluation in more than one subject:");
        for (Student student : duplicateStudents) {
            System.out.println(student);
        }
    }
}
