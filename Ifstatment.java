
// import java.util.Scanner;

// public class Ifstatment{

// public static void main(String Bum[]){

// Scanner User = new Scanner(System.in);
// System.out.print("Enter a Number");

// int NegativeOrPositive = User.nextInt();
// int Negative = NegativeOrPositive;

// if (Negative <= 1){
// System.out.print("This Number Is A Negative");
// }else{
// System.out.print("Is A Positive Number");
// }
// }
// }

// public class Ifstatment {
// public static void main(String Ifstatment[]) {

// Scanner good = new Scanner(System.in);
// System.out.println("What Is Your Favorite Number");
// String favorite = good.nextLine();

// switch (favorite) {
// case "1":
// System.out.println("This is a lucky number");
// break;
// case "2":
// System.out.println("This is a second chance number");
// break;
// case "3":
// System.out.println("This is a third chance number");
// break;
// default:
// System.out.println("Undifine");
// break;

// }

// }

// }

import java.util.Scanner;

public class Ifstatment {
    public static void main(String ifString[]) {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter To Turn On The Light");
            int i = in.nextInt();

            if (i >= 1) {
                System.out.println("The Light Is On");
                System.out.println("The Number Of People In A Room Is " + i);
            } else {
                System.out.println("The Light Is Off!!");
                System.out.println("The Room Is Emty");

            }
        } while (true);
    }
}
