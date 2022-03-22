package Driver;
import Department.AdminDepartment;
import Department.HrDepartment;
import Department.TechDepartment;

public class Main {
    public static void main(String[] args) {
        // Creating object of admin class
        AdminDepartment admin = new AdminDepartment();
        admin.departmentName();
        admin.getTodaysWork();
        admin.getWorkDeadline();
        admin.isTodayAHoliday();
        System.out.println();
        System.out.println();

        // Creating object of hr class
        HrDepartment hr = new HrDepartment();
        hr.departmentName();
        hr.doActivity();
        hr.getTodaysWork();
        hr.getWorkDeadline();
        hr.isTodayAHoliday();
        System.out.println();
        System.out.println();

        // Creating object of tech class
        TechDepartment tech =  new TechDepartment();
        tech.departmentName();
        tech.getTodaysWork();
        tech.getWorkDeadline();
        tech.getTechStackInformation();
        tech.isTodayAHoliday();
    }
}
