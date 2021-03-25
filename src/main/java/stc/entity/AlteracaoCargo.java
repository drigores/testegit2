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
* Classe que representa a tabela STC_Alteracao_Cargo
* @generated
*/
@Entity
@Table(name = "\"STC_Alteracao_Cargo\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.AlteracaoCargo")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class AlteracaoCargo implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_ALTERACAO_CARGO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String alteracaoCargo;

    /**
    * @generated
    */
    @Column(name = "ANO_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short anoInstrumentoContratual;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_CARGO", nullable = false, referencedColumnName = "IDE_CARGO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STCAlteracaoCargo_STCCargo"))
        
        private Cargo cargo;

    /**
    * @generated
    */
    @Column(name = "COD_TIPO_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String codTipoInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer codUsuario;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_ALTERACAO", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datAlteracao;

    /**
    * @generated
    */
    @Column(name = "NUM_ADITIVO", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short numAditivo;

    /**
    * @generated
    */
    @Column(name = "NUM_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "QTD_PESSOAS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtdPessoas;

    /**
    * @generated
    */
    @Column(name = "QTD_SUBSTITUTO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtdSubstituto;

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
    public AlteracaoCargo(){
    }

    /**
    * Obtém alteracaoCargo
    * return alteracaoCargo
    * @generated
    */
    
    public java.lang.String getAlteracaoCargo(){
        return this.alteracaoCargo;
    }

    /**
    * Define alteracaoCargo
    * @param alteracaoCargo alteracaoCargo
    * @generated
    */
    public AlteracaoCargo setAlteracaoCargo(java.lang.String alteracaoCargo){
        this.alteracaoCargo = alteracaoCargo;
        return this;
    }
    /**
    * Obtém anoInstrumentoContratual
    * return anoInstrumentoContratual
    * @generated
    */
    
    public java.lang.Short getAnoInstrumentoContratual(){
        return this.anoInstrumentoContratual;
    }

    /**
    * Define anoInstrumentoContratual
    * @param anoInstrumentoContratual anoInstrumentoContratual
    * @generated
    */
    public AlteracaoCargo setAnoInstrumentoContratual(java.lang.Short anoInstrumentoContratual){
        this.anoInstrumentoContratual = anoInstrumentoContratual;
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
    public AlteracaoCargo setCargo(Cargo cargo){
        this.cargo = cargo;
        return this;
    }
    /**
    * Obtém codTipoInstrumentoContratual
    * return codTipoInstrumentoContratual
    * @generated
    */
    
    public java.lang.String getCodTipoInstrumentoContratual(){
        return this.codTipoInstrumentoContratual;
    }

    /**
    * Define codTipoInstrumentoContratual
    * @param codTipoInstrumentoContratual codTipoInstrumentoContratual
    * @generated
    */
    public AlteracaoCargo setCodTipoInstrumentoContratual(java.lang.String codTipoInstrumentoContratual){
        this.codTipoInstrumentoContratual = codTipoInstrumentoContratual;
        return this;
    }
    /**
    * Obtém codUsuario
    * return codUsuario
    * @generated
    */
    
    public java.lang.Integer getCodUsuario(){
        return this.codUsuario;
    }

    /**
    * Define codUsuario
    * @param codUsuario codUsuario
    * @generated
    */
    public AlteracaoCargo setCodUsuario(java.lang.Integer codUsuario){
        this.codUsuario = codUsuario;
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
    public AlteracaoCargo setDatAlteracao(java.util.Date datAlteracao){
        this.datAlteracao = datAlteracao;
        return this;
    }
    /**
    * Obtém numAditivo
    * return numAditivo
    * @generated
    */
    
    public java.lang.Short getNumAditivo(){
        return this.numAditivo;
    }

    /**
    * Define numAditivo
    * @param numAditivo numAditivo
    * @generated
    */
    public AlteracaoCargo setNumAditivo(java.lang.Short numAditivo){
        this.numAditivo = numAditivo;
        return this;
    }
    /**
    * Obtém numInstrumentoContratual
    * return numInstrumentoContratual
    * @generated
    */
    
    public java.lang.Integer getNumInstrumentoContratual(){
        return this.numInstrumentoContratual;
    }

    /**
    * Define numInstrumentoContratual
    * @param numInstrumentoContratual numInstrumentoContratual
    * @generated
    */
    public AlteracaoCargo setNumInstrumentoContratual(java.lang.Integer numInstrumentoContratual){
        this.numInstrumentoContratual = numInstrumentoContratual;
        return this;
    }
    /**
    * Obtém qtdPessoas
    * return qtdPessoas
    * @generated
    */
    
    public java.lang.Integer getQtdPessoas(){
        return this.qtdPessoas;
    }

    /**
    * Define qtdPessoas
    * @param qtdPessoas qtdPessoas
    * @generated
    */
    public AlteracaoCargo setQtdPessoas(java.lang.Integer qtdPessoas){
        this.qtdPessoas = qtdPessoas;
        return this;
    }
    /**
    * Obtém qtdSubstituto
    * return qtdSubstituto
    * @generated
    */
    
    public java.lang.Integer getQtdSubstituto(){
        return this.qtdSubstituto;
    }

    /**
    * Define qtdSubstituto
    * @param qtdSubstituto qtdSubstituto
    * @generated
    */
    public AlteracaoCargo setQtdSubstituto(java.lang.Integer qtdSubstituto){
        this.qtdSubstituto = qtdSubstituto;
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
    public AlteracaoCargo setTimRowversion(java.lang.Long timRowversion){
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
AlteracaoCargo object = (AlteracaoCargo)obj;
        if (alteracaoCargo != null ? !alteracaoCargo.equals(object.alteracaoCargo) : object.alteracaoCargo != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((alteracaoCargo == null) ? 0 : alteracaoCargo.hashCode());
        return result;
    }

}