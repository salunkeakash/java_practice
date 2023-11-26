// Q8. WAP to calculate total salary of employee based on basic, da=10% of basic, ta=12% of basic, hra=15% of basic.
class salary_of_employee {

    public static void main(String args[]) {
        int salary = 5000;
        double ta, da, hra, total_salary;

        da = (salary * 10 / 100);
        ta = (salary * 12 / 100);
        hra = (salary * 15 / 100);

        total_salary = salary + da + ta + hra;

        System.out.println("total salary of employee is " + total_salary);
    }
}
