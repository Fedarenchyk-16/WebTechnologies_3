package by.bsuir.webTech3.client.clientInformation;

import java.util.Scanner;

public class CommandReader {
    Scanner scan;
    public CommandReader(){
        scan = new Scanner(System.in);
    }
    public String getCommand(){
        return scan.nextLine();
    }
}
