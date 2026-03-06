class Staff {
    protected String name;
    
    public Staff(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Staff Name: " + name);
    }
}

class Employee extends Staff {
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    void showSalary() {
        System.out.println("Base Salary: " + baseSalary);
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    void calculateTotalPay() {
        displayInfo();
        double total = baseSalary + bonus;
        System.out.println("Total Pay (Base + Bonus): " + total);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 8000.0, 2000.0);
        mgr.calculateTotalPay();
    }
}