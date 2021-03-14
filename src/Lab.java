public class Lab {
    private Student[] students;
    private float avg;
    private String day;
    private int capacity;
    private int currentSize;

    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
        students = new Student[capacity];
    }

    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!");
        }

    }
/*
    public void addStudent(String firstName, String lastName, String id, int grade) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!");
        }

    }
*/
    public void print() {
        System.out.println("avg:" + avg + "\t day:" + day + "\t capacity:" + capacity + "\t currentSize:" + currentSize);
        System.out.println("");

        for (int i = 0; i < currentSize; i++) {
            students[i].print();

        }
        System.out.println("************************");
    }

    public float labAvg() {
        float res = 0;
        for (int i = 0; i < currentSize; i++) {
            res += students[i].getGrade();
        }
        res = res / currentSize;
        return res;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public float getAvg() {
        return avg;
    }

    public void calculateAvg(int avg) {
        //this.avg = avg;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
