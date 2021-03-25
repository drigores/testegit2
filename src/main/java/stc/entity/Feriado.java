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
* Classe que representa a tabela STC_Feriado
* @generated
*/
@Entity
@Table(name = "\"STC_Feriado\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Feriado")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Feriado implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_FERIADO", nullable = false, precision=3, scale=3, insertable=true, updatable=true)
        private java.util.Date feriado;

    /**
    * @generated
    */
    @Column(name = "DES_FERIADO", nullable = false, unique = false, length=36, insertable=true, updatable=true)
        
        private java.lang.String desFeriado;

    /**
    * @generated
    */
    @Column(name = "IND_MEIO_EXPEDIENTE", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indMeioExpediente;

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
    public Feriado(){
    }

    /**
    * Obtém feriado
    * return feriado
    * @generated
    */
    
    public java.util.Date getFeriado(){
        return this.feriado;
    }

    /**
    * Define feriado
    * @param feriado feriado
    * @generated
    */
    public Feriado setFeriado(java.util.Date feriado){
        this.feriado = feriado;
        return this;
    }
    /**
    * Obtém desFeriado
    * return desFeriado
    * @generated
    */
    
    public java.lang.String getDesFeriado(){
        return this.desFeriado;
    }

    /**
    * Define desFeriado
    * @param desFeriado desFeriado
    * @generated
    */
    public Feriado setDesFeriado(java.lang.String desFeriado){
        this.desFeriado = desFeriado;
        return this;
    }
    /**
    * Obtém indMeioExpediente
    * return indMeioExpediente
    * @generated
    */
    
    public java.lang.Boolean getIndMeioExpediente(){
        return this.indMeioExpediente;
    }

    /**
    * Define indMeioExpediente
    * @param indMeioExpediente indMeioExpediente
    * @generated
    */
    public Feriado setIndMeioExpediente(java.lang.Boolean indMeioExpediente){
        this.indMeioExpediente = indMeioExpediente;
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
    public Feriado setTimRowversion(java.lang.Long timRowversion){
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
Feriado object = (Feriado)obj;
        if (feriado != null ? !feriado.equals(object.feriado) : object.feriado != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((feriado == null) ? 0 : feriado.hashCode());
        return result;
    }

}