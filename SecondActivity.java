package com.example.taymaz.hokm3;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.opengl.Visibility;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
** The Second Activity is lunched if the player starts a new game using the "New" Button. The very
** first item that appears on the screen is an EditText component, that will allow the user to enter
** his/her first name or any other nick name (a null pointer exception is constructed for users who
** do not comply). After the text input, the user has to press the "Done" Button for the game to
** start.
*/
public class SecondActivity extends AppCompatActivity{

    InputMethodManager imm;
    RelativeLayout secondLayout;
    int displayWidth, displayHeight;

    // Player objects have been constructed here for future assignments.
    Player mainPlayer = new Player();
    Player secondPlayer = new Player();
    Player thirdPlayer = new Player();
    Player fourthPlayer = new Player();

    Random random = new Random();

    final int MAXIMUM_DURATION = 5000;
    final int MINIMUM_DURATION = 1000;

    AlphaAnimation messBoardCardViewAnim;
    RelativeLayout.LayoutParams messBoardParams;

    TranslateAnimation mainPlayerDealAnim;
    RelativeLayout.LayoutParams mainPlayerDealAnimParams;

    int mainTeamWins = 0;
    int otherTeamWins = 0;

    CardView mPlayerEditNameCardView, mPlayerNameCardView, sPlayerNameCardView, tPlayerNameCardView,
            fPlayerNameCardView;
    EditText editText;
    TextView textView1, textView2, textView3, textView4;

    CardView messBoardCardView;
    TextView messageOnBoard;

    ImageView c1View, c2View, c3View, c4View, c5View, c6View, c7View, c8View, c9View, c10View,
        c11View, c12View, c13View, c14View, c15View, c16View, c17View, c18View, c19View, c20View,
        c21View, c22View, c23View, c24View, c25View, c26View, c27View, c28View, c29View, c30View,
        c31View, c32View, c33View, c34View, c35View, c36View, c37View, c38View, c39View, c40View,
        c41View, c42View, c43View, c44View, c45View, c46View, c47View, c48View, c49View, c50View,
        c51View, c52View, c1BackView, c2BackView, c3BackView, c4BackView, c5BackView, c6BackView,
            c7BackView, c8BackView, c9BackView, c10BackView, c11BackView, c12BackView, c13BackView,
            c14BackView, c15BackView, c16BackView, c17BackView, c18BackView, c19BackView, c20BackView,
            c21BackView, c22BackView, c23BackView, c24BackView, c25BackView, c26BackView, c27BackView,
            c28BackView, c29BackView, c30BackView, c31BackView, c32BackView, c33BackView, c34BackView,
            c35BackView, c36BackView, c37BackView, c38BackView, c39BackView, c40BackView, c41BackView,
            c42BackView, c43BackView, c44BackView, c45BackView, c46BackView, c47BackView, c48BackView,
            c49BackView, c50BackView, c51BackView, c52BackView, randCardBackView;

    Card c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20,
            c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, c34, c35, c36, c37, c38,
            c39, c40, c41, c42, c43, c44, c45, c46, c47, c48, c49, c50, c51, c52, randomCard;

    List<Card> deck;
    List<ImageView> deckFrontViews;
    List<ImageView> deckBackViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondLayout = (RelativeLayout) findViewById(R.id.secondLayout);
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        displayWidth = size.x;
        displayHeight = size.y;

