public class Student {

    //fields
    //student's firstname
    private String firstName;

    //student's lastname
    private String lastName;

    //student's id
    private String id;

    //student's grade
    private int grade;


    //constructor
    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        grade = 0;

    }


    //methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void print() {
        System.out.println(firstName + " " + lastName + ", student ID: " + id + ", grade: " + grade);

    }
}
