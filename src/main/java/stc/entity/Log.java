package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela STC_LOG
* @generated
*/
@Entity
@Table(name = "\"STC_LOG\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Log")
public class Log implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_LOG", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String log;

    /**
    * @generated
    */
    @Column(name = "COD_LOGIN", nullable = false, unique = false, length=8, insertable=true, updatable=true)
        
        private java.lang.String codLogin;

    /**
    * @generated
    */
    @Column(name = "COD_TRANSACAO", nullable = false, unique = false, length=48, insertable=true, updatable=true)
        
        private java.lang.String codTransacao;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codUsuario;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_LOG", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datLog;

    /**
    * @generated
    */
    @Column(name = "DES_TRANSACAO", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String desTransacao;

    /**
    * @generated
    */
    @Column(name = "NUM_IP", nullable = true, unique = false, length=15, insertable=true, updatable=true)
        
        private java.lang.String numIp;

    /**
    * @generated
    */
    @Column(name = "SIG_SISTEMA", nullable = false, unique = false, length=18, insertable=true, updatable=true)
        
        private java.lang.String sigSistema;

    /**
    * @generated
    */
    @Column(name = "IDE_TERCEIRIZADO", nullable = false, unique = false, length=36, insertable=true, updatable=true)
        
        private java.lang.String terceirizado;

    /**
    * Construtor
    * @generated
    */
    public Log(){
    }

    /**
    * Obtém log
    * return log
    * @generated
    */
    
    public java.lang.String getLog(){
        return this.log;
    }

    /**
    * Define log
    * @param log log
    * @generated
    */
    public Log setLog(java.lang.String log){
        this.log = log;
        return this;
    }
    /**
    * Obtém codLogin
    * return codLogin
    * @generated
    */
    
    public java.lang.String getCodLogin(){
        return this.codLogin;
    }

    /**
    * Define codLogin
    * @param codLogin codLogin
    * @generated
    */
    public Log setCodLogin(java.lang.String codLogin){
        this.codLogin = codLogin;
        return this;
    }
    /**
    * Obtém codTransacao
    * return codTransacao
    * @generated
    */
    
    public java.lang.String getCodTransacao(){
        return this.codTransacao;
    }

    /**
    * Define codTransacao
    * @param codTransacao codTransacao
    * @generated
    */
    public Log setCodTransacao(java.lang.String codTransacao){
        this.codTransacao = codTransacao;
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
    public Log setCodUsuario(java.lang.Integer codUsuario){
        this.codUsuario = codUsuario;
        return this;
    }
    /**
    * Obtém datLog
    * return datLog
    * @generated
    */
    
    public java.util.Date getDatLog(){
        return this.datLog;
    }

    /**
    * Define datLog
    * @param datLog datLog
    * @generated
    */
    public Log setDatLog(java.util.Date datLog){
        this.datLog = datLog;
        return this;
    }
    /**
    * Obtém desTransacao
    * return desTransacao
    * @generated
    */
    
    public java.lang.String getDesTransacao(){
        return this.desTransacao;
    }

    /**
    * Define desTransacao
    * @param desTransacao desTransacao
    * @generated
    */
    public Log setDesTransacao(java.lang.String desTransacao){
        this.desTransacao = desTransacao;
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
    public Log setNumIp(java.lang.String numIp){
        this.numIp = numIp;
        return this;
    }
    /**
    * Obtém sigSistema
    * return sigSistema
    * @generated
    */
    
    public java.lang.String getSigSistema(){
        return this.sigSistema;
    }

    /**
    * Define sigSistema
    * @param sigSistema sigSistema
    * @generated
    */
    public Log setSigSistema(java.lang.String sigSistema){
        this.sigSistema = sigSistema;
        return this;
    }
    /**
    * Obtém terceirizado
    * return terceirizado
    * @generated
    */
    
    public java.lang.String getTerceirizado(){
        return this.terceirizado;
    }

    /**
    * Define terceirizado
    * @param terceirizado terceirizado
    * @generated
    */
    public Log setTerceirizado(java.lang.String terceirizado){
        this.terceirizado = terceirizado;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Log object = (Log)obj;
        if (log != null ? !log.equals(object.log) : object.log != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((log == null) ? 0 : log.hashCode());
        return result;
    }

}