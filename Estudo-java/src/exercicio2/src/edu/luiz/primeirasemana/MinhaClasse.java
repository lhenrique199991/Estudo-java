package edu.luiz.primeirasemana;
public class MinhaClasse {

//main class de execulção, que irá execultar algo.
public static void main (String[] args) {

    String primeiroNome = "Luiz";
    String segundoNome = "Henrique";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.print (nomeCompleto);
}


//Métodos
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Nome: " + primeiroNome.concat(" ").concat(segundoNome);
}

    




}

//Todo arquivo.java deve começar com letra maiúscula ex: MinhaClass, toda class 'pai' deve ser o nomesmo nome do arquivo, toda palavra variavél composta deve ter a partir da segunda maiúscula


//System.out.print ("Olá Mundo"); //sistema.saida.método()



//Variável tipo nome = valor;
//final String BR = "Brasil"; //essa variavél não poderá ser mudada pois possue 'final' no início
//também não poderá ser mudada se possuir letras maiúsculas, como boa prática.

//int ano = 2021;
//ano =2021; //váriavel diferentes,pois não possuem mesmo tipo.

//String meuNome = "Luiz";

//int meuNumero = 123;

//boolean verdadeiro = true;

//boolean falso = false;