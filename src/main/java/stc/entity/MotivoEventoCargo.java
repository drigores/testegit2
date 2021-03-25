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
* Classe que representa a tabela STC_Motivo_Evento_Cargo
* @generated
*/
@Entity
@Table(name = "\"STC_Motivo_Evento_Cargo\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.MotivoEventoCargo")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class MotivoEventoCargo implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_MOTIVO_EVENTO_CARGO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String motivoEventoCargo = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "DES_MOTIVO_EVENTO_CARGO", nullable = false, unique = false, length=48, insertable=true, updatable=true)
        
        private java.lang.String desMotivoEventoCargo;

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
    public MotivoEventoCargo(){
    }

    /**
    * Obtém motivoEventoCargo
    * return motivoEventoCargo
    * @generated
    */
    
    public java.lang.String getMotivoEventoCargo(){
        return this.motivoEventoCargo;
    }

    /**
    * Define motivoEventoCargo
    * @param motivoEventoCargo motivoEventoCargo
    * @generated
    */
    public MotivoEventoCargo setMotivoEventoCargo(java.lang.String motivoEventoCargo){
        this.motivoEventoCargo = motivoEventoCargo;
        return this;
    }
    /**
    * Obtém desMotivoEventoCargo
    * return desMotivoEventoCargo
    * @generated
    */
    
    public java.lang.String getDesMotivoEventoCargo(){
        return this.desMotivoEventoCargo;
    }

    /**
    * Define desMotivoEventoCargo
    * @param desMotivoEventoCargo desMotivoEventoCargo
    * @generated
    */
    public MotivoEventoCargo setDesMotivoEventoCargo(java.lang.String desMotivoEventoCargo){
        this.desMotivoEventoCargo = desMotivoEventoCargo;
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
    public MotivoEventoCargo setIndFiscal(java.lang.Boolean indFiscal){
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
    public MotivoEventoCargo setTimRowversion(java.lang.Long timRowversion){
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
MotivoEventoCargo object = (MotivoEventoCargo)obj;
        if (motivoEventoCargo != null ? !motivoEventoCargo.equals(object.motivoEventoCargo) : object.motivoEventoCargo != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((motivoEventoCargo == null) ? 0 : motivoEventoCargo.hashCode());
        return result;
    }

}