package OOPS;
class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Amit";
        emp.id = 101;
        emp.salary = 45000.00;
        emp.displayDetails();
    }
}
