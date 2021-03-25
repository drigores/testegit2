package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela VIW_STC_Pessoa_Fisica
* @generated
*/
@Entity
@Table(name = "\"VIW_STC_Pessoa_Fisica\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.STCPessoaFisica")
public class STCPessoaFisica implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ide_Pessoa_Fisica", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String idePessoaFisica;

    /**
    * @generated
    */
    @Column(name = "cod_Pessoa_Fisica", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String codPessoaFisica;

    /**
    * @generated
    */
    @Column(name = "COD_SEXO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String codSexo;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dat_fim_autorizado", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datFimAutorizado;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_NASCIMENTO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datNascimento;

    /**
    * @generated
    */
    @Column(name = "ide_mascara_autorizado", nullable = true, unique = false, length=36, insertable=true, updatable=true)
        
        private java.lang.String ideMascaraAutorizado;

    /**
    * @generated
    */
    @Column(name = "ide_pessoa_juridica", nullable = true, unique = false, length=36, insertable=true, updatable=true)
        
        private java.lang.String idePessoaJuridica;

    /**
    * @generated
    */
    @Column(name = "ide_Terceirizado", nullable = true, unique = false, length=36, insertable=true, updatable=true)
        
        private java.lang.String ideTerceirizado;

    /**
    * @generated
    */
    @Column(name = "nom_apelido", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String nomApelido;

    /**
    * @generated
    */
    @Column(name = "NOM_BAIRRO", nullable = true, unique = false, length=32, insertable=true, updatable=true)
        
        private java.lang.String nomBairro;

    /**
    * @generated
    */
    @Column(name = "NOM_CIDADE", nullable = true, unique = false, length=32, insertable=true, updatable=true)
        
        private java.lang.String nomCidade;

    /**
    * @generated
    */
    @Column(name = "NOM_CIDADE_NASCIMENTO", nullable = true, unique = false, length=32, insertable=true, updatable=true)
        
        private java.lang.String nomCidadeNascimento;

    /**
    * @generated
    */
    @Column(name = "NOM_LOGRADOURO", nullable = true, unique = false, length=72, insertable=true, updatable=true)
        
        private java.lang.String nomLogradouro;

    /**
    * @generated
    */
    @Column(name = "Nom_Pessoa", nullable = false, unique = false, length=80, insertable=true, updatable=true)
        
        private java.lang.String nomPessoa;

    /**
    * @generated
    */
    @Column(name = "Num_CPF", nullable = true, unique = false, length=11, insertable=true, updatable=true)
        
        private java.lang.String numCPF;

    /**
    * @generated
    */
    @Column(name = "NUM_CEP", nullable = true, unique = false, length=9, insertable=true, updatable=true)
        
        private java.lang.String numCep;

    /**
    * @generated
    */
    @Column(name = "num_Ponto_Depol", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numPontoDepol;

    /**
    * @generated
    */
    @Column(name = "NUM_RG", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String numRg;

    /**
    * @generated
    */
    @Column(name = "num_telefone_celular", nullable = true, unique = false, length=14, insertable=true, updatable=true)
        
        private java.lang.String numTelefoneCelular;

    /**
    * @generated
    */
    @Column(name = "num_telefone_residencial", nullable = true, unique = false, length=14, insertable=true, updatable=true)
        
        private java.lang.String numTelefoneResidencial;

    /**
    * @generated
    */
    @Column(name = "SIG_ORGAO_EMISSOR", nullable = true, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String sigOrgaoEmissor;

    /**
    * @generated
    */
    @Column(name = "SIG_TIPO_SANGUINEO", nullable = true, unique = false, length=3, insertable=true, updatable=true)
        
        private java.lang.String sigTipoSanguineo;

    /**
    * @generated
    */
    @Column(name = "SIG_UF", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String sigUf;

    /**
    * @generated
    */
    @Column(name = "SIG_UF_NASCIMENTO", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String sigUfNascimento;

    /**
    * Construtor
    * @generated
    */
    public STCPessoaFisica(){
    }

    /**
    * Obtém idePessoaFisica
    * return idePessoaFisica
    * @generated
    */
    
    public java.lang.String getIdePessoaFisica(){
        return this.idePessoaFisica;
    }

    /**
    * Define idePessoaFisica
    * @param idePessoaFisica idePessoaFisica
    * @generated
    */
    public STCPessoaFisica setIdePessoaFisica(java.lang.String idePessoaFisica){
        this.idePessoaFisica = idePessoaFisica;
        return this;
    }
    /**
    * Obtém codPessoaFisica
    * return codPessoaFisica
    * @generated
    */
    
    public java.lang.String getCodPessoaFisica(){
        return this.codPessoaFisica;
    }

    /**
    * Define codPessoaFisica
    * @param codPessoaFisica codPessoaFisica
    * @generated
    */
    public STCPessoaFisica setCodPessoaFisica(java.lang.String codPessoaFisica){
        this.codPessoaFisica = codPessoaFisica;
        return this;
    }
    /**
    * Obtém codSexo
    * return codSexo
    * @generated
    */
    
    public java.lang.String getCodSexo(){
        return this.codSexo;
    }

    /**
    * Define codSexo
    * @param codSexo codSexo
    * @generated
    */
    public STCPessoaFisica setCodSexo(java.lang.String codSexo){
        this.codSexo = codSexo;
        return this;
    }
    /**
    * Obtém datFimAutorizado
    * return datFimAutorizado
    * @generated
    */
    
    public java.util.Date getDatFimAutorizado(){
        return this.datFimAutorizado;
    }

    /**
    * Define datFimAutorizado
    * @param datFimAutorizado datFimAutorizado
    * @generated
    */
    public STCPessoaFisica setDatFimAutorizado(java.util.Date datFimAutorizado){
        this.datFimAutorizado = datFimAutorizado;
        return this;
    }
    /**
    * Obtém datNascimento
    * return datNascimento
    * @generated
    */
    
    public java.util.Date getDatNascimento(){
        return this.datNascimento;
    }

    /**
    * Define datNascimento
    * @param datNascimento datNascimento
    * @generated
    */
    public STCPessoaFisica setDatNascimento(java.util.Date datNascimento){
        this.datNascimento = datNascimento;
        return this;
    }
    /**
    * Obtém ideMascaraAutorizado
    * return ideMascaraAutorizado
    * @generated
    */
    
    public java.lang.String getIdeMascaraAutorizado(){
        return this.ideMascaraAutorizado;
    }

    /**
    * Define ideMascaraAutorizado
    * @param ideMascaraAutorizado ideMascaraAutorizado
    * @generated
    */
    public STCPessoaFisica setIdeMascaraAutorizado(java.lang.String ideMascaraAutorizado){
        this.ideMascaraAutorizado = ideMascaraAutorizado;
        return this;
    }
    /**
    * Obtém idePessoaJuridica
    * return idePessoaJuridica
    * @generated
    */
    
    public java.lang.String getIdePessoaJuridica(){
        return this.idePessoaJuridica;
    }

    /**
    * Define idePessoaJuridica
    * @param idePessoaJuridica idePessoaJuridica
    * @generated
    */
    public STCPessoaFisica setIdePessoaJuridica(java.lang.String idePessoaJuridica){
        this.idePessoaJuridica = idePessoaJuridica;
        return this;
    }
    /**
    * Obtém ideTerceirizado
    * return ideTerceirizado
    * @generated
    */
    
    public java.lang.String getIdeTerceirizado(){
        return this.ideTerceirizado;
    }

    /**
    * Define ideTerceirizado
    * @param ideTerceirizado ideTerceirizado
    * @generated
    */
    public STCPessoaFisica setIdeTerceirizado(java.lang.String ideTerceirizado){
        this.ideTerceirizado = ideTerceirizado;
        return this;
    }
    /**
    * Obtém nomApelido
    * return nomApelido
    * @generated
    */
    
    public java.lang.String getNomApelido(){
        return this.nomApelido;
    }

    /**
    * Define nomApelido
    * @param nomApelido nomApelido
    * @generated
    */
    public STCPessoaFisica setNomApelido(java.lang.String nomApelido){
        this.nomApelido = nomApelido;
        return this;
    }
    /**
    * Obtém nomBairro
    * return nomBairro
    * @generated
    */
    
    public java.lang.String getNomBairro(){
        return this.nomBairro;
    }

    /**
    * Define nomBairro
    * @param nomBairro nomBairro
    * @generated
    */
    public STCPessoaFisica setNomBairro(java.lang.String nomBairro){
        this.nomBairro = nomBairro;
        return this;
    }
    /**
    * Obtém nomCidade
    * return nomCidade
    * @generated
    */
    
    public java.lang.String getNomCidade(){
        return this.nomCidade;
    }

    /**
    * Define nomCidade
    * @param nomCidade nomCidade
    * @generated
    */
    public STCPessoaFisica setNomCidade(java.lang.String nomCidade){
        this.nomCidade = nomCidade;
        return this;
    }
    /**
    * Obtém nomCidadeNascimento
    * return nomCidadeNascimento
    * @generated
    */
    
    public java.lang.String getNomCidadeNascimento(){
        return this.nomCidadeNascimento;
    }

    /**
    * Define nomCidadeNascimento
    * @param nomCidadeNascimento nomCidadeNascimento
    * @generated
    */
    public STCPessoaFisica setNomCidadeNascimento(java.lang.String nomCidadeNascimento){
        this.nomCidadeNascimento = nomCidadeNascimento;
        return this;
    }
    /**
    * Obtém nomLogradouro
    * return nomLogradouro
    * @generated
    */
    
    public java.lang.String getNomLogradouro(){
        return this.nomLogradouro;
    }

    /**
    * Define nomLogradouro
    * @param nomLogradouro nomLogradouro
    * @generated
    */
    public STCPessoaFisica setNomLogradouro(java.lang.String nomLogradouro){
        this.nomLogradouro = nomLogradouro;
        return this;
    }
    /**
    * Obtém nomPessoa
    * return nomPessoa
    * @generated
    */
    
    public java.lang.String getNomPessoa(){
        return this.nomPessoa;
    }

    /**
    * Define nomPessoa
    * @param nomPessoa nomPessoa
    * @generated
    */
    public STCPessoaFisica setNomPessoa(java.lang.String nomPessoa){
        this.nomPessoa = nomPessoa;
        return this;
    }
    /**
    * Obtém numCPF
    * return numCPF
    * @generated
    */
    
    public java.lang.String getNumCPF(){
        return this.numCPF;
    }

    /**
    * Define numCPF
    * @param numCPF numCPF
    * @generated
    */
    public STCPessoaFisica setNumCPF(java.lang.String numCPF){
        this.numCPF = numCPF;
        return this;
    }
    /**
    * Obtém numCep
    * return numCep
    * @generated
    */
    
    public java.lang.String getNumCep(){
        return this.numCep;
    }

    /**
    * Define numCep
    * @param numCep numCep
    * @generated
    */
    public STCPessoaFisica setNumCep(java.lang.String numCep){
        this.numCep = numCep;
        return this;
    }
    /**
    * Obtém numPontoDepol
    * return numPontoDepol
    * @generated
    */
    
    public java.lang.Integer getNumPontoDepol(){
        return this.numPontoDepol;
    }

    /**
    * Define numPontoDepol
    * @param numPontoDepol numPontoDepol
    * @generated
    */
    public STCPessoaFisica setNumPontoDepol(java.lang.Integer numPontoDepol){
        this.numPontoDepol = numPontoDepol;
        return this;
    }
    /**
    * Obtém numRg
    * return numRg
    * @generated
    */
    
    public java.lang.String getNumRg(){
        return this.numRg;
    }

    /**
    * Define numRg
    * @param numRg numRg
    * @generated
    */
    public STCPessoaFisica setNumRg(java.lang.String numRg){
        this.numRg = numRg;
        return this;
    }
    /**
    * Obtém numTelefoneCelular
    * return numTelefoneCelular
    * @generated
    */
    
    public java.lang.String getNumTelefoneCelular(){
        return this.numTelefoneCelular;
    }

    /**
    * Define numTelefoneCelular
    * @param numTelefoneCelular numTelefoneCelular
    * @generated
    */
    public STCPessoaFisica setNumTelefoneCelular(java.lang.String numTelefoneCelular){
        this.numTelefoneCelular = numTelefoneCelular;
        return this;
    }
    /**
    * Obtém numTelefoneResidencial
    * return numTelefoneResidencial
    * @generated
    */
    
    public java.lang.String getNumTelefoneResidencial(){
        return this.numTelefoneResidencial;
    }

    /**
    * Define numTelefoneResidencial
    * @param numTelefoneResidencial numTelefoneResidencial
    * @generated
    */
    public STCPessoaFisica setNumTelefoneResidencial(java.lang.String numTelefoneResidencial){
        this.numTelefoneResidencial = numTelefoneResidencial;
        return this;
    }
    /**
    * Obtém sigOrgaoEmissor
    * return sigOrgaoEmissor
    * @generated
    */
    
    public java.lang.String getSigOrgaoEmissor(){
        return this.sigOrgaoEmissor;
    }

    /**
    * Define sigOrgaoEmissor
    * @param sigOrgaoEmissor sigOrgaoEmissor
    * @generated
    */
    public STCPessoaFisica setSigOrgaoEmissor(java.lang.String sigOrgaoEmissor){
        this.sigOrgaoEmissor = sigOrgaoEmissor;
        return this;
    }
    /**
    * Obtém sigTipoSanguineo
    * return sigTipoSanguineo
    * @generated
    */
    
    public java.lang.String getSigTipoSanguineo(){
        return this.sigTipoSanguineo;
    }

    /**
    * Define sigTipoSanguineo
    * @param sigTipoSanguineo sigTipoSanguineo
    * @generated
    */
    public STCPessoaFisica setSigTipoSanguineo(java.lang.String sigTipoSanguineo){
        this.sigTipoSanguineo = sigTipoSanguineo;
        return this;
    }
    /**
    * Obtém sigUf
    * return sigUf
    * @generated
    */
    
    public java.lang.String getSigUf(){
        return this.sigUf;
    }

    /**
    * Define sigUf
    * @param sigUf sigUf
    * @generated
    */
    public STCPessoaFisica setSigUf(java.lang.String sigUf){
        this.sigUf = sigUf;
        return this;
    }
    /**
    * Obtém sigUfNascimento
    * return sigUfNascimento
    * @generated
    */
    
    public java.lang.String getSigUfNascimento(){
        return this.sigUfNascimento;
    }

    /**
    * Define sigUfNascimento
    * @param sigUfNascimento sigUfNascimento
    * @generated
    */
    public STCPessoaFisica setSigUfNascimento(java.lang.String sigUfNascimento){
        this.sigUfNascimento = sigUfNascimento;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
STCPessoaFisica object = (STCPessoaFisica)obj;
        if (idePessoaFisica != null ? !idePessoaFisica.equals(object.idePessoaFisica) : object.idePessoaFisica != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((idePessoaFisica == null) ? 0 : idePessoaFisica.hashCode());
        return result;
    }

}