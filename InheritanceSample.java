// Main class to test the hierarchy
public class InheritanceSample {
    public static void main(String[] args) {
        // Creating Student object
        Student student = new Student("Nik", "Brgy. 1", "Information Technology", 2);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Address: " + student.getAddress());
        System.out.println("Student Program: " + student.getProgram());
        System.out.println("Student Year: " + student.getYear());
        System.out.println(student.toString());

        // Creating Staff object
        Staff staff = new Staff("Raniel", "San Piro", "BSU", 19.99);
        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Address: " + staff.getAddress());
        System.out.println("Staff School: " + staff.getSchool());
        System.out.println("Staff Salary: PHP " + staff.getSalary());
        System.out.println(staff.toString());
    }
}