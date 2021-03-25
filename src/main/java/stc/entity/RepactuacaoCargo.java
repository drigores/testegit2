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
* Classe que representa a tabela STC_REPACTUACAO_CARGO
* @generated
*/
@Entity
@Table(name = "\"STC_REPACTUACAO_CARGO\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.RepactuacaoCargo")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class RepactuacaoCargo implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_REPACTUACAO_CARGO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String repactuacaoCargo;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_CARGO", nullable = false, referencedColumnName = "IDE_CARGO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STC_REPA_FKSTC_REP_STC_CARG"))
        
        private Cargo cargo;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_ALTERACAO", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datAlteracao;

    /**
    * @generated
    */
    @Column(name = "PER_ENCARGOS_SOCIAIS", nullable = true, unique = false, precision=7, scale=7, insertable=true, updatable=true)
        
        private java.lang.Double perEncargosSociais;

    /**
    * @generated
    */
    @Column(name = "PER_TAXA_ADMINISTRACAO", nullable = true, unique = false, precision=7, scale=7, insertable=true, updatable=true)
        
        private java.lang.Double perTaxaAdministracao;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_REPACTUACAO", nullable = false, referencedColumnName = "IDE_REPACTUACAO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STC_REPA_FKSTC_REP_STC_REPA"))
        
        private Repactuacao repactuacao;

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
    public RepactuacaoCargo(){
    }

    /**
    * Obtém repactuacaoCargo
    * return repactuacaoCargo
    * @generated
    */
    
    public java.lang.String getRepactuacaoCargo(){
        return this.repactuacaoCargo;
    }

    /**
    * Define repactuacaoCargo
    * @param repactuacaoCargo repactuacaoCargo
    * @generated
    */
    public RepactuacaoCargo setRepactuacaoCargo(java.lang.String repactuacaoCargo){
        this.repactuacaoCargo = repactuacaoCargo;
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
    public RepactuacaoCargo setCargo(Cargo cargo){
        this.cargo = cargo;
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
    public RepactuacaoCargo setDatAlteracao(java.util.Date datAlteracao){
        this.datAlteracao = datAlteracao;
        return this;
    }
    /**
    * Obtém perEncargosSociais
    * return perEncargosSociais
    * @generated
    */
    
    public java.lang.Double getPerEncargosSociais(){
        return this.perEncargosSociais;
    }

    /**
    * Define perEncargosSociais
    * @param perEncargosSociais perEncargosSociais
    * @generated
    */
    public RepactuacaoCargo setPerEncargosSociais(java.lang.Double perEncargosSociais){
        this.perEncargosSociais = perEncargosSociais;
        return this;
    }
    /**
    * Obtém perTaxaAdministracao
    * return perTaxaAdministracao
    * @generated
    */
    
    public java.lang.Double getPerTaxaAdministracao(){
        return this.perTaxaAdministracao;
    }

    /**
    * Define perTaxaAdministracao
    * @param perTaxaAdministracao perTaxaAdministracao
    * @generated
    */
    public RepactuacaoCargo setPerTaxaAdministracao(java.lang.Double perTaxaAdministracao){
        this.perTaxaAdministracao = perTaxaAdministracao;
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
    public RepactuacaoCargo setRepactuacao(Repactuacao repactuacao){
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
    public RepactuacaoCargo setTimRowversion(java.lang.Long timRowversion){
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
RepactuacaoCargo object = (RepactuacaoCargo)obj;
        if (repactuacaoCargo != null ? !repactuacaoCargo.equals(object.repactuacaoCargo) : object.repactuacaoCargo != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((repactuacaoCargo == null) ? 0 : repactuacaoCargo.hashCode());
        return result;
    }

}