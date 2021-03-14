public class Run {

    public static void main(String[] args) {
        // write your code here
        Student std1 = new Student("Ehsan", "Edalat", "9723073310");
        std1.setGrade(15);

        Student std2 = new Student("Maryam", "Kermanshahani", "12345601");
        std2.setGrade(20);

        Student std3 = new Student("Mohadese", "Kermanshahani", "7894561120");
        std3.setGrade(19);


        Lab lab1 = new Lab(30, "2shanbe");
        Lab lab2 = new Lab(10, "1shanbe");


        lab1.enrollStudent(std1);

        lab1.enrollStudent(std2);

        lab2.enrollStudent(std3);


        Faculty faculty = new Faculty(2, "computer");
        faculty.enrollLabs(lab1);
        faculty.enrollLabs(lab2);

        faculty.print();

        //lab1.print();

/*
        std1.print();
        std1.setGrade(15);

        std2.print();
        std2.setGrade(20);

        std3.print();
        std2.setGrade(19);
*/

    }

}
