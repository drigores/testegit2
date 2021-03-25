package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela VIW_STC_AditivoInstrumentoContratual
* @generated
*/
@Entity
@Table(name = "\"VIW_STC_AditivoInstrumentoContratual\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.STCAditivoInstrumentoContratual")
public class STCAditivoInstrumentoContratual implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "anoInstrContratual", nullable = false, length=5, insertable=true, updatable=true)
        private java.lang.Short anoInstrContratual;

    /**
    * @generated
    */
    @Column(name = "codTipoInstrContratual", nullable = false, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String codTipoInstrContratual;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datAssinatura", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datAssinatura;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datFimVigenciaAditivo", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datFimVigenciaAditivo;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datInicioVigenciaAditivo", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datInicioVigenciaAditivo;

    /**
    * @generated
    */
    @Column(name = "indProrrogacao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indProrrogacao;

    /**
    * @generated
    */
    @Column(name = "numAditivo", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short numAditivo;

    /**
    * @generated
    */
    @Column(name = "numInstrContratual", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numInstrContratual;

    /**
    * @generated
    */
    @Column(name = "txtMotivo", nullable = true, unique = false, length=500, insertable=true, updatable=true)
        
        private java.lang.String txtMotivo;

    /**
    * Construtor
    * @generated
    */
    public STCAditivoInstrumentoContratual(){
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
    public STCAditivoInstrumentoContratual setAnoInstrContratual(java.lang.Short anoInstrContratual){
        this.anoInstrContratual = anoInstrContratual;
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
    public STCAditivoInstrumentoContratual setCodTipoInstrContratual(java.lang.String codTipoInstrContratual){
        this.codTipoInstrContratual = codTipoInstrContratual;
        return this;
    }
    /**
    * Obtém datAssinatura
    * return datAssinatura
    * @generated
    */
    
    public java.util.Date getDatAssinatura(){
        return this.datAssinatura;
    }

    /**
    * Define datAssinatura
    * @param datAssinatura datAssinatura
    * @generated
    */
    public STCAditivoInstrumentoContratual setDatAssinatura(java.util.Date datAssinatura){
        this.datAssinatura = datAssinatura;
        return this;
    }
    /**
    * Obtém datFimVigenciaAditivo
    * return datFimVigenciaAditivo
    * @generated
    */
    
    public java.util.Date getDatFimVigenciaAditivo(){
        return this.datFimVigenciaAditivo;
    }

    /**
    * Define datFimVigenciaAditivo
    * @param datFimVigenciaAditivo datFimVigenciaAditivo
    * @generated
    */
    public STCAditivoInstrumentoContratual setDatFimVigenciaAditivo(java.util.Date datFimVigenciaAditivo){
        this.datFimVigenciaAditivo = datFimVigenciaAditivo;
        return this;
    }
    /**
    * Obtém datInicioVigenciaAditivo
    * return datInicioVigenciaAditivo
    * @generated
    */
    
    public java.util.Date getDatInicioVigenciaAditivo(){
        return this.datInicioVigenciaAditivo;
    }

    /**
    * Define datInicioVigenciaAditivo
    * @param datInicioVigenciaAditivo datInicioVigenciaAditivo
    * @generated
    */
    public STCAditivoInstrumentoContratual setDatInicioVigenciaAditivo(java.util.Date datInicioVigenciaAditivo){
        this.datInicioVigenciaAditivo = datInicioVigenciaAditivo;
        return this;
    }
    /**
    * Obtém indProrrogacao
    * return indProrrogacao
    * @generated
    */
    
    public java.lang.Boolean getIndProrrogacao(){
        return this.indProrrogacao;
    }

    /**
    * Define indProrrogacao
    * @param indProrrogacao indProrrogacao
    * @generated
    */
    public STCAditivoInstrumentoContratual setIndProrrogacao(java.lang.Boolean indProrrogacao){
        this.indProrrogacao = indProrrogacao;
        return this;
    }
    /**
    * Obtém numAditivo
    * return numAditivo
    * @generated
    */
    
    public java.lang.Short getNumAditivo(){
        return this.numAditivo;
    }

    /**
    * Define numAditivo
    * @param numAditivo numAditivo
    * @generated
    */
    public STCAditivoInstrumentoContratual setNumAditivo(java.lang.Short numAditivo){
        this.numAditivo = numAditivo;
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
    public STCAditivoInstrumentoContratual setNumInstrContratual(java.lang.Integer numInstrContratual){
        this.numInstrContratual = numInstrContratual;
        return this;
    }
    /**
    * Obtém txtMotivo
    * return txtMotivo
    * @generated
    */
    
    public java.lang.String getTxtMotivo(){
        return this.txtMotivo;
    }

    /**
    * Define txtMotivo
    * @param txtMotivo txtMotivo
    * @generated
    */
    public STCAditivoInstrumentoContratual setTxtMotivo(java.lang.String txtMotivo){
        this.txtMotivo = txtMotivo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
STCAditivoInstrumentoContratual object = (STCAditivoInstrumentoContratual)obj;
        if (anoInstrContratual != null ? !anoInstrContratual.equals(object.anoInstrContratual) : object.anoInstrContratual != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((anoInstrContratual == null) ? 0 : anoInstrContratual.hashCode());
        return result;
    }

}