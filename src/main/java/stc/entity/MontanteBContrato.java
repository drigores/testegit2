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
* Classe que representa a tabela STC_Montante_B_Contrato
* @generated
*/
@Entity
@IdClass(MontanteBContratoPK.class)
@Table(name = "\"STC_Montante_B_Contrato\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.MontanteBContrato")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class MontanteBContrato implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ANO_INSTRUMENTO_CONTRATUAL", nullable = false, length=5, insertable=true, updatable=true)
        private java.lang.Short anoInstrumentoContratual;

    /**
    * @generated
    */
    @Id
    @Column(name = "COD_TIPO_INSTRUMENTO_CONTRATUAL", nullable = false, length=2, insertable=true, updatable=true)
        private java.lang.String codTipoInstrumentoContratual;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="IDE_MONTANTE_B", nullable = false, referencedColumnName = "IDE_MONTANTE_B", insertable=true, updatable=true)
        private MontanteB montanteB;

    /**
    * @generated
    */
    @Id
    @Column(name = "NUM_INSTRUMENTO_CONTRATUAL", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer numInstrumentoContratual;

    /**
    * @generated
    */
    @Convert("version")
    @Column(name = "TIM_ROWVERSION", nullable = true, unique = false, length=8, insertable=false, updatable=false)
        
        private java.lang.Long timRowversion;

    /**
    * @generated
    */
    @Column(name = "VLR_MONTANTE_B", nullable = false, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double vlrMontanteB;

    /**
    * @generated
    */
    @Column(name = "VLR_MONTANTE_B_CONTRATO", nullable = false, unique = false, precision=2, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double vlrMontanteBContrato;

    /**
    * Construtor
    * @generated
    */
    public MontanteBContrato(){
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
    public MontanteBContrato setAnoInstrumentoContratual(java.lang.Short anoInstrumentoContratual){
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
    public MontanteBContrato setCodTipoInstrumentoContratual(java.lang.String codTipoInstrumentoContratual){
        this.codTipoInstrumentoContratual = codTipoInstrumentoContratual;
        return this;
    }
    /**
    * Obtém montanteB
    * return montanteB
    * @generated
    */
    
    public MontanteB getMontanteB(){
        return this.montanteB;
    }

    /**
    * Define montanteB
    * @param montanteB montanteB
    * @generated
    */
    public MontanteBContrato setMontanteB(MontanteB montanteB){
        this.montanteB = montanteB;
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
    public MontanteBContrato setNumInstrumentoContratual(java.lang.Integer numInstrumentoContratual){
        this.numInstrumentoContratual = numInstrumentoContratual;
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
    public MontanteBContrato setTimRowversion(java.lang.Long timRowversion){
        this.timRowversion = timRowversion;
        return this;
    }
    /**
    * Obtém vlrMontanteB
    * return vlrMontanteB
    * @generated
    */
    
    public java.lang.Double getVlrMontanteB(){
        return this.vlrMontanteB;
    }

    /**
    * Define vlrMontanteB
    * @param vlrMontanteB vlrMontanteB
    * @generated
    */
    public MontanteBContrato setVlrMontanteB(java.lang.Double vlrMontanteB){
        this.vlrMontanteB = vlrMontanteB;
        return this;
    }
    /**
    * Obtém vlrMontanteBContrato
    * return vlrMontanteBContrato
    * @generated
    */
    
    public java.lang.Double getVlrMontanteBContrato(){
        return this.vlrMontanteBContrato;
    }

    /**
    * Define vlrMontanteBContrato
    * @param vlrMontanteBContrato vlrMontanteBContrato
    * @generated
    */
    public MontanteBContrato setVlrMontanteBContrato(java.lang.Double vlrMontanteBContrato){
        this.vlrMontanteBContrato = vlrMontanteBContrato;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
MontanteBContrato object = (MontanteBContrato)obj;
        if (anoInstrumentoContratual != null ? !anoInstrumentoContratual.equals(object.anoInstrumentoContratual) : object.anoInstrumentoContratual != null) return false;
        if (codTipoInstrumentoContratual != null ? !codTipoInstrumentoContratual.equals(object.codTipoInstrumentoContratual) : object.codTipoInstrumentoContratual != null) return false;
        if (montanteB != null ? !montanteB.equals(object.montanteB) : object.montanteB != null) return false;
        if (numInstrumentoContratual != null ? !numInstrumentoContratual.equals(object.numInstrumentoContratual) : object.numInstrumentoContratual != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((anoInstrumentoContratual == null) ? 0 : anoInstrumentoContratual.hashCode());
        result = 31 * result + ((codTipoInstrumentoContratual == null) ? 0 : codTipoInstrumentoContratual.hashCode());
        result = 31 * result + ((montanteB == null) ? 0 : montanteB.hashCode());
        result = 31 * result + ((numInstrumentoContratual == null) ? 0 : numInstrumentoContratual.hashCode());
        return result;
    }

}