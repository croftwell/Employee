public class Employee {
   private String name;
   public double salary;
   private int  hireYear;
   private int workHours;

    Employee(int hireYear,int  workHours, double salary, String name){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {

        if (this.salary >= 1000) {
            return 1000 * 0.3;
    }
    return 0.0;
    }

    public double bonus() {
        return 30 * this.workHours;
    }
    public double increase(){

        int year = 2023- this.hireYear;

        if (year < 10) {
            return salary * 0.5;

        }
        else if (year>= 10 && year < 20){

            return salary * 0.10;
        }
        else {
            return salary * 0.15;
        }
    }
}
