public class Faculty {
    private Lab[] labs;
    //n is number of labs in a faculty
    int n;
    int currentLab;
    float facultyAvg;
    String name;

    public Faculty(int n, String name) {
        this.n = n;
        this.name = name;
        labs = new Lab[n];
    }


    public Lab[] getLabs() {
        return labs;
    }

    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }

    public float getFacultyAvg() {
        return facultyAvg;
    }

    public void setFacultyAvg(float facultyAvg) {
        this.facultyAvg = facultyAvg;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void facultyAvg() {
        float res = 0;
        for (int i = 0; i < n; i++) {
            res += labs[i].getAvg();
        }
        res = res / n;
        setFacultyAvg(res);
    }

    /*
    public void addLab(Student std, int grade, int cap, int n){
        for (int i = 0; i < n; i++){
            labs[i].enrollStudent();
        }

    }
*/
    public void enrollLabs(Lab lab) {
        if (currentLab < n) {
            labs[currentLab] = lab;
            currentLab++;
        } else {
            System.out.println("not more lab");
        }

    }


    public void print() {
        System.out.println("faculty name:" + name + "\t number of labs:" + n + "\t faculty avg:" + facultyAvg);

        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.println("lab" + (i + 1));
            labs[i].print();


        }

    }
}