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
* Classe que representa a tabela STC_Cargo_Rubrica
* @generated
*/
@Entity
@IdClass(CargoRubricaPK.class)
@Table(name = "\"STC_Cargo_Rubrica\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.CargoRubrica")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class CargoRubrica implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="IDE_CARGO", nullable = false, referencedColumnName = "IDE_CARGO", insertable=true, updatable=false)
        private Cargo cargo;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="IDE_RUBRICA", nullable = false, referencedColumnName = "IDE_RUBRICA", insertable=true, updatable=false)
        private Rubrica rubrica;

    /**
    * @generated
    */
    @Column(name = "IND_PADRAO", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indPadrao;

    /**
    * @generated
    */
    @Convert("version")
    @Column(name = "TIM_ROWVERSION", nullable = true, unique = false, length=8, insertable=false, updatable=false, columnDefinition = "TIMESTAMP")
        
        private java.lang.Long timRowversion;

    /**
    * @generated
    */
    @Column(name = "VLR_RUBRICA", nullable = false, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double vlrRubrica;

    /**
    * @generated
    */
    @Column(name = "VLR_RUBRICA_CONTRATO", nullable = false, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double vlrRubricaContrato;

    /**
    * Construtor
    * @generated
    */
    public CargoRubrica(){
    }

    /**
    * Obtém cargo
    * return cargo
    * @generated
    */
    
    public Cargo getCargo(){
        return this.cargo;
    }

    /**
    * Define cargo
    * @param cargo cargo
    * @generated
    */
    public CargoRubrica setCargo(Cargo cargo){
        this.cargo = cargo;
        return this;
    }
    /**
    * Obtém rubrica
    * return rubrica
    * @generated
    */
    
    public Rubrica getRubrica(){
        return this.rubrica;
    }

    /**
    * Define rubrica
    * @param rubrica rubrica
    * @generated
    */
    public CargoRubrica setRubrica(Rubrica rubrica){
        this.rubrica = rubrica;
        return this;
    }
    /**
    * Obtém indPadrao
    * return indPadrao
    * @generated
    */
    
    public java.lang.Boolean getIndPadrao(){
        return this.indPadrao;
    }

    /**
    * Define indPadrao
    * @param indPadrao indPadrao
    * @generated
    */
    public CargoRubrica setIndPadrao(java.lang.Boolean indPadrao){
        this.indPadrao = indPadrao;
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
    public CargoRubrica setTimRowversion(java.lang.Long timRowversion){
        this.timRowversion = timRowversion;
        return this;
    }
    /**
    * Obtém vlrRubrica
    * return vlrRubrica
    * @generated
    */
    
    public java.lang.Double getVlrRubrica(){
        return this.vlrRubrica;
    }

    /**
    * Define vlrRubrica
    * @param vlrRubrica vlrRubrica
    * @generated
    */
    public CargoRubrica setVlrRubrica(java.lang.Double vlrRubrica){
        this.vlrRubrica = vlrRubrica;
        return this;
    }
    /**
    * Obtém vlrRubricaContrato
    * return vlrRubricaContrato
    * @generated
    */
    
    public java.lang.Double getVlrRubricaContrato(){
        return this.vlrRubricaContrato;
    }

    /**
    * Define vlrRubricaContrato
    * @param vlrRubricaContrato vlrRubricaContrato
    * @generated
    */
    public CargoRubrica setVlrRubricaContrato(java.lang.Double vlrRubricaContrato){
        this.vlrRubricaContrato = vlrRubricaContrato;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CargoRubrica object = (CargoRubrica)obj;
        if (cargo != null ? !cargo.equals(object.cargo) : object.cargo != null) return false;
        if (rubrica != null ? !rubrica.equals(object.rubrica) : object.rubrica != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = 31 * result + ((rubrica == null) ? 0 : rubrica.hashCode());
        return result;
    }

}