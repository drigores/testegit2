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
* Classe que representa a tabela STC_Acesso_Anotacao
* @generated
*/
@Entity
@Table(name = "\"STC_Acesso_Anotacao\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.AcessoAnotacao")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class AcessoAnotacao implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_ACESSO_ANOTACAO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String acessoAnotacao;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_ANOTACAO", nullable = false, referencedColumnName = "IDE_ANOTACAO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STC_ACES_FKSTC_ACE_STC_ANOT"))
        
        private Anotacao anotacao;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codUsuario;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_ACESSO", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datAcesso;

    /**
    * @generated
    */
    @Column(name = "NUM_IP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String numIp;

    /**
    * @generated
    */
    @Column(name = "NUM_PONTO", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double numPonto;

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
    public AcessoAnotacao(){
    }

    /**
    * Obtém acessoAnotacao
    * return acessoAnotacao
    * @generated
    */
    
    public java.lang.String getAcessoAnotacao(){
        return this.acessoAnotacao;
    }

    /**
    * Define acessoAnotacao
    * @param acessoAnotacao acessoAnotacao
    * @generated
    */
    public AcessoAnotacao setAcessoAnotacao(java.lang.String acessoAnotacao){
        this.acessoAnotacao = acessoAnotacao;
        return this;
    }
    /**
    * Obtém anotacao
    * return anotacao
    * @generated
    */
    
    public Anotacao getAnotacao(){
        return this.anotacao;
    }

    /**
    * Define anotacao
    * @param anotacao anotacao
    * @generated
    */
    public AcessoAnotacao setAnotacao(Anotacao anotacao){
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
    public AcessoAnotacao setCodUsuario(java.lang.Integer codUsuario){
        this.codUsuario = codUsuario;
        return this;
    }
    /**
    * Obtém datAcesso
    * return datAcesso
    * @generated
    */
    
    public java.util.Date getDatAcesso(){
        return this.datAcesso;
    }

    /**
    * Define datAcesso
    * @param datAcesso datAcesso
    * @generated
    */
    public AcessoAnotacao setDatAcesso(java.util.Date datAcesso){
        this.datAcesso = datAcesso;
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
    public AcessoAnotacao setNumIp(java.lang.String numIp){
        this.numIp = numIp;
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
    public AcessoAnotacao setNumPonto(java.lang.Double numPonto){
        this.numPonto = numPonto;
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
    public AcessoAnotacao setTimRowversion(java.lang.Long timRowversion){
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
AcessoAnotacao object = (AcessoAnotacao)obj;
        if (acessoAnotacao != null ? !acessoAnotacao.equals(object.acessoAnotacao) : object.acessoAnotacao != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((acessoAnotacao == null) ? 0 : acessoAnotacao.hashCode());
        return result;
    }

}