public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT",0.30);
        Course fizik = new Course("Fizik", "FZK101", "FZK",0.40);
        Course kimya = new Course("Kimya", "KMY101", "KMY",0.20);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.mat.addExamNotes(90,60);
        s1.fizik.addExamNotes(80,80);
        s1.kimya.addExamNotes(70,60);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.mat.addExamNotes(70,60);
        s2.fizik.addExamNotes(60,80);
        s2.kimya.addExamNotes(90,60);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.mat.addExamNotes(100,60);
        s3.fizik.addExamNotes(100,80);
        s3.kimya.addExamNotes(50,50);
        s3.isPass();
    }
}
