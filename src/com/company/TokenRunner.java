package com.company;

public class TokenRunner {

    public static void main(String[] args) {
        TokenPass game1 = new TokenPass(6);

        while(game1.gameOver() < 0)
        {
            game1.printBoard();
            game1.distributeCurrentPlayerTokens();
            game1.nextPlayer();
        }
        game1.printBoard();
        System.out.println("game Winner: Player " + game1.gameOver());
    }
}
