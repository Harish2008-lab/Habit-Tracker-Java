import java.util.Scanner;

class HabitData {
    static int choice;
}

class Scannne extends HabitData {
    Scannne(int choice) {
        HabitData.choice = choice;
        if (choice <= 15) {
            System.out.println("ENTER YOUR TASKS\n");
        } else {
            System.out.println("SORRY!..YOUR TASKS ARE MORE");
        }
    }
}

class Printing {
    void print() {
        System.out.println("\nAFTER FINISHED ALL TASKS, JUST SAY HII!!");
    }
}

class finaal extends HabitData {
    finaal(int geting) {
        if (geting < choice) {
            System.out.println("YOUR HAVE INCOMPLETE TASKS");
        } else {
            System.out.println("HURRAH!! YOU COMPLETED YOUR TODAY\nSTAY DISPLINE");
        }
    }
}

public class HabitTracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("WELCOME TO HABIT COUNTER \n");
        System.out.println("HOW MANY TASKS YOU WANT TO COMPLETE TODAY (1-15)?");

        int a = scan.nextInt();
        scan.nextLine();

        String[] forr = new String[a];
        Scannne obj1 = new Scannne(a);

        for (int i = 0; i < a; i++) {
            System.out.print("TASK " + (i + 1) + ": ");
            forr[i] = scan.nextLine();
        }

        Printing p1 = new Printing();
        p1.print();

        String b = scan.nextLine();

        if (b.equalsIgnoreCase("hii") || b.equalsIgnoreCase("hi")) {
            System.out.println("\n--- YOUR DAILY HABITS ---");
            for (int i = 0; i < a; i++) {
                System.out.println("TASK " + (i + 1) + ": " + forr[i]);
            }
        } else {
            System.out.println("I AM WAITING FOR YOU");
        }

        System.out.println("\nHOW MANY HABITS YOU COMPLETED\nENTER AS A NUMBER");
        int c = scan.nextInt();
        finaal f1 = new finaal(c);

        scan.close();
    }
}