        c1 = new Card (Card.Face.twoOfHearts, 1, Card.Suit.heart, c1View = (ImageView) findViewById(R.id.c1View), c1BackView = (ImageView) findViewById(R.id.c1BackView));
        c2 = new Card (Card.Face.threeOfHearts, 2, Card.Suit.heart, c2View = (ImageView) findViewById(R.id.c2View), c2BackView = (ImageView) findViewById(R.id.c2BackView));
        c3 = new Card (Card.Face.fourOfHearts, 3, Card.Suit.heart, c3View = (ImageView) findViewById(R.id.c3View), c3BackView = (ImageView) findViewById(R.id.c3BackView));
        c4 = new Card (Card.Face.fiveOfHearts, 4, Card.Suit.heart, c4View = (ImageView) findViewById(R.id.c4View), c4BackView = (ImageView) findViewById(R.id.c4BackView));
        c5 = new Card (Card.Face.sixOfHearts, 5, Card.Suit.heart, c5View = (ImageView) findViewById(R.id.c5View), c5BackView = (ImageView) findViewById(R.id.c5BackView));
        c6 = new Card (Card.Face.sevenOfHearts, 6, Card.Suit.heart, c6View = (ImageView) findViewById(R.id.c6View), c6BackView = (ImageView) findViewById(R.id.c6BackView));
        c7 = new Card (Card.Face.eightOfHearts, 7, Card.Suit.heart, c7View = (ImageView) findViewById(R.id.c7View), c7BackView = (ImageView) findViewById(R.id.c7BackView));
        c8 = new Card (Card.Face.nineOfHearts, 8, Card.Suit.heart, c8View = (ImageView) findViewById(R.id.c8View), c8BackView = (ImageView) findViewById(R.id.c8BackView));
        c9 = new Card (Card.Face.tenOfHearts, 9, Card.Suit.heart, c9View = (ImageView) findViewById(R.id.c9View), c9BackView = (ImageView) findViewById(R.id.c9BackView));
        c10 = new Card (Card.Face.knightOfHearts, 10, Card.Suit.heart, c10View = (ImageView) findViewById(R.id.c10View), c10BackView = (ImageView) findViewById(R.id.c10BackView));
        c11 = new Card (Card.Face.queenOfHearts, 11, Card.Suit.heart, c11View = (ImageView) findViewById(R.id.c11View), c11BackView = (ImageView) findViewById(R.id.c11BackView));
        c12 = new Card (Card.Face.kingOfHearts, 12, Card.Suit.heart, c12View = (ImageView) findViewById(R.id.c12View), c12BackView = (ImageView) findViewById(R.id.c12BackView));
        c13 = new Card (Card.Face.aceOfHearts, 13, Card.Suit.heart, c13View = (ImageView) findViewById(R.id.c13View), c13BackView = (ImageView) findViewById(R.id.c13BackView));

        c14 = new Card (Card.Face.twoOfSpades, 1, Card.Suit.spades, c14View = (ImageView) findViewById(R.id.c14View), c14BackView = (ImageView) findViewById(R.id.c14BackView));
        c15 = new Card (Card.Face.threeOfSpades, 2, Card.Suit.spades, c15View = (ImageView) findViewById(R.id.c15View), c15BackView = (ImageView) findViewById(R.id.c15BackView));
        c16 = new Card (Card.Face.fourOfSpades, 3, Card.Suit.spades, c16View = (ImageView) findViewById(R.id.c16View), c16BackView = (ImageView) findViewById(R.id.c16BackView));
        c17 = new Card (Card.Face.fiveOfSpades, 4, Card.Suit.spades, c17View = (ImageView) findViewById(R.id.c17View), c17BackView = (ImageView) findViewById(R.id.c17BackView));
        c18 = new Card (Card.Face.sixOfSpades, 5, Card.Suit.spades, c18View = (ImageView) findViewById(R.id.c18View), c18BackView = (ImageView) findViewById(R.id.c18BackView));
        c19 = new Card (Card.Face.sevenOfSpades, 6, Card.Suit.spades, c19View = (ImageView) findViewById(R.id.c19View), c19BackView = (ImageView) findViewById(R.id.c19BackView));
        c20 = new Card (Card.Face.eightOfSpades, 7, Card.Suit.spades, c20View = (ImageView) findViewById(R.id.c20View), c20BackView = (ImageView) findViewById(R.id.c20BackView));
        c21 = new Card (Card.Face.nineOfSpades, 8, Card.Suit.spades, c21View = (ImageView) findViewById(R.id.c21View), c21BackView = (ImageView) findViewById(R.id.c21BackView));
        c22 = new Card (Card.Face.tenOfSpades, 9, Card.Suit.spades, c22View = (ImageView) findViewById(R.id.c22View), c22BackView = (ImageView) findViewById(R.id.c22BackView));
        c23 = new Card (Card.Face.knightOfSpades, 10, Card.Suit.spades, c23View = (ImageView) findViewById(R.id.c23View), c23BackView = (ImageView) findViewById(R.id.c23BackView));
        c24 = new Card (Card.Face.queenOfSpades, 11, Card.Suit.spades, c24View = (ImageView) findViewById(R.id.c24View), c24BackView = (ImageView) findViewById(R.id.c24BackView));
        c25 = new Card (Card.Face.kingOfSpades, 12, Card.Suit.spades, c25View = (ImageView) findViewById(R.id.c25View), c25BackView = (ImageView) findViewById(R.id.c25BackView));
        c26 = new Card (Card.Face.aceOfSpades, 13, Card.Suit.spades, c26View = (ImageView) findViewById(R.id.c26View), c26BackView = (ImageView) findViewById(R.id.c26BackView));

