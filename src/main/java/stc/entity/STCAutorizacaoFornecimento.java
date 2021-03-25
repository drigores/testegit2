package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela VIW_STC_AutorizacaoFornecimento
* @generated
*/
@Entity
@Table(name = "\"VIW_STC_AutorizacaoFornecimento\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.STCAutorizacaoFornecimento")
public class STCAutorizacaoFornecimento implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSeqAutorizacaoFornecimento", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer numSeqAutorizacaoFornecimento;

    /**
    * @generated
    */
    @Column(name = "anoInstrContratual", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short anoInstrContratual;

    /**
    * @generated
    */
    @Column(name = "anoProcesso", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short anoProcesso;

    /**
    * @generated
    */
    @Column(name = "codTipoInstrContratual", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String codTipoInstrContratual;

    /**
    * @generated
    */
    @Column(name = "numInstrContratual", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numInstrContratual;

    /**
    * @generated
    */
    @Column(name = "numProcesso", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numProcesso;

    /**
    * Construtor
    * @generated
    */
    public STCAutorizacaoFornecimento(){
    }

    /**
    * Obtém numSeqAutorizacaoFornecimento
    * return numSeqAutorizacaoFornecimento
    * @generated
    */
    
    public java.lang.Integer getNumSeqAutorizacaoFornecimento(){
        return this.numSeqAutorizacaoFornecimento;
    }

    /**
    * Define numSeqAutorizacaoFornecimento
    * @param numSeqAutorizacaoFornecimento numSeqAutorizacaoFornecimento
    * @generated
    */
    public STCAutorizacaoFornecimento setNumSeqAutorizacaoFornecimento(java.lang.Integer numSeqAutorizacaoFornecimento){
        this.numSeqAutorizacaoFornecimento = numSeqAutorizacaoFornecimento;
        return this;
    }
    /**
    * Obtém anoInstrContratual
    * return anoInstrContratual
    * @generated
    */
    
    public java.lang.Short getAnoInstrContratual(){
        return this.anoInstrContratual;
    }

    /**
    * Define anoInstrContratual
    * @param anoInstrContratual anoInstrContratual
    * @generated
    */
    public STCAutorizacaoFornecimento setAnoInstrContratual(java.lang.Short anoInstrContratual){
        this.anoInstrContratual = anoInstrContratual;
        return this;
    }
    /**
    * Obtém anoProcesso
    * return anoProcesso
    * @generated
    */
    
    public java.lang.Short getAnoProcesso(){
        return this.anoProcesso;
    }

    /**
    * Define anoProcesso
    * @param anoProcesso anoProcesso
    * @generated
    */
    public STCAutorizacaoFornecimento setAnoProcesso(java.lang.Short anoProcesso){
        this.anoProcesso = anoProcesso;
        return this;
    }
    /**
    * Obtém codTipoInstrContratual
    * return codTipoInstrContratual
    * @generated
    */
    
    public java.lang.String getCodTipoInstrContratual(){
        return this.codTipoInstrContratual;
    }

    /**
    * Define codTipoInstrContratual
    * @param codTipoInstrContratual codTipoInstrContratual
    * @generated
    */
    public STCAutorizacaoFornecimento setCodTipoInstrContratual(java.lang.String codTipoInstrContratual){
        this.codTipoInstrContratual = codTipoInstrContratual;
        return this;
    }
    /**
    * Obtém numInstrContratual
    * return numInstrContratual
    * @generated
    */
    
    public java.lang.Integer getNumInstrContratual(){
        return this.numInstrContratual;
    }

    /**
    * Define numInstrContratual
    * @param numInstrContratual numInstrContratual
    * @generated
    */
    public STCAutorizacaoFornecimento setNumInstrContratual(java.lang.Integer numInstrContratual){
        this.numInstrContratual = numInstrContratual;
        return this;
    }
    /**
    * Obtém numProcesso
    * return numProcesso
    * @generated
    */
    
    public java.lang.Integer getNumProcesso(){
        return this.numProcesso;
    }

    /**
    * Define numProcesso
    * @param numProcesso numProcesso
    * @generated
    */
    public STCAutorizacaoFornecimento setNumProcesso(java.lang.Integer numProcesso){
        this.numProcesso = numProcesso;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
STCAutorizacaoFornecimento object = (STCAutorizacaoFornecimento)obj;
        if (numSeqAutorizacaoFornecimento != null ? !numSeqAutorizacaoFornecimento.equals(object.numSeqAutorizacaoFornecimento) : object.numSeqAutorizacaoFornecimento != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((numSeqAutorizacaoFornecimento == null) ? 0 : numSeqAutorizacaoFornecimento.hashCode());
        return result;
    }

}