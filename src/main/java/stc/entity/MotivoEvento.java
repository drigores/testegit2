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
* Classe que representa a tabela STC_Motivo_Evento
* @generated
*/
@Entity
@Table(name = "\"STC_Motivo_Evento\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.MotivoEvento")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class MotivoEvento implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_MOTIVO_EVENTO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String motivoEvento = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "DES_MOTIVO_EVENTO", nullable = false, unique = false, length=48, insertable=true, updatable=true)
        
        private java.lang.String desMotivoEvento;

    /**
    * @generated
    */
    @Column(name = "IND_FISCAL", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indFiscal = true;

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
    public MotivoEvento(){
    }

    /**
    * Obtém motivoEvento
    * return motivoEvento
    * @generated
    */
    
    public java.lang.String getMotivoEvento(){
        return this.motivoEvento;
    }

    /**
    * Define motivoEvento
    * @param motivoEvento motivoEvento
    * @generated
    */
    public MotivoEvento setMotivoEvento(java.lang.String motivoEvento){
        this.motivoEvento = motivoEvento;
        return this;
    }
    /**
    * Obtém desMotivoEvento
    * return desMotivoEvento
    * @generated
    */
    
    public java.lang.String getDesMotivoEvento(){
        return this.desMotivoEvento;
    }

    /**
    * Define desMotivoEvento
    * @param desMotivoEvento desMotivoEvento
    * @generated
    */
    public MotivoEvento setDesMotivoEvento(java.lang.String desMotivoEvento){
        this.desMotivoEvento = desMotivoEvento;
        return this;
    }
    /**
    * Obtém indFiscal
    * return indFiscal
    * @generated
    */
    
    public java.lang.Boolean getIndFiscal(){
        return this.indFiscal;
    }

    /**
    * Define indFiscal
    * @param indFiscal indFiscal
    * @generated
    */
    public MotivoEvento setIndFiscal(java.lang.Boolean indFiscal){
        this.indFiscal = indFiscal;
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
    public MotivoEvento setTimRowversion(java.lang.Long timRowversion){
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
MotivoEvento object = (MotivoEvento)obj;
        if (motivoEvento != null ? !motivoEvento.equals(object.motivoEvento) : object.motivoEvento != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((motivoEvento == null) ? 0 : motivoEvento.hashCode());
        return result;
    }

}