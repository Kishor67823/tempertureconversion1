//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //an object of scanner named "in " is made and it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner in = new Scanner(System.in);

        //asks the user to input a farenheit temperture
        System.out.println("Enter a Fahrenheit temperature: ");
        //takes in the users tempture input into a variable called inputOfTemperture
        double inputOfTemperture = in.nextDouble();
        //converts the inputOfTemperture to celcius by subtracting 32 and multiplying by 5/9
        //and stores the value in convertToCelcius
        double convertToCelcius = (inputOfTemperture - 32) * ((double) 5 / 9);
        //converts the convertToCelcius to celcius by subtracting 32 and multiplying by 5/9
        //and stores the value in convertToKelvin
        double convertToKelvin = convertToCelcius + 273.15;
        //prints the celcius temp from the variable convertToCelcius
        System.out.println("The temperture in Celcius is: " + convertToCelcius);
        //prints the kelvin temp from the variable convertToKelvin
        System.out.println("The temperture in Kelvin is: " + convertToKelvin);


    }
}