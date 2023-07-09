package br.com.cce.teste.conhecimento.tecninco1;

public class Questao1 {

    private static boolean isoff() {
        return Boolean.FALSE;
    }
    private static boolean isOn() {
        return Boolean.TRUE.equals(isoff());
    }
    public static void main(String[] args) {
        System.out.println(isOn());
    }
}
