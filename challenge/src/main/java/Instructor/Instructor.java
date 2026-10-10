package Instructor;

public class Instructor {
    private String employeeNumber;
    private String lastName;
    private String firstName;
    private String email;
    private String phone;

    public Instructor(String employeeNumber, String lastName, String firstName, String email, String phone) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
    }

    public String getLastName(){return lastName;}
    public String getFirstName(){return firstName;}

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

}
