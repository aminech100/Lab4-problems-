package student;

public class Student extends Person {
     private String cne;
     private Major major;

     public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
         super(prenom, nom, telephone, email);
         this.cne = cne;
         this.major = null;
         if (major != null) {
             major.addStudent(this);
             this.major = major;
         }
     }
     public Student(String nom, String prenom, String telephone, String email, String cne) {
         this(nom, prenom, telephone, email, cne, Major.getDefaultMajor());
     }
    public Student() {
        this("", "", "", "", "");
    }

     // Getters
     public String getCne() {
         return cne;
     }

    public Major getMajor() {
        return major;
    }

    // Setters
    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setMajor(Major newMajor) {
        if (this.major == newMajor) {
            return;
        }

        Major oldMajor = this.major;

        if (oldMajor != null) {
            this.major = null;
            oldMajor.removeStudent(cne);
        }

        if (newMajor != null) {
            newMajor.addStudent(this);
            this.major = newMajor;
        }
    }

    public String getFullNameFormatted() {
        return String.format("%s, %s", getSecondName().toUpperCase(), getFirstName());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",
                cne, getSecondName(), getFirstName());
    }

}

