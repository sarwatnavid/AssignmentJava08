public class Author {       //Java class Author

    String firstName;      // Declaring the 1st variable  (instance Variable)
    String lastName;       //Declaring the 2nd variable  (instance Variable)

    public Author (String fName, String lName) {  // Constructor is created with local variable
        this.firstName = fName;   // setting up two values (fName & lName)
        this.lastName = lName;
    }
        public String printInfo(){  // Declared the method, it prints out
            System.out.println("First Name " +  firstName   +  "Last Name "  +  lastName);
            return firstName   +   lastName ;
    }
       public static void main(String[] args){      // Main method (the entry point)
        // Created an Object to Use the class above
         Author author1= new Author(   "Sarwat", "Wasim");

         System.out.println(author1.printInfo()); // To call a method , using author1 object


    }

}
