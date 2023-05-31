package aplication;

import entities.Employee;
import entities.OutsourceEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        int numberOfEmployee;
        System.out.print("Enter the number of employees: ");
        numberOfEmployee = sc.nextInt();
        sc.nextLine();
        for(int i=0; i < numberOfEmployee; i++){
            System.out.println("Employee #" + (i + 1) + " data:");

            System.out.print("Outsourced? (y/n) ");
            char outsourced;
            outsourced = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();


            if((outsourced == 'y') || (outsourced == 'Y')){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine();
                OutsourceEmployee outsourceEmployee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);

                employees.add(outsourceEmployee);

            } else if ((outsourced == 'n') || (outsourced == 'N')) {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
            else{
                System.out.println("Invalible!");
            }
        }

        System.out.println("PAYMENTS: ");

        for(Employee employee : employees)
        {
            System.out.println(employee.getName() + " - $" + employee.payment());
        }

        sc.close();
    }
}
