package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import cronapi.database.VersionConverter;


/**
* Classe que representa a tabela STC_Publicacao
* @generated
*/
@Entity
@Table(name = "\"STC_Publicacao\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Publicacao")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Publicacao implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_PUBLICACAO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String publicacao;

    /**
    * @generated
    */
    @Column(name = "ANO_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short anoInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "COD_TIPO_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String codTipoInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codUsuario;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_INCLUSAO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datInclusao;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_PUBLICACAO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datPublicacao;

    /**
    * @generated
    */
    @Column(name = "NUM_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "NUM_IP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String numIp;

    /**
    * @generated
    */
    @Column(name = "NUM_PONTO_PUBLICACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numPontoPublicacao;

    /**
    * @generated
    */
    @Convert("version")
    @Column(name = "TIM_ROWVERSION", nullable = true, unique = false, length=8, insertable=false, updatable=false)
        
        private java.lang.Long timRowversion;

    /**
    * Construtor
    * @generated
    */
    public Publicacao(){
    }

    /**
    * Obtém publicacao
    * return publicacao
    * @generated
    */
    
    public java.lang.String getPublicacao(){
        return this.publicacao;
    }

    /**
    * Define publicacao
    * @param publicacao publicacao
    * @generated
    */
    public Publicacao setPublicacao(java.lang.String publicacao){
        this.publicacao = publicacao;
        return this;
    }
    /**
    * Obtém anoInstrumentoContratual
    * return anoInstrumentoContratual
    * @generated
    */
    
    public java.lang.Short getAnoInstrumentoContratual(){
        return this.anoInstrumentoContratual;
    }

    /**
    * Define anoInstrumentoContratual
    * @param anoInstrumentoContratual anoInstrumentoContratual
    * @generated
    */
    public Publicacao setAnoInstrumentoContratual(java.lang.Short anoInstrumentoContratual){
        this.anoInstrumentoContratual = anoInstrumentoContratual;
        return this;
    }
    /**
    * Obtém codTipoInstrumentoContratual
    * return codTipoInstrumentoContratual
    * @generated
    */
    
    public java.lang.String getCodTipoInstrumentoContratual(){
        return this.codTipoInstrumentoContratual;
    }

    /**
    * Define codTipoInstrumentoContratual
    * @param codTipoInstrumentoContratual codTipoInstrumentoContratual
    * @generated
    */
    public Publicacao setCodTipoInstrumentoContratual(java.lang.String codTipoInstrumentoContratual){
        this.codTipoInstrumentoContratual = codTipoInstrumentoContratual;
        return this;
    }
    /**
    * Obtém codUsuario
    * return codUsuario
    * @generated
    */
    
    public java.lang.Integer getCodUsuario(){
        return this.codUsuario;
    }

    /**
    * Define codUsuario
    * @param codUsuario codUsuario
    * @generated
    */
    public Publicacao setCodUsuario(java.lang.Integer codUsuario){
        this.codUsuario = codUsuario;
        return this;
    }
    /**
    * Obtém datInclusao
    * return datInclusao
    * @generated
    */
    
    public java.util.Date getDatInclusao(){
        return this.datInclusao;
    }

    /**
    * Define datInclusao
    * @param datInclusao datInclusao
    * @generated
    */
    public Publicacao setDatInclusao(java.util.Date datInclusao){
        this.datInclusao = datInclusao;
        return this;
    }
    /**
    * Obtém datPublicacao
    * return datPublicacao
    * @generated
    */
    
    public java.util.Date getDatPublicacao(){
        return this.datPublicacao;
    }

    /**
    * Define datPublicacao
    * @param datPublicacao datPublicacao
    * @generated
    */
    public Publicacao setDatPublicacao(java.util.Date datPublicacao){
        this.datPublicacao = datPublicacao;
        return this;
    }
    /**
    * Obtém numInstrumentoContratual
    * return numInstrumentoContratual
    * @generated
    */
    
    public java.lang.Integer getNumInstrumentoContratual(){
        return this.numInstrumentoContratual;
    }

    /**
    * Define numInstrumentoContratual
    * @param numInstrumentoContratual numInstrumentoContratual
    * @generated
    */
    public Publicacao setNumInstrumentoContratual(java.lang.Integer numInstrumentoContratual){
        this.numInstrumentoContratual = numInstrumentoContratual;
        return this;
    }
    /**
    * Obtém numIp
    * return numIp
    * @generated
    */
    
    public java.lang.String getNumIp(){
        return this.numIp;
    }

    /**
    * Define numIp
    * @param numIp numIp
    * @generated
    */
    public Publicacao setNumIp(java.lang.String numIp){
        this.numIp = numIp;
        return this;
    }
    /**
    * Obtém numPontoPublicacao
    * return numPontoPublicacao
    * @generated
    */
    
    public java.lang.Integer getNumPontoPublicacao(){
        return this.numPontoPublicacao;
    }

    /**
    * Define numPontoPublicacao
    * @param numPontoPublicacao numPontoPublicacao
    * @generated
    */
    public Publicacao setNumPontoPublicacao(java.lang.Integer numPontoPublicacao){
        this.numPontoPublicacao = numPontoPublicacao;
        return this;
    }
    /**
    * Obtém timRowversion
    * return timRowversion
    * @generated
    */
    
    public java.lang.Long getTimRowversion(){
        return this.timRowversion;
    }

    /**
    * Define timRowversion
    * @param timRowversion timRowversion
    * @generated
    */
    public Publicacao setTimRowversion(java.lang.Long timRowversion){
        this.timRowversion = timRowversion;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Publicacao object = (Publicacao)obj;
        if (publicacao != null ? !publicacao.equals(object.publicacao) : object.publicacao != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((publicacao == null) ? 0 : publicacao.hashCode());
        return result;
    }

}