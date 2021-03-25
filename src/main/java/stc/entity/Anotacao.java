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
* Classe que representa a tabela STC_Anotacao
* @generated
*/
@Entity
@Table(name = "\"STC_Anotacao\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Anotacao")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Anotacao implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_ANOTACAO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String anotacao;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codUsuario;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_ANOTACAO", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datAnotacao;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_INCLUSAO", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datInclusao;

    /**
    * @generated
    */
    @Column(name = "DES_ANOTACAO", nullable = false, unique = false, length=2147483647, insertable=true, updatable=true)
        
        private java.lang.String desAnotacao;

    /**
    * @generated
    */
    @Column(name = "DES_ASSUNTO", nullable = false, unique = false, length=48, insertable=true, updatable=true)
        
        private java.lang.String desAssunto;

    /**
    * @generated
    */
    @Column(name = "IND_SIGILO", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indSigilo;

    /**
    * @generated
    */
    @Column(name = "NUM_PONTO", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double numPonto;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_TERCEIRIZADO", nullable = false, referencedColumnName = "IDE_TERCEIRIZADO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FKSTCANOTACAO_STCTERCEIRIZADO"))
        
        private Terceirizado terceirizado;

    /**
    * @generated
    */
    @Convert("version")
    @Column(name = "TIM_ROWVERSION", nullable = false, unique = false, length=8, insertable=false, updatable=false)
        
        private java.lang.Long timRowversion;

    /**
    * Construtor
    * @generated
    */
    public Anotacao(){
    }

    /**
    * Obtém anotacao
    * return anotacao
    * @generated
    */
    
    public java.lang.String getAnotacao(){
        return this.anotacao;
    }

    /**
    * Define anotacao
    * @param anotacao anotacao
    * @generated
    */
    public Anotacao setAnotacao(java.lang.String anotacao){
        this.anotacao = anotacao;
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
    public Anotacao setCodUsuario(java.lang.Integer codUsuario){
        this.codUsuario = codUsuario;
        return this;
    }
    /**
    * Obtém datAnotacao
    * return datAnotacao
    * @generated
    */
    
    public java.util.Date getDatAnotacao(){
        return this.datAnotacao;
    }

    /**
    * Define datAnotacao
    * @param datAnotacao datAnotacao
    * @generated
    */
    public Anotacao setDatAnotacao(java.util.Date datAnotacao){
        this.datAnotacao = datAnotacao;
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
    public Anotacao setDatInclusao(java.util.Date datInclusao){
        this.datInclusao = datInclusao;
        return this;
    }
    /**
    * Obtém desAnotacao
    * return desAnotacao
    * @generated
    */
    
    public java.lang.String getDesAnotacao(){
        return this.desAnotacao;
    }

    /**
    * Define desAnotacao
    * @param desAnotacao desAnotacao
    * @generated
    */
    public Anotacao setDesAnotacao(java.lang.String desAnotacao){
        this.desAnotacao = desAnotacao;
        return this;
    }
    /**
    * Obtém desAssunto
    * return desAssunto
    * @generated
    */
    
    public java.lang.String getDesAssunto(){
        return this.desAssunto;
    }

    /**
    * Define desAssunto
    * @param desAssunto desAssunto
    * @generated
    */
    public Anotacao setDesAssunto(java.lang.String desAssunto){
        this.desAssunto = desAssunto;
        return this;
    }
    /**
    * Obtém indSigilo
    * return indSigilo
    * @generated
    */
    
    public java.lang.Boolean getIndSigilo(){
        return this.indSigilo;
    }

    /**
    * Define indSigilo
    * @param indSigilo indSigilo
    * @generated
    */
    public Anotacao setIndSigilo(java.lang.Boolean indSigilo){
        this.indSigilo = indSigilo;
        return this;
    }
    /**
    * Obtém numPonto
    * return numPonto
    * @generated
    */
    
    public java.lang.Double getNumPonto(){
        return this.numPonto;
    }

    /**
    * Define numPonto
    * @param numPonto numPonto
    * @generated
    */
    public Anotacao setNumPonto(java.lang.Double numPonto){
        this.numPonto = numPonto;
        return this;
    }
    /**
    * Obtém terceirizado
    * return terceirizado
    * @generated
    */
    
    public Terceirizado getTerceirizado(){
        return this.terceirizado;
    }

    /**
    * Define terceirizado
    * @param terceirizado terceirizado
    * @generated
    */
    public Anotacao setTerceirizado(Terceirizado terceirizado){
        this.terceirizado = terceirizado;
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
    public Anotacao setTimRowversion(java.lang.Long timRowversion){
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
Anotacao object = (Anotacao)obj;
        if (anotacao != null ? !anotacao.equals(object.anotacao) : object.anotacao != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((anotacao == null) ? 0 : anotacao.hashCode());
        return result;
    }

}