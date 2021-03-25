package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela VIW_STC_InstrumentoContratual
* @generated
*/
@Entity
@IdClass(STCInstrumentoContratualPK.class)
@Table(name = "\"VIW_STC_InstrumentoContratual\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.STCInstrumentoContratual")
public class STCInstrumentoContratual implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "anoInstrContratual", nullable = false, length=4, insertable=true, updatable=true)
        private java.lang.Short anoInstrContratual;

    /**
    * @generated
    */
    @Id
    @Column(name = "codTipoInstrContratual", nullable = false, length=2, insertable=true, updatable=true)
        private java.lang.String codTipoInstrContratual;

    /**
    * @generated
    */
    @Id
    @Column(name = "numInstrContratual", nullable = false, length=5, insertable=true, updatable=true)
        private java.lang.Integer numInstrContratual;

    /**
    * @generated
    */
    @Column(name = "anoProcesso", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short anoProcesso;

    /**
    * @generated
    */
    @Column(name = "codCPFCNPJForn", nullable = true, unique = false, length=18, insertable=true, updatable=true)
        
        private java.lang.String codCPFCNPJForn;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datFimVigenciaOriginal", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datFimVigenciaOriginal;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datInicioVigenciaOriginal", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datInicioVigenciaOriginal;

    /**
    * @generated
    */
    @Column(name = "numMatrAssistenteFiscal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numMatrAssistenteFiscal;

    /**
    * @generated
    */
    @Column(name = "numMatrFiscal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numMatrFiscal;

    /**
    * @generated
    */
    @Column(name = "numMatrSubstitutoFiscal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numMatrSubstitutoFiscal;

    /**
    * @generated
    */
    @Column(name = "numProcesso", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numProcesso;

    /**
    * @generated
    */
    @Column(name = "perEncargosSociais", nullable = true, unique = false, precision=7, scale=7, insertable=true, updatable=true)
        
        private java.lang.Double perEncargosSociais;

    /**
    * @generated
    */
    @Column(name = "perEncargosSociaisOriginal", nullable = true, unique = false, precision=7, scale=7, insertable=true, updatable=true)
        
        private java.lang.Double perEncargosSociaisOriginal;

    /**
    * @generated
    */
    @Column(name = "taxAdministracao", nullable = true, unique = false, precision=7, scale=7, insertable=true, updatable=true)
        
        private java.lang.Double taxAdministracao;

    /**
    * @generated
    */
    @Column(name = "taxAdministracaoOriginal", nullable = true, unique = false, precision=7, scale=7, insertable=true, updatable=true)
        
        private java.lang.Double taxAdministracaoOriginal;

    /**
    * @generated
    */
    @Column(name = "vlrMaximoFatura", nullable = true, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double vlrMaximoFatura;

    /**
    * @generated
    */
    @Column(name = "vlrMaximoFaturaOriginal", nullable = true, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double vlrMaximoFaturaOriginal;

    /**
    * Construtor
    * @generated
    */
    public STCInstrumentoContratual(){
    }

    /**
    * Obtém anoInstrContratual
    * return anoInstrContratual
    * @generated
    */
    
    public java.lang.Short getAnoInstrContratual(){
        return this.anoInstrContratual;
    }

    /**
    * Define anoInstrContratual
    * @param anoInstrContratual anoInstrContratual
    * @generated
    */
    public STCInstrumentoContratual setAnoInstrContratual(java.lang.Short anoInstrContratual){
        this.anoInstrContratual = anoInstrContratual;
        return this;
    }
    /**
    * Obtém anoProcesso
    * return anoProcesso
    * @generated
    */
    
    public java.lang.Short getAnoProcesso(){
        return this.anoProcesso;
    }

    /**
    * Define anoProcesso
    * @param anoProcesso anoProcesso
    * @generated
    */
    public STCInstrumentoContratual setAnoProcesso(java.lang.Short anoProcesso){
        this.anoProcesso = anoProcesso;
        return this;
    }
    /**
    * Obtém codCPFCNPJForn
    * return codCPFCNPJForn
    * @generated
    */
    
    public java.lang.String getCodCPFCNPJForn(){
        return this.codCPFCNPJForn;
    }

    /**
    * Define codCPFCNPJForn
    * @param codCPFCNPJForn codCPFCNPJForn
    * @generated
    */
    public STCInstrumentoContratual setCodCPFCNPJForn(java.lang.String codCPFCNPJForn){
        this.codCPFCNPJForn = codCPFCNPJForn;
        return this;
    }
    /**
    * Obtém codTipoInstrContratual
    * return codTipoInstrContratual
    * @generated
    */
    
    public java.lang.String getCodTipoInstrContratual(){
        return this.codTipoInstrContratual;
    }

    /**
    * Define codTipoInstrContratual
    * @param codTipoInstrContratual codTipoInstrContratual
    * @generated
    */
    public STCInstrumentoContratual setCodTipoInstrContratual(java.lang.String codTipoInstrContratual){
        this.codTipoInstrContratual = codTipoInstrContratual;
        return this;
    }
    /**
    * Obtém datFimVigenciaOriginal
    * return datFimVigenciaOriginal
    * @generated
    */
    
    public java.util.Date getDatFimVigenciaOriginal(){
        return this.datFimVigenciaOriginal;
    }

    /**
    * Define datFimVigenciaOriginal
    * @param datFimVigenciaOriginal datFimVigenciaOriginal
    * @generated
    */
    public STCInstrumentoContratual setDatFimVigenciaOriginal(java.util.Date datFimVigenciaOriginal){
        this.datFimVigenciaOriginal = datFimVigenciaOriginal;
        return this;
    }
    /**
    * Obtém datInicioVigenciaOriginal
    * return datInicioVigenciaOriginal
    * @generated
    */
    
    public java.util.Date getDatInicioVigenciaOriginal(){
        return this.datInicioVigenciaOriginal;
    }

    /**
    * Define datInicioVigenciaOriginal
    * @param datInicioVigenciaOriginal datInicioVigenciaOriginal
    * @generated
    */
    public STCInstrumentoContratual setDatInicioVigenciaOriginal(java.util.Date datInicioVigenciaOriginal){
        this.datInicioVigenciaOriginal = datInicioVigenciaOriginal;
        return this;
    }
    /**
    * Obtém numInstrContratual
    * return numInstrContratual
    * @generated
    */
    
    public java.lang.Integer getNumInstrContratual(){
        return this.numInstrContratual;
    }

    /**
    * Define numInstrContratual
    * @param numInstrContratual numInstrContratual
    * @generated
    */
    public STCInstrumentoContratual setNumInstrContratual(java.lang.Integer numInstrContratual){
        this.numInstrContratual = numInstrContratual;
        return this;
    }
    /**
    * Obtém numMatrAssistenteFiscal
    * return numMatrAssistenteFiscal
    * @generated
    */
    
    public java.lang.Integer getNumMatrAssistenteFiscal(){
        return this.numMatrAssistenteFiscal;
    }

    /**
    * Define numMatrAssistenteFiscal
    * @param numMatrAssistenteFiscal numMatrAssistenteFiscal
    * @generated
    */
    public STCInstrumentoContratual setNumMatrAssistenteFiscal(java.lang.Integer numMatrAssistenteFiscal){
        this.numMatrAssistenteFiscal = numMatrAssistenteFiscal;
        return this;
    }
    /**
    * Obtém numMatrFiscal
    * return numMatrFiscal
    * @generated
    */
    
    public java.lang.Integer getNumMatrFiscal(){
        return this.numMatrFiscal;
    }

    /**
    * Define numMatrFiscal
    * @param numMatrFiscal numMatrFiscal
    * @generated
    */
    public STCInstrumentoContratual setNumMatrFiscal(java.lang.Integer numMatrFiscal){
        this.numMatrFiscal = numMatrFiscal;
        return this;
    }
    /**
    * Obtém numMatrSubstitutoFiscal
    * return numMatrSubstitutoFiscal
    * @generated
    */
    
    public java.lang.Integer getNumMatrSubstitutoFiscal(){
        return this.numMatrSubstitutoFiscal;
    }

    /**
    * Define numMatrSubstitutoFiscal
    * @param numMatrSubstitutoFiscal numMatrSubstitutoFiscal
    * @generated
    */
    public STCInstrumentoContratual setNumMatrSubstitutoFiscal(java.lang.Integer numMatrSubstitutoFiscal){
        this.numMatrSubstitutoFiscal = numMatrSubstitutoFiscal;
        return this;
    }
    /**
    * Obtém numProcesso
    * return numProcesso
    * @generated
    */
    
    public java.lang.Integer getNumProcesso(){
        return this.numProcesso;
    }

    /**
    * Define numProcesso
    * @param numProcesso numProcesso
    * @generated
    */
    public STCInstrumentoContratual setNumProcesso(java.lang.Integer numProcesso){
        this.numProcesso = numProcesso;
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
    public STCInstrumentoContratual setPerEncargosSociais(java.lang.Double perEncargosSociais){
        this.perEncargosSociais = perEncargosSociais;
        return this;
    }
    /**
    * Obtém perEncargosSociaisOriginal
    * return perEncargosSociaisOriginal
    * @generated
    */
    
    public java.lang.Double getPerEncargosSociaisOriginal(){
        return this.perEncargosSociaisOriginal;
    }

    /**
    * Define perEncargosSociaisOriginal
    * @param perEncargosSociaisOriginal perEncargosSociaisOriginal
    * @generated
    */
    public STCInstrumentoContratual setPerEncargosSociaisOriginal(java.lang.Double perEncargosSociaisOriginal){
        this.perEncargosSociaisOriginal = perEncargosSociaisOriginal;
        return this;
    }
    /**
    * Obtém taxAdministracao
    * return taxAdministracao
    * @generated
    */
    
    public java.lang.Double getTaxAdministracao(){
        return this.taxAdministracao;
    }

    /**
    * Define taxAdministracao
    * @param taxAdministracao taxAdministracao
    * @generated
    */
    public STCInstrumentoContratual setTaxAdministracao(java.lang.Double taxAdministracao){
        this.taxAdministracao = taxAdministracao;
        return this;
    }
    /**
    * Obtém taxAdministracaoOriginal
    * return taxAdministracaoOriginal
    * @generated
    */
    
    public java.lang.Double getTaxAdministracaoOriginal(){
        return this.taxAdministracaoOriginal;
    }

    /**
    * Define taxAdministracaoOriginal
    * @param taxAdministracaoOriginal taxAdministracaoOriginal
    * @generated
    */
    public STCInstrumentoContratual setTaxAdministracaoOriginal(java.lang.Double taxAdministracaoOriginal){
        this.taxAdministracaoOriginal = taxAdministracaoOriginal;
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
    public STCInstrumentoContratual setVlrMaximoFatura(java.lang.Double vlrMaximoFatura){
        this.vlrMaximoFatura = vlrMaximoFatura;
        return this;
    }
    /**
    * Obtém vlrMaximoFaturaOriginal
    * return vlrMaximoFaturaOriginal
    * @generated
    */
    
    public java.lang.Double getVlrMaximoFaturaOriginal(){
        return this.vlrMaximoFaturaOriginal;
    }

    /**
    * Define vlrMaximoFaturaOriginal
    * @param vlrMaximoFaturaOriginal vlrMaximoFaturaOriginal
    * @generated
    */
    public STCInstrumentoContratual setVlrMaximoFaturaOriginal(java.lang.Double vlrMaximoFaturaOriginal){
        this.vlrMaximoFaturaOriginal = vlrMaximoFaturaOriginal;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
STCInstrumentoContratual object = (STCInstrumentoContratual)obj;
        if (anoInstrContratual != null ? !anoInstrContratual.equals(object.anoInstrContratual) : object.anoInstrContratual != null) return false;
        if (codTipoInstrContratual != null ? !codTipoInstrContratual.equals(object.codTipoInstrContratual) : object.codTipoInstrContratual != null) return false;
        if (numInstrContratual != null ? !numInstrContratual.equals(object.numInstrContratual) : object.numInstrContratual != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((anoInstrContratual == null) ? 0 : anoInstrContratual.hashCode());
        result = 31 * result + ((codTipoInstrContratual == null) ? 0 : codTipoInstrContratual.hashCode());
        result = 31 * result + ((numInstrContratual == null) ? 0 : numInstrContratual.hashCode());
        return result;
    }

}