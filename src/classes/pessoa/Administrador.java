/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.pessoa;

import classes.endereco.Endereco;


/**
 *
 * @author felipe
 */
public class Administrador extends Pessoa {
    private String cpf;
    private int numeroCandidatura;

    public Administrador(String nome, String dataNascimento, String telefone, String email, String apelido, Endereco endereco) {
        super(nome, dataNascimento, telefone, email, apelido, endereco);
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroCandidatura() {
        return numeroCandidatura;
    }

    public void setNumeroCandidatura(int numeroCandidatura) {
        this.numeroCandidatura = numeroCandidatura;
    }

    public String getCargoPolitico() {
        return cargoPolitico;
    }

    public void setCargoPolitico(String cargoPolitico) {
        this.cargoPolitico = cargoPolitico;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    private String cargoPolitico;
    private String senha;

    @Override
    public void cadastrarDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gerarRelatorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
