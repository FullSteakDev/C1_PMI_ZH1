package reg;

public class Exam extends Grades {
    public Exam(String subject, int grade) {
        super(subject, grade);
    }

    public void registGradeToSubject(Grades gradesParameter) {
        boolean contains = false;
        for (Grades grades : gradesList) {
            if (grades.equals(gradesParameter.getGrade())) {
                contains = true;
            }
        }
        if (!contains) {
            super.gradesList.add(new Grades(gradesParameter.getSubject(), gradesParameter.getGrade()));
        }
    }
}