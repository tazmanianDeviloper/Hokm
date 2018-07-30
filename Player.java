package com.example.taymaz.hokm3;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
** Class Player in the first release contains only names of 3 none-main-players (robots). In future,
** when the game becomes multi-player, the class Player shall contain additional fields such as:
** int Image, where for example an onClickListener() of that image should open the player's profile.
*/

public class Player {

// Every players' hand [] collects randomly 13 Card Objects from Deck's deck().
    private List <CardView> hand = new ArrayList<>(13);

    public List<CardView> getHand(int i) {
        return hand;
    }

    public void setHand(List<CardView> hand) {
        this.hand = hand;
    }


// Droid players' names, randomly selected from the name[].
    private String[] names = new String[] {"Joe", "Jack", "Jill", "Jenifer", "Jasmin", "Jamshid", "Fereydoon",
            "Kambiz", "Sholeh", "Maryam", "Marry", "Mo", "Ali", "Karim", "Alex", "Justin", "Bill", "Jose",
            "Joseph", "David", "Mike", "Micheal", "Nora", "Megan", "Vanessa", "William", "Barry", "Aslan",
            "Shaghayegh", "Nazli", "Adrian", "Alvin", "Niki", "Nelson", "Leila", "Hamid", "Philips"};

    private String randomName = names [new Random().nextInt(names.length)];

    public String toString(){
        return randomName;
    }

/*
     public Players (String[] names, String randomName){

        this.names=names;
        this.randomName=randomName;
    }
*/

}