        c27 = new Card (Card.Face.twoOfDiamonds, 1, Card.Suit.diamond, c27View = (ImageView) findViewById(R.id.c27View), c27BackView = (ImageView) findViewById(R.id.c27BackView));
        c28 = new Card (Card.Face.threeOfDiamonds, 2, Card.Suit.diamond, c28View = (ImageView) findViewById(R.id.c28View), c28BackView = (ImageView) findViewById(R.id.c28BackView));
        c29 = new Card (Card.Face.fourOfDiamonds, 3, Card.Suit.diamond, c29View = (ImageView) findViewById(R.id.c29View), c29BackView = (ImageView) findViewById(R.id.c29BackView));
        c30 = new Card (Card.Face.fiveOfDiamonds, 4, Card.Suit.diamond, c30View = (ImageView) findViewById(R.id.c30View), c30BackView = (ImageView) findViewById(R.id.c30BackView));
        c31 = new Card (Card.Face.sixOfDiamonds, 5, Card.Suit.diamond, c31View = (ImageView) findViewById(R.id.c31View), c31BackView = (ImageView) findViewById(R.id.c31BackView));
        c32 = new Card (Card.Face.sevenOfDiamonds, 6, Card.Suit.diamond, c32View = (ImageView) findViewById(R.id.c32View), c32BackView = (ImageView) findViewById(R.id.c32BackView));
        c33 = new Card (Card.Face.eightOfDiamonds, 7, Card.Suit.diamond, c33View = (ImageView) findViewById(R.id.c33View), c33BackView = (ImageView) findViewById(R.id.c33BackView));
        c34 = new Card (Card.Face.nineOfDiamonds, 8, Card.Suit.diamond, c34View = (ImageView) findViewById(R.id.c34View), c34BackView = (ImageView) findViewById(R.id.c34BackView));
        c35 = new Card (Card.Face.tenOfDiamonds, 9, Card.Suit.diamond, c35View = (ImageView) findViewById(R.id.c35View), c35BackView = (ImageView) findViewById(R.id.c35BackView));
        c36 = new Card (Card.Face.knightOfDiamonds, 10, Card.Suit.diamond, c36View = (ImageView) findViewById(R.id.c36View), c36BackView = (ImageView) findViewById(R.id.c36BackView));
        c37 = new Card (Card.Face.queenOfDiamonds, 11, Card.Suit.diamond, c37View = (ImageView) findViewById(R.id.c37View), c37BackView = (ImageView) findViewById(R.id.c37BackView));
        c38 = new Card (Card.Face.kingOfDiamonds, 12, Card.Suit.diamond, c38View = (ImageView) findViewById(R.id.c38View), c38BackView = (ImageView) findViewById(R.id.c38BackView));
        c39 = new Card (Card.Face.aceOfDiamonds, 13, Card.Suit.diamond, c39View = (ImageView) findViewById(R.id.c39View), c39BackView = (ImageView) findViewById(R.id.c39BackView));

