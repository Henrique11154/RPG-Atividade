package br.edu.iftm.rpgjava.teste;

import java.util.Scanner;
import java.util.Random;

import br.edu.iftm.rpgjava.Classes.Guerreiro;
import br.edu.iftm.rpgjava.Classes.Arma;
import br.edu.iftm.rpgjava.Classes.Arqueiro;
import br.edu.iftm.rpgjava.Classes.Mago;
import br.edu.iftm.rpgjava.Classes.Armadura;

public class Principal2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Guerreiro g = new Guerreiro();

        System.out.print("Digite o nome do gurreiro: ");
        g.setNome(entrada.next());
        System.out.print("Digite a força do gurreiro: ");
        g.setForca(entrada.nextInt());
        System.out.print("Digite a resistência do gurreiro: ");
        g.setResistencia(entrada.nextInt());
        System.out.print("Digite a vida do gurreiro: ");
        g.setVida(entrada.nextInt());
        System.out.print("Digite a estamina do gurreiro: ");
        g.setEstamina(entrada.nextInt());
        System.out.print("Digite a agilidade do gurreiro: ");
        g.setAgilidade(entrada.nextInt());
        System.out.print("Digite a sorte do gurreiro: ");
        g.setSorte(entrada.nextInt());
        
        Arqueiro a = new Arqueiro();

        System.out.print("\nDigite o nome do Arqueiro: ");
        a.setNome(entrada.next());
        System.out.print("Digite a destreza do Arqueiro: ");
        a.setDestreza(entrada.nextInt());
        System.out.print("Digite a agilidade do Arqueiro: ");
        a.setAgilidade(entrada.nextInt());
        System.out.print("Digite a resistência do Arqueiro: ");
        a.setResistencia(entrada.nextInt());
        System.out.print("Digite a vida do Arqueiro: ");
        a.setVida(entrada.nextInt());
        System.out.print("Digite a estamina do Arqueiro: ");
        a.setEstamina(entrada.nextInt());
        System.out.print("Digite a sorte do Arqueiro: ");
        a.setSorte(entrada.nextInt());
         
        Mago m = new Mago();

        System.out.print("\nDigite o nome do Mago: ");
        m.setNome(entrada.next());
        System.out.print("Digite a inteligência do Mago: ");
        m.setInteligencia(entrada.nextInt());
        System.out.print("Digite a agilidade do Mago: ");
        m.setAgilidade(entrada.nextInt());
        System.out.print("Digite a resistência do Mago: ");
        m.setResistencia(entrada.nextInt());
        System.out.print("Digite a vida do Mago: ");
        m.setVida(entrada.nextInt());
        System.out.print("Digite a estamina do Mago: ");
        m.setEstamina(entrada.nextInt());
        System.out.print("Digite a sorte do Mago: ");
        m.setSorte(entrada.nextInt());
        System.out.print("Digite a mana do Mago: ");
        m.setMana(entrada.nextInt());
         
        
        Arma armaG = new Arma("Escalibur", 35, 20);//Arma do guerreiro
        Arma armaA = new Arma("Yumi", 20, 35);//Arma do arqueiro
        Arma armaM = new Arma("cajado do saber", 13, 30);//Arma do mago
                
        Armadura armaduraG = new Armadura("", 20, 15, 20);
        Armadura armaduraA = new Armadura("", 12, 15, 20);
        Armadura armaduraM = new Armadura("",10, 25, 25);

        g.setArma(armaG);
        g.setArmadura(armaduraG);
        a.setArma(armaA);
        a.setArmadura(armaduraA);
        m.setArma(armaM);
        m.setArmadura(armaduraM);

        int round = 1;
        Random dado = new Random();
        int ataque;

        while(g.getVida() > 0 && m.getVida() > 0 && a.getVida() > 0){
            System.out.println("\nRound: " + round);
            System.out.println("Oponente 1: " +g.getNome());
            System.out.println("Oponente 2: "+a.getNome());
            System.out.println("Oponente 3: " + m.getNome());

            // Turno do mago
            int valorDado = dado.nextInt(6);
            System.out.println("\nValor do dado: "+valorDado);
            System.out.print("Escolha quem vai atacar: (G/A) ");
            String ataqueM = entrada.next();
            if (ataqueM == "G" || ataqueM == "g"){
                    ataque = m.atacar(valorDado, g.getResistencia());
                    g.defender(ataque);
            }else{
                ataque = m.atacar(valorDado, a.getResistencia());
                a.defender(ataque);
            }

            // Turno do arqueiro
            valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: "+valorDado);
            System.out.print("Escolha quem vai atacar: (G/M)");
            String ataqueA = entrada.next();
            if (ataqueA == "G" || ataqueA == "g"){
                ataque = a.atacar(valorDado, g.getResistencia());
                g.defender(ataque);
            }else{
                ataque = a.atacar(valorDado, m.getResistencia());
                m.defender(ataque);       
            }

            //Turno do guerreiro
            valorDado = dado.nextInt(6);
            System.out.println("Valor do dado: "+valorDado);
            System.out.print("Escolha quem vai atacar: (G/M)");
            String ataqueG = entrada.next();
            if (ataqueG == "A" || ataqueG == "a"){
                ataque = g.atacar(valorDado, a.getResistencia());
                a.defender(ataque);
            }else{
                ataque = a.atacar(valorDado, m.getResistencia());
                m.defender(ataque);  
            }           
        }
    
        entrada.close();
    }   
}


/*  Gabriel
Digite a força do gurreiro: 65
Digite a resistência do gurreiro: 70
Digite a vida do gurreiro: 100
Digite a estamina do gurreiro: 50
Digite a agilidade do gurreiro: 25
Digite a sorte do gurreiro: 5

Digite o nome do Arqueiro: Henrique
Digite a destreza do Arqueiro: 60
Digite a agilidade do Arqueiro: 80
Digite a resistência do Arqueiro: 50
Digite a vida do Arqueiro: 100
Digite a estamina do Arqueiro: 20
Digite a sorte do Arqueiro: 15

Digite o nome do Mago: Ana
Digite a inteligência do Mago: 55
Digite a agilidade do Mago: 45
Digite a resistência do Mago: 30
Digite a vida do Mago: 100
Digite a estamina do Mago: 4
Digite a sorte do Mago: 0
Digite a mana do Mago: 90*/