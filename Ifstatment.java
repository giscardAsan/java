
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

// import java.util.Scanner;

// public class Ifstatment {
//     public static void main(String ifString[]) {
//         Scanner in = new Scanner(System.in);

//         do {
//             System.out.println("Enter To Turn On The Light");
//             int i = in.nextInt();

//             if (i >= 1) {
//                 System.out.println("The Light Is On");
//                 System.out.println("The Number Of People In A Room Is " + i);
//             } else {
//                 System.out.println("The Light Is Off!!");
//                 System.out.println("The Room Is Emty");

//             }
//         } while (true);
//     } 
// }

// public class Ifstatment {

//     public static void main(String ages[]) {
//         Scanner people = new Scanner(System.in);

//         boolean InOrOut;
//         boolean peopleOne;
//         boolean peopleTwo;
//         int i = 0;
//         do {
//             System.out.println("Are you coming out...?");
//             InOrOut = people.nextBoolean();

//             if (InOrOut) {
//                 System.out.println("Motion one state");
//                 peopleOne = people.nextBoolean();

//                 System.out.println("Motion two state");
//                 peopleTwo = people.nextBoolean();

//                 if (peopleOne == true) {
//                     if (peopleTwo == true) {
//                         if (i <= 0) {
//                             i = 0;
//                         } else {
//                             i--;
//                         }

//                     }
//                 }
//             } else {
//                 System.out.println("Motion two state");
//                 peopleTwo = people.nextBoolean();

//                 System.out.println("Motion one state");
//                 peopleOne = people.nextBoolean();

//                 if (peopleTwo == true) {
//                     if (peopleOne == true) {
//                         if (i < 0) {
//                             i = 0;
//                         } else {
//                             i++;
//                         }

//                     }
//                 }
//             }
//             if (i == 0) {
//                 System.out.println("The Light Is Off");
//                 System.out.println("The Room Is Emty");
//             } else {
//                 System.out.println("The Light Is On!");
//                 System.out.println("The Number Of People In The Is " + i);

//             }
//         } while (true);

//     }
// }

public class Ifstatment {

    public static void main(String agr[]) {

        // int i = 0;

        // for (i = 10; i > 0; i = i - 1) {
        // System.out.println(i + "Hello World");

        // }

        // for (i = 0; i < 10; i = i + 1) {
        // System.out.println(i + "Hello World");

        // }

        // String number[][] = {
        // { "Giscard", "Atta", "Jones" },
        // { "Jones", "Atta", "Giscard" },
        // { "Atta", "Giscard", "Jones" },
        // };

        // for (int i = 0; i < number.length; i++) {
        // for (int j = 0; j < number[i].length; j++) {
        // System.out.println(number[i][j]);
        // }
        // }

        // initializer
        // int j = 0;
        // int t = 0;
        // condition

        for (int i = 0; i < man().length; i++) {

            for (int j = 0; j < man()[i].length; j++) {
                System.out.println(man()[i][j]);
            }
        }

    }

    public static String[][] man() {
        String Engineer[][] = {
                { "Giscard", "Atta", "Jones" },
                { "Jones", "Atta", "Giscar" },
                { "Atta", "Giscard", "Jones" },
        };
        return Engineer;
    }

}
