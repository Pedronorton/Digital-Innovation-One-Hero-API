package com.digitialinnovationone.herosapi;

import org.springframework.boot.test.context.SpringBootTest;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.digitialinnovationone.herosapi.document.Heroes;
import com.digitialinnovationone.herosapi.repository.HerosRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

import static com.digitialinnovationone.herosapi.constants.HerosConstant.HEROES_ENDPOINT_LOCAL;

@RunWith(SpringRunner.class)
@DirtiesContext
@AutoConfigureWebTestClient
@SpringBootTest
public class HerosapiApplicationTests {

    @Autowired
    WebTestClient webTestClient;

    @Autowired
    HerosRepository heroesRepository;

    //Quando eu acho um Hero
    @Test
    public void getOneHeroById(){
        webTestClient.get().uri(HEROES_ENDPOINT_LOCAL.concat("/{id}"), "3")
                .exchange()
                .expectStatus().isOk()
                .expectBody();
    }
    //Quando eu não acho um Hero
    @Test
    public void getOneHeroNotFound(){
        webTestClient.get().uri(HEROES_ENDPOINT_LOCAL.concat("/{id}"), "1")
                .exchange()
                .expectStatus().isNotFound();
    }

    @Test
    public void deleteHero(){
        webTestClient.delete().uri(HEROES_ENDPOINT_LOCAL.concat("/{id}"), "3")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isNotFound()
                .expectBody(Void.class);
    }

}
