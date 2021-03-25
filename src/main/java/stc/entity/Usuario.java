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
* Classe que representa a tabela STC_Usuario
* @generated
*/
@Entity
@IdClass(UsuarioPK.class)
@Table(name = "\"STC_Usuario\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Usuario")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Usuario implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "COD_TIPO_INSTRUMENTO_CONTRATUAL", nullable = false, length=2, insertable=true, updatable=true)
        private java.lang.String codTipoInstrumentoContratual;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_USUARIO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer ideUsuario;

    /**
    * @generated
    */
    @Id
    @Column(name = "ANO_INSTRUMENTO_CONTRATUAL", nullable = false, length=5, insertable=true, updatable=true)
        private java.lang.Short instrumentoContratual;

    /**
    * @generated
    */
    @Id
    @Column(name = "NUM_INSTRUMENTO_CONTRATUAL", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer numInstrumentoContratual;

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
    public Usuario(){
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
    public Usuario setCodTipoInstrumentoContratual(java.lang.String codTipoInstrumentoContratual){
        this.codTipoInstrumentoContratual = codTipoInstrumentoContratual;
        return this;
    }
    /**
    * Obtém ideUsuario
    * return ideUsuario
    * @generated
    */
    
    public java.lang.Integer getIdeUsuario(){
        return this.ideUsuario;
    }

    /**
    * Define ideUsuario
    * @param ideUsuario ideUsuario
    * @generated
    */
    public Usuario setIdeUsuario(java.lang.Integer ideUsuario){
        this.ideUsuario = ideUsuario;
        return this;
    }
    /**
    * Obtém instrumentoContratual
    * return instrumentoContratual
    * @generated
    */
    
    public java.lang.Short getInstrumentoContratual(){
        return this.instrumentoContratual;
    }

    /**
    * Define instrumentoContratual
    * @param instrumentoContratual instrumentoContratual
    * @generated
    */
    public Usuario setInstrumentoContratual(java.lang.Short instrumentoContratual){
        this.instrumentoContratual = instrumentoContratual;
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
    public Usuario setNumInstrumentoContratual(java.lang.Integer numInstrumentoContratual){
        this.numInstrumentoContratual = numInstrumentoContratual;
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
    public Usuario setTimRowversion(java.lang.Long timRowversion){
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
Usuario object = (Usuario)obj;
        if (codTipoInstrumentoContratual != null ? !codTipoInstrumentoContratual.equals(object.codTipoInstrumentoContratual) : object.codTipoInstrumentoContratual != null) return false;
        if (ideUsuario != null ? !ideUsuario.equals(object.ideUsuario) : object.ideUsuario != null) return false;
        if (instrumentoContratual != null ? !instrumentoContratual.equals(object.instrumentoContratual) : object.instrumentoContratual != null) return false;
        if (numInstrumentoContratual != null ? !numInstrumentoContratual.equals(object.numInstrumentoContratual) : object.numInstrumentoContratual != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((codTipoInstrumentoContratual == null) ? 0 : codTipoInstrumentoContratual.hashCode());
        result = 31 * result + ((ideUsuario == null) ? 0 : ideUsuario.hashCode());
        result = 31 * result + ((instrumentoContratual == null) ? 0 : instrumentoContratual.hashCode());
        result = 31 * result + ((numInstrumentoContratual == null) ? 0 : numInstrumentoContratual.hashCode());
        return result;
    }

}