package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args){

        //Declara um List, mas para instanciá-la é preciso usar a classe ArrayList
        List <String> list = new ArrayList<>();

        //Cria um elemento da lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());        //Printa uma lista com o tamanho

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------");

        list.removeIf(x -> x.charAt(0) == 'M');     //Isso é um predicado que é uma função Lambda (isso será falado mais a frente no curso)

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));     //Mostra a posição do elemento

        System.out.println("----------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("----------------------");

        //Comando para achar o primeiro elemento da lista que atender a um predicado
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);

    }
}
