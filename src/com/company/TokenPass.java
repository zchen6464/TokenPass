package com.company;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for(int i =0; i < playerCount; i++)
        {
            board[i] = (int)(Math.random()*10 +1);
        }
        currentPlayer = (int)(Math.random()*(playerCount-1));
    }

    public void distributeCurrentPlayerTokens()
    {
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;
        while (numToDistribute > 0)
        {
            nextPlayer = (nextPlayer + 1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }

    public int gameOver()
    {
        for(int i = 0; i < board.length; i++)
        {
            if(board[i] == 0)
            {
              return i+1;
            }
        }
        return -1;
    }

    public void printBoard()
    {
        for(int i = 0; i < board.length; i++)
        {
            System.out.println("Player " + (i + 1)  + ": " + board[i] + "Tokens");
        }
    }

    public void nextPlayer()
    {
        currentPlayer++;
        if(currentPlayer <= board.length)
        {
            currentPlayer = 0;
        }
    }
}
