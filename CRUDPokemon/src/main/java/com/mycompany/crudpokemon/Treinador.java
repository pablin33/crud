
package com.mycompany.crudpokemon;

public class Treinador {
      
    private String nome;
    private int dinheiro;
    private int vitoria;
    private char sexo;
    private Pokemon[] pokemons = new Pokemon [6];
    
    public Treinador (String n, int d, int v, char s, Pokemon[] pok ){
      nome = n;
      dinheiro = d;
      sexo = s;
      vitoria = v;
      pokemons = pok;
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dinheiro
     */
    public int getDinheiro() {
        return dinheiro;
    }

    /**
     * @param dinheiro the dinheiro to set
     */
    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    /**
     * @return the vitoria
     */
    public int getVitoria() {
        return vitoria;
    }

    /**
     * @param vitoria the vitoria to set
     */
    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the pokemons
     */
    public Pokemon[] getPokemons() {
        return pokemons;
    }

    /**
     * @param pokemons the pokemons to set
     */
    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }
    
        
}
