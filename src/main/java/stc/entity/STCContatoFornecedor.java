package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela VIW_STC_ContatoFornecedor
* @generated
*/
@Entity
@Table(name = "\"VIW_STC_ContatoFornecedor\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.STCContatoFornecedor")
public class STCContatoFornecedor implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "codCPFCNPJForn", nullable = false, length=18, insertable=true, updatable=true)
        private java.lang.String codCPFCNPJForn;

    /**
    * @generated
    */
    @Column(name = "numDDD", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short numDDD;

    /**
    * @generated
    */
    @Column(name = "numTelefone", nullable = false, unique = false, length=25, insertable=true, updatable=true)
        
        private java.lang.String numTelefone;

    /**
    * @generated
    */
    @Column(name = "txtNomeContato", nullable = false, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String txtNomeContato;

    /**
    * Construtor
    * @generated
    */
    public STCContatoFornecedor(){
    }

    /**
    * Obtém codCPFCNPJForn
    * return codCPFCNPJForn
    * @generated
    */
    
    public java.lang.String getCodCPFCNPJForn(){
        return this.codCPFCNPJForn;
    }

    /**
    * Define codCPFCNPJForn
    * @param codCPFCNPJForn codCPFCNPJForn
    * @generated
    */
    public STCContatoFornecedor setCodCPFCNPJForn(java.lang.String codCPFCNPJForn){
        this.codCPFCNPJForn = codCPFCNPJForn;
        return this;
    }
    /**
    * Obtém numDDD
    * return numDDD
    * @generated
    */
    
    public java.lang.Short getNumDDD(){
        return this.numDDD;
    }

    /**
    * Define numDDD
    * @param numDDD numDDD
    * @generated
    */
    public STCContatoFornecedor setNumDDD(java.lang.Short numDDD){
        this.numDDD = numDDD;
        return this;
    }
    /**
    * Obtém numTelefone
    * return numTelefone
    * @generated
    */
    
    public java.lang.String getNumTelefone(){
        return this.numTelefone;
    }

    /**
    * Define numTelefone
    * @param numTelefone numTelefone
    * @generated
    */
    public STCContatoFornecedor setNumTelefone(java.lang.String numTelefone){
        this.numTelefone = numTelefone;
        return this;
    }
    /**
    * Obtém txtNomeContato
    * return txtNomeContato
    * @generated
    */
    
    public java.lang.String getTxtNomeContato(){
        return this.txtNomeContato;
    }

    /**
    * Define txtNomeContato
    * @param txtNomeContato txtNomeContato
    * @generated
    */
    public STCContatoFornecedor setTxtNomeContato(java.lang.String txtNomeContato){
        this.txtNomeContato = txtNomeContato;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
STCContatoFornecedor object = (STCContatoFornecedor)obj;
        if (codCPFCNPJForn != null ? !codCPFCNPJForn.equals(object.codCPFCNPJForn) : object.codCPFCNPJForn != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((codCPFCNPJForn == null) ? 0 : codCPFCNPJForn.hashCode());
        return result;
    }

}