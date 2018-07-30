package com.example.taymaz.hokm3;

/*
import java.util.ArrayList;
import java.util.Collections;
import android.widget.ImageView;

/*
** Class Deck contains 52 Card objects, each of which is an instance from the class Card. Cards'
** attributes have been initialized using a constructor from the Card class.
*/
/*
public class Deck {

     Card c1 = new Card("twoOfHearts", 1, Card.Suit.Heart, Card.Color.Red);
     Card c2 = new Card ("threeOfHearts", 2, Card.Suit.Heart, Card.Color.Red);
     Card c3 = new Card("fourOfHearts", 3, Card.Suit.Heart, Card.Color.Red);
     Card c4 = new Card ("fiveOfHearts", 4, Card.Suit.Heart, Card.Color.Red);
     Card c5 = new Card("sixOfHearts", 1, Card.Suit.Heart, Card.Color.Red);
     Card c6 = new Card ("sevenOfHearts", 2, Card.Suit.Heart, Card.Color.Red);
     Card c7 = new Card("eightOfHearts", 3, Card.Suit.Heart, Card.Color.Red);
     Card c8 = new Card ("nineOfHearts", 4, Card.Suit.Heart, Card.Color.Red);
     Card c9 = new Card("tenOfHearts", 1, Card.Suit.Heart, Card.Color.Red);
     Card c10 = new Card ("knightOfHearts", 2, Card.Suit.Heart, Card.Color.Red);
     Card c11 = new Card("queenOfHearts", 3, Card.Suit.Heart, Card.Color.Red);
     Card c12 = new Card ("kingOfHearts", 4, Card.Suit.Heart, Card.Color.Red);
     Card c13 = new Card("aceOfHearts", 1, Card.Suit.Heart, Card.Color.Red);

     Card c14 = new Card ("twoOfSpades", 2, Card.Suit.Spades, Card.Color.Blk);
     Card c15 = new Card("threeOfSpades", 3, Card.Suit.Spades, Card.Color.Blk);
     Card c16 = new Card ("fourOfSpades", 4, Card.Suit.Spades, Card.Color.Blk);
     Card c17 = new Card("fiveOfSpades", 1, Card.Suit.Spades, Card.Color.Blk);
     Card c18 = new Card ("sixOfSpades", 2, Card.Suit.Spades, Card.Color.Blk);
     Card c19 = new Card("sevenOfSpades", 3, Card.Suit.Spades, Card.Color.Blk);
     Card c20 = new Card ("eightOfSpades", 4, Card.Suit.Spades, Card.Color.Blk);
     Card c21 = new Card("nineOfSpades", 1, Card.Suit.Spades, Card.Color.Blk);
     Card c22 = new Card ("tenOfSpades", 2, Card.Suit.Spades, Card.Color.Blk);
     Card c23 = new Card("knightOfSpades", 3, Card.Suit.Spades, Card.Color.Blk);
     Card c24 = new Card ("queenOfSpades", 4, Card.Suit.Spades, Card.Color.Blk);
     Card c25 = new Card("kingOfSpades", 1, Card.Suit.Spades, Card.Color.Blk);
     Card c26 = new Card ("aceOfSpades", 2, Card.Suit.Spades, Card.Color.Blk);

     Card c27 = new Card("twoOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red);
     Card c28 = new Card ("threeOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red);
     Card c29 = new Card("fourOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red);
     Card c30 = new Card ("fiveOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red);
     Card c31 = new Card("sixOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red);
     Card c32 = new Card ("sevenOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red);
     Card c33 = new Card("eightOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red);
     Card c34 = new Card ("nineOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red);
     Card c35 = new Card("tenOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red);
     Card c36 = new Card ("knightOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red);
     Card c37 = new Card("queenOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red);
     Card c38 = new Card ("kingOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red);
     Card c39 = new Card("aceOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red);

     Card c40 = new Card ("twoOfClovers", 4, Card.Suit.Clover, Card.Color.Blk);
     Card c41 = new Card("threeOfClovers", 1, Card.Suit.Clover, Card.Color.Blk);
     Card c42 = new Card ("fourOfClovers", 2, Card.Suit.Clover, Card.Color.Blk);
     Card c43 = new Card("fiveOfClovers", 3, Card.Suit.Clover, Card.Color.Blk);
     Card c44 = new Card ("sixOfClovers", 4, Card.Suit.Clover, Card.Color.Blk);
     Card c45 = new Card("sevenOfClovers", 1, Card.Suit.Clover, Card.Color.Blk);
     Card c46 = new Card ("eightOfClovers", 2, Card.Suit.Clover, Card.Color.Blk);
     Card c47 = new Card("nineOfClovers", 3, Card.Suit.Clover, Card.Color.Blk);
     Card c48 = new Card ("tenOfClovers", 4, Card.Suit.Clover, Card.Color.Blk);
     Card c49 = new Card("knightOfClovers", 1, Card.Suit.Clover, Card.Color.Blk);
     Card c50 = new Card ("queenOfClovers", 2, Card.Suit.Clover, Card.Color.Blk);
     Card c51 = new Card("kingOfClovers", 3, Card.Suit.Clover, Card.Color.Blk);
     Card c52 = new Card ("aceOfClovers", 4, Card.Suit.Clover, Card.Color.Blk);


    Deck() {

        ArrayList<Card> cardsInTheDeck = new ArrayList<>();
        cardsInTheDeck.add(c1);
        cardsInTheDeck.add(c2);
        cardsInTheDeck.add(c3);
        cardsInTheDeck.add(c4);
        cardsInTheDeck.add(c5);
        cardsInTheDeck.add(c6);
        cardsInTheDeck.add(c7);
        cardsInTheDeck.add(c8);
        cardsInTheDeck.add(c9);
        cardsInTheDeck.add(c10);
        cardsInTheDeck.add(c11);
        cardsInTheDeck.add(c12);
        cardsInTheDeck.add(c13);
        cardsInTheDeck.add(c14);
        cardsInTheDeck.add(c15);
        cardsInTheDeck.add(c16);
        cardsInTheDeck.add(c17);
        cardsInTheDeck.add(c18);
        cardsInTheDeck.add(c19);
        cardsInTheDeck.add(c20);
        cardsInTheDeck.add(c21);
        cardsInTheDeck.add(c22);
        cardsInTheDeck.add(c23);
        cardsInTheDeck.add(c24);
        cardsInTheDeck.add(c25);
        cardsInTheDeck.add(c26);
        cardsInTheDeck.add(c27);
        cardsInTheDeck.add(c28);
        cardsInTheDeck.add(c29);
        cardsInTheDeck.add(c30);
        cardsInTheDeck.add(c31);
        cardsInTheDeck.add(c32);
        cardsInTheDeck.add(c33);
        cardsInTheDeck.add(c34);
        cardsInTheDeck.add(c35);
        cardsInTheDeck.add(c36);
        cardsInTheDeck.add(c37);
        cardsInTheDeck.add(c38);
        cardsInTheDeck.add(c39);
        cardsInTheDeck.add(c40);
        cardsInTheDeck.add(c41);
        cardsInTheDeck.add(c42);
        cardsInTheDeck.add(c43);
        cardsInTheDeck.add(c44);
        cardsInTheDeck.add(c45);
        cardsInTheDeck.add(c46);
        cardsInTheDeck.add(c47);
        cardsInTheDeck.add(c48);
        cardsInTheDeck.add(c49);
        cardsInTheDeck.add(c50);
        cardsInTheDeck.add(c51);
        cardsInTheDeck.add(c52);

        //Collections.shuffle(cardsInTheDeck);

         //Object[] array = new Object[52];

          //((ImageView) Card.ImageView.c1View).setImageResource(R.drawable.c1);

    }


    public void blabla() {
        ArrayList<Card.Suit> suitsInTheDeck = new ArrayList<>();

        suitsInTheDeck.add(Card.Suit.Heart);
        suitsInTheDeck.add(Card.Suit.Spades);
        suitsInTheDeck.add(Card.Suit.Diamond);
        suitsInTheDeck.add(Card.Suit.Clover);

    }

    public void blablabla () {
        ArrayList<Card.Color> colorsInTheDeck = new ArrayList<>();

        colorsInTheDeck.add(Card.Color.Blk);
        colorsInTheDeck.add(Card.Color.Red);
    }

    enum ImageView {c1View, c2View, c3View, c4View, c5View, c6View, c7View, c8View, c9View, c10View,
        c11View, c12View, c13View, c14View, c15View, c16View, c17View, c18View, c19View, c20View,
        c21View, c22View, c23View, c24View, c25View, c26View, c27View, c28View, c29View, c30View,
        c31View, c32View, c33View, c34View, c35View, c36View, c37View, c38View, c39View, c40View,
        c41View, c42View, c43View, c44View, c45View, c46View, c47View, c48View, c49View, c50View,
        c51View, c52View}

}


    Card c1 = new Card("twoOfHearts", 1, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c1View);
    Card c2 = new Card("threeOfHearts", 2, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c2View);
    Card c3 = new Card("fourOfHearts", 3, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c3View);
    Card c4 = new Card("fiveOfHearts", 4, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c4View);
    Card c5 = new Card("sixOfHearts", 1, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c5View);
    Card c6 = new Card("sevenOfHearts", 2, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c6View);
    Card c7 = new Card("eightOfHearts", 3, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c7View);
    Card c8 = new Card("nineOfHearts", 4, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c8View);
    Card c9 = new Card("tenOfHearts", 1, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c9View);
    Card c10 = new Card("knightOfHearts", 2, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c10View);
    Card c11 = new Card("queenOfHearts", 3, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c11View);
    Card c12 = new Card("kingOfHearts", 4, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c12View);
    Card c13 = new Card("aceOfHearts", 1, Card.Suit.Heart, Card.Color.Red, Card.ImageView.c13View);

    Card c14 = new Card("twoOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c14View);
    Card c15 = new Card("threeOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c15View);
    Card c16 = new Card("fourOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c16View);
    Card c17 = new Card("fiveOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c17View);
    Card c18 = new Card("sixOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c18View);
    Card c19 = new Card("sevenOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c19View);
    Card c20 = new Card("eightOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c20View);
    Card c21 = new Card("nineOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c21View);
    Card c22 = new Card("tenOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c22View);
    Card c23 = new Card("knightOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c23View);
    Card c24 = new Card("queenOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c24View);
    Card c25 = new Card("kingOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c25View);
    Card c26 = new Card("aceOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, Card.ImageView.c26View);

    Card c27 = new Card("twoOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c27View);
    Card c28 = new Card("threeOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c28View);
    Card c29 = new Card("fourOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c29View);
    Card c30 = new Card("fiveOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c30View);
    Card c31 = new Card("sixOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c31View);
    Card c32 = new Card("sevenOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c32View);
    Card c33 = new Card("eightOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c33View);
    Card c34 = new Card("nineOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c34View);
    Card c35 = new Card("tenOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c35View);
    Card c36 = new Card("knightOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c36View);
    Card c37 = new Card("queenOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c37View);
    Card c38 = new Card("kingOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c38View);
    Card c39 = new Card("aceOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, Card.ImageView.c39View);

    Card c40 = new Card("twoOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c40View);
    Card c41 = new Card("threeOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c41View);
    Card c42 = new Card("fourOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c42View);
    Card c43 = new Card("fiveOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c43View);
    Card c44 = new Card("sixOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c44View);
    Card c45 = new Card("sevenOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c45View);
    Card c46 = new Card("eightOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c46View);
    Card c47 = new Card("nineOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c47View);
    Card c48 = new Card("tenOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c48View);
    Card c49 = new Card("knightOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c49View);
    Card c50 = new Card("queenOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c50View);
    Card c51 = new Card("kingOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c51View);
    Card c52 = new Card("aceOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, Card.ImageView.c52View);


        enum ImageView {R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5, R.drawable.c6,
             R.drawable.c7, R.drawable.c8, R.drawable.c9, R.drawable.c10, R.drawable.c11,
             R.drawable.c12, R.drawable.c13, R.drawable.c14, R.drawable.c15, R.drawable.c16,
             R.drawable.c17, R.drawable.c18, R.drawable.c19, R.drawable.c20, R.drawable.c21,
             R.drawable.c22, R.drawable.c23, R.drawable.c24, R.drawable.c25, R.drawable.c26,
             R.drawable.c27, R.drawable.c28, R.drawable.c29, R.drawable.c30, R.drawable.c31,
             R.drawable.c32, R.drawable.c33, R.drawable.c34, R.drawable.c35, R.drawable.c36,
             R.drawable.c37, R.drawable.c38, R.drawable.c39, R.drawable.c40, R.drawable.c41,
             R.drawable.c42, R.drawable.c43, R.drawable.c44, R.drawable.c45, R.drawable.c46,
             R.drawable.c47, R.drawable.c48, R.drawable.c49, R.drawable.c50, R.drawable.c51,
             R.drawable.c52,

                 enum ImageView {c1View, c2View, c3View, c4View, c5View, c6View, c7View, c8View, c9View, c10View,
        c11View, c12View, c13View, c14View, c15View, c16View, c17View, c18View, c19View, c20View,
        c21View, c22View, c23View, c24View, c25View, c26View, c27View, c28View, c29View, c30View,
        c31View, c32View, c33View, c34View, c35View, c36View, c37View, c38View, c39View, c40View,
        c41View, c42View, c43View, c44View, c45View, c46View, c47View, c48View, c49View, c50View,
        c51View, c52View}
    ImageView frontView;

    enum  {backView1, backView2, backView3, backView4, backView5, backView6, backView7,
        backView8, backView9, backView10, backView11, backView12, backView13, backView14, backView15,
        backView16, backView17, backView18, backView19, backView20, backView21, backView22, backView23,
        backView24, backView25, backView26, backView27, backView28, backView29, backView30, backView31,
        backView32, backView33, backView34, backView35, backView36, backView37, backView38, backView39,
        backView40, backView41, backView42, backView43, backView44, backView45, backView46, backView47,
        backView48, backView49, backView50, backView51, backView52}
    ImageView backView;

private android.widget.ImageView frontImageView;
private android.widget.ImageView backImageView;


                String noIdEntered = "You";
                textView.setText(editText.getText())

    <ImageView
        android:id="@+id/c1View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="visible"
        app:srcCompat="@drawable/c1" />

    <ImageView
        android:id="@+id/c2View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c2" />

    <ImageView
        android:id="@+id/c3View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c3" />

    <ImageView
        android:id="@+id/c4View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c4" />

    <ImageView
        android:id="@+id/c5View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c5" />

    <ImageView
        android:id="@+id/c6View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c6" />

    <ImageView
        android:id="@+id/c7View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c7" />

    <ImageView
        android:id="@+id/c8View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c8" />

    <ImageView
        android:id="@+id/c9View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c9" />

    <ImageView
        android:id="@+id/c10View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c10" />

    <ImageView
        android:id="@+id/c11View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c11" />

    <ImageView
        android:id="@+id/c12View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c12" />

    <ImageView
        android:id="@+id/c13View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c13" />

    <ImageView
        android:id="@+id/c14View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c14" />

    <ImageView
        android:id="@+id/c15View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c15" />

    <ImageView
        android:id="@+id/c16View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c16" />

    <ImageView
        android:id="@+id/c17View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c17" />

    <ImageView
        android:id="@+id/c18View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c18" />

    <ImageView
        android:id="@+id/c19View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c19" />

    <ImageView
        android:id="@+id/c20View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c20" />

    <ImageView
        android:id="@+id/c21View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        app:srcCompat="@drawable/c21"
        android:visibility="invisible" />

    <ImageView
        android:id="@+id/c22View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c22" />

    <ImageView
        android:id="@+id/c23View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c23" />

    <ImageView
        android:id="@+id/c24View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c24" />

    <ImageView
        android:id="@+id/c25View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c25" />

    <ImageView
        android:id="@+id/c26View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c26" />

    <ImageView
        android:id="@+id/c27View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c27" />

    <ImageView
        android:id="@+id/c28View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c28" />

    <ImageView
        android:id="@+id/c29View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c29" />

    <ImageView
        android:id="@+id/c30View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c30" />

    <ImageView
        android:id="@+id/c31View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c31" />

    <ImageView
        android:id="@+id/c32View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c32" />

    <ImageView
        android:id="@+id/c33View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c33" />

    <ImageView
        android:id="@+id/c34View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c34" />

    <ImageView
        android:id="@+id/c35View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c35" />

    <ImageView
        android:id="@+id/c36View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c36" />

    <ImageView
        android:id="@+id/c37View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c37" />

    <ImageView
        android:id="@+id/c38View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c38" />

    <ImageView
        android:id="@+id/c39View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c39" />

    <ImageView
        android:id="@+id/c40View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c40" />

    <ImageView
        android:id="@+id/c41View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c41" />

    <ImageView
        android:id="@+id/c42View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c42" />

    <ImageView
        android:id="@+id/c43View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c43" />

    <ImageView
        android:id="@+id/c44View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c44" />

    <ImageView
        android:id="@+id/c45View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c45" />

    <ImageView
        android:id="@+id/c46View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c46" />

    <ImageView
        android:id="@+id/c47View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c47" />

    <ImageView
        android:id="@+id/c48View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c48" />

    <ImageView
        android:id="@+id/c49View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c49" />

    <ImageView
        android:id="@+id/c50View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c50" />

    <ImageView
        android:id="@+id/c51View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c51" />

    <ImageView
        android:id="@+id/c52View"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/app_name"
        android:visibility="invisible"
        app:srcCompat="@drawable/c52" />

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/back" />


  textView2 = (TextView) findViewById(R.id.textView2);
  Player secondPlayer = new Player();
  textView2.setText(secondPlayer.toString());


  /*
    public enum Card{
        c1(1,R.drawable.c1),
        private int image;
        private int value;
        private Card (int value, int drawableId){
            this.value = value;
            this.image = drawableId;
        }
        public  int getImage(){
            return image;
        }

        }

                button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //InputMethodManager myIMM = new InputMethodManager();
                textView1.setText(editText.getText());
            }
        });


       // if (random.nextInt(cardsInTheDeck.size()) == c13||c26||c39||c52)

        //dealCards();
        //String randomCard = shuffledDeck [random.nextInt(shuffledDeck[])];

        /*
// The startPlaying() gathers all card objects, shuffles them, and picks one randomly.
    Object startPlaying(){

      List <Object> cardsInTheDeck = new ArrayList<>();

        cardsInTheDeck.add(c1);
        cardsInTheDeck.add(c2);
        cardsInTheDeck.add(c3);
        cardsInTheDeck.add(c4);
        cardsInTheDeck.add(c5);
        cardsInTheDeck.add(c6);
        cardsInTheDeck.add(c7);
        cardsInTheDeck.add(c8);
        cardsInTheDeck.add(c9);
        cardsInTheDeck.add(c10);
        cardsInTheDeck.add(c11);
        cardsInTheDeck.add(c12);
        cardsInTheDeck.add(c13);
        cardsInTheDeck.add(c14);
        cardsInTheDeck.add(c15);
        cardsInTheDeck.add(c16);
        cardsInTheDeck.add(c17);
        cardsInTheDeck.add(c18);
        cardsInTheDeck.add(c19);
        cardsInTheDeck.add(c20);
        cardsInTheDeck.add(c21);
        cardsInTheDeck.add(c22);
        cardsInTheDeck.add(c23);
        cardsInTheDeck.add(c24);
        cardsInTheDeck.add(c25);
        cardsInTheDeck.add(c26);
        cardsInTheDeck.add(c27);
        cardsInTheDeck.add(c28);
        cardsInTheDeck.add(c29);
        cardsInTheDeck.add(c30);
        cardsInTheDeck.add(c31);
        cardsInTheDeck.add(c32);
        cardsInTheDeck.add(c33);
        cardsInTheDeck.add(c34);
        cardsInTheDeck.add(c35);
        cardsInTheDeck.add(c36);
        cardsInTheDeck.add(c37);
        cardsInTheDeck.add(c38);
        cardsInTheDeck.add(c39);
        cardsInTheDeck.add(c40);
        cardsInTheDeck.add(c41);
        cardsInTheDeck.add(c42);
        cardsInTheDeck.add(c43);
        cardsInTheDeck.add(c44);
        cardsInTheDeck.add(c45);
        cardsInTheDeck.add(c46);
        cardsInTheDeck.add(c47);
        cardsInTheDeck.add(c48);
        cardsInTheDeck.add(c49);
        cardsInTheDeck.add(c50);
        cardsInTheDeck.add(c51);
        cardsInTheDeck.add(c52);

        Collections.shuffle(cardsInTheDeck);
        Object[] shuffledDeck = new Object[]{cardsInTheDeck};
        Object randomCard = random.nextInt(shuffledDeck.length);
        randomCard.notify();
        StartAnimation();

        return randomCard;
    }

        Card c1 = new Card("twoOfHearts", 1, Card.Suit.Heart, Card.Color.Red, R.drawable.c1, R.drawable.back, R.id.card1CardView);
    Card c2 = new Card("threeOfHearts", 2, Card.Suit.Heart, Card.Color.Red, R.drawable.c2, R.drawable.back, R.id.card2CardView);
    Card c3 = new Card("fourOfHearts", 3, Card.Suit.Heart, Card.Color.Red, R.drawable.c3, R.drawable.back,R.id.card3CardView);
    Card c4 = new Card("fiveOfHearts", 4, Card.Suit.Heart, Card.Color.Red, R.drawable.c4, R.drawable.back, R.id.card4CardView);
    Card c5 = new Card("sixOfHearts", 1, Card.Suit.Heart, Card.Color.Red, R.drawable.c5, R.drawable.back, R.id.card5CardView);
    Card c6 = new Card("sevenOfHearts", 2, Card.Suit.Heart, Card.Color.Red, R.drawable.c6, R.drawable.back, R.id.card6CardView);
    Card c7 = new Card("eightOfHearts", 3, Card.Suit.Heart, Card.Color.Red, R.drawable.c7, R.drawable.back, R.id.card7CardView);
    Card c8 = new Card("nineOfHearts", 4, Card.Suit.Heart, Card.Color.Red, R.drawable.c8, R.drawable.back, R.id.card8CardView);
    Card c9 = new Card("tenOfHearts", 1, Card.Suit.Heart, Card.Color.Red, R.drawable.c9, R.drawable.back, R.id.card9CardView);
    Card c10 = new Card("knightOfHearts", 2, Card.Suit.Heart, Card.Color.Red, R.drawable.c10, R.drawable.back, R.id.card10CardView);
    Card c11 = new Card("queenOfHearts", 3, Card.Suit.Heart, Card.Color.Red, R.drawable.c11, R.drawable.back, R.id.card11CardView);
    Card c12 = new Card("kingOfHearts", 4, Card.Suit.Heart, Card.Color.Red, R.drawable.c12, R.drawable.back, R.id.card12CardView);
    Card c13 = new Card("aceOfHearts", 1, Card.Suit.Heart, Card.Color.Red, R.drawable.c13, R.drawable.back, R.id.card13CardView);

    Card c14 = new Card("twoOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, R.drawable.c14, R.drawable.back, R.id.card14CardView);
    Card c15 = new Card("threeOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, R.drawable.c15, R.drawable.back, R.id.card15CardView);
    Card c16 = new Card("fourOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, R.drawable.c16, R.drawable.back, R.id.card16CardView);
    Card c17 = new Card("fiveOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, R.drawable.c17, R.drawable.back, R.id.card17CardView);
    Card c18 = new Card("sixOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, R.drawable.c18, R.drawable.back, R.id.card18CardView);
    Card c19 = new Card("sevenOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, R.drawable.c19, R.drawable.back, R.id.card19CardView);
    Card c20 = new Card("eightOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, R.drawable.c20, R.drawable.back, R.id.card20CardView);
    Card c21 = new Card("nineOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, R.drawable.c21, R.drawable.back, R.id.card21CardView);
    Card c22 = new Card("tenOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, R.drawable.c22, R.drawable.back, R.id.card22CardView);
    Card c23 = new Card("knightOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, R.drawable.c23, R.drawable.back, R.id.card23CardView);
    Card c24 = new Card("queenOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, R.drawable.c24, R.drawable.back, R.id.card24CardView);
    Card c25 = new Card("kingOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, R.drawable.c25, R.drawable.back, R.id.card25CardView);
    Card c26 = new Card("aceOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, R.drawable.c26, R.drawable.back, R.id.card26CardView);

    Card c27 = new Card("twoOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, R.drawable.c27, R.drawable.back, R.id.card27CardView);
    Card c28 = new Card("threeOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, R.drawable.c28, R.drawable.back, R.id.card28CardView);
    Card c29 = new Card("fourOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, R.drawable.c29, R.drawable.back, R.id.card29CardView);
    Card c30 = new Card("fiveOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, R.drawable.c30, R.drawable.back, R.id.card30CardView);
    Card c31 = new Card("sixOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, R.drawable.c31, R.drawable.back, R.id.card31CardView);
    Card c32 = new Card("sevenOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, R.drawable.c32, R.drawable.back, R.id.card32CardView);
    Card c33 = new Card("eightOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, R.drawable.c33, R.drawable.back, R.id.card33CardView);
    Card c34 = new Card("nineOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, R.drawable.c34, R.drawable.back, R.id.card34CardView);
    Card c35 = new Card("tenOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, R.drawable.c35, R.drawable.back, R.id.card35CardView);
    Card c36 = new Card("knightOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red,R.drawable.c36, R.drawable.back, R.id.card36CardView);
    Card c37 = new Card("queenOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, R.drawable.c37, R.drawable.back, R.id.card37CardView);
    Card c38 = new Card("kingOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, R.drawable.c38, R.drawable.back, R.id.card38CardView);
    Card c39 = new Card("aceOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, R.drawable.c39, R.drawable.back, R.id.card39CardView);

    Card c40 = new Card("twoOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, R.drawable.c40, R.drawable.back, R.id.card40CardView);
    Card c41 = new Card("threeOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, R.drawable.c41, R.drawable.back, R.id.card41CardView);
    Card c42 = new Card("fourOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, R.drawable.c42, R.drawable.back, R.id.card42CardView);
    Card c43 = new Card("fiveOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, R.drawable.c43, R.drawable.back, R.id.card43CardView);
    Card c44 = new Card("sixOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, R.drawable.c44, R.drawable.back, R.id.card44CardView);
    Card c45 = new Card("sevenOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, R.drawable.c45, R.drawable.back, R.id.card45CardView);
    Card c46 = new Card("eightOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, R.drawable.c46, R.drawable.back, R.id.card46CardView);
    Card c47 = new Card("nineOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, R.drawable.c47, R.drawable.back, R.id.card47CardView);
    Card c48 = new Card("tenOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, R.drawable.c48, R.drawable.back, R.id.card48CardView);
    Card c49 = new Card("knightOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, R.drawable.c49, R.drawable.back, R.id.card49CardView);
    Card c50 = new Card("queenOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, R.drawable.c50, R.drawable.back, R.id.card50CardView);
    Card c51 = new Card("kingOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, R.drawable.c51, R.drawable.back, R.id.card51CardView);
    Card c52 = new Card("aceOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, R.drawable.c52, R.drawable.back, R.id.card52CardView);


       CardView card1CardView;
    ImageView card1FrontView;
    ImageView card1BackView;

    CardView card2CardView;
    ImageView card2FrontView;
    ImageView card2BackView;

    CardView card3CardView;
    ImageView card3FrontView;
    ImageView card3BackView;

    CardView card4CardView;
    ImageView card4FrontView;
    ImageView card4BackView;

    CardView card5CardView;
    ImageView card5FrontView;
    ImageView card5BackView;

    CardView card6CardView;
    ImageView card6FrontView;
    ImageView card6BackView;

    CardView card7CardView;
    ImageView card7FrontView;
    ImageView card7BackView;

    CardView card8CardView;
    ImageView card8FrontView;
    ImageView card8BackView;

    CardView card9CardView;
    ImageView card9FrontView;
    ImageView card9BackView;

    CardView card10CardView;
    ImageView card10FrontView;
    ImageView card10BackView;

    CardView card11CardView;
    ImageView card11FrontView;
    ImageView card11BackView;

    CardView card12CardView;
    ImageView card12FrontView;
    ImageView card12BackView;

    CardView card13CardView;
    ImageView card13FrontView;
    ImageView card13BackView;

    CardView card14CardView;
    ImageView card14FrontView;
    ImageView card14BackView;

    CardView card15CardView;
    ImageView card15FrontView;
    ImageView card15BackView;

    CardView card16CardView;
    ImageView card16FrontView;
    ImageView card16BackView;

    CardView card17CardView;
    ImageView card17FrontView;
    ImageView card17BackView;

    CardView card18CardView;
    ImageView card18FrontView;
    ImageView card18BackView;

    CardView card19CardView;
    ImageView card19FrontView;
    ImageView card19BackView;

    CardView card20CardView;
    ImageView card20FrontView;
    ImageView card20BackView;

    CardView card21CardView;
    ImageView card21FrontView;
    ImageView card21BackView;

    CardView card22CardView;
    ImageView card22FrontView;
    ImageView card22BackView;

    CardView card23CardView;
    ImageView card23FrontView;
    ImageView card23BackView;

    CardView card24CardView;
    ImageView card24FrontView;
    ImageView card24BackView;

    CardView card25CardView;
    ImageView card25FrontView;
    ImageView card25BackView;

    CardView card26CardView;
    ImageView card26FrontView;
    ImageView card26BackView;

    CardView card27CardView;
    ImageView card27FrontView;
    ImageView card27BackView;

    CardView card28CardView;
    ImageView card28FrontView;
    ImageView card28BackView;

    CardView card29CardView;
    ImageView card29FrontView;
    ImageView card29BackView;

    CardView card30CardView;
    ImageView card30FrontView;
    ImageView card30BackView;

    CardView card31CardView;
    ImageView card31FrontView;
    ImageView card31BackView;

    CardView card32CardView;
    ImageView card32FrontView;
    ImageView card32BackView;

    CardView card33CardView;
    ImageView card33FrontView;
    ImageView card33BackView;

    CardView card34CardView;
    ImageView card34FrontView;
    ImageView card34BackView;

    CardView card35CardView;
    ImageView card35FrontView;
    ImageView card35BackView;

    CardView card36CardView;
    ImageView card36FrontView;
    ImageView card36BackView;

    CardView card37CardView;
    ImageView card37FrontView;
    ImageView card37BackView;

    CardView card38CardView;
    ImageView card38FrontView;
    ImageView card38BackView;

    CardView card39CardView;
    ImageView card39FrontView;
    ImageView card39BackView;

    CardView card40CardView;
    ImageView card40FrontView;
    ImageView card40BackView;

    CardView card41CardView;
    ImageView card41FrontView;
    ImageView card41BackView;

    CardView card42CardView;
    ImageView card42FrontView;
    ImageView card42BackView;

    CardView card43CardView;
    ImageView card43FrontView;
    ImageView card43BackView;

    CardView card44CardView;
    ImageView card44FrontView;
    ImageView card44BackView;

    CardView card45CardView;
    ImageView card45FrontView;
    ImageView card45BackView;

    CardView card46CardView;
    ImageView card46FrontView;
    ImageView card46BackView;

    CardView card47CardView;
    ImageView card47FrontView;
    ImageView card47BackView;

    CardView card48CardView;
    ImageView card48FrontView;
    ImageView card48BackView;

    CardView card49CardView;
    ImageView card49FrontView;
    ImageView card49BackView;

    CardView card50CardView;
    ImageView card50FrontView;
    ImageView card50BackView;

    CardView card51CardView;
    ImageView card51FrontView;
    ImageView card51BackView;

    CardView card52CardView;
    ImageView card52FrontView;
    ImageView card52BackView;

     card1CardView = (CardView) findViewById(R.id.card1CardView);
        card1FrontView = (ImageView) findViewById(R.id.card1FrontView);
        card1BackView = (ImageView) findViewById(R.id.card1BackView);

        card2CardView = (CardView) findViewById(R.id.card2CardView);
        card2FrontView = (ImageView) findViewById(R.id.card2FrontView);
        card2BackView = (ImageView) findViewById(R.id.card2BackView);

        card3CardView = (CardView) findViewById(R.id.card3CardView);
        card3FrontView = (ImageView) findViewById(R.id.card3FrontView);
        card3BackView = (ImageView) findViewById(R.id.card3BackView);

        card4CardView = (CardView) findViewById(R.id.card4CardView);
        card4FrontView = (ImageView) findViewById(R.id.card4FrontView);
        card4BackView = (ImageView) findViewById(R.id.card4BackView);

        card5CardView = (CardView) findViewById(R.id.card5CardView);
        card5FrontView = (ImageView) findViewById(R.id.card5FrontView);
        card5BackView = (ImageView) findViewById(R.id.card5BackView);

        card6CardView = (CardView) findViewById(R.id.card6CardView);
        card6FrontView = (ImageView) findViewById(R.id.card6FrontView);
        card6BackView = (ImageView) findViewById(R.id.card6BackView);

        card7CardView = (CardView) findViewById(R.id.card7CardView);
        card7FrontView = (ImageView) findViewById(R.id.card7FrontView);
        card7BackView = (ImageView) findViewById(R.id.card7BackView);

        card8CardView = (CardView) findViewById(R.id.card8CardView);
        card8FrontView = (ImageView) findViewById(R.id.card8FrontView);
        card8BackView = (ImageView) findViewById(R.id.card8BackView);

        card9CardView = (CardView) findViewById(R.id.card9CardView);
        card9FrontView = (ImageView) findViewById(R.id.card9FrontView);
        card9BackView = (ImageView) findViewById(R.id.card9BackView);

        card10CardView = (CardView) findViewById(R.id.card10CardView);
        card10FrontView = (ImageView) findViewById(R.id.card10FrontView);
        card10BackView = (ImageView) findViewById(R.id.card10BackView);

        card11CardView = (CardView) findViewById(R.id.card11CardView);
        card11FrontView = (ImageView) findViewById(R.id.card11FrontView);
        card11BackView = (ImageView) findViewById(R.id.card11BackView);

        card12CardView = (CardView) findViewById(R.id.card12CardView);
        card12FrontView = (ImageView) findViewById(R.id.card12FrontView);
        card12BackView = (ImageView) findViewById(R.id.card12BackView);

        card13CardView = (CardView) findViewById(R.id.card13CardView);
        card13FrontView = (ImageView) findViewById(R.id.card13FrontView);
        card13BackView = (ImageView) findViewById(R.id.card13BackView);

        card14CardView = (CardView) findViewById(R.id.card14CardView);
        card14FrontView = (ImageView) findViewById(R.id.card14FrontView);
        card14BackView = (ImageView) findViewById(R.id.card14BackView);

        card15CardView = (CardView) findViewById(R.id.card15CardView);
        card15FrontView = (ImageView) findViewById(R.id.card15FrontView);
        card15BackView = (ImageView) findViewById(R.id.card15BackView);

        card16CardView = (CardView) findViewById(R.id.card16CardView);
        card16FrontView = (ImageView) findViewById(R.id.card16FrontView);
        card16BackView = (ImageView) findViewById(R.id.card16BackView);

        card17CardView = (CardView) findViewById(R.id.card17CardView);
        card17FrontView = (ImageView) findViewById(R.id.card17FrontView);
        card17BackView = (ImageView) findViewById(R.id.card17BackView);

        card18CardView = (CardView) findViewById(R.id.card18CardView);
        card18FrontView = (ImageView) findViewById(R.id.card18FrontView);
        card18BackView = (ImageView) findViewById(R.id.card18BackView);

        card19CardView = (CardView) findViewById(R.id.card19CardView);
        card19FrontView = (ImageView) findViewById(R.id.card19FrontView);
        card19BackView = (ImageView) findViewById(R.id.card19BackView);

        card20CardView = (CardView) findViewById(R.id.card20CardView);
        card20FrontView = (ImageView) findViewById(R.id.card20FrontView);
        card20BackView = (ImageView) findViewById(R.id.card20BackView);

        card21CardView = (CardView) findViewById(R.id.card21CardView);
        card21FrontView = (ImageView) findViewById(R.id.card21FrontView);
        card21BackView = (ImageView) findViewById(R.id.card21BackView);

        card22CardView = (CardView) findViewById(R.id.card22CardView);
        card22FrontView = (ImageView) findViewById(R.id.card22FrontView);
        card22BackView = (ImageView) findViewById(R.id.card22BackView);

        card23CardView = (CardView) findViewById(R.id.card23CardView);
        card23FrontView = (ImageView) findViewById(R.id.card23FrontView);
        card23BackView = (ImageView) findViewById(R.id.card23BackView);

        card24CardView = (CardView) findViewById(R.id.card24CardView);
        card24FrontView = (ImageView) findViewById(R.id.card24FrontView);
        card24BackView = (ImageView) findViewById(R.id.card24BackView);

        card25CardView = (CardView) findViewById(R.id.card25CardView);
        card25FrontView = (ImageView) findViewById(R.id.card25FrontView);
        card25BackView = (ImageView) findViewById(R.id.card25BackView);

        card26CardView = (CardView) findViewById(R.id.card26CardView);
        card26FrontView = (ImageView) findViewById(R.id.card26FrontView);
        card26BackView = (ImageView) findViewById(R.id.card26BackView);

        card27CardView = (CardView) findViewById(R.id.card27CardView);
        card27FrontView = (ImageView) findViewById(R.id.card27FrontView);
        card27BackView = (ImageView) findViewById(R.id.card27BackView);

        card28CardView = (CardView) findViewById(R.id.card28CardView);
        card28FrontView = (ImageView) findViewById(R.id.card28FrontView);
        card28BackView = (ImageView) findViewById(R.id.card28BackView);

        card29CardView = (CardView) findViewById(R.id.card29CardView);
        card29FrontView = (ImageView) findViewById(R.id.card29FrontView);
        card29BackView = (ImageView) findViewById(R.id.card29BackView);

        card30CardView = (CardView) findViewById(R.id.card30CardView);
        card30FrontView = (ImageView) findViewById(R.id.card30FrontView);
        card30BackView = (ImageView) findViewById(R.id.card30BackView);

        card31CardView = (CardView) findViewById(R.id.card31CardView);
        card31FrontView = (ImageView) findViewById(R.id.card31FrontView);
        card31BackView = (ImageView) findViewById(R.id.card31BackView);

        card32CardView = (CardView) findViewById(R.id.card32CardView);
        card32FrontView = (ImageView) findViewById(R.id.card32FrontView);
        card32BackView = (ImageView) findViewById(R.id.card32BackView);

        card33CardView = (CardView) findViewById(R.id.card33CardView);
        card33FrontView = (ImageView) findViewById(R.id.card33FrontView);
        card33BackView = (ImageView) findViewById(R.id.card33BackView);

        card34CardView = (CardView) findViewById(R.id.card34CardView);
        card34FrontView = (ImageView) findViewById(R.id.card34FrontView);
        card34BackView = (ImageView) findViewById(R.id.card34BackView);

        card35CardView = (CardView) findViewById(R.id.card35CardView);
        card35FrontView = (ImageView) findViewById(R.id.card35FrontView);
        card35BackView = (ImageView) findViewById(R.id.card35BackView);

        card36CardView = (CardView) findViewById(R.id.card36CardView);
        card36FrontView = (ImageView) findViewById(R.id.card36FrontView);
        card36BackView = (ImageView) findViewById(R.id.card36BackView);

        card37CardView = (CardView) findViewById(R.id.card37CardView);
        card37FrontView = (ImageView) findViewById(R.id.card37FrontView);
        card37BackView = (ImageView) findViewById(R.id.card37BackView);

        card38CardView = (CardView) findViewById(R.id.card38CardView);
        card38FrontView = (ImageView) findViewById(R.id.card38FrontView);
        card38BackView = (ImageView) findViewById(R.id.card38BackView);

        card39CardView = (CardView) findViewById(R.id.card39CardView);
        card39FrontView = (ImageView) findViewById(R.id.card39FrontView);
        card39BackView = (ImageView) findViewById(R.id.card39BackView);

        card40CardView = (CardView) findViewById(R.id.card40CardView);
        card40FrontView = (ImageView) findViewById(R.id.card40FrontView);
        card40BackView = (ImageView) findViewById(R.id.card40BackView);

        card41CardView = (CardView) findViewById(R.id.card41CardView);
        card41FrontView = (ImageView) findViewById(R.id.card41FrontView);
        card41BackView = (ImageView) findViewById(R.id.card41BackView);

        card42CardView = (CardView) findViewById(R.id.card42CardView);
        card42FrontView = (ImageView) findViewById(R.id.card42FrontView);
        card42BackView = (ImageView) findViewById(R.id.card42BackView);

        card43CardView = (CardView) findViewById(R.id.card43CardView);
        card43FrontView = (ImageView) findViewById(R.id.card43FrontView);
        card43BackView = (ImageView) findViewById(R.id.card43BackView);

        card44CardView = (CardView) findViewById(R.id.card44CardView);
        card44FrontView = (ImageView) findViewById(R.id.card44FrontView);
        card44BackView = (ImageView) findViewById(R.id.card44BackView);

        card45CardView = (CardView) findViewById(R.id.card45CardView);
        card45FrontView = (ImageView) findViewById(R.id.card45FrontView);
        card45BackView = (ImageView) findViewById(R.id.card45BackView);

        card46CardView = (CardView) findViewById(R.id.card46CardView);
        card46FrontView = (ImageView) findViewById(R.id.card46FrontView);
        card46BackView = (ImageView) findViewById(R.id.card46BackView);

        card47CardView = (CardView) findViewById(R.id.card47CardView);
        card47FrontView = (ImageView) findViewById(R.id.card47FrontView);
        card47BackView = (ImageView) findViewById(R.id.card47BackView);

        card48CardView = (CardView) findViewById(R.id.card48CardView);
        card48FrontView = (ImageView) findViewById(R.id.card48FrontView);
        card48BackView = (ImageView) findViewById(R.id.card48BackView);

        card49CardView = (CardView) findViewById(R.id.card49CardView);
        card49FrontView = (ImageView) findViewById(R.id.card49FrontView);
        card49BackView = (ImageView) findViewById(R.id.card49BackView);

        card50CardView = (CardView) findViewById(R.id.card50CardView);
        card50FrontView = (ImageView) findViewById(R.id.card50FrontView);
        card50BackView = (ImageView) findViewById(R.id.card50BackView);

        card51CardView = (CardView) findViewById(R.id.card51CardView);
        card51FrontView = (ImageView) findViewById(R.id.card51FrontView);
        card51BackView = (ImageView) findViewById(R.id.card51BackView);

        card52CardView = (CardView) findViewById(R.id.card52CardView);
        card52FrontView = (ImageView) findViewById(R.id.card52FrontView);
        card52BackView = (ImageView) findViewById(R.id.card52BackView);

        Card c1 = new Card("twoOfHearts", 1, Card.Suit.Heart, Card.Color.Red, card1FrontView, card1BackView, card1CardView);
        Card c2 = new Card("threeOfHearts", 2, Card.Suit.Heart, Card.Color.Red, card2FrontView, card2BackView, card2CardView);
        Card c3 = new Card("fourOfHearts", 3, Card.Suit.Heart, Card.Color.Red, card3FrontView, card3BackView, card3CardView);
        Card c4 = new Card("fiveOfHearts", 4, Card.Suit.Heart, Card.Color.Red, card4FrontView, card4BackView, card4CardView);
        Card c5 = new Card("sixOfHearts", 1, Card.Suit.Heart, Card.Color.Red, card5FrontView, card5BackView, card5CardView);
        Card c6 = new Card("sevenOfHearts", 2, Card.Suit.Heart, Card.Color.Red, card6FrontView, card6BackView, card6CardView);
        Card c7 = new Card("eightOfHearts", 3, Card.Suit.Heart, Card.Color.Red, card7FrontView, card7BackView, card7CardView);
        Card c8 = new Card("nineOfHearts", 4, Card.Suit.Heart, Card.Color.Red, card8FrontView, card8BackView, card8CardView);
        Card c9 = new Card("tenOfHearts", 1, Card.Suit.Heart, Card.Color.Red, card9FrontView, card9BackView, card9CardView);
        Card c10 = new Card("knightOfHearts", 2, Card.Suit.Heart, Card.Color.Red, card10FrontView, card10BackView, card10CardView);
        Card c11 = new Card("queenOfHearts", 3, Card.Suit.Heart, Card.Color.Red, card11FrontView, card11BackView, card11CardView);
        Card c12 = new Card("kingOfHearts", 4, Card.Suit.Heart, Card.Color.Red, card12FrontView, card12BackView, card12CardView);
        Card c13 = new Card("aceOfHearts", 1, Card.Suit.Heart, Card.Color.Red, card13FrontView, card13BackView, card13CardView);

        Card c14 = new Card("twoOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, card14FrontView, card14BackView, card14CardView);
        Card c15 = new Card("threeOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, card15FrontView, card15BackView,card15CardView);
        Card c16 = new Card("fourOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, card16FrontView, card16BackView, card16CardView);
        Card c17 = new Card("fiveOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, card17FrontView, card17BackView, card17CardView);
        Card c18 = new Card("sixOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, card18FrontView, card18BackView, card18CardView);
        Card c19 = new Card("sevenOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, card19FrontView, card19BackView, card19CardView);
        Card c20 = new Card("eightOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, card20FrontView, card20BackView, card20CardView);
        Card c21 = new Card("nineOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, card21FrontView, card21BackView, card21CardView);
        Card c22 = new Card("tenOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, card22FrontView, card22BackView, card22CardView);
        Card c23 = new Card("knightOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, card23FrontView, card23BackView, card23CardView);
        Card c24 = new Card("queenOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, card24FrontView, card24BackView, card24CardView);
        Card c25 = new Card("kingOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, card25FrontView, card25BackView, card25CardView);
        Card c26 = new Card("aceOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, card26FrontView, card26BackView, card26CardView);

        Card c27 = new Card("twoOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, card27FrontView, card27BackView, card27CardView);
        Card c28 = new Card("threeOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, card28FrontView, card28BackView, card28CardView);
        Card c29 = new Card("fourOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, card29FrontView, card29BackView, card29CardView);
        Card c30 = new Card("fiveOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, card30FrontView, card30BackView, card30CardView);
        Card c31 = new Card("sixOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, card31FrontView, card31BackView, card31CardView);
        Card c32 = new Card("sevenOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, card32FrontView, card32BackView, card32CardView);
        Card c33 = new Card("eightOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, card33FrontView, card33BackView, card33CardView);
        Card c34 = new Card("nineOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, card34FrontView, card34BackView, card34CardView);
        Card c35 = new Card("tenOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, card35FrontView, card35BackView, card35CardView);
        Card c36 = new Card("knightOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red,card36FrontView, card36BackView, card36CardView);
        Card c37 = new Card("queenOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, card37FrontView, card37BackView, card37CardView);
        Card c38 = new Card("kingOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, card38FrontView, card38BackView, card38CardView);
        Card c39 = new Card("aceOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, card39FrontView, card39BackView, card39CardView);

        Card c40 = new Card("twoOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, card40FrontView, card40BackView, card40CardView);
        Card c41 = new Card("threeOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, card41FrontView, card41BackView, card41CardView);
        Card c42 = new Card("fourOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, card42FrontView, card42BackView, card42CardView);
        Card c43 = new Card("fiveOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, card43FrontView, card43BackView, card43CardView);
        Card c44 = new Card("sixOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, card44FrontView, card44BackView, card44CardView);
        Card c45 = new Card("sevenOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, card45FrontView, card45BackView, card45CardView);
        Card c46 = new Card("eightOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, card46FrontView, card46BackView, card46CardView);
        Card c47 = new Card("nineOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, card47FrontView, card47BackView, card47CardView);
        Card c48 = new Card("tenOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, card48FrontView, card48BackView, card48CardView);
        Card c49 = new Card("knightOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, card49FrontView, card49BackView, card49CardView);
        Card c50 = new Card("queenOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, card50FrontView, card50BackView, card50CardView);
        Card c51 = new Card("kingOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, card51FrontView, card51BackView, card51CardView);
        Card c52 = new Card("aceOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, card52FrontView, card52BackView, card52CardView);

        List <Object> cardsInTheDeck = new ArrayList<>();
        cardsInTheDeck.add(c1);
        cardsInTheDeck.add(c2);
        cardsInTheDeck.add(c3);
        cardsInTheDeck.add(c4);
        cardsInTheDeck.add(c5);
        cardsInTheDeck.add(c6);
        cardsInTheDeck.add(c7);
        cardsInTheDeck.add(c8);
        cardsInTheDeck.add(c9);
        cardsInTheDeck.add(c10);
        cardsInTheDeck.add(c11);
        cardsInTheDeck.add(c12);
        cardsInTheDeck.add(c13);
        cardsInTheDeck.add(c14);
        cardsInTheDeck.add(c15);
        cardsInTheDeck.add(c16);
        cardsInTheDeck.add(c17);
        cardsInTheDeck.add(c18);
        cardsInTheDeck.add(c19);
        cardsInTheDeck.add(c20);
        cardsInTheDeck.add(c21);
        cardsInTheDeck.add(c22);
        cardsInTheDeck.add(c23);
        cardsInTheDeck.add(c24);
        cardsInTheDeck.add(c25);
        cardsInTheDeck.add(c26);
        cardsInTheDeck.add(c27);
        cardsInTheDeck.add(c28);
        cardsInTheDeck.add(c29);
        cardsInTheDeck.add(c30);
        cardsInTheDeck.add(c31);
        cardsInTheDeck.add(c32);
        cardsInTheDeck.add(c33);
        cardsInTheDeck.add(c34);
        cardsInTheDeck.add(c35);
        cardsInTheDeck.add(c36);
        cardsInTheDeck.add(c37);
        cardsInTheDeck.add(c38);
        cardsInTheDeck.add(c39);
        cardsInTheDeck.add(c40);
        cardsInTheDeck.add(c41);
        cardsInTheDeck.add(c42);
        cardsInTheDeck.add(c43);
        cardsInTheDeck.add(c44);
        cardsInTheDeck.add(c45);
        cardsInTheDeck.add(c46);
        cardsInTheDeck.add(c47);
        cardsInTheDeck.add(c48);
        cardsInTheDeck.add(c49);
        cardsInTheDeck.add(c50);
        cardsInTheDeck.add(c51);
        cardsInTheDeck.add(c52);

        Collections.shuffle(cardsInTheDeck);
        Object[] shuffledDeck = new Object[]{cardsInTheDeck};

       // shuffledDeck.length(cardsInTheDeck.getCardView)
        //Object randomCard = random.nextInt(shuffledDeck.length);

       // print shuffled deck

       int numberOfPlayers = 4;
       int numberOfCards = 52;
       int maxCardsInHand = numberOfCards / numberOfPlayers;

       for (int i = 0; i < maxCardsInHand; i++) {
           System.out.println(deck[i]);
           if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1)
               System.out.println();
       }


        List<CardView> cardViews = new ArrayList<>();
        cardViews.add(card1CardView);
        cardViews.add(card2CardView);
        cardViews.add(card3CardView);
        cardViews.add(card4CardView);
        cardViews.add(card5CardView);
        cardViews.add(card6CardView);
        cardViews.add(card7CardView);
        cardViews.add(card8CardView);
        cardViews.add(card9CardView);
        cardViews.add(card10CardView);
        cardViews.add(card11CardView);
        cardViews.add(card12CardView);
        cardViews.add(card13CardView);
        cardViews.add(card14CardView);
        cardViews.add(card15CardView);
        cardViews.add(card16CardView);
        cardViews.add(card17CardView);
        cardViews.add(card18CardView);
        cardViews.add(card19CardView);
        cardViews.add(card20CardView);
        cardViews.add(card21CardView);
        cardViews.add(card22CardView);
        cardViews.add(card23CardView);
        cardViews.add(card24CardView);
        cardViews.add(card25CardView);
        cardViews.add(card26CardView);
        cardViews.add(card27CardView);
        cardViews.add(card28CardView);
        cardViews.add(card29CardView);
        cardViews.add(card30CardView);
        cardViews.add(card31CardView);
        cardViews.add(card32CardView);
        cardViews.add(card33CardView);
        cardViews.add(card34CardView);
        cardViews.add(card35CardView);
        cardViews.add(card36CardView);
        cardViews.add(card37CardView);
        cardViews.add(card38CardView);
        cardViews.add(card39CardView);
        cardViews.add(card40CardView);
        cardViews.add(card41CardView);
        cardViews.add(card42CardView);
        cardViews.add(card43CardView);
        cardViews.add(card44CardView);
        cardViews.add(card45CardView);
        cardViews.add(card46CardView);
        cardViews.add(card47CardView);
        cardViews.add(card48CardView);
        cardViews.add(card49CardView);
        cardViews.add(card50CardView);
        cardViews.add(card51CardView);
        cardViews.add(card52CardView);

        params.bottomMargin = (displayHeight) - 9 / 10;
        params.addRule(RelativeLayout.TEXT_ALIGNMENT_CENTER, RelativeLayout.TRUE);


    }


    Card c1 = new Card("twoOfHearts", 1, Card.Suit.Heart, Card.Color.Red, card1FrontView, card1BackView, card1CardView);
    Card c2 = new Card("threeOfHearts", 2, Card.Suit.Heart, Card.Color.Red, card2FrontView, card2BackView, card2CardView);
    Card c3 = new Card("fourOfHearts", 3, Card.Suit.Heart, Card.Color.Red, card3FrontView, card3BackView, card3CardView);
    Card c4 = new Card("fiveOfHearts", 4, Card.Suit.Heart, Card.Color.Red, card4FrontView, card4BackView, card4CardView);
    Card c5 = new Card("sixOfHearts", 1, Card.Suit.Heart, Card.Color.Red, card5FrontView, card5BackView, card5CardView);
    Card c6 = new Card("sevenOfHearts", 2, Card.Suit.Heart, Card.Color.Red, card6FrontView, card6BackView, card6CardView);
    Card c7 = new Card("eightOfHearts", 3, Card.Suit.Heart, Card.Color.Red, card7FrontView, card7BackView, card7CardView);
    Card c8 = new Card("nineOfHearts", 4, Card.Suit.Heart, Card.Color.Red, card8FrontView, card8BackView, card8CardView);
    Card c9 = new Card("tenOfHearts", 1, Card.Suit.Heart, Card.Color.Red, card9FrontView, card9BackView, card9CardView);
    Card c10 = new Card("knightOfHearts", 2, Card.Suit.Heart, Card.Color.Red, card10FrontView, card10BackView, card10CardView);
    Card c11 = new Card("queenOfHearts", 3, Card.Suit.Heart, Card.Color.Red, card11FrontView, card11BackView, card11CardView);
    Card c12 = new Card("kingOfHearts", 4, Card.Suit.Heart, Card.Color.Red, card12FrontView, card12BackView, card12CardView);
    Card c13 = new Card("aceOfHearts", 1, Card.Suit.Heart, Card.Color.Red, card13FrontView, card13BackView, card13CardView);

    Card c14 = new Card("twoOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, card14FrontView, card14BackView, card14CardView);
    Card c15 = new Card("threeOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, card15FrontView, card15BackView, card15CardView);
    Card c16 = new Card("fourOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, card16FrontView, card16BackView, card16CardView);
    Card c17 = new Card("fiveOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, card17FrontView, card17BackView, card17CardView);
    Card c18 = new Card("sixOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, card18FrontView, card18BackView, card18CardView);
    Card c19 = new Card("sevenOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, card19FrontView, card19BackView, card19CardView);
    Card c20 = new Card("eightOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, card20FrontView, card20BackView, card20CardView);
    Card c21 = new Card("nineOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, card21FrontView, card21BackView, card21CardView);
    Card c22 = new Card("tenOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, card22FrontView, card22BackView, card22CardView);
    Card c23 = new Card("knightOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, card23FrontView, card23BackView, card23CardView);
    Card c24 = new Card("queenOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, card24FrontView, card24BackView, card24CardView);
    Card c25 = new Card("kingOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, card25FrontView, card25BackView, card25CardView);
    Card c26 = new Card("aceOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, card26FrontView, card26BackView, card26CardView);

    Card c27 = new Card("twoOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, card27FrontView, card27BackView, card27CardView);
    Card c28 = new Card("threeOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, card28FrontView, card28BackView, card28CardView);
    Card c29 = new Card("fourOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, card29FrontView, card29BackView, card29CardView);
    Card c30 = new Card("fiveOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, card30FrontView, card30BackView, card30CardView);
    Card c31 = new Card("sixOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, card31FrontView, card31BackView, card31CardView);
    Card c32 = new Card("sevenOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, card32FrontView, card32BackView, card32CardView);
    Card c33 = new Card("eightOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, card33FrontView, card33BackView, card33CardView);
    Card c34 = new Card("nineOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, card34FrontView, card34BackView, card34CardView);
    Card c35 = new Card("tenOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, card35FrontView, card35BackView, card35CardView);
    Card c36 = new Card("knightOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, card36FrontView, card36BackView, card36CardView);
    Card c37 = new Card("queenOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, card37FrontView, card37BackView, card37CardView);
    Card c38 = new Card("kingOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, card38FrontView, card38BackView, card38CardView);
    Card c39 = new Card("aceOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, card39FrontView, card39BackView, card39CardView);

    Card c40 = new Card("twoOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, card40FrontView, card40BackView, card40CardView);
    Card c41 = new Card("threeOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, card41FrontView, card41BackView, card41CardView);
    Card c42 = new Card("fourOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, card42FrontView, card42BackView, card42CardView);
    Card c43 = new Card("fiveOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, card43FrontView, card43BackView, card43CardView);
    Card c44 = new Card("sixOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, card44FrontView, card44BackView, card44CardView);
    Card c45 = new Card("sevenOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, card45FrontView, card45BackView, card45CardView);
    Card c46 = new Card("eightOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, card46FrontView, card46BackView, card46CardView);
    Card c47 = new Card("nineOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, card47FrontView, card47BackView, card47CardView);
    Card c48 = new Card("tenOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, card48FrontView, card48BackView, card48CardView);
    Card c49 = new Card("knightOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, card49FrontView, card49BackView, card49CardView);
    Card c50 = new Card("queenOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, card50FrontView, card50BackView, card50CardView);
    Card c51 = new Card("kingOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, card51FrontView, card51BackView, card51CardView);
    Card c52 = new Card("aceOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, card52FrontView, card52BackView, card52CardView);

   public void roundStart() {

        List<Object> deck = new ArrayList<>();
        deck.add(c1);
        deck.add(c2);
        deck.add(c3);
        deck.add(c4);
        deck.add(c5);
        deck.add(c6);
        deck.add(c7);
        deck.add(c8);
        deck.add(c9);
        deck.add(c10);
        deck.add(c11);
        deck.add(c12);
        deck.add(c13);
        deck.add(c14);
        deck.add(c15);
        deck.add(c16);
        deck.add(c17);
        deck.add(c18);
        deck.add(c19);
        deck.add(c20);
        deck.add(c21);
        deck.add(c22);
        deck.add(c23);
        deck.add(c24);
        deck.add(c25);
        deck.add(c26);
        deck.add(c27);
        deck.add(c28);
        deck.add(c29);
        deck.add(c30);
        deck.add(c31);
        deck.add(c32);
        deck.add(c33);
        deck.add(c34);
        deck.add(c35);
        deck.add(c36);
        deck.add(c37);
        deck.add(c38);
        deck.add(c39);
        deck.add(c40);
        deck.add(c41);
        deck.add(c42);
        deck.add(c43);
        deck.add(c44);
        deck.add(c45);
        deck.add(c46);
        deck.add(c47);
        deck.add(c48);
        deck.add(c49);
        deck.add(c50);
        deck.add(c51);
        deck.add(c52);
    }


    <android.support.v7.widget.CardView
        android:id="@+id/messBoardCardView"
        android:layout_width="@android:dimen/thumbnail_width"
        android:layout_height="?android:attr/actionBarSize"
        android:layout_below="@+id/mPlayerEditNameCardView"
        android:layout_centerHorizontal="true"
        app:cardBackgroundColor="@android:color/transparent"
        app:cardElevation="0dp">

        <TextView
            android:id="@+id/messageOnBoard"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="Shuffling"
            android:textColor="@android:color/background_dark"
            android:textSize="30sp"
            android:textStyle="bold"
            android:visibility="invisible" />

    </android.support.v7.widget.CardView>

        long duration = MAXIMUM_DURATION;

        RelativeLayout.LayoutParams messBoardParams = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        messBoardParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);

        messBoardCardView = (CardView) findViewById(R.id.messBoardCardView);
        messBoardCardView.setLayoutParams(messBoardParams);
        messBoardCardView.setVisibility(View.INVISIBLE);

        secondLayout.addView(messBoardCardView);

        AlphaAnimation messBoardCardViewAnim = new AlphaAnimation(0.0F, 1.0F);
        messBoardCardViewAnim.setDuration(duration);
        messBoardCardViewAnim.setAnimationListener(this);
        messBoardCardView.startAnimation(messBoardCardViewAnim);

messBoardParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);

        messBoardParams.leftMargin = (displayWidth) * 1 / 4;
        messBoardParams.topMargin = (displayHeight) * 1 / 8;
        messBoardParams.rightMargin = (displayWidth) * 1 / 4;
        messBoardParams.bottomMargin = (displayHeight) * 5 / 8;


////////////////////////////////////////////////////////////////////////////////////////////////////
    CardView card1CardView, card2CardView, card3CardView, card4CardView, card5CardView, card6CardView,
            card7CardView, card8CardView, card9CardView, card10CardView, card11CardView, card12CardView,
            card13CardView, card14CardView, card15CardView, card16CardView, card17CardView, card18CardView,
            card19CardView, card20CardView, card21CardView, card22CardView, card23CardView, card24CardView,
            card25CardView, card26CardView, card27CardView, card28CardView, card29CardView, card30CardView,
            card31CardView, card32CardView, card33CardView, card34CardView, card35CardView, card36CardView,
            card37CardView, card38CardView, card39CardView, card40CardView, card41CardView, card42CardView,
            card43CardView, card44CardView, card45CardView, card46CardView, card47CardView, card48CardView,
            card49CardView, card50CardView, card51CardView, card52CardView;

    ImageView card1FrontView, card2FrontView, card3FrontView, card4FrontView, card5FrontView, card6FrontView,
            card7FrontView, card8FrontView, card9FrontView, card10FrontView, card11FrontView, card12FrontView,
            card13FrontView, card14FrontView, card15FrontView, card16FrontView, card17FrontView, card18FrontView,
            card19FrontView, card20FrontView, card21FrontView, card22FrontView, card23FrontView, card24FrontView,
            card25FrontView, card26FrontView, card27FrontView, card28FrontView, card29FrontView, card30FrontView,
            card31FrontView, card32FrontView, card33FrontView, card34FrontView, card35FrontView, card36FrontView,
            card37FrontView, card38FrontView, card39FrontView, card40FrontView, card41FrontView, card42FrontView,
            card43FrontView, card44FrontView, card45FrontView, card46FrontView, card47FrontView, card48FrontView,
            card49FrontView, card50FrontView, card51FrontView, card52FrontView;

    ImageView card1BackView, card2BackView, card3BackView, card4BackView, card5BackView, card6BackView,
            card7BackView, card8BackView, card9BackView, card10BackView, card11BackView, card12BackView,
            card13BackView, card14BackView, card15BackView, card16BackView, card17BackView, card18BackView,
            card19BackView, card20BackView, card21BackView, card22BackView, card23BackView, card24BackView,
            card25BackView, card26BackView, card27BackView, card28BackView, card29BackView, card30BackView,
            card31BackView, card32BackView, card33BackView, card34BackView, card35BackView, card36BackView,
            card37BackView, card38BackView, card39BackView, card40BackView, card41BackView, card42BackView,
            card43BackView, card44BackView, card45BackView, card46BackView, card47BackView, card48BackView,
            card49BackView, card50BackView, card51BackView, card52BackView;

    Card c1 = new Card("twoOfHearts", 1, Card.Suit.Heart, Card.Color.Red, R.drawable.c1, R.drawable.back, R.id.card1CardView);
    Card c2 = new Card("threeOfHearts", 2, Card.Suit.Heart, Card.Color.Red, R.drawable.c2, R.drawable.back, R.id.card1CardView);
    Card c3 = new Card("fourOfHearts", 3, Card.Suit.Heart, Card.Color.Red, R.drawable.c3, R.drawable.back, R.id.card1CardView);
    Card c4 = new Card("fiveOfHearts", 4, Card.Suit.Heart, Card.Color.Red, R.drawable.c4, R.drawable.back, R.id.card1CardView);
    Card c5 = new Card("sixOfHearts", 1, Card.Suit.Heart, Card.Color.Red, R.drawable.c5, R.drawable.back, R.id.card1CardView);
    Card c6 = new Card("sevenOfHearts", 2, Card.Suit.Heart, Card.Color.Red, R.drawable.c6, R.drawable.back, R.id.card1CardView);
    Card c7 = new Card("eightOfHearts", 3, Card.Suit.Heart, Card.Color.Red, R.drawable.c7, R.drawable.back, R.id.card1CardView);
    Card c8 = new Card("nineOfHearts", 4, Card.Suit.Heart, Card.Color.Red, R.drawable.c8, R.drawable.back, R.id.card1CardView);
    Card c9 = new Card("tenOfHearts", 1, Card.Suit.Heart, Card.Color.Red, R.drawable.c9, R.drawable.back, R.id.card1CardView);
    Card c10 = new Card("knightOfHearts", 2, Card.Suit.Heart, Card.Color.Red, R.drawable.c10, R.drawable.back, R.id.card1CardView);
    Card c11 = new Card("queenOfHearts", 3, Card.Suit.Heart, Card.Color.Red, R.drawable.c11, R.drawable.back, R.id.card1CardView);
    Card c12 = new Card("kingOfHearts", 4, Card.Suit.Heart, Card.Color.Red, R.drawable.c12, R.drawable.back, R.id.card1CardView);
    Card c13 = new Card("aceOfHearts", 1, Card.Suit.Heart, Card.Color.Red, R.drawable.c13, R.drawable.back, R.id.card1CardView);

    Card c14 = new Card("twoOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, R.drawable.c14, R.drawable.back, R.id.card1CardView);
    Card c15 = new Card("threeOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, R.drawable.c15, R.drawable.back, R.id.card1CardView);
    Card c16 = new Card("fourOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, R.drawable.c16, R.drawable.back, R.id.card1CardView);
    Card c17 = new Card("fiveOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, R.drawable.c17, R.drawable.back, R.id.card1CardView);
    Card c18 = new Card("sixOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, R.drawable.c18, R.drawable.back, R.id.card1CardView);
    Card c19 = new Card("sevenOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, R.drawable.c19, R.drawable.back, R.id.card1CardView);
    Card c20 = new Card("eightOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, R.drawable.c20, R.drawable.back, R.id.card1CardView);
    Card c21 = new Card("nineOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, R.drawable.c21, R.drawable.back, R.id.card1CardView);
    Card c22 = new Card("tenOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, R.drawable.c22, R.drawable.back, R.id.card1CardView);
    Card c23 = new Card("knightOfSpades", 3, Card.Suit.Spades, Card.Color.Blk, R.drawable.c23, R.drawable.back, R.id.card1CardView);
    Card c24 = new Card("queenOfSpades", 4, Card.Suit.Spades, Card.Color.Blk, R.drawable.c24, R.drawable.back, R.id.card1CardView);
    Card c25 = new Card("kingOfSpades", 1, Card.Suit.Spades, Card.Color.Blk, R.drawable.c25, R.drawable.back, R.id.card1CardView);
    Card c26 = new Card("aceOfSpades", 2, Card.Suit.Spades, Card.Color.Blk, R.drawable.c26, R.drawable.back, R.id.card1CardView);

    Card c27 = new Card("twoOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, R.drawable.c27, R.drawable.back, R.id.card1CardView);
    Card c28 = new Card("threeOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, R.drawable.c28, R.drawable.back, R.id.card1CardView);
    Card c29 = new Card("fourOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, R.drawable.c29, R.drawable.back, R.id.card1CardView);
    Card c30 = new Card("fiveOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, R.drawable.c30, R.drawable.back, R.id.card1CardView);
    Card c31 = new Card("sixOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, R.drawable.c31, R.drawable.back, R.id.card1CardView);
    Card c32 = new Card("sevenOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, R.drawable.c32, R.drawable.back, R.id.card1CardView);
    Card c33 = new Card("eightOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, R.drawable.c33, R.drawable.back, R.id.card1CardView);
    Card c34 = new Card("nineOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, R.drawable.c34, R.drawable.back, R.id.card1CardView);
    Card c35 = new Card("tenOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, R.drawable.c35, R.drawable.back, R.id.card1CardView);
    Card c36 = new Card("knightOfDiamonds", 4, Card.Suit.Diamond, Card.Color.Red, R.drawable.c36, R.drawable.back, R.id.card1CardView);
    Card c37 = new Card("queenOfDiamonds", 1, Card.Suit.Diamond, Card.Color.Red, R.drawable.c37, R.drawable.back, R.id.card1CardView);
    Card c38 = new Card("kingOfDiamonds", 2, Card.Suit.Diamond, Card.Color.Red, R.drawable.c38, R.drawable.back, R.id.card1CardView);
    Card c39 = new Card("aceOfDiamonds", 3, Card.Suit.Diamond, Card.Color.Red, R.drawable.c39, R.drawable.back, R.id.card1CardView);

    Card c40 = new Card("twoOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, R.drawable.c40, R.drawable.back, R.id.card1CardView);
    Card c41 = new Card("threeOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, R.drawable.c41, R.drawable.back, R.id.card1CardView);
    Card c42 = new Card("fourOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, R.drawable.c42, R.drawable.back, R.id.card1CardView);
    Card c43 = new Card("fiveOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, R.drawable.c43, R.drawable.back, R.id.card1CardView);
    Card c44 = new Card("sixOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, R.drawable.c44, R.drawable.back, R.id.card1CardView);
    Card c45 = new Card("sevenOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, R.drawable.c45, R.drawable.back, R.id.card1CardView);
    Card c46 = new Card("eightOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, R.drawable.c46, R.drawable.back, R.id.card1CardView);
    Card c47 = new Card("nineOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, R.drawable.c47, R.drawable.back, R.id.card1CardView);
    Card c48 = new Card("tenOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, R.drawable.c48, R.drawable.back, R.id.card1CardView);
    Card c49 = new Card("knightOfClovers", 1, Card.Suit.Clover, Card.Color.Blk, R.drawable.c49, R.drawable.back, R.id.card1CardView);
    Card c50 = new Card("queenOfClovers", 2, Card.Suit.Clover, Card.Color.Blk, R.drawable.c50, R.drawable.back, R.id.card1CardView);
    Card c51 = new Card("kingOfClovers", 3, Card.Suit.Clover, Card.Color.Blk, R.drawable.c51, R.drawable.back, R.id.card1CardView);
    Card c52 = new Card("aceOfClovers", 4, Card.Suit.Clover, Card.Color.Blk, R.drawable.c52, R.drawable.back, R.id.card1CardView);

      card1CardView = (CardView) findViewById(R.id.card1CardView);
        card2CardView = (CardView) findViewById(R.id.card2CardView);
        card3CardView = (CardView) findViewById(R.id.card3CardView);
        card4CardView = (CardView) findViewById(R.id.card4CardView);
        card5CardView = (CardView) findViewById(R.id.card5CardView);
        card6CardView = (CardView) findViewById(R.id.card6CardView);
        card7CardView = (CardView) findViewById(R.id.card7CardView);
        card8CardView = (CardView) findViewById(R.id.card8CardView);
        card9CardView = (CardView) findViewById(R.id.card9CardView);
        card10CardView = (CardView) findViewById(R.id.card10CardView);
        card11CardView = (CardView) findViewById(R.id.card11CardView);
        card12CardView = (CardView) findViewById(R.id.card12CardView);
        card13CardView = (CardView) findViewById(R.id.card13CardView);
        card14CardView = (CardView) findViewById(R.id.card14CardView);
        card15CardView = (CardView) findViewById(R.id.card15CardView);
        card16CardView = (CardView) findViewById(R.id.card16CardView);
        card17CardView = (CardView) findViewById(R.id.card17CardView);
        card18CardView = (CardView) findViewById(R.id.card18CardView);
        card19CardView = (CardView) findViewById(R.id.card19CardView);
        card20CardView = (CardView) findViewById(R.id.card20CardView);
        card21CardView = (CardView) findViewById(R.id.card21CardView);
        card22CardView = (CardView) findViewById(R.id.card22CardView);
        card23CardView = (CardView) findViewById(R.id.card23CardView);
        card24CardView = (CardView) findViewById(R.id.card24CardView);
        card25CardView = (CardView) findViewById(R.id.card25CardView);
        card26CardView = (CardView) findViewById(R.id.card26CardView);
        card27CardView = (CardView) findViewById(R.id.card27CardView);
        card28CardView = (CardView) findViewById(R.id.card28CardView);
        card29CardView = (CardView) findViewById(R.id.card29CardView);
        card30CardView = (CardView) findViewById(R.id.card30CardView);
        card31CardView = (CardView) findViewById(R.id.card31CardView);
        card32CardView = (CardView) findViewById(R.id.card32CardView);
        card33CardView = (CardView) findViewById(R.id.card33CardView);
        card34CardView = (CardView) findViewById(R.id.card34CardView);
        card35CardView = (CardView) findViewById(R.id.card35CardView);
        card36CardView = (CardView) findViewById(R.id.card36CardView);
        card37CardView = (CardView) findViewById(R.id.card37CardView);
        card38CardView = (CardView) findViewById(R.id.card38CardView);
        card39CardView = (CardView) findViewById(R.id.card39CardView);
        card40CardView = (CardView) findViewById(R.id.card40CardView);
        card41CardView = (CardView) findViewById(R.id.card41CardView);
        card42CardView = (CardView) findViewById(R.id.card42CardView);
        card43CardView = (CardView) findViewById(R.id.card43CardView);
        card44CardView = (CardView) findViewById(R.id.card44CardView);
        card45CardView = (CardView) findViewById(R.id.card45CardView);
        card46CardView = (CardView) findViewById(R.id.card46CardView);
        card47CardView = (CardView) findViewById(R.id.card47CardView);
        card48CardView = (CardView) findViewById(R.id.card48CardView);
        card49CardView = (CardView) findViewById(R.id.card49CardView);
        card50CardView = (CardView) findViewById(R.id.card50CardView);
        card51CardView = (CardView) findViewById(R.id.card51CardView);
        card52CardView = (CardView) findViewById(R.id.card52CardView);

          card1CardView.setVisibility(View.VISIBLE);
        card2CardView.setVisibility(View.VISIBLE);
        card3CardView.setVisibility(View.VISIBLE);
        card4CardView.setVisibility(View.VISIBLE);
        card5CardView.setVisibility(View.VISIBLE);
        card6CardView.setVisibility(View.VISIBLE);
        card7CardView.setVisibility(View.VISIBLE);
        card8CardView.setVisibility(View.VISIBLE);
        card9CardView.setVisibility(View.VISIBLE);
        card10CardView.setVisibility(View.VISIBLE);
        card11CardView.setVisibility(View.VISIBLE);
        card12CardView.setVisibility(View.VISIBLE);
        card13CardView.setVisibility(View.VISIBLE);
        card14CardView.setVisibility(View.VISIBLE);
        card15CardView.setVisibility(View.VISIBLE);
        card16CardView.setVisibility(View.VISIBLE);
        card17CardView.setVisibility(View.VISIBLE);
        card18CardView.setVisibility(View.VISIBLE);
        card19CardView.setVisibility(View.VISIBLE);
        card20CardView.setVisibility(View.VISIBLE);
        card21CardView.setVisibility(View.VISIBLE);
        card22CardView.setVisibility(View.VISIBLE);
        card23CardView.setVisibility(View.VISIBLE);
        card24CardView.setVisibility(View.VISIBLE);
        card25CardView.setVisibility(View.VISIBLE);
        card26CardView.setVisibility(View.VISIBLE);
        card27CardView.setVisibility(View.VISIBLE);
        card28CardView.setVisibility(View.VISIBLE);
        card29CardView.setVisibility(View.VISIBLE);
        card30CardView.setVisibility(View.VISIBLE);
        card31CardView.setVisibility(View.VISIBLE);
        card32CardView.setVisibility(View.VISIBLE);
        card33CardView.setVisibility(View.VISIBLE);
        card34CardView.setVisibility(View.VISIBLE);
        card35CardView.setVisibility(View.VISIBLE);
        card36CardView.setVisibility(View.VISIBLE);
        card37CardView.setVisibility(View.VISIBLE);
        card38CardView.setVisibility(View.VISIBLE);
        card39CardView.setVisibility(View.VISIBLE);
        card40CardView.setVisibility(View.VISIBLE);
        card41CardView.setVisibility(View.VISIBLE);
        card42CardView.setVisibility(View.VISIBLE);
        card43CardView.setVisibility(View.VISIBLE);
        card44CardView.setVisibility(View.VISIBLE);
        card45CardView.setVisibility(View.VISIBLE);
        card46CardView.setVisibility(View.VISIBLE);
        card47CardView.setVisibility(View.VISIBLE);
        card48CardView.setVisibility(View.VISIBLE);
        card49CardView.setVisibility(View.VISIBLE);
        card50CardView.setVisibility(View.VISIBLE);
        card51CardView.setVisibility(View.VISIBLE);
        card52CardView.setVisibility(View.VISIBLE);

  List<CardView> deckCardView = new ArrayList<>();
        deckCardView.add(card1CardView);
        deckCardView.add(card2CardView);
        deckCardView.add(card3CardView);
        deckCardView.add(card4CardView);
        deckCardView.add(card5CardView);
        deckCardView.add(card6CardView);
        deckCardView.add(card7CardView);
        deckCardView.add(card8CardView);
        deckCardView.add(card9CardView);
        deckCardView.add(card10CardView);
        deckCardView.add(card11CardView);
        deckCardView.add(card12CardView);
        deckCardView.add(card13CardView);
        deckCardView.add(card14CardView);
        deckCardView.add(card15CardView);
        deckCardView.add(card16CardView);
        deckCardView.add(card17CardView);
        deckCardView.add(card18CardView);
        deckCardView.add(card19CardView);
        deckCardView.add(card20CardView);
        deckCardView.add(card21CardView);
        deckCardView.add(card22CardView);
        deckCardView.add(card23CardView);
        deckCardView.add(card24CardView);
        deckCardView.add(card25CardView);
        deckCardView.add(card26CardView);
        deckCardView.add(card27CardView);
        deckCardView.add(card28CardView);
        deckCardView.add(card29CardView);
        deckCardView.add(card30CardView);
        deckCardView.add(card31CardView);
        deckCardView.add(card32CardView);
        deckCardView.add(card33CardView);
        deckCardView.add(card34CardView);
        deckCardView.add(card35CardView);
        deckCardView.add(card36CardView);
        deckCardView.add(card37CardView);
        deckCardView.add(card38CardView);
        deckCardView.add(card39CardView);
        deckCardView.add(card40CardView);
        deckCardView.add(card41CardView);
        deckCardView.add(card42CardView);
        deckCardView.add(card43CardView);
        deckCardView.add(card44CardView);
        deckCardView.add(card45CardView);
        deckCardView.add(card46CardView);
        deckCardView.add(card47CardView);
        deckCardView.add(card48CardView);
        deckCardView.add(card49CardView);
        deckCardView.add(card50CardView);
        deckCardView.add(card51CardView);
        deckCardView.add(card52CardView);

    <android.support.v7.widget.CardView
        android:id="@+id/mPlayerDealAnimCardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/sPlayerDealAnimCardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/tPlayerDealAnimCardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/fPlayerDealAnimCardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card1CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent" />

        <ImageView
            android:id="@+id/card1FrontView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:srcCompat="@drawable/c1" />

        <ImageView
            android:id="@+id/card1BackView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card2CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent" />

            <ImageView
                android:id="@+id/card2FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c2" />

            <ImageView
                android:id="@+id/card2BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card3CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent" />

            <ImageView
                android:id="@+id/card3FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c3" />

            <ImageView
                android:id="@+id/card3BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card4CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card4FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c4" />

            <ImageView
                android:id="@+id/card4BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card5CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card5FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c5" />

            <ImageView
                android:id="@+id/card5BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card6CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card6FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c6" />

            <ImageView
                android:id="@+id/card6BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card7CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card7FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c7" />

            <ImageView
                android:id="@+id/card7BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card8CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card8FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c8" />

            <ImageView
                android:id="@+id/card8BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card9CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card9FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c9" />

            <ImageView
                android:id="@+id/card9BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card10CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card10FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c10" />

            <ImageView
                android:id="@+id/card10BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card11CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card11FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c11" />

            <ImageView
                android:id="@+id/card11BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card12CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card12FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c12" />

            <ImageView
                android:id="@+id/card12BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card13CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card13FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c13" />

            <ImageView
                android:id="@+id/card13BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card14CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card14FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c14" />

            <ImageView
                android:id="@+id/card14BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card15CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card15FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c15" />

            <ImageView
                android:id="@+id/card15BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card16CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card16FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c16" />

            <ImageView
                android:id="@+id/card16BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card17CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card17FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c17" />

            <ImageView
                android:id="@+id/card17BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card18CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card18FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c18" />

            <ImageView
                android:id="@+id/card18BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card19CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card19FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c19" />

            <ImageView
                android:id="@+id/card19BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card20CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card20FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c20" />

            <ImageView
                android:id="@+id/card20BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card21CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card21FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c21" />

            <ImageView
                android:id="@+id/card21BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card22CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card22FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c22" />

            <ImageView
                android:id="@+id/card22BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card23CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card23FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c23" />

            <ImageView
                android:id="@+id/card23BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card24CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card24FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c24" />

            <ImageView
                android:id="@+id/card24BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card25CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card25FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c25" />

            <ImageView
                android:id="@+id/card25BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card26CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card26FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c26" />

            <ImageView
                android:id="@+id/card26BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card27CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card27FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c27" />

            <ImageView
                android:id="@+id/card27BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card28CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card28FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c28" />

            <ImageView
                android:id="@+id/card28BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card29CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card29FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c29" />

            <ImageView
                android:id="@+id/card29BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card30CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card30FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c30" />

            <ImageView
                android:id="@+id/card30BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card31CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card31FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c31" />

            <ImageView
                android:id="@+id/card31BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card32CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card32FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c32" />

            <ImageView
                android:id="@+id/card32BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card33CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card33FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c33" />

            <ImageView
                android:id="@+id/card33BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card34CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card34FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c34" />

            <ImageView
                android:id="@+id/card34BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card35CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card35FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c35" />

            <ImageView
                android:id="@+id/card35BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card36CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card36FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c36" />

            <ImageView
                android:id="@+id/card36BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card37CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card37FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c37" />

            <ImageView
                android:id="@+id/card37BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card38CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card38FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c38" />

            <ImageView
                android:id="@+id/card38BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card39CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card39FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c39" />

            <ImageView
                android:id="@+id/card39BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card40CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card40FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c40" />

            <ImageView
                android:id="@+id/card40BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card41CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card41FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c41" />

            <ImageView
                android:id="@+id/card41BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card42CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card42FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c42" />

            <ImageView
                android:id="@+id/card42BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card43CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card43FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c43" />

            <ImageView
                android:id="@+id/card43BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card44CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card44FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c44" />

            <ImageView
                android:id="@+id/card44BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card45CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card45FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c45" />

            <ImageView
                android:id="@+id/card45BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card46CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card46FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c46" />

            <ImageView
                android:id="@+id/card46BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card47CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card47FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c47" />

            <ImageView
                android:id="@+id/card47BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card48CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card48FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c48" />

            <ImageView
                android:id="@+id/card48BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card49CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card49FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c49" />

            <ImageView
                android:id="@+id/card49BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card50CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card50FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c50" />

            <ImageView
                android:id="@+id/card50BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card51CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card51FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c51" />

            <ImageView
                android:id="@+id/card51BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

    <android.support.v7.widget.CardView
        android:id="@+id/card52CardView"
        android:layout_width="80dp"
        android:layout_height="120dp"
        android:layout_centerInParent="true"
        android:visibility="invisible">

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

            <ImageView
                android:id="@+id/card52FrontView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/c52" />

            <ImageView
                android:id="@+id/card52BackView"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:srcCompat="@drawable/back" />
    </android.support.v7.widget.CardView>

CardView mPlayerDealAnimCardView, sPlayerDealAnimCardView, tPlayerDealAnimCardView, fPlayerDealAnimCardView;

 CardView randomCardCardView;

         c1.frontView.setVisibility(View.VISIBLE);
        c2.frontView.setVisibility(View.VISIBLE);
        c3.frontView.setVisibility(View.VISIBLE);
        c4.frontView.setVisibility(View.VISIBLE);
        c5.frontView.setVisibility(View.VISIBLE);
        c6.frontView.setVisibility(View.VISIBLE);
        c7.frontView.setVisibility(View.VISIBLE);
        c8.frontView.setVisibility(View.VISIBLE);
        c9.frontView.setVisibility(View.VISIBLE);
        c10.frontView.setVisibility(View.VISIBLE);
        c11.frontView.setVisibility(View.VISIBLE);
        c12.frontView.setVisibility(View.VISIBLE);
        c13.frontView.setVisibility(View.VISIBLE);
        c14.frontView.setVisibility(View.VISIBLE);
        c15.frontView.setVisibility(View.VISIBLE);
        c16.frontView.setVisibility(View.VISIBLE);
        c17.frontView.setVisibility(View.VISIBLE);
        c18.frontView.setVisibility(View.VISIBLE);
        c19.frontView.setVisibility(View.VISIBLE);
        c20.frontView.setVisibility(View.VISIBLE);
        c21.frontView.setVisibility(View.VISIBLE);
        c22.frontView.setVisibility(View.VISIBLE);
        c23.frontView.setVisibility(View.VISIBLE);
        c24.frontView.setVisibility(View.VISIBLE);
        c25.frontView.setVisibility(View.VISIBLE);
        c26.frontView.setVisibility(View.VISIBLE);
        c27.frontView.setVisibility(View.VISIBLE);
        c28.frontView.setVisibility(View.VISIBLE);
        c29.frontView.setVisibility(View.VISIBLE);
        c30.frontView.setVisibility(View.VISIBLE);
        c31.frontView.setVisibility(View.VISIBLE);
        c32.frontView.setVisibility(View.VISIBLE);
        c33.frontView.setVisibility(View.VISIBLE);
        c34.frontView.setVisibility(View.VISIBLE);
        c35.frontView.setVisibility(View.VISIBLE);
        c36.frontView.setVisibility(View.VISIBLE);
        c37.frontView.setVisibility(View.VISIBLE);
        c38.frontView.setVisibility(View.VISIBLE);
        c39.frontView.setVisibility(View.VISIBLE);
        c40.frontView.setVisibility(View.VISIBLE);
        c41.frontView.setVisibility(View.VISIBLE);
        c42.frontView.setVisibility(View.VISIBLE);
        c43.frontView.setVisibility(View.VISIBLE);
        c44.frontView.setVisibility(View.VISIBLE);
        c45.frontView.setVisibility(View.VISIBLE);
        c46.frontView.setVisibility(View.VISIBLE);
        c47.frontView.setVisibility(View.VISIBLE);
        c48.frontView.setVisibility(View.VISIBLE);
        c49.frontView.setVisibility(View.VISIBLE);
        c50.frontView.setVisibility(View.VISIBLE);
        c51.frontView.setVisibility(View.VISIBLE);
        c52.frontView.setVisibility(View.VISIBLE);

                   // randomCard.backView = (ImageView) findViewById(R.id.randomCardView);
            //randomCard.backView.setLayoutParams(mainPlayerDealAnimParams);
           // randomCard.backView.setVisibility(View.VISIBLE);

           for (int i = 0; i < deckBackViews.size(); i++) {}


////////////////////////////////////////////////////////////////////////////////////////////////////
            RelativeLayout.LayoutParams sPlayerDealAnimParams = new RelativeLayout.LayoutParams
                    (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            mainPlayerDealAnimParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);

            TranslateAnimation sPlayerDealAnim = new TranslateAnimation
                    (Animation.RELATIVE_TO_SELF, 200, Animation.RELATIVE_TO_PARENT, 200, Animation.RELATIVE_TO_SELF, 200, Animation.RELATIVE_TO_PARENT, 200);
            mainPlayerDealAnim.setDuration(translateDuration);
            mainPlayerDealAnim.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                }
                @Override
                public void onAnimationEnd(Animation animation) {
                }
                @Override
                public void onAnimationRepeat(Animation animation) {
                }
            });
////////////////////////////////////////////////////////////////////////////////////////////////////
            RelativeLayout.LayoutParams tPlayerDealAnimParams = new RelativeLayout.LayoutParams
                    (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            mainPlayerDealAnimParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE);

            TranslateAnimation tPlayerDealAnim = new TranslateAnimation
                    (Animation.RELATIVE_TO_SELF, 200, Animation.RELATIVE_TO_PARENT, 200, Animation.RELATIVE_TO_SELF, 200, Animation.RELATIVE_TO_PARENT, 200);
            mainPlayerDealAnim.setDuration(translateDuration);
            mainPlayerDealAnim.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                }
                @Override
                public void onAnimationEnd(Animation animation) {
                }
                @Override
                public void onAnimationRepeat(Animation animation) {
                }
            });
////////////////////////////////////////////////////////////////////////////////////////////////////
            RelativeLayout.LayoutParams fPlayerDealAnimParams = new RelativeLayout.LayoutParams
                    (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            mainPlayerDealAnimParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);

            TranslateAnimation fPlayerDealAnim = new TranslateAnimation
                    (Animation.RELATIVE_TO_SELF, 200, Animation.RELATIVE_TO_PARENT, 200, Animation.RELATIVE_TO_SELF, 200, Animation.RELATIVE_TO_PARENT, 200);
            mainPlayerDealAnim.setDuration(translateDuration);
            mainPlayerDealAnim.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                }
                @Override
                public void onAnimationEnd(Animation animation) {
                }
                @Override
                public void onAnimationRepeat(Animation animation) {
                }
            });
////////////////////////////////////////////////////////////////////////////////////////////////////
*/


