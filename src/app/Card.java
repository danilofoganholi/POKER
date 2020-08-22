package app;

import java.util.Scanner;

public class Card {
    int value;
    int suit;

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return  Main.valueCards[value-1]+Main.valueSuitS[suit-1];
    }

    public static boolean validCardsValue(String card){
        //if card value is 10 change to 0 (only to continue to use char),
        //in any other case convert to char
        char cardValue = (card.trim().equals("10"))?'0': card.toUpperCase().trim().charAt(0);

        switch (cardValue){//if the value is one of these, it is valid
            case 'A':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '0':
            case 'Q':
            case 'J':
            case 'K':
                return true;
            default:
                return false;// in other cases it is invalid
        }
    }

    public static boolean validCardsSuit(String card){

        //removes the space at the beginning and end of the word
        card = card.trim();

        try{
            int cardSuit = Integer.parseInt(card);//changes string to int

            if (cardSuit>=1 && cardSuit<=4){//if the number is 1,2,3 or 4 is valid
                return true;
            }

        }catch (NumberFormatException e ){
            return false;
        }

        return false;//in all other cases is false
    }

    public static Card getCard(){
        String cardValue;// variable that holds the card value
        String cardSuit;// variable that holds the card suit
        boolean valid;

        System.out.print("Digite o valor da carta(A,2,3,4,5,6,7,8,9,J,Q,K): ");//print of request
        do{
            Scanner myObj = new Scanner(System.in);//open scanner

            cardValue = myObj.nextLine();//read user input

            valid = validCardsValue(cardValue);//valid of cards value

            if (!(valid)){//if validation returns false
                System.out.print("Valor da carta inválido. " +
                        "Digite um dos valores a seguir (A,2,3,4,5,6,7,8,9,J,Q,K): ");//print error
            }
        }while(!(valid));

        System.out.print("Digite o número correspondente ao naipe da carta" +
                "(1-Paus/2-Coração/3-Espada/4-Ouro): ");//print of request

        do{
            Scanner myObj = new Scanner(System.in);//open scanner

            cardSuit = myObj.nextLine();//read user input

            valid = validCardsSuit(cardSuit);//valid of cards suit

            if (!(valid)){//if validation returns false
                System.out.print("Número de naipe da carta inválido. " +
                        "Digite o número correspondente ao naipe desejado" +
                        "(1-Paus/2-Coração/3-Espada/4-Ouro): ");//print error
            }
        }while(!(valid));

        return new Card(cardValue.toUpperCase().trim().charAt(0),Short.parseShort(cardSuit));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return value == card.value && suit == card.suit;
    }

//    public boolean equals(Card card) {
//        return value == card.value && suit == card.suit;
//    }
}
