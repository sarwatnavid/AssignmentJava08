public class Employee {
    String fName;
    float salary;
    long phoneNumber;
    int age;
    String lName;

//    public Employee(String fName, float salary, long phoneNumber , int age, String lName){
//       this.firstName = fName;
//       this.salary = salary;
//       this.phoneNumber = phoneNumber;
//       this.age = age;
//       this.lastName = lName;
//    }
       public String printInfo(String fName, float salary, long phoneNumber , int age, String lName) {
           String infoBox=("First Name" + fName + "Last Name" + lName + "Salary" + salary +
                   "Phone Number" + phoneNumber + "Age" + age );
            return infoBox;
       }
//public String calculateBonus(): displays the monthly salary of employee after getting 5% bonus
       public String calculateBonus(float salary){
        float totalSalary = salary + salary *5/100;
        return Float.toString(totalSalary);
       }
      public static void main (String[] args){
           Employee employee1= new Employee();

        System.out.println(employee1.printInfo("sarwat",7000f, 51689756L, 25, "Wasim" ));
        System.out.println("the bonus payment is:" + employee1.calculateBonus(7000f)+ " USD" );

    }
}


