package studentcontrolsystem.view;

import java.io.*;
import java.util.*;
import studentcontrolsystem.model.*;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class StudentControlSystem {
    
    public static void main(String[] args) {
        Teacher teacher;
        teacher = new Teacher();
        int choiceTeachOrStud;
        boolean exitFirstMenu = false;

        Scanner sc = new Scanner(System.in);
        do {
            // First menu, could be a student or a teacher
            menuTeacherOrStudent();
            choiceTeachOrStud = sc.nextInt();
            switch (choiceTeachOrStud) {
                case 1 -> {
                    login();
                    //Tercer menu para el profesor
                    printMenuTeacher();

                }
                case 2 ->{
                    System.out.println("=======================");
                    System.out.println("This section will be available soon :D");
                    System.out.println("=======================");
                }
                case 3 -> {
                    exitFirstMenu = true;
                }
                default ->
                    System.out.println("Invalid option");

            }
        } while (!exitFirstMenu);
    }

    private static void login() {
        
        Teacher teacher;
        teacher = new Teacher();
        
        Scanner sc = new Scanner(System.in);
        String readPassword;
        int searchId;
        System.out.print("Please enter your id: ");
        searchId = sc.nextInt();
        
        while (searchId != teacher.getId()) {
            System.out.println("Please try again: ");
            searchId = sc.nextInt();
        }
        
        System.out.print("Please enter your password: ");
        readPassword = sc.next();
        
        while (!readPassword.equals(teacher.getPassword())) {
            System.out.print("Please enter your password: ");
            readPassword = sc.next();
        }
        
        System.out.println("\n\n*** You made it yay ***\n\n");
    }
    
    private static void menuTeacherOrStudent() {
        System.out.println("Welcome to the Student Control System");
        System.out.println("=======================");
        System.out.println("1.I'm the Teacher > \t");
        System.out.println("2.I'm a Student > \t");
        System.out.println("3.Exit the program > \t");
        System.out.println("=======================");
    }

    private static void printMenuTeacher() {
        Scanner sc = new Scanner(System.in);
        String name;
        name = "Lucy";
        int option;
        do {

            System.out.println("   Welcome " + name);
            System.out.println("=======================");
            System.out.println("1. Register a student > \t");
            //System.out.println("2.Enter into the grade system > \t");
            System.out.println("2. View student list > \t");
            System.out.println("3. Exit the teacher menu > \t");
            System.out.println("=======================");
            System.out.print("==============> ");

            option = sc.nextInt();
            menuTeacher(option);

        } while (option != 3);

    }

    private static void menuTeacher(int option) {

        ArrayList<Student> studentsToWrite = new ArrayList<>();
        String fileName = "studentsFile.csv";
        int position = 0;

        switch (option) {
            case 1 -> {
                registerStudent(studentsToWrite);
                System.out.println("..:: STUDENT ADDED ::..");
                editFile(fileName, studentsToWrite, position);
                position++;
            }

            case 2 -> {
                readFile("studentsFile.csv");

            }

            case 3 ->
                System.out.println("..:: YOU HAVE EXIT ::..");

            default ->
                System.out.println("csd");
        }
    }

    private static void registerStudent(ArrayList<Student> students) {
        
        String fileName = "studentsFile.csv";

        Student student = new Student();
        System.out.println("****************************");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student name: ");
        student.setName(sc.next());
        System.out.print("Enter the student age: ");
        int age = sc.nextInt();
        age = validateAge(age);
        student.setAge(age);
        System.out.print("Enter the student gender: ");
        student.setGender(sc.next());

        int id = generateId();
        boolean validationId = validateIfIdExist(fileName,id);
        /*System.out.println(validationId);*/
        if (validationId) {
            id = generateId();
        }
        
        student.setId(id);
        
        System.out.println("The student's id is: " + id);

        students.add(student);

    }

    private static int generateId() {
        int numero;
        numero = (int) (Math.random() * 9999 + 1000);
        validateId();
        return numero;
    }

    private static void validateId() {

    }

    public static void editFile(String fileName, ArrayList<Student> student, int position) {
        File file = new File(fileName);

        String name = student.get(position).getName();
        int age = student.get(position).getAge();
        int id = student.get(position).getId();
        String gender = student.get(position).getGender(name);

        try {
            PrintWriter output = new PrintWriter(new FileWriter(file, true));
            output.println(id + ";" + name + ";" + age + ";" + gender);
            output.close();
            System.out.println("\n\n..:: File has been written! ::..\n");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public boolean validatorOfDNI(String DNI) {
        boolean correctDNI = false;

        try {

            if (DNI.length() == 10) 
            {
                int thirdDigit = Integer.parseInt(DNI.substring(2, 3));
                if (thirdDigit < 6) {
                    int[] arrayDNI = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificator = Integer.parseInt(DNI.substring(9, 10));
                    int addition = 0;
                    int digit = 0;
                    for (int i = 0; i < (DNI.length() - 1); i++) {
                        digit = Integer.parseInt(DNI.substring(i, i + 1)) * arrayDNI[i];
                        addition += ((digit % 10) + (digit / 10));
                    }

                    if ((addition % 10 == 0) && (addition % 10 == verificator)) {
                        correctDNI = true;
                    } else if ((10 - (addition % 10)) == verificator) {
                        correctDNI = true;
                    } else {
                        correctDNI = false;
                    }
                } else {
                    correctDNI = false;
                }
            } else {
                correctDNI = false;
            }
        } catch (NumberFormatException nfe) {
            correctDNI = false;
        } catch (Exception err) {
            System.out.println("An exception has ocurred in the process of validation");
            correctDNI = false;
        }

        if (!correctDNI) {
            System.out.println("The DNI entered is incorrect");
        }
        return correctDNI;
    }
    public static boolean validateIfIdExist(String fileName,int id) {
        System.out.println("*********************************");
        File file = new File(fileName);
        System.out.println("*********************************");
        
        String[] data;
        String idToString=id+"";
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            while (line != null) {
                data = line.split(";");

                if (idToString.equals(data[0])) {
                    return true;
                }
                
                line = input.readLine();
            }
            input.close();
            return false;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            return false;
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            return false;
        }
        
    }
    public static void printLine(String[] data) {
        //for-each use
        for (String fact : data) {
            System.out.print(fact + "\t|");
        }
    }
    public static void readFile(String fileName){
        File file = new File(fileName);
        String[] data;
        try {
            var input = new BufferedReader(new FileReader(file));
            var line = input.readLine();
            System.out.println("\nID\t|NAME\t|AGE\t|GENDER\t|");
            while (line != null) {
                data = line.split(";");
                printLine(data);
                line = input.readLine();
                System.out.println();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    private static int validateAge(int age) {
        Scanner sc = new Scanner(System.in);
        while(age < 14 || age > 20){
            System.out.print("Age invalid, enter age again: ");
            age = sc.nextInt();
        }
        return age;
    }
}
