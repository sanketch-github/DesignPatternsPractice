package creational_design_pattern.singleton_pattern;



class Employee {
    private static Employee instance = new Employee();
    private Employee(){
    }
    public static Employee getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Employee class");
    }
}

public class SingletonPattern {

    public static void main(String[] args) {

        Employee object = Employee.getInstance();
        object.showMessage();

    }
}
