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
* Classe que representa a tabela STC_Escala
* @generated
*/
@Entity
@Table(name = "\"STC_Escala\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Escala")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Escala implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_ESCALA", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String escala;

    /**
    * @generated
    */
    @Column(name = "DES_ESCALA", nullable = false, unique = false, length=64, insertable=true, updatable=true)
        
        private java.lang.String desEscala;

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
    public Escala(){
    }

    /**
    * Obtém escala
    * return escala
    * @generated
    */
    
    public java.lang.String getEscala(){
        return this.escala;
    }

    /**
    * Define escala
    * @param escala escala
    * @generated
    */
    public Escala setEscala(java.lang.String escala){
        this.escala = escala;
        return this;
    }
    /**
    * Obtém desEscala
    * return desEscala
    * @generated
    */
    
    public java.lang.String getDesEscala(){
        return this.desEscala;
    }

    /**
    * Define desEscala
    * @param desEscala desEscala
    * @generated
    */
    public Escala setDesEscala(java.lang.String desEscala){
        this.desEscala = desEscala;
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
    public Escala setTimRowversion(java.lang.Long timRowversion){
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
Escala object = (Escala)obj;
        if (escala != null ? !escala.equals(object.escala) : object.escala != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((escala == null) ? 0 : escala.hashCode());
        return result;
    }

}