/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Glaudervane de Moura
 */
public class Atendente {

    private int matr;
    private String nome;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atendente() {
    }

    public Atendente(int matr, String nome) {
        this.matr = matr;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return   "\nMatrícula:          " + getMatr()
               + "\nNome:               " + getNome();
    }
}
