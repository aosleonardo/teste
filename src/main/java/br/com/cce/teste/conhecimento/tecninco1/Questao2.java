package br.com.cce.teste.conhecimento.tecninco1;

import br.com.cce.teste.conhecimento.tecninco1.Questao2DTO.Item;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
public class Questao2 {

    private static final int MIN = 1;
    private static final int MAX = 10;

    private static void processarItens(List<Item> itens) {
            itens.forEach( i -> processar(i));
    }

    private static void processar(Item i)  {
        if (i.getValor() > 11) {
            log.error("Erro ao processar o item id: {}, com o valor: {}", i.getId(), i.getValor());
            return;
        }
        log.info("Item id : {}, processado com sucesso", i.getId());
    }

    public static int randomInt() {
        Random random = new Random();
        return random.nextInt(MAX - MIN) + MIN;
    }
    private static List<Item> populaItens() {
        final List<Item> itens = new ArrayList<>();
        itens.add(Item.builder().id(1).name("Item 1").valor(randomInt()).build());
        itens.add(Item.builder().id(4).name("Item ERRO").valor(9999).build());
        itens.add(Item.builder().id(2).name("Item 2").valor(randomInt()).build());
        itens.add(Item.builder().id(3).name("Item 3").valor(randomInt()).build());
        return itens;
    }

    public static void main(String[] args) {
        processarItens(populaItens());
    }
}
