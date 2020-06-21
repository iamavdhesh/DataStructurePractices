package com.devlopeapps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendanceRecords {


    static class Employee {

        int empId;
        String department;
        String empName;
        List<AttendanceModel> model;

        static class AttendanceModel {
            int isPresent;
            String dayName;
        }
    }

    public static void main(String[] args) {


        showAttendanceMgmtSystem();


    }

    private static void showAttendanceMgmtSystem() {

        System.out.println("" +
                "\t*****************************************\n" +
                "\t*     Employee Attendance Application   *\n" +
                "\t*****************************************\n\n");


        System.out.println("\t" +
                "*************************************\n" +
                "\tPlease enter your choice   \n " +
                "\tEnter 1 for weekly report:\n" +
                "\tEnter 2 for  search employee record by name or empId:\n" +
                "\tEnter 3  for exit.\n" +
                "\t***************************************\n");
        boolean checkLoop = true;
        printAttendanceRecord();
        while (checkLoop) {

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            switch (input) {

                case 1:
                    printRecord();
                    break;
                case 2:
                    scanner.nextLine();
                    printSpecifiedEmployee(scanner.next());
                    break;
                case 3:

                    checkLoop = false;
                    break;
                default:


                    System.out.println("Wrong choice");

            }


        }


    }

    private static void printSpecifiedEmployee(String inputValue) {

        if (inputValue == null && inputValue.isBlank()) {
            System.out.println("Employee record not found");
            return;
        }

        System.out.println("Department\t\tEmp. No\t\tEmp.Name\t\t\tMon\tTue\tWed\tThu\tFri\tSat");
        for (Employee model : employeeArrayList) {
            if ((model.empId + "").contains(inputValue) || model.empName.contains(inputValue)) {

                String deprtStr = "";
                if (model.department.equals("HR"))
                    deprtStr = model.department + "\t\t\t\t";
                else
                    deprtStr = model.department + "\t\t\t";

                String s = deprtStr + model.empId + "\t\t\t" + model.empName + "\t\t\t" + model.model.get(0).isPresent + "\t"
                        + model.model.get(1).isPresent + "\t" + model.model.get(2).isPresent + "\t" + model.model.get(3).isPresent + "\t"
                        + model.model.get(4).isPresent + "\t" + model.model.get(5).isPresent;
                System.out.println(s);
            }
        }


    }

    static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    private static void printAttendanceRecord() {
        employeeArrayList.clear();
        addRecord(234, "HR", "Ali Sabah", 1, 1, 1, 1, 1, 1);
        addRecord(345, "HR", "Ahmed Omer", 1, 0, 0, 0, 1, 1);
        addRecord(452, "HR", "Ban Khalid", 1, 1, 1, 1, 1, 1);
        addRecord(365, "Finance", "Kawa Aziz", 1, 1, 1, 1, 1, 1);
        addRecord(645, "Finance", "Akam Bakr", 1, 1, 0, 0, 1, 1);
        addRecord(745, "Finance", "Shorish Ali", 1, 1, 1, 1, 0, 1);
    }

    private static void printRecord() {
        System.out.println("Department\t\tEmp. No\t\tEmp.Name\t\t\tMon\tTue\tWed\tThu\tFri\tSat");
        int count = 0;
        for (Employee model : employeeArrayList) {
            if (count == 0 || count == 3)
                System.out.println(model.department);
            count++;
            String s = "\t\t\t\t" + model.empId + "\t\t\t" + model.empName + "\t\t\t" + model.model.get(0).isPresent + "\t"
                    + model.model.get(1).isPresent + "\t" + model.model.get(2).isPresent + "\t" + model.model.get(3).isPresent + "\t"
                    + model.model.get(4).isPresent + "\t" + model.model.get(5).isPresent;
            System.out.println(s);
        }
    }

    private static void addRecord(int empId, String department, String empName,
                                  int monday,
                                  int tuesday,
                                  int wednesday,
                                  int thursday,
                                  int friday,
                                  int saturday) {
        Employee employee = new Employee();
        employee.department = department;
        employee.empId = empId;
        employee.empName = empName;
        String days[] = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] daysPresent = {monday, tuesday, wednesday, thursday, friday, saturday};
        employee.model = new ArrayList<>();
        for (int i = 0; i < days.length; i++) {
            Employee.AttendanceModel attendanceModel = new Employee.AttendanceModel();
            attendanceModel.dayName = days[i];
            attendanceModel.isPresent = daysPresent[i];
            employee.model.add(attendanceModel);
        }

        employeeArrayList.add(employee);
    }


}

