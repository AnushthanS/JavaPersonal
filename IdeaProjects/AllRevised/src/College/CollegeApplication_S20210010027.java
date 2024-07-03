package College;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Person{
    private String name;
    private String aadharNumber;
    private String gender;
    private String dateOfBirth;
    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    private String instituteName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Person(){}

    public int calculateAge() {
        System.out.println("Invoked calculateAge");
        StringTokenizer stringTokenizer = new StringTokenizer(getDateOfBirth(), "-", false);
        stringTokenizer.nextToken();
        int month = Integer.parseInt(stringTokenizer.nextToken());
        int year = Integer.parseInt(stringTokenizer.nextToken());
        return month > 9 ? 2021 - year : 2022 - year;
    }

    public void print(){
        System.out.println("Name           : "+getName());
        System.out.println("Aadhar Number  : "+getAadharNumber());
        System.out.println("Gender         : "+getGender());
        System.out.println("Date of birth  : "+getDateOfBirth());
        System.out.println("Age            : "+calculateAge());
        System.out.println("Institute Name : "+getInstituteName());
    }
}

class Student extends Person{
    private String rollNumber, department, specialization;
    private ArrayList<String> subjects;
    private ArrayList<String> grades;

    public Student() {
        super();
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }


    public String getDepartment() {
        return department;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<String> grades) {
        this.grades = grades;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void admitStudent(String name, String aadharNumber, String gender, String dateOfBirth, String instituteName){
        super.setName(name);
        super.setAadharNumber(aadharNumber);
        super.setGender(gender);
        super.setDateOfBirth(dateOfBirth);
        super.setInstituteName(instituteName);

        System.out.println("Student successfully admitted");
    }

    public void enrollStudent(String department, String specialization, ArrayList<String> subjects){
        this.setDepartment(department);
        this.setSpecialization(specialization);
        this.setSubjects(subjects);
        System.out.println("Student successfully enrolled");
    }

    public void print(){
        super.print();
        System.out.println("Roll Number    : "+getRollNumber());
        System.out.println("Department name: "+getDepartment());
        System.out.println("Specialization : "+getSpecialization());
        System.out.println("Subjects       : "+getSubjects().toString());
        System.out.println("Grades         : "+getGrades().toString());
    }
}

class Faculty extends Person{
    private int salary;
    private String empId, department, specialization;

    public Faculty() {
        super();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }


    public void joinFaculty(String name, String aadharNumber, String gender, String dateOfBirth,String empId, String instituteName){
        super.setName(name);
        super.setAadharNumber(aadharNumber);
        super.setGender(gender);
        super.setDateOfBirth(dateOfBirth);
        super.setInstituteName(instituteName);
        this.setEmpId(empId);
        System.out.println("Faculty joined");
    }

    public void assignFaculty(String department, String specialization, int salary){
        this.setDepartment(department);
        this.setSpecialization(specialization);
        this.setSalary(salary);
        System.out.println("Faculty assigned a department");
    }
    public void print(){
        super.print();
        System.out.println("EmployeeId     : "+getEmpId());
        System.out.println("Department name: "+getDepartment());
        System.out.println("Specialization : "+getSpecialization());
        System.out.println("Salary         : "+getSalary());
    }
}

public class CollegeApplication_S20210010027 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name, aadhar, gender, dob, institute, dept, spec, empid;
        int sal;
        //Partially hardcoded input
        ArrayList<String> subjects = new ArrayList<>();
        ArrayList<String> grade1 = new ArrayList<>();
        ArrayList<String> grade2 = new ArrayList<>();

        subjects.add("DSA");
        subjects.add("CA");
        subjects.add("PS");
        subjects.add("SS");

        grade1.add("O");
        grade1.add("O");
        grade1.add("B");
        grade1.add("B");

        grade2.add("O");
        grade2.add("A");
        grade2.add("A");
        grade2.add("B");

        Student[] students = new Student[2];
        Faculty[] faculties = new Faculty[2];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            faculties[i] = new Faculty();
        }

        System.out.println("STUDENT");
        int i = 0;
        for(Student student: students){
            System.out.print("Enter name:");
            name = bufferedReader.readLine();

            System.out.print("Enter aadhar number:");
            aadhar = bufferedReader.readLine();

            System.out.print("Enter gender:");
            gender = bufferedReader.readLine();

            System.out.print("Enter date of birth in the format dd-mm-yyyy:");
            dob = bufferedReader.readLine();

            System.out.print("Enter Institute name:");
            institute = bufferedReader.readLine();

            student.admitStudent(name, aadhar, gender, dob, institute);

            System.out.print("Enter department name:");
            dept = bufferedReader.readLine();

            System.out.print("Enter specialization:");
            spec = bufferedReader.readLine();

            student.enrollStudent(dept, spec, subjects);

            student.setRollNumber("S2021001000"+ (i+1));
            i++;
        }
        students[0].setGrades(grade1);
        students[1].setGrades(grade2);

        System.out.println("\nFACULTY");
        for (Faculty faculty : faculties) {
            System.out.print("Enter name:");
            name = bufferedReader.readLine();

            System.out.print("Enter aadhar number:");
            aadhar = bufferedReader.readLine();

            System.out.print("Enter gender:");
            gender = bufferedReader.readLine();

            System.out.print("Enter date of birth in the format dd-mm-yyyy:");
            dob = bufferedReader.readLine();
            System.out.print("Enter employee id:");
            empid = bufferedReader.readLine();

            System.out.print("Enter Institute name:");
            institute = bufferedReader.readLine();

            faculty.joinFaculty(name, aadhar, gender, dob, empid, institute);

            System.out.print("Enter department name:");
            dept = bufferedReader.readLine();

            System.out.print("Enter specialization:");
            spec = bufferedReader.readLine();

            System.out.print("Enter salary:");
            sal = Integer.parseInt(bufferedReader.readLine());

            faculty.assignFaculty(dept, spec, sal);
        }

        for(Student student: students) {
            student.print();
            System.out.println();
        }

        for(Faculty faculty: faculties) {
            faculty.print();
            System.out.println();
        }
    }
}
