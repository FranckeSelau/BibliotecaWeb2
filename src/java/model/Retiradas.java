package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.ClienteAntigo;
import model.LivroAntigo;


public class Retiradas{

    
    private int id;
    private Date retirada;    
    private Date devolvido;
    private Date entrega;
    private String cliente;
    private String livro;
    private Boolean livroDevolvido = false;
    
    public Retiradas() {
        
    }

    public Retiradas(String cliente, String livro) {
        this.cliente = cliente;
        this.livro = livro;
        long DAY_IN_MS = 1000 * 60 * 60 * 24;
        this.setEntrega(new Date(System.currentTimeMillis() + (7 * DAY_IN_MS)));
    }
    
    
    public Date getEntrega() {
        return entrega;
    }

    /**
     * Formata data de entrega
     *
     * @return a entrega de um livro com data formatada "dd/MM/yyyy".
     */
    public String getEntregaFormatada() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(entrega);
    }

    /**
     * Informa Entrega (com base no par�metro construtor)
     *
     * @param entrega recebida do par�mentro contrutor.
     */
    public void setEntrega(Date entrega) {
        this.entrega = entrega;
    }

    /**
     * Recebe cliente que retira um livro
     *
     * @return cliente que retirou um livro
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Informa cliente que retirou um livro
     *
     * @param cliente que retira um livro.
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * Recebe livro que foi retirado
     *
     * @return livro que foi retirado.
     */
    public String getLivro() {
        return livro;
    }

    /**
     * Informa livro a ser retirado
     *
     * @param livro recebe novo livro retirado.
     */
    public void setLivro(String livro) {
        this.livro = livro;
    }

    /**
     * Recebe data de retirada
     *
     * @return retirada, data da retirada.
     */
    public Date getRetirada() {
        return retirada;
    }

    /**
     * recebe data de devolu��o no mesmo livro, caso ele ainda tenha sido
     * devolvido, n�o poder� ser retirado
     *
     * @return devolvido, data.
     */
    public Date getDevolvido() {
        return devolvido;
    }

    /**
     * Informa caso o livro a ser retirado j� tenha sido devolvido anteriormente
     *
     * @param devolvido, a data de devolu��o anterior ao pr�ximo empr�stimo.
     */
    public void setDevolvido(Date devolvido) {
        this.devolvido = devolvido;
    }

    /**
     * Formata data de devolu��o anterior ao pr�ximo empr�stimo
     *
     * @return devolvido. data formatada "dd/MM/yyyy".
     */
    public String getDevolvidoFormatada() {
        if (devolvido != null) {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            return df.format(devolvido);
        } else {
            return "";
        }
    }

    /**
     * Formata data de retirada anterior ao pr�ximo empr�stimo
     *
     * @return retirada. data formatada "dd/MM/yyyy".
     */
    public String getRetiradaFormatada() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(retirada);
    }
    
    /**
     * Recebe data da Retirada atual
     *
     * @param retirada de livro.
     */
    public void setRetirada(Date retirada) {
        this.retirada = retirada;
    }

    /**
     * Retorna status de devolu��o do livro a ser emprestado
     *
     * @return livroDevolvido, verdadeiro ou falso.
     */
    public Boolean getLivroDevolvido() {
        return livroDevolvido;
    }

    /**
     * Recebe status de devolu��o do livro a ser emprestado
     *
     * @param livroDevolvido verdadeiro ou falso.
     */
    public void setLivroDevolvido(Boolean livroDevolvido) {
        this.livroDevolvido = livroDevolvido;
    }

    /**
     * Retorna c�d id da retirada
     *
     * @return id, retirada de livro.
     */
    public int getId() {
        return id;
    }

    /**
     * Recebe c�d id da retirada
     *
     * @param id, retirada de livro.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Compara se um livro ja foi retirado antes de realizar nova retirada.
     *
     * @return verdadeiro ou falso para o livro a ser retidado.
     */
    /*
    @Override
    public int compareTo(RetiradaLivro o) {
        return (this.getEntrega().compareTo(o.getEntrega()));
    }
    */
    /**
     * Retorna hor�rio atual.
     *
     * @return horario
     */
    public Object getHorario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
