package in.sampleapp;

import in.picklerick.PickleRick;

import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("\nEnter setup name: ");
        String setupName = scanner.nextLine();

        PickleRick.loadSetup(setupName);

        ShowRoom showRoom = new ShowRoom();
        ICar car = showRoom.getCar();
        System.out.println(car.toString());
    }
}
