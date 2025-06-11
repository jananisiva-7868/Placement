public class Employee {
    String name;
    double basicSalary;

    
    Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

   
    double calculateSalary() {
        double hra = 0.20 * basicSalary; // 20% of basic
        double da = 0.10 * basicSalary; // 10% of basic
        return basicSalary + hra + da;
    }

    
    void display() {
        double totalSalary = calculateSalary();
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + totalSalary);
    }

    
    public static void main(String[] args) {
        Employee emp = new Employee("John", 20000);
        emp.display();
    }
}
