package pl.FilipRajmund;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("src\\main\\resources\\pytaniaQuiz.txt");
        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            String[] split = line.split(";");
            String question = split[0];
            System.out.println(question);
            String answer1 = split[1];
            String answer2 = split[2];
            String answer3 = split[3];
            String answer4 = split[4];
            System.out.println("1. " + answer1);
            System.out.println("2. " + answer2);
            System.out.println("3. " + answer3);
            System.out.println("4. " + answer4);
            System.out.println();
            System.out.println("Jaka jest poprawna odpowiedź?");
                System.out.print("Wpisz liczbę: ");
            int answer = scanner.nextInt();
            if (answer == Integer.parseInt(split[5])){
                System.out.println("to jest poprawna odpowiedź");
            } else {
                System.out.println("to jest błędna odpowiedź");
            }
            System.out.println();
        }


    }
}