        c40 = new Card (Card.Face.twoOfClovers, 1, Card.Suit.clover, c40View = (ImageView) findViewById(R.id.c40View), c40BackView = (ImageView) findViewById(R.id.c40BackView));
        c41 = new Card (Card.Face.threeOfClovers, 2, Card.Suit.clover, c41View = (ImageView) findViewById(R.id.c41View), c41BackView = (ImageView) findViewById(R.id.c41BackView));
        c42 = new Card (Card.Face.fourOfClovers, 3, Card.Suit.clover, c42View = (ImageView) findViewById(R.id.c42View), c42BackView = (ImageView) findViewById(R.id.c42BackView));
        c43 = new Card (Card.Face.fiveOfClovers, 4, Card.Suit.clover, c43View = (ImageView) findViewById(R.id.c43View), c43BackView = (ImageView) findViewById(R.id.c43BackView));
        c44 = new Card (Card.Face.sixOfClovers, 5, Card.Suit.clover, c44View = (ImageView) findViewById(R.id.c44View), c44BackView = (ImageView) findViewById(R.id.c44BackView));
        c45 = new Card (Card.Face.sevenOfClovers, 6, Card.Suit.clover, c45View = (ImageView) findViewById(R.id.c45View), c45BackView = (ImageView) findViewById(R.id.c45BackView));
        c46 = new Card (Card.Face.eightOfClovers, 7, Card.Suit.clover, c46View = (ImageView) findViewById(R.id.c46View), c46BackView = (ImageView) findViewById(R.id.c46BackView));
        c47 = new Card (Card.Face.nineOfClovers, 8, Card.Suit.clover, c47View = (ImageView) findViewById(R.id.c47View), c47BackView = (ImageView) findViewById(R.id.c47BackView));
        c48 = new Card (Card.Face.tenOfClovers, 9, Card.Suit.clover, c48View = (ImageView) findViewById(R.id.c48View), c48BackView = (ImageView) findViewById(R.id.c48BackView));
        c49 = new Card (Card.Face.knightOfClovers, 10, Card.Suit.clover, c49View = (ImageView) findViewById(R.id.c49View), c49BackView = (ImageView) findViewById(R.id.c49BackView));
        c50 = new Card (Card.Face.queenOfClovers, 11, Card.Suit.clover, c50View = (ImageView) findViewById(R.id.c50View), c50BackView = (ImageView) findViewById(R.id.c50BackView));
        c51 = new Card (Card.Face.kingOfClovers, 12, Card.Suit.clover, c51View = (ImageView) findViewById(R.id.c51View), c51BackView = (ImageView) findViewById(R.id.c51BackView));
        c52 = new Card (Card.Face.aceOfClovers, 13, Card.Suit.clover, c52View = (ImageView) findViewById(R.id.c52View), c52BackView = (ImageView) findViewById(R.id.c52BackView));

        randomCard = new Card(); //Local Variable from parameter-less constructor.
        randomCard.backView = (ImageView) findViewById(R.id.randCardBackView);

        deck = new ArrayList<>();
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

        deckFrontViews = new ArrayList<>();
        deckFrontViews.add(c1.frontView);
        deckFrontViews.add(c2.frontView);
        deckFrontViews.add(c3.frontView);
        deckFrontViews.add(c4.frontView);
        deckFrontViews.add(c5.frontView);
        deckFrontViews.add(c6.frontView);
        deckFrontViews.add(c7.frontView);
        deckFrontViews.add(c8.frontView);
        deckFrontViews.add(c9.frontView);
        deckFrontViews.add(c10.frontView);
        deckFrontViews.add(c11.frontView);
        deckFrontViews.add(c12.frontView);
        deckFrontViews.add(c13.frontView);
        deckFrontViews.add(c14.frontView);
        deckFrontViews.add(c15.frontView);
        deckFrontViews.add(c16.frontView);
        deckFrontViews.add(c17.frontView);
        deckFrontViews.add(c18.frontView);
        deckFrontViews.add(c19.frontView);
        deckFrontViews.add(c20.frontView);
        deckFrontViews.add(c21.frontView);
        deckFrontViews.add(c22.frontView);
        deckFrontViews.add(c23.frontView);
        deckFrontViews.add(c24.frontView);
        deckFrontViews.add(c25.frontView);
        deckFrontViews.add(c26.frontView);
        deckFrontViews.add(c27.frontView);
        deckFrontViews.add(c28.frontView);
        deckFrontViews.add(c29.frontView);
        deckFrontViews.add(c30.frontView);
        deckFrontViews.add(c31.frontView);
        deckFrontViews.add(c32.frontView);
        deckFrontViews.add(c33.frontView);
        deckFrontViews.add(c34.frontView);
        deckFrontViews.add(c35.frontView);
        deckFrontViews.add(c36.frontView);
        deckFrontViews.add(c37.frontView);
        deckFrontViews.add(c38.frontView);
        deckFrontViews.add(c39.frontView);
        deckFrontViews.add(c40.frontView);
        deckFrontViews.add(c41.frontView);
        deckFrontViews.add(c42.frontView);
        deckFrontViews.add(c43.frontView);
        deckFrontViews.add(c44.frontView);
        deckFrontViews.add(c45.frontView);
        deckFrontViews.add(c46.frontView);
        deckFrontViews.add(c47.frontView);
        deckFrontViews.add(c48.frontView);
        deckFrontViews.add(c49.frontView);
        deckFrontViews.add(c50.frontView);
        deckFrontViews.add(c51.frontView);
        deckFrontViews.add(c52.frontView);

