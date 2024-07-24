package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0.0f) {
            System.out.println("wrong input!");
        } else if (salary > 20000.0f) {
            System.out.println(salary * (1.0f - 0.20f));
        } else if (salary > 10000) {
            System.out.println(salary * (1.0f - 0.18f));
        } else {
            System.out.println(salary * (1.0f - 0.15f));
        }
    }
}
