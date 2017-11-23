/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ESCRITORIO
 */
public class Cliente extends Pessoa {

    protected long id = 0;
    protected boolean status = true;
    private float credito;
    private String documento;
    private String endereco;
    private String telefone;
    private String email;

    public Cliente() {
        super();
    }

    public Cliente(String documento, String endereco, String telefone, String email, String nome, String sobrenome, String dataNasc, String sexo) {
        super(nome, sobrenome, dataNasc, sexo);
        this.documento = documento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getInfo() {
        String informacoes = "Nome Completo: " + super.getNome() + " " + super.getSobrenome();
        informacoes += "\nDocumento: " + documento + " " + " Sexo: " + super.getSexo();
        informacoes += "\nData de Nascimento: " + super.getDataNasc();
        informacoes += "\nEndereço: " + endereco;
        informacoes += "\nE-mail: " + email;
        informacoes += "\nTelefone: " + telefone;

        return informacoes;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() + "id=" + id + ", status=" + status + ", credito=" + credito + ", documento=" + documento + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    public String print(){
        return ""
                + "Nome Completo: "+super.getNome()+" "+super.getSobrenome()
                + "\nData de Nascimento: "+super.getDataNasc()
                + "\nSexo: "+super.getSexo()
                + "\nEndereço: "+getEndereco()
                + "\nE-mail: "+getEmail()
                + "\nTelefone:"+getTelefone();
    }

}
