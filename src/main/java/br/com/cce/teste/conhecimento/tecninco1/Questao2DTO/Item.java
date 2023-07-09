package br.com.cce.teste.conhecimento.tecninco1.Questao2DTO;

public class Item {

    private int id;
    private String name;
    private Integer valor;

    public static ItemBuilder builder() {
        return new ItemBuilder();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }


    public static final class ItemBuilder {
        private Item item;

        private ItemBuilder() {
            item = new Item();
        }

        public ItemBuilder id(int id) {
            item.setId(id);
            return this;
        }

        public ItemBuilder name(String name) {
            item.setName(name);
            return this;
        }

        public ItemBuilder valor(Integer valor) {
            item.setValor(valor);
            return this;
        }

        public Item build() {
            return item;
        }
    }
}
