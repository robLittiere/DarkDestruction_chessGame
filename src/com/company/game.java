package com.company;

public class game {

    private static boolean player = true;

    public static String[][] Game(String[][] gameBoard){

        PrintGame.printBoard(gameBoard);

        if (player) {
            System.out.println("It's "+gameMenu.player1+"'s turn \uD83D\uDD34, You're the red ball, don't forget !!");
            gameMenu.jumpLine(2);

            PlayerMove.PlayerMove(gameBoard,"\uD83D\uDD34");
            PrintGame.printBoard(gameBoard);
            PlayerDestroyCase.destroyCase(gameBoard);

            player = false;
        }
        else {
            System.out.println("It's "+gameMenu.player2+"'s turn \uD83D\uDD35, You're the blue ball, don't forget !!");
            gameMenu.jumpLine(2);

            PlayerMove.PlayerMove(gameBoard,"\uD83D\uDD35");
            PrintGame.printBoard(gameBoard);
            PlayerDestroyCase.destroyCase(gameBoard);

            player = true;
        }
        return gameBoard;
    }
}
