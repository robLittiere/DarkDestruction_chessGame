package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        char menu = 'm';        //to know where the player is in the menu 'r'; 'm'; 'p'; 'q';

        while (menu != 'q'){
            menu = gameMenu.menu(menu);
        }
        System.out.println("Aurevoir");
    }
}