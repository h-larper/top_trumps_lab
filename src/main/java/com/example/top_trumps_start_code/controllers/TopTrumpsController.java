package com.example.top_trumps_start_code.controllers;


import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Suit;
import com.example.top_trumps_start_code.services.TopTrumpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/toptrumps")
public class TopTrumpsController {

    @Autowired                              // instantiate top trump service object
    TopTrumpsService topTrumpsService;

@PostMapping
    public ResponseEntity<String> playGame(@RequestBody ArrayList<Card> hand){
//  TopTrumpsService checkwinner() passing in hand, returns string
    String winner = topTrumpsService.checkWinner(hand);
    return new ResponseEntity<>(winner, HttpStatus.OK);
}

}