        deckBackViews = new ArrayList<>();
        deckBackViews.add(c1.backView);
        deckBackViews.add(c2.backView);
        deckBackViews.add(c3.backView);
        deckBackViews.add(c4.backView);
        deckBackViews.add(c5.backView);
        deckBackViews.add(c6.backView);
        deckBackViews.add(c7.backView);
        deckBackViews.add(c8.backView);
        deckBackViews.add(c9.backView);
        deckBackViews.add(c10.backView);
        deckBackViews.add(c11.backView);
        deckBackViews.add(c12.backView);
        deckBackViews.add(c13.backView);
        deckBackViews.add(c14.backView);
        deckBackViews.add(c15.backView);
        deckBackViews.add(c16.backView);
        deckBackViews.add(c17.backView);
        deckBackViews.add(c18.backView);
        deckBackViews.add(c19.backView);
        deckBackViews.add(c20.backView);
        deckBackViews.add(c21.backView);
        deckBackViews.add(c22.backView);
        deckBackViews.add(c23.backView);
        deckBackViews.add(c24.backView);
        deckBackViews.add(c25.backView);
        deckBackViews.add(c26.backView);
        deckBackViews.add(c27.backView);
        deckBackViews.add(c28.backView);
        deckBackViews.add(c29.backView);
        deckBackViews.add(c30.backView);
        deckBackViews.add(c31.backView);
        deckBackViews.add(c32.backView);
        deckBackViews.add(c33.backView);
        deckBackViews.add(c34.backView);
        deckBackViews.add(c35.backView);
        deckBackViews.add(c36.backView);
        deckBackViews.add(c37.backView);
        deckBackViews.add(c38.backView);
        deckBackViews.add(c39.backView);
        deckBackViews.add(c40.backView);
        deckBackViews.add(c41.backView);
        deckBackViews.add(c42.backView);
        deckBackViews.add(c43.backView);
        deckBackViews.add(c44.backView);
        deckBackViews.add(c45.backView);
        deckBackViews.add(c46.backView);
        deckBackViews.add(c47.backView);
        deckBackViews.add(c48.backView);
        deckBackViews.add(c49.backView);
        deckBackViews.add(c50.backView);
        deckBackViews.add(c51.backView);
        deckBackViews.add(c52.backView);

        mPlayerEditNameCardView = (CardView) findViewById(R.id.mPlayerEditNameCardView);
        editText = (EditText) findViewById(R.id.editText1);
        imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

        mPlayerNameCardView = (CardView) findViewById(R.id.mPlayerNameCardView);
        textView1 = (TextView) findViewById(R.id.textView1);

        sPlayerNameCardView = (CardView) findViewById(R.id.sPlayerNameCardView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(secondPlayer.toString());

        tPlayerNameCardView = (CardView) findViewById(R.id.tPlayerNameCardView);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView3.setText(thirdPlayer.toString());

        fPlayerNameCardView = (CardView) findViewById(R.id.fPlayerNameCardView);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setText(fourthPlayer.toString());
    }

