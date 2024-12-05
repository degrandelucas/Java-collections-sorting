package list.collections.application;

import list.collections.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.StringUTF16.compareTo;

public class App {
    public static void main(String[] args) {
        //1- Lista ordenadas de numeros inteiros
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(5);
        listaNumeros.add(1);
        listaNumeros.add(6);
        listaNumeros.add(4);
        listaNumeros.add(3);
        System.out.println("Lista nao ordenada:");
        System.out.println(listaNumeros);
        Collections.sort(listaNumeros);
        System.out.println("\nLista ordenada:");
        System.out.println(listaNumeros);

        //2 e 3 - Usando Interface Comparable para ordenar objetos do tipo Titulo (Classe)
        Titulo conteudoLerAssistir1 = new Titulo("Dom Quixote", "Livro");
        Titulo conteudoLerAssistir2 = new Titulo("O Senhor dos Anéis", "Livro");
        Titulo conteudoLerAssistir3 = new Titulo("Avatar", "Filme");
        Titulo conteudoLerAssistir4 = new Titulo("Vingadores: Ultimato", "Filme");
        Titulo conteudoLerAssistir5 = new Titulo("Friends", "Serie");
        Titulo conteudoLerAssistir6 = new Titulo("Suits", "Serie");
        List<Titulo> conteudoLerAssistir = new ArrayList<>();
        conteudoLerAssistir.add(conteudoLerAssistir1);
        conteudoLerAssistir.add(conteudoLerAssistir2);
        conteudoLerAssistir.add(conteudoLerAssistir3);
        conteudoLerAssistir.add(conteudoLerAssistir4);
        conteudoLerAssistir.add(conteudoLerAssistir5);
        conteudoLerAssistir.add(conteudoLerAssistir6);
        System.out.println("\nLista ordenada por título:" + compareTo(conteudoLerAssistir);

    }
}