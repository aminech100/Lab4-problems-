package Instructor;

public class Instructor {
    private String employeeNumber;
    private String lastName;
    private String firstName;
    private String email;
    private String phone;
    private Subject[] subjects;
    private int subjectCount;
    private static final int MAX_SUBJECTS = 50;

    // I added these last three variables in order to represent the one-to-many relationship between the two classes Instructor and Subject.
    // An Instructor can take many Subjects. I suppose that MAX_SUBJECTS is 50.
    // It will be the same thing as the Student-Major relationship
    // I added a method called addSUbject to add a subject taken by an instructor
    // I also added a getter for the subjectCount

    public Instructor(String employeeNumber, String lastName, String firstName, String email, String phone) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;

        this.subjects = new Subject[MAX_SUBJECTS];
        this.subjectCount = 0;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public int getSubjectCount() {
        return subjectCount;
    }

    public String cleanEmployeeNumber() {
        return employeeNumber.trim().replace(" ", "");
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                employeeNumber, lastName, firstName
        );
    }

    public String toCard() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor\n");
        sb.append("\\----------\n");
        sb.append("Employee #: ").append(employeeNumber).append("\n");
        sb.append("Name : ").append(lastName).append(", ").append(firstName).append("\n");
        sb.append("Email : ").append(email).append("\n");
        sb.append("Phone : ").append(phone);
        return sb.toString();
    }

    public String displayName() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null && !lastName.isEmpty()) {
            sb.append(lastName);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append(firstName);
        }
        return sb.toString();
    }

    public void addSubject(Subject subject) {
        if (subject == null || subjectCount >= MAX_SUBJECTS) {
            return;
        }

        subjects[subjectCount] = subject;
        subjectCount++;
    }

}
