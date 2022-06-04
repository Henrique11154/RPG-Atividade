package br.edu.iftm.rpgjava.teste;

import java.util.Scanner;

import br.edu.iftm.rpgjava.Classes.Guerreiro;
import br.edu.iftm.rpgjava.Classes.Arma;
import br.edu.iftm.rpgjava.Classes.Arqueiro;
import br.edu.iftm.rpgjava.Classes.Mago;

public class Principal2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Guerreiro g = new Guerreiro("Belerofonte" ,50, 0, 10, 
         0, 0, 60,
         100, 5, 20, 0);
        
        Arqueiro a = new Arqueiro("Itzamna", 0, 55, 78,
         0, 0, 50,
         100, 40, 15, 0);
         
        Mago m = new Mago("Nicholas Flamel", 0, 0, 30,
         60, 0, 48,
         100, 30, 20, 90);
        
        Arma armaG = new Arma("Escalibur", 35, 20);//Arma do guerreiro
        Arma arma2 = new Arma("Yumi", 20, 35);//Arma do arqueiro
        Arma armaM = new Arma("", 0, 0);//Arma do mago
                
    }
}
/*System.out.print("Escolha seu personagem (Guerreiro/Arqueiro/Mago): ");
        String personagem = entrada.next();*/