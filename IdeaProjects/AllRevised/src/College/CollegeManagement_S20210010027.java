package College;

class Student{
    private String name;
    private String rollNumber;
    private float cgpa;
    private String instituteName;

    public Student(String name, String rollNumber, float cgpa, String instituteName) {
        setName(name);
        setRollNumber(rollNumber);
        setCgpa(cgpa);
        setInstituteName(instituteName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }
    public void printDetails(){
        System.out.println("Name:            "+getName());
        System.out.println("Roll Number:     "+getRollNumber());
        System.out.println("CGPA:            "+getCgpa());
        System.out.println("Institute Name:  "+getInstituteName());
    }
}

class Teacher{
    private String name;
    private String departmentName;
    private float salary;

    public Teacher(String name, String departmentName, float salary) {
        setName(name);
        setDepartmentName(departmentName);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void printDetails(){
        System.out.println("Name:            "+getName());
        System.out.println("Department Name: "+getDepartmentName());
        System.out.println("Salary:          "+getSalary());
    }
}

public class CollegeManagement_S20210010027 {
    public static void main(String[] args) {

        Student student1 = new Student("Anushthan", "S20210010027", 9.1f, "IIITS");

        Teacher teacher1 = new Teacher("abc", "OOP", 100000);

        student1.printDetails();
        teacher1.printDetails();
    }
}