    public void onStart () {
        super.onStart();
        startTheGame();
    }
// The game starts here
    public void startTheGame(){
        mainTeamWins = 0;
        otherTeamWins = 0;

        editText.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                textView1.setText(editText.getText());
                mPlayerEditNameCardView.setVisibility(View.INVISIBLE);
                imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                showMessageBoard();
                return true;
            }
            return false;
        });
    }

    void showMessageBoard() {

        long alphaDuration = MAXIMUM_DURATION;

        messBoardParams = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        messBoardParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);

        messBoardCardView = (CardView) findViewById(R.id.messBoardCardView);
        messBoardCardView.setLayoutParams(messBoardParams);
        messBoardCardView.setVisibility(View.INVISIBLE);

        messBoardCardViewAnim = new AlphaAnimation(0.0F, 1.0F);
        messBoardCardViewAnim.setDuration(alphaDuration);
        messBoardCardViewAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onAnimationEnd(Animation animation) {
                c1.backView.setVisibility(View.VISIBLE);
                c2.backView.setVisibility(View.VISIBLE);
                c3.backView.setVisibility(View.VISIBLE);
                c4.backView.setVisibility(View.VISIBLE);
                c5.backView.setVisibility(View.VISIBLE);
                c6.backView.setVisibility(View.VISIBLE);
                c7.backView.setVisibility(View.VISIBLE);
                c8.backView.setVisibility(View.VISIBLE);
                c9.backView.setVisibility(View.VISIBLE);
                c10.backView.setVisibility(View.VISIBLE);
                c11.backView.setVisibility(View.VISIBLE);
                c12.backView.setVisibility(View.VISIBLE);
                c13.backView.setVisibility(View.VISIBLE);
                c14.backView.setVisibility(View.VISIBLE);
                c15.backView.setVisibility(View.VISIBLE);
                c16.backView.setVisibility(View.VISIBLE);
                c17.backView.setVisibility(View.VISIBLE);
                c18.backView.setVisibility(View.VISIBLE);
                c19.backView.setVisibility(View.VISIBLE);
                c20.backView.setVisibility(View.VISIBLE);
                c21.backView.setVisibility(View.VISIBLE);
                c22.backView.setVisibility(View.VISIBLE);
                c23.backView.setVisibility(View.VISIBLE);
                c24.backView.setVisibility(View.VISIBLE);
                c25.backView.setVisibility(View.VISIBLE);
                c26.backView.setVisibility(View.VISIBLE);
                c27.backView.setVisibility(View.VISIBLE);
                c28.backView.setVisibility(View.VISIBLE);
                c29.backView.setVisibility(View.VISIBLE);
                c30.backView.setVisibility(View.VISIBLE);
                c31.backView.setVisibility(View.VISIBLE);
                c32.backView.setVisibility(View.VISIBLE);
                c33.backView.setVisibility(View.VISIBLE);
                c34.backView.setVisibility(View.VISIBLE);
                c35.backView.setVisibility(View.VISIBLE);
                c36.backView.setVisibility(View.VISIBLE);
                c37.backView.setVisibility(View.VISIBLE);
                c38.backView.setVisibility(View.VISIBLE);
                c39.backView.setVisibility(View.VISIBLE);
                c40.backView.setVisibility(View.VISIBLE);
                c41.backView.setVisibility(View.VISIBLE);
                c42.backView.setVisibility(View.VISIBLE);
                c43.backView.setVisibility(View.VISIBLE);
                c44.backView.setVisibility(View.VISIBLE);
                c45.backView.setVisibility(View.VISIBLE);
                c46.backView.setVisibility(View.VISIBLE);
                c47.backView.setVisibility(View.VISIBLE);
                c48.backView.setVisibility(View.VISIBLE);
                c49.backView.setVisibility(View.VISIBLE);
                c50.backView.setVisibility(View.VISIBLE);
                c51.backView.setVisibility(View.VISIBLE);
                c52.backView.setVisibility(View.VISIBLE);

                randomCard.backView.setVisibility(View.VISIBLE);

                crownDeal();
            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
        messBoardCardView.startAnimation(messBoardCardViewAnim);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void crownDeal() {
        long translateDuration = MINIMUM_DURATION;
////////////////////////////////////////////////////////////////////////////////////////////////////
            mainPlayerDealAnimParams = new RelativeLayout.LayoutParams
                    (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            mainPlayerDealAnimParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);

            mainPlayerDealAnim = new TranslateAnimation
                    (Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_PARENT, 200, Animation.RELATIVE_TO_SELF, 0, Animation.RELATIVE_TO_PARENT, 200);
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
            randCardBackView = (ImageView) findViewById(R.id.randomCardView);
            randCardBackView.setImageResource(random.nextInt(deckBackViews.size())); // redundant bc every Image on deckBackViews is the same LOL.
            randCardBackView.setLayoutParams(mainPlayerDealAnimParams);
            //randCardBackView.setAnimation(mainPlayerDealAnim);
            randCardBackView.startAnimation(mainPlayerDealAnim);

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
        }
}



