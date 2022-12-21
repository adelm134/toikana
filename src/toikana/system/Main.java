package toikana.system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        System.out.println("Sign in");
        chooseUsers();
    }

    // Choose role
    public static String chooseUsers() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your position: ");
        System.out.println("(1) Admin");
        System.out.println("(2) Manager");
        System.out.println("(3) Waiter");

        do {
            System.out.print("You choose ");
            String choose = sc.nextLine();
            switch (choose) {
                case "admin", "Admin", "1" -> {
                    System.out.println("Admin");
                    System.out.println("Enter your login and password");
                    adminInput();
                }
                case "manager", "Manager", "2" -> {
                    System.out.println("Manager");
                    System.out.println("Enter your login and password");
                    managerInput();
                }
                case "waiter", "Waiter", "3" -> {
                    System.out.println("Waiter");
                    System.out.println("Enter your login and password");
                    waiterInput();
                }
                default -> {
                    System.out.print("Press 0 to Retry and 1 to Exit");
                    int ex = sc.nextInt();
                    if (ex == 0) {
                        chooseUsers();
                    } else if (ex == 1) {
                        System.exit(0);
                    }
                }
            }
            break;
        } while (true);
        return "";
    }

    // Admin authorization
    public static void adminInput() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("admin");
        passwordArrayList.add("admin1");

        do {
            System.out.print("Login: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("You entered the system as Admin");
                adminActions();
                break;
            } else {
                System.out.println("Try again");
            }
        } while (true);
    }

    // Manager authorization
    public static void managerInput() throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("man");
        passwordArrayList.add("man1");

        do {
            System.out.print("Login: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("You entered the system as Manager");
                managerActions();
                break;
            } else {
                System.out.println("Try again");
            }
        } while (true);
    }

    // Waiter authorization
    public static void waiterInput() throws IOException {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> loginArrayList = new ArrayList<String>();
        ArrayList<String> passwordArrayList = new ArrayList<String>();
        loginArrayList.add("wait");
        passwordArrayList.add("wait1");

        do {
            System.out.print("Login: ");
            String input_lg = sc.next();
            sc.nextLine();
            System.out.print("Password: ");
            String input_pw = sc.next();
            sc.nextLine();
            int indexArray = 0;
            boolean haveInArray = false;
            while (indexArray < loginArrayList.size()) {
                if (input_lg.equals(loginArrayList.get(indexArray)) &&
                        input_pw.equals(passwordArrayList.get(indexArray))) {
                    haveInArray = true;
                    break;
                } else {
                    haveInArray = false;
                }
                indexArray++;
            }
            ;
            if (haveInArray == true) {
                System.out.println("You entered the system as Waiter");
                waiterActions();
                break;
            } else {
                System.out.println("Try again");
            }
        } while (true);
    }



    // Admin actions
    public static void adminActions() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Actions: ");
        System.out.println("(1)User administration");
        System.out.println("(2)Menu control");
        System.out.println("(3)Event management");
        System.out.println("(4)Table management");
        System.out.println("(5)Restaurant management");
        System.out.println("(6)Reports");
        System.out.println("(0)Exit");
        do {
            System.out.print("Choose: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction) {
                case "1": userAdm(); break;
                case "2": menuCon(); break;
                case "3": eventMan(); break;
                case "4": tableMan(); break;
                case "5": restMan(); break;
                case "6": report(); break;
                default:
                    System.out.println("The action is not possible");
                    adminActions();
                    break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "0":
                    System.out.println("Exit");
                    break;
            }
            break;
        } while (true);
    }

    public static void userAdm() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Options: ");
            System.out.println("(1)Add user");
            System.out.println("(2)Delete user");


        } finally {

        }
    }

    public static void menuCon(){

    }

    public static void eventMan(){

    }

    public static void tableMan(){

    }

    public static void restMan(){

    }

    public static void report(){

    }

    // Manager actions
    public static void managerActions() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Actions: ");
        System.out.println("(1)Menu control");
        System.out.println("(2)Event management");
        System.out.println("(3)Table management");
        System.out.println("(0)Exit");
        do {
            System.out.print("Choose: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction) {
                case "1": menuCon(); break;
                case "2": eventMan(); break;
                case "3": tableMan(); break;
                default:
                    System.out.println("The action is not possible");
                    adminActions();
                    break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "0":
                    System.out.println("Exit");
                    break;
            }
            break;
        } while (true);
    }

    // Waiter actions
    public static void waiterActions() {
        System.out.println("No actions for you. Keep doing great!");
    }
}






