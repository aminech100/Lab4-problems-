package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
    }

    public Person(){
        this("","","","");
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getSecondName() { return secondName; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return String.format("%d %s %s", id, secondName, firstName);
    }
}

