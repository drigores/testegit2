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
* Classe que representa a tabela STC_Cargo_em_Exercicio
* @generated
*/
@Entity
@Table(name = "\"STC_Cargo_em_Exercicio\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.CargoEmExercicio")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class CargoEmExercicio implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_CARGO_EM_EXERCICIO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String cargoEmExercicio;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_CARGO", nullable = false, referencedColumnName = "IDE_CARGO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "UKSTC_Cargo_Em_Exercicio_Cargo"))
        
        private Cargo cargo;

    /**
    * @generated
    */
    @Column(name = "COD_SITUACAO", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String codSituacao;

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
    @Column(name = "DAT_INCLUSAO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datInclusao;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_INICIO", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datInicio;

    /**
    * @generated
    */
    @Column(name = "IND_TEMPORARIO", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indTemporario;

    /**
    * @generated
    */
    @Column(name = "IDE_LOTACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer lotacao;

    /**
    * @generated
    */
    @Column(name = "NUM_PONTO_INCLUSAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double numPontoInclusao;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_TERCEIRIZADO", nullable = false, referencedColumnName = "IDE_TERCEIRIZADO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "IX_FK_STCCargoemExercicio_STCTerceirizado"))
        
        private Terceirizado terceirizado;

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
    public CargoEmExercicio(){
    }

    /**
    * Obtém cargoEmExercicio
    * return cargoEmExercicio
    * @generated
    */
    
    public java.lang.String getCargoEmExercicio(){
        return this.cargoEmExercicio;
    }

    /**
    * Define cargoEmExercicio
    * @param cargoEmExercicio cargoEmExercicio
    * @generated
    */
    public CargoEmExercicio setCargoEmExercicio(java.lang.String cargoEmExercicio){
        this.cargoEmExercicio = cargoEmExercicio;
        return this;
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
    public CargoEmExercicio setCargo(Cargo cargo){
        this.cargo = cargo;
        return this;
    }
    /**
    * Obtém codSituacao
    * return codSituacao
    * @generated
    */
    
    public java.lang.String getCodSituacao(){
        return this.codSituacao;
    }

    /**
    * Define codSituacao
    * @param codSituacao codSituacao
    * @generated
    */
    public CargoEmExercicio setCodSituacao(java.lang.String codSituacao){
        this.codSituacao = codSituacao;
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
    public CargoEmExercicio setDatFim(java.util.Date datFim){
        this.datFim = datFim;
        return this;
    }
    /**
    * Obtém datInclusao
    * return datInclusao
    * @generated
    */
    
    public java.util.Date getDatInclusao(){
        return this.datInclusao;
    }

    /**
    * Define datInclusao
    * @param datInclusao datInclusao
    * @generated
    */
    public CargoEmExercicio setDatInclusao(java.util.Date datInclusao){
        this.datInclusao = datInclusao;
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
    public CargoEmExercicio setDatInicio(java.util.Date datInicio){
        this.datInicio = datInicio;
        return this;
    }
    /**
    * Obtém indTemporario
    * return indTemporario
    * @generated
    */
    
    public java.lang.Boolean getIndTemporario(){
        return this.indTemporario;
    }

    /**
    * Define indTemporario
    * @param indTemporario indTemporario
    * @generated
    */
    public CargoEmExercicio setIndTemporario(java.lang.Boolean indTemporario){
        this.indTemporario = indTemporario;
        return this;
    }
    /**
    * Obtém lotacao
    * return lotacao
    * @generated
    */
    
    public java.lang.Integer getLotacao(){
        return this.lotacao;
    }

    /**
    * Define lotacao
    * @param lotacao lotacao
    * @generated
    */
    public CargoEmExercicio setLotacao(java.lang.Integer lotacao){
        this.lotacao = lotacao;
        return this;
    }
    /**
    * Obtém numPontoInclusao
    * return numPontoInclusao
    * @generated
    */
    
    public java.lang.Double getNumPontoInclusao(){
        return this.numPontoInclusao;
    }

    /**
    * Define numPontoInclusao
    * @param numPontoInclusao numPontoInclusao
    * @generated
    */
    public CargoEmExercicio setNumPontoInclusao(java.lang.Double numPontoInclusao){
        this.numPontoInclusao = numPontoInclusao;
        return this;
    }
    /**
    * Obtém terceirizado
    * return terceirizado
    * @generated
    */
    
    public Terceirizado getTerceirizado(){
        return this.terceirizado;
    }

    /**
    * Define terceirizado
    * @param terceirizado terceirizado
    * @generated
    */
    public CargoEmExercicio setTerceirizado(Terceirizado terceirizado){
        this.terceirizado = terceirizado;
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
    public CargoEmExercicio setTimRowversion(java.lang.Long timRowversion){
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
CargoEmExercicio object = (CargoEmExercicio)obj;
        if (cargoEmExercicio != null ? !cargoEmExercicio.equals(object.cargoEmExercicio) : object.cargoEmExercicio != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((cargoEmExercicio == null) ? 0 : cargoEmExercicio.hashCode());
        return result;
    }

}