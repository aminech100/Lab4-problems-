package student;

public class Major {
     private static int nextId = 1;
     private int id;
     private String code;
     private String name;
     private Student[] students;
     private int studentCount;
     private static final Major DEFAULT_MAJOR = new Major("23", "Computer Science");

     private static final int CAPACITY = 50;

     public Major(String code, String name) {
         this.id = nextId++;
         this.code = code;
         this.name = name;
         this.students = new Student[CAPACITY];
         this.studentCount = 0;
     }

     public Major(){
         this("23", "Computer Science");
     }

     //Method to add a student
     public void addStudent(Student s) {
        if (s == null){
            return;
        }
        if (studentCount >= CAPACITY){
            System.out.println("Major is full");
            return;
        }
        students[studentCount] = s;
        studentCount++;
     }

     //Getters
    public int getId(){return id;}
    public String getCode(){return code;}
    public String getName() {return name;}
    public Student[] getStudents() {return students.clone();}
    public int getStudentCount() {return studentCount;}
    public static Major getDefaultMajor(){return DEFAULT_MAJOR;}

    //Setters
    public void setCode(String code){this.code = code;}
    public void setName(String name){this.name = name;}

     //Display all students in the major
     public void displayStudents() {
        System.out.println("The list of students in the " + name + " major is: \n");
        System.out.println(getStudentListAsString());
     }

    public Student findStudentByCNE(String cne){
         if (cne == null){
             return null;
         }
         for (int i=0; i<studentCount; i++){
             if (cne.equals(students[i].getCne())){
                 return students[i];
             }
         }
         return null;
    }

    public boolean removeStudent(String cne){
         Student s = findStudentByCNE(cne);

         if (s == null){
             return false;
         }

         for (int i=0; i<studentCount; i++){
             if (students[i] == s){
                for (int j=i; j<studentCount-1; j++){
                    students[j] = students[j+1];
                }
                students[studentCount-1] = null;
                studentCount--;
                return true;
             }
         }
         return false;
    }

    public double getOccupancyRate(){
         return studentCount * 100.0 / CAPACITY;
    }

    public String getStudentListAsString() {
         StringBuilder sb = new StringBuilder();

         for (int i=0; i<studentCount; i++){
             if (i>0){
                 sb.append("\n");
             }
             sb.append(i + 1).append(". ").append(students[i]);
         }
         return sb.toString();
    }

    @Override
    public String toString(){
         return String.format(
                 "Major{id=%d, code='%s', name='%s', students=%d/%d}",
                 id, code, name, studentCount, CAPACITY);

    }
}
