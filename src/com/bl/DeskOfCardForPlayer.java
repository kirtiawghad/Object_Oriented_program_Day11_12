package com.bl;

public class DeskOfCardForPlayer {

    public void cardForPlayer(){
        String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] cardNumbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] cardsArray = new String[52];
        int start = 0, end = 12, j1 = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = start; j <= end; j++) {
                cardsArray[j] = cardType[i] + " " + cardNumbers[j1];
                j1++;
            }
            j1 = 0;
            start = end + 1;
            end += 13;
        }


        int j2 = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("For Player " + i + ": \n");
            for (int j = 0; j < 9; j++) {

                System.out.print(cardsArray[j2] + "-->");
                j2++;
            }
            System.out.println();
        }

    }
}
