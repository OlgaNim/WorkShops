public class Workshop6 {
    public static void main(String[] args) {
        Student student = new Student();
        student.toAttendUniversity();
        work(student);

        Docent docent = new Docent();
        docent.toAttendUniversity();
        work(docent);
    }

    public static void work(PersonAttendingUniversity person){
        person.answer();
    }
}
