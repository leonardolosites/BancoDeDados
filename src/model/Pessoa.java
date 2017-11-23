/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author ESCRITORIO
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String dataNasc;
    private String sexo;
    
    public Pessoa() {
    }
    
    public Pessoa(String nome, String sobrenome, String dataNasc, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", sexo=" + sexo;
    }    
}
