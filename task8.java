package Placement;
//[Create an array list of students and display using an iterator]
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class task02 {
//    public static void main(String[] args) {        
//        ArrayList<String> students = new ArrayList<>();        
//        students.add("Darshana");
//        students.add("Janani");
//        students.add("Rudhra");
//        students.add("Rashmitha");
//        students.add("Harini");
//        System.out.println("List of students:");
//        Iterator<String> iterator = students.iterator();
//        while (iterator.hasNext()) {
//            String student = iterator.next();
//            System.out.println(student);
//        }
//    }
//}




//[Use a hashset to store a list of unique mail address]
//import java.util.HashSet;
//
//public class task02 {
//    public static void main(String[] args) {
//        HashSet<String> emailSet = new HashSet<>();
//        emailSet.add("darshana@example.com");
//        emailSet.add("janani@example.com");
//        emailSet.add("rudhra@example.com");
//        System.out.println("Unique email addresses:");
//        for (String email : emailSet) {
//            System.out.println(email);
//        }
//    }
//}




//[Use hashmap to store a name mark and compute average]
//import java.util.HashMap;
//
//public class task02{
//    public static void main(String[] args) {
//        HashMap data = new HashMap();
//        data.put("John", 80);
//        data.put("Mary", 70);
//        data.put("Alex", 90);
//        int total = 0;
//        int count = 0;
//        for (Object mark : data.values()) {
//            total += (int) mark;
//            count++;
//        }
//        int average = total / count;
//        System.out.println("Average mark: " + average);
//    }
//}




//Use an array list for students , use a hashmap to assign multiple courses per student , include functionality to add remove and display students and their enrolled courses , use iterators to loop through data]
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Scanner;
//
//public class task02 {
//    public static void main(String[] args) {
//        ArrayList<String> students = new ArrayList<>();
//        HashMap<String, ArrayList<String>> courses = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//        int choice;
//        do {
//            System.out.println("\n1. Add Student");
//            System.out.println("2. Remove Student");
//            System.out.println("3. Display All");
//            System.out.println("4. Exit");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//            sc.nextLine(); 
//            if (choice == 1) {
//                System.out.print("Enter student name: ");
//                String name = sc.nextLine();
//                students.add(name);
//                ArrayList<String> courseList = new ArrayList<>();
//                System.out.print("Enter number of courses: ");
//                int n = sc.nextInt();
//                sc.nextLine();
//                for (int i = 0; i < n; i++) {
//                    System.out.print("Enter course " + (i + 1) + ": ");
//                    String course = sc.nextLine();
//                    courseList.add(course);
//                }
//                courses.put(name, courseList);
//                System.out.println("Student added.");
//            } else if (choice == 2) {
//                System.out.print("Enter student name to remove: ");
//                String name = sc.nextLine();
//                students.remove(name);
//                courses.remove(name);
//                System.out.println("Student removed.");
//            } else if (choice == 3) {
//                System.out.println("\nStudent List:");
//                Iterator<String> it = students.iterator();
//                while (it.hasNext()) {
//                    String student = it.next();
//                    System.out.println("Student: " + student);
//                    ArrayList<String> cs = courses.get(student);
//                    if (cs != null) {
//                        Iterator<String> cIt = cs.iterator();
//                        while (cIt.hasNext()) {
//                            System.out.println("  Course: " + cIt.next());
//                        }
//                    }
//                }
//            } else if (choice != 4) {
//                System.out.println("Invalid choice.");
//            }
//
//        } while (choice != 4);
//        sc.close();
//    }
//}
