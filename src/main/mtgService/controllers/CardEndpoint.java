package mtgService.controllers;

import mtgService.model.Card;
import mtgService.model.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
@RequestMapping("/cards")
public class CardEndpoint {

    @Autowired
    CardRepository cardRepository;

    @RequestMapping(method=RequestMethod.PUT)
    void insertCards(
            @RequestParam
            List<Card> cards
    ){
        cardRepository.save(cards);
    }
}
