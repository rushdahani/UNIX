/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rushd
 */import java.util.Scanner;

class Student {
    
    private String usn;
    private String name;
    private String branch;
    private String phone;
    public Student(String usn, String name, String branch, String phone) {
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }


    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getPhone() {
        return phone;
    }
    public void displayStudentDetails()
 {
        System.out.printf("%-15s %-20s %-15s %-15s\n", usn, name, branch, phone);
    }
}


public class StudentDetails {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        
        Student[] students = new Student[n];


        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            
            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Branch: ");
            String branch = scanner.nextLine();

            System.out.print("Enter Phone: ");
            String phone = scanner.nextLine();

                        students[i] = new Student(usn, name, branch, phone);
        }

        
        System.out.println("\nStudent Details: ");
        System.out.printf("%-15s %-20s %-15s %-15s\n", "USN", "Name", "Branch", "Phone"); 

        for (Student student : students)
 {
            student.displayStudentDetails();
        }


        scanner.close();
    }

}
