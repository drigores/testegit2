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
* Classe que representa a tabela STC_Raca
* @generated
*/
@Entity
@Table(name = "\"STC_Raca\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Raca")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Raca implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_RACA", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String raca = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "COD_RACA_RAIS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.Integer codRacaRais;

    /**
    * @generated
    */
    @Column(name = "NOM_RACA", nullable = false, unique = false, length=24, insertable=true, updatable=true)
        
        private java.lang.String nomRaca;

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
    public Raca(){
    }

    /**
    * Obtém raca
    * return raca
    * @generated
    */
    
    public java.lang.String getRaca(){
        return this.raca;
    }

    /**
    * Define raca
    * @param raca raca
    * @generated
    */
    public Raca setRaca(java.lang.String raca){
        this.raca = raca;
        return this;
    }
    /**
    * Obtém codRacaRais
    * return codRacaRais
    * @generated
    */
    
    public java.lang.Integer getCodRacaRais(){
        return this.codRacaRais;
    }

    /**
    * Define codRacaRais
    * @param codRacaRais codRacaRais
    * @generated
    */
    public Raca setCodRacaRais(java.lang.Integer codRacaRais){
        this.codRacaRais = codRacaRais;
        return this;
    }
    /**
    * Obtém nomRaca
    * return nomRaca
    * @generated
    */
    
    public java.lang.String getNomRaca(){
        return this.nomRaca;
    }

    /**
    * Define nomRaca
    * @param nomRaca nomRaca
    * @generated
    */
    public Raca setNomRaca(java.lang.String nomRaca){
        this.nomRaca = nomRaca;
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
    public Raca setTimRowversion(java.lang.Long timRowversion){
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
Raca object = (Raca)obj;
        if (raca != null ? !raca.equals(object.raca) : object.raca != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((raca == null) ? 0 : raca.hashCode());
        return result;
    }

}