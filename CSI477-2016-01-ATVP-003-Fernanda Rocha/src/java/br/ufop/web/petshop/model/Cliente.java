/*
 * 
 */

package br.ufop.web.petshop.model;

import java.io.Serializable;


public class Cliente implements Serializable, InterfaceModel {
    
    private int id = 0;
    private String nome = "";
    private String login = "";
    private String senha = "";
  
    
    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTable() {
        return "clientes";
    }
    
     public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
       this.login = login;
    }
    
     public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
       this.senha = senha;
    }

}
