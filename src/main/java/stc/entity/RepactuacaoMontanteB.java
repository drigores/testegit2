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
* Classe que representa a tabela STC_Repactuacao_Montante_B
* @generated
*/
@Entity
@IdClass(RepactuacaoMontanteBPK.class)
@Table(name = "\"STC_Repactuacao_Montante_B\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.RepactuacaoMontanteB")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class RepactuacaoMontanteB implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @JoinColumns({
    @JoinColumn(name="ANO_INSTRUMENTO_CONTRATUAL", nullable = false, referencedColumnName = "COD_TIPO_INSTRUMENTO_CONTRATUAL", insertable=true, updatable=true)
                    ,
    @JoinColumn(name="COD_TIPO_INSTRUMENTO_CONTRATUAL", nullable = false, referencedColumnName = "IDE_MONTANTE_B", insertable=true, updatable=true)
                    ,
    @JoinColumn(name="IDE_MONTANTE_B", nullable = false, referencedColumnName = "ANO_INSTRUMENTO_CONTRATUAL", insertable=true, updatable=true)
                    ,
    @JoinColumn(name="NUM_INSTRUMENTO_CONTRATUAL", nullable = false, referencedColumnName = "NUM_INSTRUMENTO_CONTRATUAL", insertable=true, updatable=true)
                    
    })
        private MontanteBContrato montanteBContrato;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="IDE_REPACTUACAO", nullable = false, referencedColumnName = "IDE_REPACTUACAO", insertable=true, updatable=true)
        private Repactuacao repactuacao;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_ALTERACAO", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datAlteracao;

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
    * Construtor
    * @generated
    */
    public RepactuacaoMontanteB(){
    }

    /**
    * Obtém montanteBContrato
    * return montanteBContrato
    * @generated
    */
    
    public MontanteBContrato getMontanteBContrato(){
        return this.montanteBContrato;
    }

    /**
    * Define montanteBContrato
    * @param montanteBContrato montanteBContrato
    * @generated
    */
    public RepactuacaoMontanteB setMontanteBContrato(MontanteBContrato montanteBContrato){
        this.montanteBContrato = montanteBContrato;
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
    public RepactuacaoMontanteB setRepactuacao(Repactuacao repactuacao){
        this.repactuacao = repactuacao;
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
    public RepactuacaoMontanteB setDatAlteracao(java.util.Date datAlteracao){
        this.datAlteracao = datAlteracao;
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
    public RepactuacaoMontanteB setTimRowversion(java.lang.Long timRowversion){
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
    public RepactuacaoMontanteB setVlrMontanteB(java.lang.Double vlrMontanteB){
        this.vlrMontanteB = vlrMontanteB;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
RepactuacaoMontanteB object = (RepactuacaoMontanteB)obj;
        if (montanteBContrato != null ? !montanteBContrato.equals(object.montanteBContrato) : object.montanteBContrato != null) return false;
        if (repactuacao != null ? !repactuacao.equals(object.repactuacao) : object.repactuacao != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((montanteBContrato == null) ? 0 : montanteBContrato.hashCode());
        result = 31 * result + ((repactuacao == null) ? 0 : repactuacao.hashCode());
        return result;
    }

}