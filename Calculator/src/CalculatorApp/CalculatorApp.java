package CalculatorApp;

import Calculator.Calculator;
import Operations.DividingOperation;
import Operations.MinusOperation;
import Operations.MultiplicationOperation;
import Operations.PlusOperation;

import java.util.Scanner;

public class CalculatorApp {
    private final Scanner scanner = new Scanner(System.in);
    private final Calculator calculator = new Calculator();

    public CalculatorApp() {
        MinusOperation minusOperation = new MinusOperation();
        PlusOperation plusOperation = new PlusOperation();
        MultiplicationOperation multiplicationOperation = new MultiplicationOperation();
        DividingOperation dividingOperation = new DividingOperation();

        this.calculator.addOperation(minusOperation);
        this.calculator.addOperation(plusOperation);
        this.calculator.addOperation(multiplicationOperation);
        this.calculator.addOperation(dividingOperation);
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            System.out.println(" ");
            System.out.println("Enter the operation:");
            System.out.println("1: Entering a formula");
            System.out.println("2: Exiting the program");
            System.out.println(" ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера после чтения числа

            switch (choice) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Enter the formula:");
                    System.out.println(" ");
                    String formula = scanner.nextLine();
                    try {
                        float result = this.calculator.apply(formula);
                        System.out.println(result);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong choice. Please select one of the suggested options.");
            }
        }
    }
}
