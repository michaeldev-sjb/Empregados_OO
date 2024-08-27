package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private Integer payDay;
    private Address address;

    private List<Employee> employees = new ArrayList<>();

    public Department(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public double payroll(){
        double sum = 0.0;
        for (Employee e : employees){
            sum += e.getSalary();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento " + name + " = R$ " + String.format("%.2f",payroll()));
        sb.append("\nPagamento realizado no dia " + payDay);
        sb.append("\nFuncionários:\n");
        for (Employee e : employees){
            sb.append(e + "\n");
        }
        sb.append(address);
        return sb.toString();
    }
}
