//Person.java
package BuildClass;

public class Person {
    // Thuoc tinh
    private String name;
    private int age;
    private String adreess;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Person() {

    }

    // Ham khoi tao co doi so
    public Person(String name, int age, String adreess) {
        this.name = name;
        this.age = age;
        this.adreess = adreess;
    }

    // Ham hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("\tTen: " + name);
        System.out.println("\tTuoi: " + age);
        System.out.println("\tDia chi: " + adreess);
    }
}
// Employee.java:
package BuildClass;

public class Person {
    // Thuoc tinh
    private String name;
    private int age;
    private String adreess;

    // Phuong thuc
    // Ham khoi tao khong doi so
    public Person() {

    }

    // Ham khoi tao co doi so
    public Person(String name, int age, String adreess) {
        this.name = name;
        this.age = age;
        this.adreess = adreess;
    }

    // Ham hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("\tTen: " + name);
        System.out.println("\tTuoi: " + age);
        System.out.println("\tDia chi: " + adreess);
    }
}
// main.java
package UseClass;

import BuildClass.Employee;

public class MainClass {
    public static void main(String[] args) {
        // Khai bao doi tuong Employee
        Employee employee = new Employee("Tuan", 30, "Ha Noi", 123, 123);

        // Hien thi thong tin employee
        employee.hienThiThongTin();
    }
}

