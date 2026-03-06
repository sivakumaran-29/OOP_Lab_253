class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println("Developer is writing code.");
    }
}

class Manager extends Employee {
    void meeting() {
        System.out.println("Manager is in a meeting.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Manager mgr = new Manager();
        
        dev.work();
        dev.code();
        
        mgr.work();
        mgr.meeting();
    }
}