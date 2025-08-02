package com.alap;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a non numeric string: ");

            if (StringUtils.isNumeric(scanner.nextLine())) {
                System.out.println("The provided string is numeric!");
            } else {
                System.out.println("The provided string is valid.");
            }
        }
    }
}
