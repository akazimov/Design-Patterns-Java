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

public class Singleton {
    public static void main(String[] args) {
        Admin admin = Admin.getInstance("Jack", "carribean123");
        admin.doSmth();
        admin = Admin.getInstance("Tony","avengers123");
        admin.doSmth();
    }
}