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
* Classe que representa a tabela STC_Rubrica
* @generated
*/
@Entity
@Table(name = "\"STC_Rubrica\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Rubrica")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Rubrica implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_RUBRICA", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String rubrica = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "DES_RUBRICA", nullable = false, unique = false, length=72, insertable=true, updatable=true)
        
        private java.lang.String desRubrica;

    /**
    * @generated
    */
    @Column(name = "IND_DESCONTO_FALTA", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indDescontoFalta = true;

    /**
    * @generated
    */
    @Column(name = "IND_DIARIO", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indDiario = false;

    /**
    * @generated
    */
    @Column(name = "IND_ENCARGO_SOCIAL", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indEncargoSocial = true;

    /**
    * @generated
    */
    @Convert("version")
    @Column(name = "TIM_ROWVERSION", nullable = true, unique = false, length=8, insertable=false, updatable=false, columnDefinition = "TIMESTAMP")
        
        private java.lang.Long timRowversion;

    /**
    * Construtor
    * @generated
    */
    public Rubrica(){
    }

    /**
    * Obtém rubrica
    * return rubrica
    * @generated
    */
    
    public java.lang.String getRubrica(){
        return this.rubrica;
    }

    /**
    * Define rubrica
    * @param rubrica rubrica
    * @generated
    */
    public Rubrica setRubrica(java.lang.String rubrica){
        this.rubrica = rubrica;
        return this;
    }
    /**
    * Obtém desRubrica
    * return desRubrica
    * @generated
    */
    
    public java.lang.String getDesRubrica(){
        return this.desRubrica;
    }

    /**
    * Define desRubrica
    * @param desRubrica desRubrica
    * @generated
    */
    public Rubrica setDesRubrica(java.lang.String desRubrica){
        this.desRubrica = desRubrica;
        return this;
    }
    /**
    * Obtém indDescontoFalta
    * return indDescontoFalta
    * @generated
    */
    
    public java.lang.Boolean getIndDescontoFalta(){
        return this.indDescontoFalta;
    }

    /**
    * Define indDescontoFalta
    * @param indDescontoFalta indDescontoFalta
    * @generated
    */
    public Rubrica setIndDescontoFalta(java.lang.Boolean indDescontoFalta){
        this.indDescontoFalta = indDescontoFalta;
        return this;
    }
    /**
    * Obtém indDiario
    * return indDiario
    * @generated
    */
    
    public java.lang.Boolean getIndDiario(){
        return this.indDiario;
    }

    /**
    * Define indDiario
    * @param indDiario indDiario
    * @generated
    */
    public Rubrica setIndDiario(java.lang.Boolean indDiario){
        this.indDiario = indDiario;
        return this;
    }
    /**
    * Obtém indEncargoSocial
    * return indEncargoSocial
    * @generated
    */
    
    public java.lang.Boolean getIndEncargoSocial(){
        return this.indEncargoSocial;
    }

    /**
    * Define indEncargoSocial
    * @param indEncargoSocial indEncargoSocial
    * @generated
    */
    public Rubrica setIndEncargoSocial(java.lang.Boolean indEncargoSocial){
        this.indEncargoSocial = indEncargoSocial;
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
    public Rubrica setTimRowversion(java.lang.Long timRowversion){
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
Rubrica object = (Rubrica)obj;
        if (rubrica != null ? !rubrica.equals(object.rubrica) : object.rubrica != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((rubrica == null) ? 0 : rubrica.hashCode());
        return result;
    }

}