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
* Classe que representa a tabela STC_Cargo
* @generated
*/
@Entity
@Table(name = "\"STC_Cargo\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Cargo")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Cargo implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_CARGO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String cargo = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "ANO_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=4, insertable=true, updatable=true)
        
        private java.lang.Integer anoInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "COD_TIPO_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String codTipoInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "IND_LOGIN", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indLogin;

    /**
    * @generated
    */
    @Column(name = "IND_PERCENTUAIS_CARGO", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indPercentuaisCargo = false;

    /**
    * @generated
    */
    @Column(name = "IND_SUBSTITUTO", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indSubstituto;

    /**
    * @generated
    */
    @Column(name = "NOM_CARGO", nullable = false, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String nomCargo;

    /**
    * @generated
    */
    @Column(name = "NOM_CARGO_FEMININO", nullable = false, unique = false, length=60, insertable=true, updatable=true)
        
        private java.lang.String nomCargoFeminino;

    /**
    * @generated
    */
    @Column(name = "NUM_HORAS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Byte numHoras;

    /**
    * @generated
    */
    @Column(name = "NUM_INSTRUMENTO_CONTRATUAL", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Integer numInstrumentoContratual;

    /**
    * @generated
    */
    @Column(name = "PER_ENCARGOS_SOCIAIS", nullable = true, unique = false, precision=10, scale=7, insertable=true, updatable=true)
        
        private java.lang.Double perEncargosSociais;

    /**
    * @generated
    */
    @Column(name = "PER_ENCARGOS_SOCIAIS_CONTRATO", nullable = true, unique = false, precision=10, scale=7, insertable=true, updatable=true)
        
        private java.lang.Double perEncargosSociaisContrato;

    /**
    * @generated
    */
    @Column(name = "PER_TAXA_ADMINISTRACAO", nullable = true, unique = false, precision=10, scale=7, insertable=true, updatable=true)
        
        private java.lang.Double perTaxaAdministracao;

    /**
    * @generated
    */
    @Column(name = "PER_TAXA_ADMINISTRACAO_CONTRATO", nullable = true, unique = false, precision=10, scale=7, insertable=true, updatable=true)
        
        private java.lang.Double perTaxaAdministracaoContrato;

    /**
    * @generated
    */
    @Column(name = "QTD_PESSOAS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtdPessoas;

    /**
    * @generated
    */
    @Column(name = "QTD_PESSOAS_CONTRATO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtdPessoasContrato;

    /**
    * @generated
    */
    @Column(name = "SIG_CARGO", nullable = false, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String sigCargo;

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
    public Cargo(){
    }

    /**
    * Obtém cargo
    * return cargo
    * @generated
    */
    
    public java.lang.String getCargo(){
        return this.cargo;
    }

    /**
    * Define cargo
    * @param cargo cargo
    * @generated
    */
    public Cargo setCargo(java.lang.String cargo){
        this.cargo = cargo;
        return this;
    }
    /**
    * Obtém anoInstrumentoContratual
    * return anoInstrumentoContratual
    * @generated
    */
    
    public java.lang.Integer getAnoInstrumentoContratual(){
        return this.anoInstrumentoContratual;
    }

    /**
    * Define anoInstrumentoContratual
    * @param anoInstrumentoContratual anoInstrumentoContratual
    * @generated
    */
    public Cargo setAnoInstrumentoContratual(java.lang.Integer anoInstrumentoContratual){
        this.anoInstrumentoContratual = anoInstrumentoContratual;
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
    public Cargo setCodTipoInstrumentoContratual(java.lang.String codTipoInstrumentoContratual){
        this.codTipoInstrumentoContratual = codTipoInstrumentoContratual;
        return this;
    }
    /**
    * Obtém indLogin
    * return indLogin
    * @generated
    */
    
    public java.lang.Boolean getIndLogin(){
        return this.indLogin;
    }

    /**
    * Define indLogin
    * @param indLogin indLogin
    * @generated
    */
    public Cargo setIndLogin(java.lang.Boolean indLogin){
        this.indLogin = indLogin;
        return this;
    }
    /**
    * Obtém indPercentuaisCargo
    * return indPercentuaisCargo
    * @generated
    */
    
    public java.lang.Boolean getIndPercentuaisCargo(){
        return this.indPercentuaisCargo;
    }

    /**
    * Define indPercentuaisCargo
    * @param indPercentuaisCargo indPercentuaisCargo
    * @generated
    */
    public Cargo setIndPercentuaisCargo(java.lang.Boolean indPercentuaisCargo){
        this.indPercentuaisCargo = indPercentuaisCargo;
        return this;
    }
    /**
    * Obtém indSubstituto
    * return indSubstituto
    * @generated
    */
    
    public java.lang.Boolean getIndSubstituto(){
        return this.indSubstituto;
    }

    /**
    * Define indSubstituto
    * @param indSubstituto indSubstituto
    * @generated
    */
    public Cargo setIndSubstituto(java.lang.Boolean indSubstituto){
        this.indSubstituto = indSubstituto;
        return this;
    }
    /**
    * Obtém nomCargo
    * return nomCargo
    * @generated
    */
    
    public java.lang.String getNomCargo(){
        return this.nomCargo;
    }

    /**
    * Define nomCargo
    * @param nomCargo nomCargo
    * @generated
    */
    public Cargo setNomCargo(java.lang.String nomCargo){
        this.nomCargo = nomCargo;
        return this;
    }
    /**
    * Obtém nomCargoFeminino
    * return nomCargoFeminino
    * @generated
    */
    
    public java.lang.String getNomCargoFeminino(){
        return this.nomCargoFeminino;
    }

    /**
    * Define nomCargoFeminino
    * @param nomCargoFeminino nomCargoFeminino
    * @generated
    */
    public Cargo setNomCargoFeminino(java.lang.String nomCargoFeminino){
        this.nomCargoFeminino = nomCargoFeminino;
        return this;
    }
    /**
    * Obtém numHoras
    * return numHoras
    * @generated
    */
    
    public java.lang.Byte getNumHoras(){
        return this.numHoras;
    }

    /**
    * Define numHoras
    * @param numHoras numHoras
    * @generated
    */
    public Cargo setNumHoras(java.lang.Byte numHoras){
        this.numHoras = numHoras;
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
    public Cargo setNumInstrumentoContratual(java.lang.Integer numInstrumentoContratual){
        this.numInstrumentoContratual = numInstrumentoContratual;
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
    public Cargo setPerEncargosSociais(java.lang.Double perEncargosSociais){
        this.perEncargosSociais = perEncargosSociais;
        return this;
    }
    /**
    * Obtém perEncargosSociaisContrato
    * return perEncargosSociaisContrato
    * @generated
    */
    
    public java.lang.Double getPerEncargosSociaisContrato(){
        return this.perEncargosSociaisContrato;
    }

    /**
    * Define perEncargosSociaisContrato
    * @param perEncargosSociaisContrato perEncargosSociaisContrato
    * @generated
    */
    public Cargo setPerEncargosSociaisContrato(java.lang.Double perEncargosSociaisContrato){
        this.perEncargosSociaisContrato = perEncargosSociaisContrato;
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
    public Cargo setPerTaxaAdministracao(java.lang.Double perTaxaAdministracao){
        this.perTaxaAdministracao = perTaxaAdministracao;
        return this;
    }
    /**
    * Obtém perTaxaAdministracaoContrato
    * return perTaxaAdministracaoContrato
    * @generated
    */
    
    public java.lang.Double getPerTaxaAdministracaoContrato(){
        return this.perTaxaAdministracaoContrato;
    }

    /**
    * Define perTaxaAdministracaoContrato
    * @param perTaxaAdministracaoContrato perTaxaAdministracaoContrato
    * @generated
    */
    public Cargo setPerTaxaAdministracaoContrato(java.lang.Double perTaxaAdministracaoContrato){
        this.perTaxaAdministracaoContrato = perTaxaAdministracaoContrato;
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
    public Cargo setQtdPessoas(java.lang.Integer qtdPessoas){
        this.qtdPessoas = qtdPessoas;
        return this;
    }
    /**
    * Obtém qtdPessoasContrato
    * return qtdPessoasContrato
    * @generated
    */
    
    public java.lang.Integer getQtdPessoasContrato(){
        return this.qtdPessoasContrato;
    }

    /**
    * Define qtdPessoasContrato
    * @param qtdPessoasContrato qtdPessoasContrato
    * @generated
    */
    public Cargo setQtdPessoasContrato(java.lang.Integer qtdPessoasContrato){
        this.qtdPessoasContrato = qtdPessoasContrato;
        return this;
    }
    /**
    * Obtém sigCargo
    * return sigCargo
    * @generated
    */
    
    public java.lang.String getSigCargo(){
        return this.sigCargo;
    }

    /**
    * Define sigCargo
    * @param sigCargo sigCargo
    * @generated
    */
    public Cargo setSigCargo(java.lang.String sigCargo){
        this.sigCargo = sigCargo;
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
    public Cargo setTimRowversion(java.lang.Long timRowversion){
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
Cargo object = (Cargo)obj;
        if (cargo != null ? !cargo.equals(object.cargo) : object.cargo != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((cargo == null) ? 0 : cargo.hashCode());
        return result;
    }

}