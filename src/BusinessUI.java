import java.util.Scanner;

public class BusinessUI {
    Employee[] employees;
    Scanner sc = new Scanner(System.in);

    public BusinessUI(){
        employees = new Employee[10];
        populateEmployeeArray();
    }

    public void startUI(){
        System.out.println("[1] Print all employees");
        System.out.println("[2] Find employee by ID");
        System.out.println("[3] Update employee salary");
        System.out.println("[9] Quit");
        System.out.println("Please enter a choice:");

        String userChoice = "";

        while (!userChoice.equals("9")){
            userChoice = sc.nextLine();//get the
            if (userChoice.equals("1")){
                printAllEmployees();
                startUI();
            }
            else if (userChoice.equals("2")) {
                System.out.print("Enter the ID: ");
                String idToSearchFor = sc.nextLine();
                findEmployee(idToSearchFor);
                startUI();
            }
            else if (userChoice.equals("3")) {
                updateEmployeeSalary();
                startUI();
            }
            else if (userChoice.equals("9")) {
                System.out.println("Thanks for using BusinessApp!");
                System.out.println("See you next time!!");
            }
            else{
                System.out.println("that is not a valid choice. Please enter a valid choice");
                System.out.println("Press Enter key to continue...");
                sc.nextLine();
                startUI();
            }
        }
    }

    public void printAllEmployees(){
        System.out.println("Printing out all employees");
        for(int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
        }
        System.out.println("Press Enter key to continue...");
        sc.nextLine();
    }

    public void findEmployee(String id){
        System.out.println("Finding employee by ID");
        boolean found = false;
        for(int i=0; i<employees.length; i++){
            if (employees[i].getEmployeeId().equals(id)){
                found = true;
                System.out.println("Employee found:");
                System.out.println(employees[i]);
            }
        }
        if (found == false){
            System.out.println("The employee with id \""  + id + "\" doesn't exist\n\n");
        }
        System.out.println("Press Enter key to continue...");
        sc.nextLine();
    }

    public void updateEmployeeSalary(){
        System.out.println("Updating employee salary");
        //find the employee by ID
        //if found then print out the employee's current salary
        //ask for the new salary amount
        //update the salary field of the employee
        System.out.println("Press Enter key to continue...");
        sc.nextLine();
    }

    void populateEmployeeArray(){
        employees[0] = new Employee("EMP1", "John Doe", 50000.0, "Software Engineer",
                new Address("123 Main St", "Springfield", "12345"));
        employees[1] = new Employee("EMP2", "Alice Smith", 60000.0, "Data Analyst",
                new Address("456 Oak St", "Riverside", "54321"));
        employees[2] = new Employee("EMP3", "Bob Johnson", 55000.0, "Project Manager",
                new Address("789 Pine St", "Lakeview", "67890"));
        employees[3] =new Employee("EMP4", "Emily Brown", 52000.0, "Quality Assurance",
                new Address("101 Elm St", "Hillside", "13579"));
        employees[4] = new Employee("EMP5", "Michael Wilson", 58000.0, "System Administrator",
                new Address("246 Cedar St", "Bayside", "24680"));
        employees[5] = new Employee("EMP6", "Samantha Jones", 63000.0, "Business Analyst",
                new Address("369 Maple St", "Sunset", "97531"));
        employees[6] = new Employee("EMP7", "David Lee", 54000.0, "Software Developer",
                new Address("482 Oak St", "Riverdale", "86420"));
        employees[7] = new Employee("EMP8", "Sarah Davis", 51000.0, "Database Administrator",
                new Address("573 Pine St", "Hillcrest", "75309"));
        employees[8] = new Employee("EMP9", "Chris Garcia", 59000.0, "Network Engineer",
                new Address("698 Cedar St", "Lakeside", "15926"));
        employees[9] = new Employee("EMP10", "Jennifer Martinez", 57000.0, "UX/UI Designer",
                new Address("715 Maple St", "Mountainview", "35791"));
    }
}
