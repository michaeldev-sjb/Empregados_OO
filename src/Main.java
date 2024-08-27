import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String departamento = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int day = sc.nextInt();
        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        Address address = new Address(email, telefone);
        Department department = new Department(departamento, day, address);

        System.out.print("Quantos funcionários tem o departamento? ");
        int funcionarios = sc.nextInt();
        for (int x = 1; x <= funcionarios; x++) {
            System.out.println("Dados do funcionário " + x + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(name, salary);
            department.addEmployee(employee);
        }

        System.out.println("\nFOLHA DE PAGAMENTO:");
        System.out.println(department);
        sc.close();
    }
}
