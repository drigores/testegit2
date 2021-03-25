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
* Classe que representa a tabela STC_Telefone
* @generated
*/
@Entity
@Table(name = "\"STC_Telefone\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Telefone")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Telefone implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_TELEFONE", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String telefone;

    /**
    * @generated
    */
    @Column(name = "COD_TELEFONE", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String codTelefone;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_INCLUSAO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datInclusao;

    /**
    * @generated
    */
    @Column(name = "NUM_PONTO_INCLUSAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double numPontoInclusao;

    /**
    * @generated
    */
    @Column(name = "NUM_TELEFONE", nullable = false, unique = false, length=11, insertable=true, updatable=true)
        
        private java.lang.String numTelefone;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_TERCEIRIZADO", nullable = true, referencedColumnName = "IDE_TERCEIRIZADO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "IX_FKSTC_Telefone_STCTerceirizado"))
        
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
    public Telefone(){
    }

    /**
    * Obtém telefone
    * return telefone
    * @generated
    */
    
    public java.lang.String getTelefone(){
        return this.telefone;
    }

    /**
    * Define telefone
    * @param telefone telefone
    * @generated
    */
    public Telefone setTelefone(java.lang.String telefone){
        this.telefone = telefone;
        return this;
    }
    /**
    * Obtém codTelefone
    * return codTelefone
    * @generated
    */
    
    public java.lang.String getCodTelefone(){
        return this.codTelefone;
    }

    /**
    * Define codTelefone
    * @param codTelefone codTelefone
    * @generated
    */
    public Telefone setCodTelefone(java.lang.String codTelefone){
        this.codTelefone = codTelefone;
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
    public Telefone setDatInclusao(java.util.Date datInclusao){
        this.datInclusao = datInclusao;
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
    public Telefone setNumPontoInclusao(java.lang.Double numPontoInclusao){
        this.numPontoInclusao = numPontoInclusao;
        return this;
    }
    /**
    * Obtém numTelefone
    * return numTelefone
    * @generated
    */
    
    public java.lang.String getNumTelefone(){
        return this.numTelefone;
    }

    /**
    * Define numTelefone
    * @param numTelefone numTelefone
    * @generated
    */
    public Telefone setNumTelefone(java.lang.String numTelefone){
        this.numTelefone = numTelefone;
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
    public Telefone setTerceirizado(Terceirizado terceirizado){
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
    public Telefone setTimRowversion(java.lang.Long timRowversion){
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
Telefone object = (Telefone)obj;
        if (telefone != null ? !telefone.equals(object.telefone) : object.telefone != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((telefone == null) ? 0 : telefone.hashCode());
        return result;
    }

}