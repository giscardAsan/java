// import java.util.*;
// import java.text.*;
// import java.math.*;

// public class Syetem {
// public static void main(String args[]) {
// Scanner in = new Scanner(System.in);
// DecimalFormat format = new DecimalFormat(".0");
// format.setRoundingMode(RoundingMode.HALF_UP);
// // Teachers can choose how many grades they want to enter
// System.out.print("How many student grades would you like to enter:");
// int x = in.nextInt();
// int[] grades = new int[x];
// System.out.print("Enter student marks:\n");
// for (int i = 0; i < x; i++) {
// grades[i] = in.nextInt();
// }
// bubbleSort(grades);
// System.out.println("Sorted grades: " + Arrays.toString(grades));
// classAverage(grades);
// System.out.println("Class average: " + format.format(classAverage(grades)) +
// "%");
// classMax(grades);
// System.out.println("Maximum mark: " + classMax(grades) + "%");
// classMin(grades);
// System.out.println("Minimum mark: " + classMin(grades) + "%");
// // To get the grade range.
// int range = classMax(grades) - classMin(grades);
// System.out.println("Range of marks: " + range + "%");
// classLevel(grades);
// } // Method for finding the class average

// private static double classAverage(int[] grades) {
// int sum = 0;
// for (int g : grades)
// sum += g;
// double average = ((double) sum) / grades.length;
// return (average);
// } // Method for finding the highest grade

// private static int classMax(int[] grades) {
// int max = Arrays.stream(grades).max().getAsInt();
// return max;
// } // Method for finding the lowest grade

// private static int classMin(int[] grades) {
// int min = Arrays.stream(grades).min().getAsInt();
// return min;
// } // Method for arranging the grades into levels

// private static void classLevel(int[] grades) {
// for (int i : grades) {
// if (i < 50) {
// System.out.println("Number at Level R: " + i);
// } else if ((i >= 50) && (i < 60)) {
// System.out.println("Number at Level 1: " + i);
// } else if ((i >= 60) && (i < 70)) {
// System.out.println("Number at Level 2: " + i);
// } else if ((i >= 70) && (i < 80)) {
// System.out.println("Number at Level 3: " + i);
// } else {
// System.out.println("Number at Level 4: " + i);
// }
// }
// }

// // Method for sorting the grades
// private static void bubbleSort(int[] n) {
// boolean flag;
// do {
// flag = false;
// for (int i = 0; i < n.length - 1; i++) {
// if (n[i] > n[i + 1]) {
// int temp = n[i];
// n[i] = n[i + 1];
// n[i + 1] = temp;
// flag = true;
// }
// }
// } while (flag);
// }
// }