public class EmpDriver {

 public static void main() {

     Employee emp1 = new Employee(1985, 45, 200, "kemal");
     System.out.println("Tax:" + emp1.tax());
     System.out.println("Bonus" + emp1.bonus());
     System.out.println("İncrease salary" + emp1.increase());
     double totalSalary = emp1.salary - emp1.tax();
 }

}
