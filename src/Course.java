public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double note1,note2,noteTotal;
    double noteRate1,noteRate2;

    public Course(String name, String code, String prefix,Double noteRate1) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.noteTotal =0;
        this.note1=0;
        this.note2=0;
        this.noteRate1=noteRate1;
        this.noteRate2=1-noteRate1;
    }

    public void addExamNotes(int note1,int note2){

        this.note1=note1*noteRate1;
        this.note2=note2*noteRate2;
        this.noteTotal=this.note1+this.note2;

    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
