public class Main {
    public static void main(String[] args){
        Employee[] employee = new Employee[5];

        employee[0] = new Employee("Ivanov Ivan", "Engineer", "ivan@mailbox.com", "892312312", 30000, 30);
        employee[1] = new Employee("Petrov Petr", "Manager", "petr@mailbox.com", "892312313", 40000, 22);
        employee[2] = new Employee("Vasilev Vasiliy", "Operator", "vasiliy@mailbox.com", "892312314", 45000, 42);
        employee[3] = new Employee("Olgina Olga", "Designer", "olga@mailbox.com", "892312315", 32000, 26);
        employee[4] = new Employee("Fedorov Fedor", "SEO", "fedor@mailbox.com", "892312316", 55000, 34);

        for (Employee employeeObj : employee) {
            employeeObj.printInfo();
            System.out.println();
        }
    }
}