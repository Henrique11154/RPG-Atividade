package br.edu.iftm.rpgjava.teste;

import java.util.Random;

import br.edu.iftm.rpgjava.Classes.Guerreiro;
import br.edu.iftm.rpgjava.Classes.Arqueiro;
import br.edu.iftm.rpgjava.Classes.Mago;

public class Principal {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Vladimir", 50, 30, -3, 0,
         80, 90, 90, 
         10, 80, 63); /*METODO CONSTRUTOR*/

        /* OBJETO GUERREIRO
        g.setNome("Vladimir");
        g.setForca(80);
        g.setAgilidade(30);;
        g.carisma = 0;
        g.destreza = 50;
        g.inteligencia = -3;
        g.estamina = 90;
        g.resistencia = 80;
        g.sorte = 10;
        g.vida = 90;
        g.*/

        Mago m = new Mago("Agostinho Carrara", 90, 0, 60, 0, 50,
        60, 45, 85, 0, 100);
        /* OBJETO MAGO
        m.nome = "Agostinho Carrara";
        m.mana = 100;
        m.vida = 60;
        m.destreza = 90;
        m.resistencia = 50;
        m.sorte = 85;
        m.inteligencia = 60;
        m.estamina = 45;*/

        Arqueiro a = new Arqueiro("Jonshon e Jhonson a family company", 95, 0, 60,
         0, 30, 75,
          45, 5, 0, 0);
        /*OBJETO ARQUEIRO
        a.nome = "Jhonson e Jhonson a family company";
        a.destreza = 95;
        a.resistencia = 30;
        a.estamina = 45;
        a.sorte = 5;
        a.vida = 75;
        a.inteligencia = 60;*/
        
        /* int valorAtaque = g.ataque(6);*/

        Random dado = new Random();

        int round = 1;

        while (g.getVida() > 0 && a.getVida() > 0){
            System.out.println("\nRound: " + round);
            System.out.println("Oponente 1: " +g.getNome());
            System.out.println("Oponente 2: "+a.getNome()+"\n");

            /* Turno do Mago*/
            int valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: "+valorDado);
            int valorAtaque = a.atacar(valorDado,a.getResistencia());
            g.defender(valorAtaque);

            /* Turno do Guerreiro*/
            valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: "+valorDado);
            valorAtaque = g.atacar(valorDado,0);
            a.defender(valorAtaque);
            /* round = round +1*/ 
            round++;
        }
    }
}
