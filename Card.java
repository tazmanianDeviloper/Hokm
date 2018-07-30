package com.example.taymaz.hokm3;

/*
** For the purpose of code re-use-ability, objects from this class cannot use their name;
** instead IDs such as "c1" or "c20" are used so that if in future additional decks are added to
** the game overloading errors are prevented.
 */

import android.widget.ImageView;

public class Card {

    private Integer faceValue;

    enum Face {twoOfHearts, threeOfHearts, fourOfHearts, fiveOfHearts, sixOfHearts, sevenOfHearts,
        eightOfHearts, nineOfHearts, tenOfHearts, knightOfHearts, queenOfHearts, kingOfHearts,
        aceOfHearts, twoOfSpades, threeOfSpades, fourOfSpades, fiveOfSpades, sixOfSpades,
        sevenOfSpades, eightOfSpades, nineOfSpades, tenOfSpades, knightOfSpades, queenOfSpades,
        kingOfSpades, aceOfSpades, twoOfDiamonds, threeOfDiamonds, fourOfDiamonds, fiveOfDiamonds,
        sixOfDiamonds, sevenOfDiamonds, eightOfDiamonds, nineOfDiamonds, tenOfDiamonds,
        knightOfDiamonds, queenOfDiamonds, kingOfDiamonds, aceOfDiamonds, twoOfClovers,
        threeOfClovers, fourOfClovers, fiveOfClovers, sixOfClovers, sevenOfClovers, eightOfClovers,
        nineOfClovers, tenOfClovers, knightOfClovers, queenOfClovers, kingOfClovers, aceOfClovers}
    private Face face;

    enum Suit {heart, clover, diamond, spades}
    private Suit suit;

    ImageView frontView;
    ImageView backView;



/*
** A parametrized constructor has been used to initialize Obj Card with Class Card(immutable class)
** attributes, but Getter/Setter methods are also constructed, as those attributes might change at
** run-time. For Example the crownSuit() method will change or over-ride the int value of 13 cards
** on each run. Further more, having Getter/Setter might present me with opportunities later on
** (code re-use-ability).
*/


    public Card(Face face, Integer faceValue, Suit suit, ImageView frontView, ImageView backView) {
        this.faceValue=faceValue;
        this.face=face;
        this.suit=suit;
        this.frontView=frontView;
        this.backView=backView;
    }

    public Card(){

    }

}
