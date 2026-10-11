package Instructor;

public class Subject {
    private String code;
    private String title;
    private Instructor instructor;

    //Instructor is an attribute since each Subject has exactly one Instructor

    public Subject(String code, String title, Instructor instructor) {
        this.code = code;
        this.title = title;
        this.instructor = instructor;

        // We have to add this subject to the instructor's list of subjects
        if (instructor != null){
            instructor.addSubject(this);
        }

    }

    public String normalizedCode() {
        return code.trim().toUpperCase();
    }

    public String properTitle() {
        String[] words = title.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) {
                continue;
            }

            sb.append(words[i].substring(0, 1).toUpperCase());
            sb.append(words[i].substring(1).toLowerCase());

            if (i < words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString().trim().replaceAll(" +", " ");
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public boolean isIntroCourse() {
        return (title != null && title.toLowerCase().contains("intro"))
                || (code != null && code.toUpperCase().startsWith("INTRO-"));
    }

    public String syllabusLine(Instructor instructor) {
        StringBuilder sb = new StringBuilder();

        sb.append(code)
                .append(" - ")
                .append(title)
                .append(" (Instructor: ")
                .append(instructor.getLastName())
                .append(" ")
                .append(instructor.getFirstName())
                .append(")");

        return sb.toString();
    }


}
