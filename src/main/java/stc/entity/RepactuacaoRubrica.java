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
* Classe que representa a tabela STC_Repactuacao_Rubrica
* @generated
*/
@Entity
@Table(name = "\"STC_Repactuacao_Rubrica\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.RepactuacaoRubrica")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class RepactuacaoRubrica implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_REPACTUACAO_RUBRICA", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String repactuacaoRubrica;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumns({
    @JoinColumn(name="IDE_CARGO", nullable = false, referencedColumnName = "IDE_CARGO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STCRepactuacaoRubrica_STCRubrica"))
                    ,
    @JoinColumn(name="IDE_RUBRICA", nullable = false, referencedColumnName = "IDE_RUBRICA", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STCRepactuacaoRubrica_STCRubrica"))
                    
    })
        
        private CargoRubrica cargoRubrica;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_ALTERACAO", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datAlteracao;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_REPACTUACAO", nullable = false, referencedColumnName = "IDE_REPACTUACAO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STCRepactuacaoRubrica_STCRepactuacao"))
        
        private Repactuacao repactuacao;

    /**
    * @generated
    */
    @Convert("version")
    @Column(name = "TIM_ROWVERSION", nullable = true, unique = false, length=8, insertable=false, updatable=false)
        
        private java.lang.Long timRowversion;

    /**
    * @generated
    */
    @Column(name = "VlR_RUBRICA", nullable = false, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double vlRRUBRICA;

    /**
    * Construtor
    * @generated
    */
    public RepactuacaoRubrica(){
    }

    /**
    * Obtém repactuacaoRubrica
    * return repactuacaoRubrica
    * @generated
    */
    
    public java.lang.String getRepactuacaoRubrica(){
        return this.repactuacaoRubrica;
    }

    /**
    * Define repactuacaoRubrica
    * @param repactuacaoRubrica repactuacaoRubrica
    * @generated
    */
    public RepactuacaoRubrica setRepactuacaoRubrica(java.lang.String repactuacaoRubrica){
        this.repactuacaoRubrica = repactuacaoRubrica;
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
    public RepactuacaoRubrica setCargoRubrica(CargoRubrica cargoRubrica){
        this.cargoRubrica = cargoRubrica;
        return this;
    }
    /**
    * Obtém datAlteracao
    * return datAlteracao
    * @generated
    */
    
    public java.util.Date getDatAlteracao(){
        return this.datAlteracao;
    }

    /**
    * Define datAlteracao
    * @param datAlteracao datAlteracao
    * @generated
    */
    public RepactuacaoRubrica setDatAlteracao(java.util.Date datAlteracao){
        this.datAlteracao = datAlteracao;
        return this;
    }
    /**
    * Obtém repactuacao
    * return repactuacao
    * @generated
    */
    
    public Repactuacao getRepactuacao(){
        return this.repactuacao;
    }

    /**
    * Define repactuacao
    * @param repactuacao repactuacao
    * @generated
    */
    public RepactuacaoRubrica setRepactuacao(Repactuacao repactuacao){
        this.repactuacao = repactuacao;
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
    public RepactuacaoRubrica setTimRowversion(java.lang.Long timRowversion){
        this.timRowversion = timRowversion;
        return this;
    }
    /**
    * Obtém vlRRUBRICA
    * return vlRRUBRICA
    * @generated
    */
    
    public java.lang.Double getVlRRUBRICA(){
        return this.vlRRUBRICA;
    }

    /**
    * Define vlRRUBRICA
    * @param vlRRUBRICA vlRRUBRICA
    * @generated
    */
    public RepactuacaoRubrica setVlRRUBRICA(java.lang.Double vlRRUBRICA){
        this.vlRRUBRICA = vlRRUBRICA;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
RepactuacaoRubrica object = (RepactuacaoRubrica)obj;
        if (repactuacaoRubrica != null ? !repactuacaoRubrica.equals(object.repactuacaoRubrica) : object.repactuacaoRubrica != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((repactuacaoRubrica == null) ? 0 : repactuacaoRubrica.hashCode());
        return result;
    }

}