package teacher_students;

public class Main_teacher_students {
    public static void main(String[] args) {
        Students student = new Students();
        Teacher teacher = new Teacher();
        student.question(teacher);
        teacher.teach(student);
        //teacher.answer();
    }
}
