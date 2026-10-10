package Instructor;

public class Subject {
    private String code;
    private String title;

    public Subject(String code, String title) {
        this.code = code;
        this.title = title;
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
