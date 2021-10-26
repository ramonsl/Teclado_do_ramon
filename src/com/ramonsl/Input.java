package com.ramonsl;

import javax.swing.*;
import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public String lerString(){
        System.out.println("Digite a String");
       return scanner.next();
    }

    public String lerString(String msg){
        System.out.println(msg);
        return scanner.next();
    }

    public int lerInt(String msg){
        System.out.println(msg);
        int valor=0;


            try{
                valor =scanner.nextInt();
            }catch (Exception io){
                System.out.println("Erro ao ler inteiro");
            }
        return  valor;
    }

}
