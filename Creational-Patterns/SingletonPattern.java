/***
    Main purpose of using Singleton Pattern: To make sure that class has ONLY and ONLY one instance (object)
    Main rules for Singleton Pattern:
        1. Class must be final.
        2. Class must have static instance of itself.
        3. Class must have static getInstance() method to create object (or inform the programmer if an object already exists).
***/
final class Admin {
    private static Admin admin;
    private String username, password;

    private Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Admin getInstance(String username, String password) {
        if(admin == null) {
            System.out.println("----------");
            admin = new Admin(username, password);
            System.out.println("Admin profile is created:" + "\n"
                    + "username: " + admin.getUsername() + "\n"
                    + "password: " + admin.getPassword());
        }
        else {
            System.out.println("----------");
            System.out.println("Admin profile already exists:" + "\n"
                    + "username: " + admin.getUsername() + "\n"
                    + "password: " + admin.getPassword());
        }
        return admin;
    }

    public void doSmth() {
        System.out.println("----------");
        System.out.println("Process finished successfully.");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Admin admin = Admin.getInstance("Jack", "caribbean123");
        admin.doSmth();
        admin = Admin.getInstance("Tony","avengers123");
        admin.doSmth();
    }
}
/* OUTPUT: */
/*
----------
Admin profile is active:
username: Jack
password: carribean123
----------
Process finished successfully.
----------
Admin profile already exists:
username: Jack
password: caribbean123
----------
Process finished successfully.
*/
