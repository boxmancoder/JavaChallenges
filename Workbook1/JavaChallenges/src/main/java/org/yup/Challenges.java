package org.yup;

  import javax.sound.midi.Soundbank;
  import java.util.Scanner;
  import java.util.SortedMap;

public class Challenges {

    public String greeting(String name, int age) {

        if (age >= 21) {
            return "Hello " + name + ", Welcome to the party!";
        } else {
            return "Hello " + name + ", I am sorry we cannot let you in the party.";
        }
    }

    public String greetingWithUserInput() {
        Scanner theScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = theScanner.nextLine();

        System.out.print("Enter your age: ");
        int age = theScanner.nextInt();

        if (age >= 21) {
            return "Hello " + name + ", Welcome to the party!";
        } else {
            return "Hello " + name + ", I am sorry we cannot let you in the party.";
        }
    }

    public int addTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("Enter first number to add: ");
        int number1 = theScanner.nextInt();
        System.out.print("Enter second number to add: ");
        int number2 = theScanner.nextInt();
        return number1 + number2;
    }

    public int subtractTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("Enter first number to subtract: ");
        int number1 = theScanner.nextInt();
        System.out.print("Enter second number to subtract: ");
        int number2 = theScanner.nextInt();
        return number1 - number2;
    }

    public int multiplyTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("Enter first number to multiply: ");
        int number1 = theScanner.nextInt();
        System.out.print("Enter second number to multiply: ");
        int number2 = theScanner.nextInt();
        return number1 * number2;
    }

    public int interactiveCalculator() {
        Scanner theScanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.println("Enter your selection and press ENTER: ");

        int userSelection = theScanner.nextInt();
        int result = 0;
        switch (userSelection) {
            case 1:
                result = this.addTwoNumbers();
                break;
            case 2:
                result = this.subtractTwoNumbers();
                break;
            case 3:
                result = multiplyTwoNumbers();
                break;
            default:
                System.out.println("Error , please choose only what's available");
                return 0;
        }

        return result;
    }

    public String findTheBiggestNumber() {

        Scanner theScanner = new Scanner(System.in);

        System.out.print("give me the first number please: ");

        int firstNumber = theScanner.nextInt();

        System.out.print("give me the second nmber please: ");

        int secondNumber = theScanner.nextInt();

        int theBiggestNumber = Math.max(firstNumber, secondNumber);

        return "the Biggest Number between " + firstNumber + " and " + secondNumber + " is " + theBiggestNumber;
    }

    public String findTheSmallestNumber() {

        Scanner theScanner = new Scanner(System.in);

        System.out.print("give me the first number please: ");

        int firstNumber = theScanner.nextInt();

        System.out.print("give me the second number please: ");

        int secondNumber = theScanner.nextInt();

        int theSmallestNumber = Math.min(firstNumber, secondNumber);

        return "the smallest number between " + firstNumber + " and " + secondNumber + " is " + theSmallestNumber;

    }

    public String findTheDifferenceBetweenTwoNumbers() {
        Scanner theScanner = new Scanner(System.in);

        System.out.print("give me the first number please: ");

        int firstNumber = theScanner.nextInt();

        System.out.print("give me the second number please: ");

        int secondNumber = theScanner.nextInt();

        int difference = Math.abs(firstNumber - secondNumber);

        return "the difference between " + firstNumber + " and " + secondNumber + " is " + difference;

    }

    public String convertToUppercase(){

        Scanner theScanner = new Scanner(System.in);

        System.out.println("Provide a word to convert to all UPPERCASE: ");
        String theWord = theScanner.nextLine();

        return "You provided, " + theWord + " and we converted to: " + theWord.toUpperCase();

    }
        public String convertToLowercase(){
            Scanner theScanner = new Scanner(System.in);
            System.out.print("Provide a word to convert to all lowercase: ");
            String theWord = theScanner.nextLine();

            return "You provided, " + theWord + " and we converted to: " + theWord.toLowerCase();
        }
        public String lengthOfWord(){
            Scanner theScanner = new Scanner(System.in);
            System.out.print("Provide a word to count the length of it: ");
            String theWord = theScanner.nextLine();
            return "The length of the word " + theWord + " is : " + theWord.length() + " letters long.";
        }
}

