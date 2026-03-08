import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basic, hra, da, salary;

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        hra = basic * 0.2;
        da = basic * 0.1;

        salary = basic + hra + da;

        System.out.println("Total Salary = " + salary);
    }
}
