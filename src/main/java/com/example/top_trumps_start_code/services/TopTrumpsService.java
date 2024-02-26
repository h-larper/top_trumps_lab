package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TopTrumpsService {
    @Autowired
    Card card;
    private Rank rank;

    private ArrayList<Card> hand;

    public TopTrumpsService() {
    }


    public String checkWinner(ArrayList<Card> hand){
        if(hand.get(0).getCardValue() > hand.get(1).getCardValue() ){
            return hand.get(0).getRank() + " of " +hand.get(0).getSuit() + " wins!";
        }
        if(hand.get(1).getCardValue() > hand.get(0).getCardValue() ){
            return hand.get(1).getRank() + " of " +hand.get(1).getSuit() + " wins!";
        }
        if(hand.get(1).getCardValue() == hand.get(0).getCardValue() ){
            return "Its a draw!";
        }
        return "Game failed";
    }
}
