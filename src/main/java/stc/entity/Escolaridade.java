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
* Classe que representa a tabela STC_Escolaridade
* @generated
*/
@Entity
@Table(name = "\"STC_Escolaridade\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Escolaridade")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Escolaridade implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_ESCOLARIDADE", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String escolaridade = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "COD_ESCOLARIDADE_RAIS", nullable = true, unique = false, length=5, precision=2, insertable=true, updatable=true)
        
        private java.lang.Double codEscolaridadeRais;

    /**
    * @generated
    */
    @Column(name = "DES_ESCOLARIDADE", nullable = false, unique = false, length=48, insertable=true, updatable=true)
        
        private java.lang.String desEscolaridade;

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
    public Escolaridade(){
    }

    /**
    * Obtém escolaridade
    * return escolaridade
    * @generated
    */
    
    public java.lang.String getEscolaridade(){
        return this.escolaridade;
    }

    /**
    * Define escolaridade
    * @param escolaridade escolaridade
    * @generated
    */
    public Escolaridade setEscolaridade(java.lang.String escolaridade){
        this.escolaridade = escolaridade;
        return this;
    }
    /**
    * Obtém codEscolaridadeRais
    * return codEscolaridadeRais
    * @generated
    */
    
    public java.lang.Double getCodEscolaridadeRais(){
        return this.codEscolaridadeRais;
    }

    /**
    * Define codEscolaridadeRais
    * @param codEscolaridadeRais codEscolaridadeRais
    * @generated
    */
    public Escolaridade setCodEscolaridadeRais(java.lang.Double codEscolaridadeRais){
        this.codEscolaridadeRais = codEscolaridadeRais;
        return this;
    }
    /**
    * Obtém desEscolaridade
    * return desEscolaridade
    * @generated
    */
    
    public java.lang.String getDesEscolaridade(){
        return this.desEscolaridade;
    }

    /**
    * Define desEscolaridade
    * @param desEscolaridade desEscolaridade
    * @generated
    */
    public Escolaridade setDesEscolaridade(java.lang.String desEscolaridade){
        this.desEscolaridade = desEscolaridade;
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
    public Escolaridade setTimRowversion(java.lang.Long timRowversion){
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
Escolaridade object = (Escolaridade)obj;
        if (escolaridade != null ? !escolaridade.equals(object.escolaridade) : object.escolaridade != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((escolaridade == null) ? 0 : escolaridade.hashCode());
        return result;
    }

}