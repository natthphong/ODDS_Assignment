
import java.util.Scanner;

import model.*;

class Start {
    static int num = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "-";
        System.out.println(str.repeat(30) + "START PROGRAM" + str.repeat(30));
        System.out.print("N : ");
        int N = scan.nextInt();
        if (N <= 0) {
            System.out.println("No students enter");
            System.out.println("Pls try again");
            scan.close();
            return;
        }
    
        Hogwarts[] students = new Hogwarts[N];
        The_Sorting_Hat House = new The_Sorting_Hat(N);

        String studentName;
        num = 0;
        while (true) {
            System.out.print("OPEN MENU(y/n)? :");
            String type = scan.next();
            if (type.toLowerCase().equals("y")) {
                menuList();
            }
            System.out.print("SELECT : ");
            try {
                int select = scan.nextInt();
                switch (select) {
                    case -1:
                        num = 0;
                        break;
                    case 0:
                        if (num < N) {
                            System.out.print("Student name : ");
                            studentName = scan.next();
                            if (!check(students, studentName)) {
                                System.out.println("*****" + studentName + " already used*****");
                                break;
                            }
                            students[num] = House.randomHouse(studentName);
                            students[num].printHouse();
                            num++;
                        } else {
                            System.out.println(str.repeat(30) + "Full number of students" + str.repeat(30));
                        }
                        break;
                    case 1:
                        printAll(students);
                        break;
                    case 2:
                        printInfo(students, "Gryffindor");
                        break;
                    case 3:
                        printInfo(students, "Hufflepuff");
                        break;
                    case 4:
                        printInfo(students, "Ravenclaw");
                        break;
                    case 5:
                        printInfo(students, "Slytherin");
                        break;
                    case 6:
                        printNumHouse(students);
                        break;
                    case 7:
                        while (true) {
                            if (num < N) {
                                System.out.print("Student name : ");
                                studentName = scan.next();
                                if (!check(students, studentName)) {
                                    System.out.println("*****" + studentName + " already used*****");
                                    break;
                                }
                                students[num] = House.randomHouse(studentName);
                                num++;
                            } else {
                                System.out.println(str.repeat(30) + "Full number of students" + str.repeat(30));
                                break;
                            }
                        }
                        break;
                    case 8:
                        System.out.print("Student name : ");
                        studentName = scan.next();
                        showProfile(students, studentName);
                        break;
                    case 9:
                        scan.close();
                        System.out.println(str.repeat(30) + "STOP PROGRAM" + str.repeat(30));
                        return;
                    default:
                        System.out.println("*****INDEX NOT FOUND*****");
                        break;
                }
            } catch (Exception e) {
                System.out.println("*****SELECT IS INTEGER*****");
                type = scan.next();
            }

        }

    }

    /// function program

    static void printNumHouse(Hogwarts[] students) {
        String str = "-";
        int Gryffindor = 0;
        int Hufflepuff = 0;
        int Ravenclaw = 0;
        int Slytherin = 0;
        for (int i = 0; i < num; i++) {
            if (students[i] instanceof Gryffindor) {
                Gryffindor++;
            } else if (students[i] instanceof Hufflepuff) {
                Hufflepuff++;
            } else if (students[i] instanceof Ravenclaw) {
                Ravenclaw++;
            } else {
                Slytherin++;
            }
        }
        System.out.println(str.repeat(18) + "NUMBER OF STUDENTS IN HOGWARTS" + str.repeat(18));
        System.out.println("Number of Students in Gryffindor: " + Gryffindor);
        System.out.println("Number of Students in Hufflepuff: " + Hufflepuff);
        System.out.println("Number of Students in Ravenclaw: " + Ravenclaw);
        System.out.println("Number of Students in Slytherin: " + Slytherin);
        System.out.println("Total Students : " + num);
        System.out.println(str.repeat(20) + "THE END OF NUMBER" + str.repeat(20));
    }

    static void printInfo(Hogwarts[] students, String house) {
        String str = "*";
        System.out.println(str.repeat(30) + house + str.repeat(30));
        int index = 1;
        for (int i = 0; i < num; i++) {
            if (students[i].getHouse().equals(house)) {
                System.out.println("No." + index + " Student Name : " + students[i].getName());
                index++;
            }
        }
        if (index == 1) {
            System.out.println("There are no students in " + house);
        }

    }

    static void printAll(Hogwarts[] students) {
        String str = "*";
        if (num == 0) {
            System.out.println(str.repeat(30) + "NO STUDENTS IN HOGWARTS" + str.repeat(30));
            return;
        }

        System.out.println(str.repeat(30) + "LIST STUDENTS IN HOGWARTS" + str.repeat(30));
        printInfo(students, "Gryffindor");
        printInfo(students, "Hufflepuff");
        printInfo(students, "Ravenclaw");
        printInfo(students, "Slytherin");
        System.out.println(str.repeat(30) + "THE END OF LIST STUDENTS" + str.repeat(30));
    }

    static void menuList() {
        String ex = "*";
        System.out.println(ex.repeat(40) + "MENU" + ex.repeat(40));
        System.out.println("Select -1 : RESET INPUT");
        System.out.println("Select  0 : ADD STUDENT");
        System.out.println("Select  1 : SHOW ALL STUDENTS");
        System.out.println("Select  2 : SHOW STUDENTS IN GRYFFINDOR");
        System.out.println("Select  3 : SHOW STUDENTS IN HUFFLEPUFF");
        System.out.println("Select  4 : SHOW STUDENTS IN RAVENCLAW");
        System.out.println("Select  5 : SHOW STUDENTS IN SLYTHERIN");
        System.out.println("Select  6 : NUMBER OF STUDENTS");
        System.out.println("Select  7 : MULTIPLE ADD STUDENT");
        System.out.println("Select  8 : SELECT PROFILE BY NAME");
        System.out.println("Select  9 : STOP PROGRAM");
        System.out.println(ex.repeat(84));
    }

    static boolean check(Hogwarts[] students, String name) {
        for (int i = 0; i < num; i++) {
            if (name.equals(students[i].getName()))
                return false;
        }
        return true;
    }

    static void showProfile(Hogwarts[] students, String name) {
        boolean found = false;
        for (int i = 0; i < num; i++) {
            if (name.equals(students[i].getName())) {
                found = true;
                students[i].printHouse();
            }

        }
        if (!found)
            System.out.println("Name not found");
    }
}
