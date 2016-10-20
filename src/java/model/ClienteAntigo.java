package model;

import java.util.Objects;

/**
 * Classe para objetos do tipo cliente, onde ser�o criados os clientes da
 * Biblioteca.
 *
 * @author Francke
 * @since JDK 1.0
 */
public class ClienteAntigo {

    private String matricula, nome, telefone;
    private int retiradas, atrasos;

    
    public ClienteAntigo() {        
    }
    /**
     * Construtor para inicializar cliente
     *
     * @param matricula identifica a matr�cula de uma pessoa.
     * @param nome identifica o nome de uma pessoa.
     * @param telefone identifica telefone de uma pessoa.
     *
     */
    public ClienteAntigo(String matricula, String nome, String telefone) {
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
    }   

    /**
     * Retorna a matr�cula
     *
     * @return matr�cula de uma pessoa
     */
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Retorna o nome
     *
     * @return nome de uma pessoa
     */
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o telefone
     *
     * @return telefone de uma pessoa
     */
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getRetiradas() {
        return retiradas;
    }

    public void setRetiradas(int retiradas) {
        this.retiradas = retiradas;
    }

    public int getAtrasos() {
        return atrasos;
    }

    public void setAtrasos(int atrasos) {
        this.atrasos = atrasos;
    }
    
    

    /**
     * Faz o controle de matr�culas para n�o inserir uma nova repetida.
     *
     * @return verdadeiro para uma nova matr�cula �nica, ou falso para matr�cula
     * j� existente.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClienteAntigo other = (ClienteAntigo) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    
    public boolean verificaCliente(String matricula){
        return(this.matricula.equals(matricula));
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    /**
     * converte o objeto pessoa em String para mostrar suas informa��es
     * corretamente.
     *
     * @return a matricula, o nome e o telefone de uma pessoa j� formatado em
     * String.
     */
    @Override
    public String toString() {
        return matricula + " - " + nome + ", " + telefone;
    }
}  