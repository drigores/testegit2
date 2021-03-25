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
* Classe que representa a tabela STC_Repactuacao
* @generated
*/
@Entity
@Table(name = "\"STC_Repactuacao\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Repactuacao")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Repactuacao implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_REPACTUACAO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String repactuacao;

    /**
    * @generated
    */
    @Column(name = "ANO_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short anoInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "ANO_PROCESSO_ORIGINAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer anoProcessoOriginal;

    /**
    * @generated
    */
    @Column(name = "ANO_PROCESSO_REPACTUACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer anoProcessoRepactuacao;

    /**
    * @generated
    */
    @Column(name = "COD_TIPO_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String codTipoInstrumentoContratual;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_ALTERACAO", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datAlteracao;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_AUTORIZACAO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datAutorizacao;

    /**
    * @generated
    */
    @Column(name = "DES_AUTORIZACAO", nullable = true, unique = false, length=200, insertable=true, updatable=true)
        
        private java.lang.String desAutorizacao;

    /**
    * @generated
    */
    @Column(name = "DES_JUSTIFICATIVA", nullable = false, unique = false, length=500, insertable=true, updatable=true)
        
        private java.lang.String desJustificativa;

    /**
    * @generated
    */
    @Column(name = "NUM_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "NUM_PROCESSO_ORIGINAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numProcessoOriginal;

    /**
    * @generated
    */
    @Column(name = "NUM_PROCESSO_REPACTUACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numProcessoRepactuacao;

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
    @Convert("version")
    @Column(name = "TIM_ROWVERSION", nullable = true, unique = false, length=8, insertable=false, updatable=false)
        
        private java.lang.Long timRowversion;

    /**
    * @generated
    */
    @Column(name = "VLR_MAXIMO_FATURA", nullable = true, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double vlrMaximoFatura;

    /**
    * Construtor
    * @generated
    */
    public Repactuacao(){
    }

    /**
    * Obtém repactuacao
    * return repactuacao
    * @generated
    */
    
    public java.lang.String getRepactuacao(){
        return this.repactuacao;
    }

    /**
    * Define repactuacao
    * @param repactuacao repactuacao
    * @generated
    */
    public Repactuacao setRepactuacao(java.lang.String repactuacao){
        this.repactuacao = repactuacao;
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
    public Repactuacao setAnoInstrumentoContratual(java.lang.Short anoInstrumentoContratual){
        this.anoInstrumentoContratual = anoInstrumentoContratual;
        return this;
    }
    /**
    * Obtém anoProcessoOriginal
    * return anoProcessoOriginal
    * @generated
    */
    
    public java.lang.Integer getAnoProcessoOriginal(){
        return this.anoProcessoOriginal;
    }

    /**
    * Define anoProcessoOriginal
    * @param anoProcessoOriginal anoProcessoOriginal
    * @generated
    */
    public Repactuacao setAnoProcessoOriginal(java.lang.Integer anoProcessoOriginal){
        this.anoProcessoOriginal = anoProcessoOriginal;
        return this;
    }
    /**
    * Obtém anoProcessoRepactuacao
    * return anoProcessoRepactuacao
    * @generated
    */
    
    public java.lang.Integer getAnoProcessoRepactuacao(){
        return this.anoProcessoRepactuacao;
    }

    /**
    * Define anoProcessoRepactuacao
    * @param anoProcessoRepactuacao anoProcessoRepactuacao
    * @generated
    */
    public Repactuacao setAnoProcessoRepactuacao(java.lang.Integer anoProcessoRepactuacao){
        this.anoProcessoRepactuacao = anoProcessoRepactuacao;
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
    public Repactuacao setCodTipoInstrumentoContratual(java.lang.String codTipoInstrumentoContratual){
        this.codTipoInstrumentoContratual = codTipoInstrumentoContratual;
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
    public Repactuacao setDatAlteracao(java.util.Date datAlteracao){
        this.datAlteracao = datAlteracao;
        return this;
    }
    /**
    * Obtém datAutorizacao
    * return datAutorizacao
    * @generated
    */
    
    public java.util.Date getDatAutorizacao(){
        return this.datAutorizacao;
    }

    /**
    * Define datAutorizacao
    * @param datAutorizacao datAutorizacao
    * @generated
    */
    public Repactuacao setDatAutorizacao(java.util.Date datAutorizacao){
        this.datAutorizacao = datAutorizacao;
        return this;
    }
    /**
    * Obtém desAutorizacao
    * return desAutorizacao
    * @generated
    */
    
    public java.lang.String getDesAutorizacao(){
        return this.desAutorizacao;
    }

    /**
    * Define desAutorizacao
    * @param desAutorizacao desAutorizacao
    * @generated
    */
    public Repactuacao setDesAutorizacao(java.lang.String desAutorizacao){
        this.desAutorizacao = desAutorizacao;
        return this;
    }
    /**
    * Obtém desJustificativa
    * return desJustificativa
    * @generated
    */
    
    public java.lang.String getDesJustificativa(){
        return this.desJustificativa;
    }

    /**
    * Define desJustificativa
    * @param desJustificativa desJustificativa
    * @generated
    */
    public Repactuacao setDesJustificativa(java.lang.String desJustificativa){
        this.desJustificativa = desJustificativa;
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
    public Repactuacao setNumInstrumentoContratual(java.lang.Integer numInstrumentoContratual){
        this.numInstrumentoContratual = numInstrumentoContratual;
        return this;
    }
    /**
    * Obtém numProcessoOriginal
    * return numProcessoOriginal
    * @generated
    */
    
    public java.lang.Integer getNumProcessoOriginal(){
        return this.numProcessoOriginal;
    }

    /**
    * Define numProcessoOriginal
    * @param numProcessoOriginal numProcessoOriginal
    * @generated
    */
    public Repactuacao setNumProcessoOriginal(java.lang.Integer numProcessoOriginal){
        this.numProcessoOriginal = numProcessoOriginal;
        return this;
    }
    /**
    * Obtém numProcessoRepactuacao
    * return numProcessoRepactuacao
    * @generated
    */
    
    public java.lang.Integer getNumProcessoRepactuacao(){
        return this.numProcessoRepactuacao;
    }

    /**
    * Define numProcessoRepactuacao
    * @param numProcessoRepactuacao numProcessoRepactuacao
    * @generated
    */
    public Repactuacao setNumProcessoRepactuacao(java.lang.Integer numProcessoRepactuacao){
        this.numProcessoRepactuacao = numProcessoRepactuacao;
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
    public Repactuacao setPerEncargosSociais(java.lang.Double perEncargosSociais){
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
    public Repactuacao setPerTaxaAdministracao(java.lang.Double perTaxaAdministracao){
        this.perTaxaAdministracao = perTaxaAdministracao;
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
    public Repactuacao setTimRowversion(java.lang.Long timRowversion){
        this.timRowversion = timRowversion;
        return this;
    }
    /**
    * Obtém vlrMaximoFatura
    * return vlrMaximoFatura
    * @generated
    */
    
    public java.lang.Double getVlrMaximoFatura(){
        return this.vlrMaximoFatura;
    }

    /**
    * Define vlrMaximoFatura
    * @param vlrMaximoFatura vlrMaximoFatura
    * @generated
    */
    public Repactuacao setVlrMaximoFatura(java.lang.Double vlrMaximoFatura){
        this.vlrMaximoFatura = vlrMaximoFatura;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Repactuacao object = (Repactuacao)obj;
        if (repactuacao != null ? !repactuacao.equals(object.repactuacao) : object.repactuacao != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((repactuacao == null) ? 0 : repactuacao.hashCode());
        return result;
    }

}