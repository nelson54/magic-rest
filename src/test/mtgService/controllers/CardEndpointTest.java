package mtgService.controllers;

import mtgService.Application;
import mtgService.model.Card;
import mtgService.model.CardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CardEndpointTest {

    @Autowired
    CardRepository cardEndpoint;

    @Test
    public void testInsertCards() throws Exception {
        List<Card> cards = new ArrayList<Card>();

        Card card = new Card();

        card.setArtist("Test Artist");
        card.setName("Test Name");

        cards.add(card);

        cardEndpoint.save(cards);
    }
}