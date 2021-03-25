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
* Classe que representa a tabela STC_Terceirizado
* @generated
*/
@Entity
@Table(name = "\"STC_Terceirizado\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Terceirizado")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Terceirizado implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_TERCEIRIZADO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String terceirizado;

    /**
    * @generated
    */
    @Column(name = "COD_LOGIN", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private java.lang.String codLogin;

    /**
    * @generated
    */
    @Column(name = "COD_SEXO", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String codSexo;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_ALTERACAO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datAlteracao;

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
    @Column(name = "DAT_NASCIMENTO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datNascimento;

    /**
    * @generated
    */
    @Column(name = "DES_EMAIL", nullable = true, unique = false, length=128, insertable=true, updatable=true)
        
        private java.lang.String desEmail;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_ESCOLARIDADE", nullable = false, referencedColumnName = "IDE_ESCOLARIDADE", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "IX_FK_STCTerceirizado_STCEscolaridade"))
        
        private Escolaridade escolaridade;

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
    @Column(name = "NOM_TERCEIRIZADO", nullable = false, unique = false, length=72, insertable=true, updatable=true)
        
        private java.lang.String nomTerceirizado;

    /**
    * @generated
    */
    @Column(name = "NUM_CEP", nullable = true, unique = false, length=9, insertable=true, updatable=true)
        
        private java.lang.String numCep;

    /**
    * @generated
    */
    @Column(name = "NUM_CPF", nullable = false, unique = false, length=11, insertable=true, updatable=true)
        
        private java.lang.String numCpf;

    /**
    * @generated
    */
    @Column(name = "NUM_CTPS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double numCtps;

    /**
    * @generated
    */
    @Column(name = "NUM_PIS", nullable = true, unique = false, length=11, insertable=true, updatable=true)
        
        private java.lang.String numPis;

    /**
    * @generated
    */
    @Column(name = "NUM_PONTO_ALTERACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double numPontoAlteracao;

    /**
    * @generated
    */
    @Column(name = "NUM_PONTO_DEPOL", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String numPontoDepol;

    /**
    * @generated
    */
    @Column(name = "NUM_PONTO_INCLUSAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double numPontoInclusao;

    /**
    * @generated
    */
    @Column(name = "NUM_RG", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String numRg;

    /**
    * @generated
    */
    @Column(name = "NUM_SERIE_CTPS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double numSerieCtps;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_RACA", nullable = false, referencedColumnName = "IDE_RACA", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STCTerceirizado_STCRaca"))
        
        private Raca raca;

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
    @Column(name = "SIG_UF_CTPS", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String sigUfCtps;

    /**
    * @generated
    */
    @Column(name = "SIG_UF_NASCIMENTO", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String sigUfNascimento;

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
    public Terceirizado(){
    }

    /**
    * Obtém terceirizado
    * return terceirizado
    * @generated
    */
    
    public java.lang.String getTerceirizado(){
        return this.terceirizado;
    }

    /**
    * Define terceirizado
    * @param terceirizado terceirizado
    * @generated
    */
    public Terceirizado setTerceirizado(java.lang.String terceirizado){
        this.terceirizado = terceirizado;
        return this;
    }
    /**
    * Obtém codLogin
    * return codLogin
    * @generated
    */
    
    public java.lang.String getCodLogin(){
        return this.codLogin;
    }

    /**
    * Define codLogin
    * @param codLogin codLogin
    * @generated
    */
    public Terceirizado setCodLogin(java.lang.String codLogin){
        this.codLogin = codLogin;
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
    public Terceirizado setCodSexo(java.lang.String codSexo){
        this.codSexo = codSexo;
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
    public Terceirizado setDatAlteracao(java.util.Date datAlteracao){
        this.datAlteracao = datAlteracao;
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
    public Terceirizado setDatInclusao(java.util.Date datInclusao){
        this.datInclusao = datInclusao;
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
    public Terceirizado setDatNascimento(java.util.Date datNascimento){
        this.datNascimento = datNascimento;
        return this;
    }
    /**
    * Obtém desEmail
    * return desEmail
    * @generated
    */
    
    public java.lang.String getDesEmail(){
        return this.desEmail;
    }

    /**
    * Define desEmail
    * @param desEmail desEmail
    * @generated
    */
    public Terceirizado setDesEmail(java.lang.String desEmail){
        this.desEmail = desEmail;
        return this;
    }
    /**
    * Obtém escolaridade
    * return escolaridade
    * @generated
    */
    
    public Escolaridade getEscolaridade(){
        return this.escolaridade;
    }

    /**
    * Define escolaridade
    * @param escolaridade escolaridade
    * @generated
    */
    public Terceirizado setEscolaridade(Escolaridade escolaridade){
        this.escolaridade = escolaridade;
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
    public Terceirizado setNomBairro(java.lang.String nomBairro){
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
    public Terceirizado setNomCidade(java.lang.String nomCidade){
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
    public Terceirizado setNomCidadeNascimento(java.lang.String nomCidadeNascimento){
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
    public Terceirizado setNomLogradouro(java.lang.String nomLogradouro){
        this.nomLogradouro = nomLogradouro;
        return this;
    }
    /**
    * Obtém nomTerceirizado
    * return nomTerceirizado
    * @generated
    */
    
    public java.lang.String getNomTerceirizado(){
        return this.nomTerceirizado;
    }

    /**
    * Define nomTerceirizado
    * @param nomTerceirizado nomTerceirizado
    * @generated
    */
    public Terceirizado setNomTerceirizado(java.lang.String nomTerceirizado){
        this.nomTerceirizado = nomTerceirizado;
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
    public Terceirizado setNumCep(java.lang.String numCep){
        this.numCep = numCep;
        return this;
    }
    /**
    * Obtém numCpf
    * return numCpf
    * @generated
    */
    
    public java.lang.String getNumCpf(){
        return this.numCpf;
    }

    /**
    * Define numCpf
    * @param numCpf numCpf
    * @generated
    */
    public Terceirizado setNumCpf(java.lang.String numCpf){
        this.numCpf = numCpf;
        return this;
    }
    /**
    * Obtém numCtps
    * return numCtps
    * @generated
    */
    
    public java.lang.Double getNumCtps(){
        return this.numCtps;
    }

    /**
    * Define numCtps
    * @param numCtps numCtps
    * @generated
    */
    public Terceirizado setNumCtps(java.lang.Double numCtps){
        this.numCtps = numCtps;
        return this;
    }
    /**
    * Obtém numPis
    * return numPis
    * @generated
    */
    
    public java.lang.String getNumPis(){
        return this.numPis;
    }

    /**
    * Define numPis
    * @param numPis numPis
    * @generated
    */
    public Terceirizado setNumPis(java.lang.String numPis){
        this.numPis = numPis;
        return this;
    }
    /**
    * Obtém numPontoAlteracao
    * return numPontoAlteracao
    * @generated
    */
    
    public java.lang.Double getNumPontoAlteracao(){
        return this.numPontoAlteracao;
    }

    /**
    * Define numPontoAlteracao
    * @param numPontoAlteracao numPontoAlteracao
    * @generated
    */
    public Terceirizado setNumPontoAlteracao(java.lang.Double numPontoAlteracao){
        this.numPontoAlteracao = numPontoAlteracao;
        return this;
    }
    /**
    * Obtém numPontoDepol
    * return numPontoDepol
    * @generated
    */
    
    public java.lang.String getNumPontoDepol(){
        return this.numPontoDepol;
    }

    /**
    * Define numPontoDepol
    * @param numPontoDepol numPontoDepol
    * @generated
    */
    public Terceirizado setNumPontoDepol(java.lang.String numPontoDepol){
        this.numPontoDepol = numPontoDepol;
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
    public Terceirizado setNumPontoInclusao(java.lang.Double numPontoInclusao){
        this.numPontoInclusao = numPontoInclusao;
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
    public Terceirizado setNumRg(java.lang.String numRg){
        this.numRg = numRg;
        return this;
    }
    /**
    * Obtém numSerieCtps
    * return numSerieCtps
    * @generated
    */
    
    public java.lang.Double getNumSerieCtps(){
        return this.numSerieCtps;
    }

    /**
    * Define numSerieCtps
    * @param numSerieCtps numSerieCtps
    * @generated
    */
    public Terceirizado setNumSerieCtps(java.lang.Double numSerieCtps){
        this.numSerieCtps = numSerieCtps;
        return this;
    }
    /**
    * Obtém raca
    * return raca
    * @generated
    */
    
    public Raca getRaca(){
        return this.raca;
    }

    /**
    * Define raca
    * @param raca raca
    * @generated
    */
    public Terceirizado setRaca(Raca raca){
        this.raca = raca;
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
    public Terceirizado setSigOrgaoEmissor(java.lang.String sigOrgaoEmissor){
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
    public Terceirizado setSigTipoSanguineo(java.lang.String sigTipoSanguineo){
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
    public Terceirizado setSigUf(java.lang.String sigUf){
        this.sigUf = sigUf;
        return this;
    }
    /**
    * Obtém sigUfCtps
    * return sigUfCtps
    * @generated
    */
    
    public java.lang.String getSigUfCtps(){
        return this.sigUfCtps;
    }

    /**
    * Define sigUfCtps
    * @param sigUfCtps sigUfCtps
    * @generated
    */
    public Terceirizado setSigUfCtps(java.lang.String sigUfCtps){
        this.sigUfCtps = sigUfCtps;
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
    public Terceirizado setSigUfNascimento(java.lang.String sigUfNascimento){
        this.sigUfNascimento = sigUfNascimento;
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
    public Terceirizado setTimRowversion(java.lang.Long timRowversion){
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
Terceirizado object = (Terceirizado)obj;
        if (terceirizado != null ? !terceirizado.equals(object.terceirizado) : object.terceirizado != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((terceirizado == null) ? 0 : terceirizado.hashCode());
        return result;
    }

}