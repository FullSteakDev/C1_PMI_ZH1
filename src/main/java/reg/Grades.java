package reg;

import java.util.ArrayList;

public class Grades {
    private String subject;
    private int grade;

    public Grades(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    protected ArrayList<Grades> gradesList = new ArrayList<>();

    public String addSubject() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < gradesList.size(); i++) {
            builder.append(gradesList.get(i).getSubject());
            if (i < gradesList.size() - 1) {
                builder.append("\r\n");
            }
        }
        return builder.toString();
    }

    public static void getGrades(ArrayList<Grades> gradesList) {
        for (Grades grades : gradesList) {
            System.out.println((gradesList.indexOf(grades) + 1) + ". " + grades.getSubject() + " "
                    + grades.getGrade());
        }
    }

    public String dropSubject() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < gradesList.size(); i++) {
            builder.delete(gradesList.remove(i).getSubject());
            if (i < gradesList.size() - 1) {
                builder.append("\r\n");
            }
        }
        return builder.toString();
    }

    @Override
    public String toString () {
        return subject;
    }
}