package com.ramonsl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner tc2 = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String a = tc2.next();

        Input tc= new Input();
        tc.lerString();
        tc.lerString("Digite seu nome");
        tc.lerInt("DiGITE ");


       // tc.lerJopString("Digite seu nome");
    }
}
