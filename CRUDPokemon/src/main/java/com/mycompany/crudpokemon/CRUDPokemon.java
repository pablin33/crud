package com.mycompany.crudpokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class CRUDPokemon {

    public static void main(String[] args) {
        ArrayList<Habilidade> listaHabilidades = new ArrayList<Habilidade>();
        ArrayList<Pokemon> listaPokemons = new ArrayList<Pokemon>();
        ArrayList<Treinador> listasTreinadores = new ArrayList<Treinador>();

        SeedHabilidade(listaHabilidades);
        CriarPokemon(listaHabilidades);
    }
    //SCANNER PARAR LER GLOBALMENTE--------------------------------------------
    public static Scanner ler = new Scanner(System.in);

    //CRUD HABILIDADE----------------------------------------------------------------------
    //CRIAR HABILIDADE
    public static Habilidade CriarHabilidade() {

        System.out.println("Digite o nome da habilidade:");
        String nomeHabilidade = ler.nextLine();

        System.out.println("Digite a descrição da habilidade:");
        String desc = ler.nextLine();

        System.out.println("Digite o tipo da habilidade:");
        String t = ler.nextLine();

        System.out.println("Digite o dano da habilidade:");
        int d = ler.nextInt();

        System.out.println("Digite quanto de mana gasta a habilidade:");
        int gM = ler.nextInt();

        Habilidade habAdd = new Habilidade(nomeHabilidade, desc, t, d, gM);

        return habAdd;

    }

    //MOSTRAR HABILIDADE A PARTIR DE UMA LISTA
    public static void MostrarHabilidade(ArrayList<Habilidade> liHa, int select) {
        if (select == 0) {
            int idHabilidade = 0;
            for (Habilidade hab : liHa) {
                System.out.println("\n Habilidade Numero " + idHabilidade);
                System.out.println("Nome da habilidade: " + hab.GetNome());
                System.out.println("Descrição da habilidade: " + hab.GetDescricao());
                System.out.println("Tipo da habilidade: " + hab.GetTipo());
                System.out.println("dano da habilidade: " + hab.GetDano());
                System.out.println("Quanto de mana gasta da habilidade: " + hab.GetGastoDeMana());
                System.out.println("-----------------------------------------------------------------");
                idHabilidade++;
            }
        }
        if (select == 1) {
            int idHabilidade = 0;
            for (Habilidade hab : liHa) {
                System.out.println("\n Habilidade Numero " + idHabilidade);
                System.out.println("Nome da habilidade: " + hab.GetNome());
                System.out.println("-----------------------------------------------------------------");
                idHabilidade++;
            }
        }

    }

    //ATUALIZAR HABILIDADE A PARTIR DE UMA LISTA E DO NOME DA HABILIDADE
    public static void AtualizarHabilidade(ArrayList<Habilidade> liHa, String nomeHabilidade) {
        for (Habilidade hab : liHa) {
            if (hab.GetNome().equals(nomeHabilidade)) {

                System.out.println("Aperte para Atualizar habilidades");
                ler.nextLine();

                System.out.println("Digite o nome da habilidade:");
                hab.SetNome(ler.nextLine());

                System.out.println("Digite a descrição da habilidade:");
                hab.Setdescricao(ler.nextLine());

                System.out.println("Digite o tipo da habilidade:");
                hab.SetTipo(ler.nextLine());

                System.out.println("Digite o dano da habilidade:");
                hab.SetDano(ler.nextInt());

                System.out.println("Digite quanto de mana gasta a habilidade:");
                hab.SetGastoDeMana(ler.nextInt());

            }
        }
    }

    //DELETAR UMA HABILIDADE A PARTIR DE UMA LISTA E DO NOME DELA
    public static void DeletarHabilidade(ArrayList<Habilidade> liHa, String nomeHabilidade) {
        for (Habilidade hab : liHa) {
            if (hab.GetNome().equals(nomeHabilidade)) {
                System.out.println("Voce deletou a habilidade: " + hab.GetNome());
                liHa.remove(hab);
            }
        }
    }

    //ALIMENTAR HABILIDADES INICIALMENTE - SEED
    public static void SeedHabilidade(ArrayList<Habilidade> liHa) {
        Habilidade hab01 = new Habilidade("Bola de Fogo", "Solta uma bola de fogo", "Fogo", 10, 10);
        liHa.add(hab01);
        Habilidade hab02 = new Habilidade("Bola de Agua", "Solta uma bola de agua", "Agua", 10, 10);
        liHa.add(hab02);
        Habilidade hab03 = new Habilidade("Pancada", "Da um soco", "Normal", 10, 10);
        liHa.add(hab03);
        Habilidade hab04 = new Habilidade("Body Slam", "Se joga", "Normal", 10, 10);
        liHa.add(hab04);
        Habilidade hab05 = new Habilidade("Scratch", "Arranha", "Normal", 10, 10);
        liHa.add(hab05);
        Habilidade hab06 = new Habilidade("Tail Whip", "Aumenta o dano do Pokemon", "Normal", 10, 10);
        liHa.add(hab06);
    }

    //CRUD POKEMON-------------------------------------------------------------------------
    //CRIAR POKEMON
    public static Pokemon CriarPokemon(ArrayList<Habilidade> liHa) {

        System.out.println("Digite o nome do Pokemon:");
        String nomePoke = ler.nextLine();

        System.out.println("Digite o tipo do Pokemon:");
        String t = ler.nextLine();

        System.out.println("Digite a vida maxima do Pokemon:");
        int vM = ler.nextInt();

        System.out.println("Digite a mana maxima do Pokemon:");
        int gM = ler.nextInt();

        MostrarHabilidade(liHa, 0);

        System.out.println("Digite o ID da Habilidade 01 que quer adicionar:");
        int hab1 = ler.nextInt();
        System.out.println("Digite o ID da Habilidade 02 que quer adicionar:");
        int hab2 = ler.nextInt();
        System.out.println("Digite o ID da Habilidade 03 que quer adicionar:");
        int hab3 = ler.nextInt();
        System.out.println("Digite o ID da Habilidade 04 que quer adicionar:");
        int hab4 = ler.nextInt();

        Habilidade[] habPoke = new Habilidade[4];
        habPoke[0] = liHa.get(hab1);
        habPoke[1] = liHa.get(hab2);
        habPoke[2] = liHa.get(hab3);
        habPoke[3] = liHa.get(hab4);

        Pokemon pokeAdd = new Pokemon(nomePoke, t, vM, gM, habPoke);

        return pokeAdd;

    }

    //MOSTRAR POKEMON A PARTIR DE UMA LISTA
    public static void MostrarPokemon(ArrayList<Pokemon> liPo) {
        int idPokemon = 0;
        for (Pokemon poke : liPo) {
            System.out.println("\n Habilidade Numero " + idPokemon);
            System.out.println("Nome dO Pokemon: " + poke.getNome());
            System.out.println("Tipo do Pokemon: " + poke.getTipo());
            System.out.println("Vida Maxima do Pokemon: " + poke.getVidaMaxima());
            System.out.println("Gasta Maxima do Pokemon " + poke.getManaMaxima());
            for (int i = 0; i < 4; i++) {
                System.out.println("Habilidade" + i + ": " + poke.getHabilidade()[i].GetNome());
            }
            System.out.println("-----------------------------------------------------------------");
            idPokemon++;
        }
    }

    //ATUALIZAR POKEMON A PARTIR DE UMA LISTA POKEMONS E DO NOME DO POKEMON e
    public static void AtualizarPokemon(ArrayList<Pokemon> liPo, String nomePokemon, ArrayList<Habilidade> liHa) {
        for (Pokemon poke : liPo) {
            if (poke.getNome().equals(nomePokemon)) {

                System.out.println("Atualizar Pokemon - " + nomePokemon);
                ler.nextLine();

                System.out.println("Digite o nome do Pokemon:");
                poke.setNome(ler.nextLine());

                System.out.println("Digite o tipo do Pokemon:");
                poke.setTipo(ler.nextLine());

                System.out.println("Digite a vida Maxima do Pokemon:");
                poke.setVidaMaxima(ler.nextInt());

                System.out.println("Digite a mana Maxima do Pokemon:");
                poke.setManaMaxima(ler.nextInt());

                System.out.println("--------Habilidades Disponiveis-------");
                MostrarHabilidade(liHa, 1);
                System.out.println("--------Selecionar Habilidades-------");

                System.out.println("Digite o ID da Habilidade 01 que quer adicionar:");
                int hab1 = ler.nextInt();
                System.out.println("Digite o ID da Habilidade 02 que quer adicionar:");
                int hab2 = ler.nextInt();
                System.out.println("Digite o ID da Habilidade 03 que quer adicionar:");
                int hab3 = ler.nextInt();
                System.out.println("Digite o ID da Habilidade 04 que quer adicionar:");
                int hab4 = ler.nextInt();

                Habilidade[] habPoke = new Habilidade[4];
                habPoke[0] = liHa.get(hab1);
                habPoke[1] = liHa.get(hab2);
                habPoke[2] = liHa.get(hab3);
                habPoke[3] = liHa.get(hab4);

                poke.setHabilidade(habPoke);

                System.out.println("----------------------- | Pokemon atualizado para: " + poke.getNome() + " | ----------------------------------------");
            }
        }
    }

    //DELETAR UM POKEMON A PARTIR DE UMA LISTA DE POKEMON E DO NOME DELE
    public static void DeletarPokemon(ArrayList<Pokemon> liPo, String nomePoke) {
        for (Pokemon poke : liPo) {
            if (poke.getNome().equals(nomePoke)) {
                System.out.println("Voce deletou o Pokemon: " + poke.getNome());
                liPo.remove(poke);
            }
        }
    }

}
