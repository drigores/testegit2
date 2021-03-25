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
* Classe que representa a tabela STC_Beneficiado
* @generated
*/
@Entity
@Table(name = "\"STC_Beneficiado\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Beneficiado")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Beneficiado implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_BENEFICIADO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String beneficiado = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_CARGO_EM_EXERCICIO", nullable = false, referencedColumnName = "IDE_CARGO_EM_EXERCICIO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STCBeneficiado_STCCargoemExercicio"))
        
        private CargoEmExercicio cargoEmExercicio;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="IDE_CARGO", nullable = false, referencedColumnName = "IDE_CARGO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STCBeneficiado_STCCargoemExercicio"))
                    ,
    @JoinColumn(name="IDE_RUBRICA", nullable = false, referencedColumnName = "IDE_RUBRICA", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STCBeneficiado_STCCargoemExercicio"))
                    
    })
        
        private CargoRubrica cargoRubrica;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_FIM", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datFim;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_INICIO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datInicio;

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
    public Beneficiado(){
    }

    /**
    * Obtém beneficiado
    * return beneficiado
    * @generated
    */
    
    public java.lang.String getBeneficiado(){
        return this.beneficiado;
    }

    /**
    * Define beneficiado
    * @param beneficiado beneficiado
    * @generated
    */
    public Beneficiado setBeneficiado(java.lang.String beneficiado){
        this.beneficiado = beneficiado;
        return this;
    }
    /**
    * Obtém cargoEmExercicio
    * return cargoEmExercicio
    * @generated
    */
    
    public CargoEmExercicio getCargoEmExercicio(){
        return this.cargoEmExercicio;
    }

    /**
    * Define cargoEmExercicio
    * @param cargoEmExercicio cargoEmExercicio
    * @generated
    */
    public Beneficiado setCargoEmExercicio(CargoEmExercicio cargoEmExercicio){
        this.cargoEmExercicio = cargoEmExercicio;
        return this;
    }
    /**
    * Obtém cargoRubrica
    * return cargoRubrica
    * @generated
    */
    
    public CargoRubrica getCargoRubrica(){
        return this.cargoRubrica;
    }

    /**
    * Define cargoRubrica
    * @param cargoRubrica cargoRubrica
    * @generated
    */
    public Beneficiado setCargoRubrica(CargoRubrica cargoRubrica){
        this.cargoRubrica = cargoRubrica;
        return this;
    }
    /**
    * Obtém datFim
    * return datFim
    * @generated
    */
    
    public java.util.Date getDatFim(){
        return this.datFim;
    }

    /**
    * Define datFim
    * @param datFim datFim
    * @generated
    */
    public Beneficiado setDatFim(java.util.Date datFim){
        this.datFim = datFim;
        return this;
    }
    /**
    * Obtém datInicio
    * return datInicio
    * @generated
    */
    
    public java.util.Date getDatInicio(){
        return this.datInicio;
    }

    /**
    * Define datInicio
    * @param datInicio datInicio
    * @generated
    */
    public Beneficiado setDatInicio(java.util.Date datInicio){
        this.datInicio = datInicio;
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
    public Beneficiado setTimRowversion(java.lang.Long timRowversion){
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
Beneficiado object = (Beneficiado)obj;
        if (beneficiado != null ? !beneficiado.equals(object.beneficiado) : object.beneficiado != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((beneficiado == null) ? 0 : beneficiado.hashCode());
        return result;
    }

}