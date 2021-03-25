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
* Classe que representa a tabela STC_Preposto
* @generated
*/
@Entity
@Table(name = "\"STC_Preposto\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Preposto")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Preposto implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_PREPOSTO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String preposto;

    /**
    * @generated
    */
    @Column(name = "ANO_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short anoInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "COD_LOGIN", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private java.lang.String codLogin;

    /**
    * @generated
    */
    @Column(name = "COD_TIPO_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String codTipoInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "NUM_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "NUM_TELEFONE", nullable = true, unique = false, length=11, insertable=true, updatable=true)
        
        private java.lang.String numTelefone;

    /**
    * @generated
    */
    @Column(name = "NUM_TELEFONE_CELULAR", nullable = true, unique = false, length=11, insertable=true, updatable=true)
        
        private java.lang.String numTelefoneCelular;

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
    public Preposto(){
    }

    /**
    * Obtém preposto
    * return preposto
    * @generated
    */
    
    public java.lang.String getPreposto(){
        return this.preposto;
    }

    /**
    * Define preposto
    * @param preposto preposto
    * @generated
    */
    public Preposto setPreposto(java.lang.String preposto){
        this.preposto = preposto;
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
    public Preposto setAnoInstrumentoContratual(java.lang.Short anoInstrumentoContratual){
        this.anoInstrumentoContratual = anoInstrumentoContratual;
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
    public Preposto setCodLogin(java.lang.String codLogin){
        this.codLogin = codLogin;
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
    public Preposto setCodTipoInstrumentoContratual(java.lang.String codTipoInstrumentoContratual){
        this.codTipoInstrumentoContratual = codTipoInstrumentoContratual;
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
    public Preposto setNumInstrumentoContratual(java.lang.Integer numInstrumentoContratual){
        this.numInstrumentoContratual = numInstrumentoContratual;
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
    public Preposto setNumTelefone(java.lang.String numTelefone){
        this.numTelefone = numTelefone;
        return this;
    }
    /**
    * Obtém numTelefoneCelular
    * return numTelefoneCelular
    * @generated
    */
    
    public java.lang.String getNumTelefoneCelular(){
        return this.numTelefoneCelular;
    }

    /**
    * Define numTelefoneCelular
    * @param numTelefoneCelular numTelefoneCelular
    * @generated
    */
    public Preposto setNumTelefoneCelular(java.lang.String numTelefoneCelular){
        this.numTelefoneCelular = numTelefoneCelular;
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
    public Preposto setTimRowversion(java.lang.Long timRowversion){
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
Preposto object = (Preposto)obj;
        if (preposto != null ? !preposto.equals(object.preposto) : object.preposto != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((preposto == null) ? 0 : preposto.hashCode());
        return result;
    }

}