package student;

public class Test {
    public static void main(String[] args) {


        // Display computer science students
        Major cs = Major.getDefaultMajor();
        Major ai = new Major("24", "Artificial Intelligence");

        Student s1 = new Student(
                "SAFI", "Amal", "0611111111",
                "amal@example.com", "22885676");

        Student s2 = new Student(
                "ALAMI", "Samir", "0622222222",
                "samir@example.com", "23585976");

        Student s3 = new Student(
                "BENALI", "Youssef", "0633333333",
                "youssef@example.com", "24567891", ai);

        cs.displayStudents();

        System.out.println("\nFormatted name:");
        System.out.println(s1.getFullNameFormatted());

        System.out.println("\nSearch result:");
        System.out.println(cs.findStudentByCNE("23585976"));

        System.out.println("\nStudent count: "
                + cs.getStudentCount());

        System.out.printf("Occupancy rate: %.1f%%%n",
                cs.getOccupancyRate());

        System.out.println("\nStudent list:");
        System.out.println(cs.getStudentListAsString());

        System.out.println("\nRemoving Amal:");
        System.out.println(cs.removeStudent("22885676"));

        cs.displayStudents();

        System.out.println("\nMissing student:");
        System.out.println(cs.findStudentByCNE("00000000"));
    }
}

