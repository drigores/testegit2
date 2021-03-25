package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela VIW_STC_Fornecedor
* @generated
*/
@Entity
@Table(name = "\"VIW_STC_Fornecedor\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.STCFornecedor")
public class STCFornecedor implements Serializable {

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
    @Column(name = "numCEP", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numCEP;

    /**
    * @generated
    */
    @Column(name = "sigUF", nullable = false, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String sigUF;

    /**
    * @generated
    */
    @Column(name = "txtCidade", nullable = false, unique = false, length=70, insertable=true, updatable=true)
        
        private java.lang.String txtCidade;

    /**
    * @generated
    */
    @Column(name = "txtEndereco", nullable = true, unique = false, length=120, insertable=true, updatable=true)
        
        private java.lang.String txtEndereco;

    /**
    * @generated
    */
    @Column(name = "txtNomeForn", nullable = false, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String txtNomeForn;

    /**
    * Construtor
    * @generated
    */
    public STCFornecedor(){
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
    public STCFornecedor setCodCPFCNPJForn(java.lang.String codCPFCNPJForn){
        this.codCPFCNPJForn = codCPFCNPJForn;
        return this;
    }
    /**
    * Obtém numCEP
    * return numCEP
    * @generated
    */
    
    public java.lang.Integer getNumCEP(){
        return this.numCEP;
    }

    /**
    * Define numCEP
    * @param numCEP numCEP
    * @generated
    */
    public STCFornecedor setNumCEP(java.lang.Integer numCEP){
        this.numCEP = numCEP;
        return this;
    }
    /**
    * Obtém sigUF
    * return sigUF
    * @generated
    */
    
    public java.lang.String getSigUF(){
        return this.sigUF;
    }

    /**
    * Define sigUF
    * @param sigUF sigUF
    * @generated
    */
    public STCFornecedor setSigUF(java.lang.String sigUF){
        this.sigUF = sigUF;
        return this;
    }
    /**
    * Obtém txtCidade
    * return txtCidade
    * @generated
    */
    
    public java.lang.String getTxtCidade(){
        return this.txtCidade;
    }

    /**
    * Define txtCidade
    * @param txtCidade txtCidade
    * @generated
    */
    public STCFornecedor setTxtCidade(java.lang.String txtCidade){
        this.txtCidade = txtCidade;
        return this;
    }
    /**
    * Obtém txtEndereco
    * return txtEndereco
    * @generated
    */
    
    public java.lang.String getTxtEndereco(){
        return this.txtEndereco;
    }

    /**
    * Define txtEndereco
    * @param txtEndereco txtEndereco
    * @generated
    */
    public STCFornecedor setTxtEndereco(java.lang.String txtEndereco){
        this.txtEndereco = txtEndereco;
        return this;
    }
    /**
    * Obtém txtNomeForn
    * return txtNomeForn
    * @generated
    */
    
    public java.lang.String getTxtNomeForn(){
        return this.txtNomeForn;
    }

    /**
    * Define txtNomeForn
    * @param txtNomeForn txtNomeForn
    * @generated
    */
    public STCFornecedor setTxtNomeForn(java.lang.String txtNomeForn){
        this.txtNomeForn = txtNomeForn;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
STCFornecedor object = (STCFornecedor)obj;
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