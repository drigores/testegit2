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
* Classe que representa a tabela STC_Evento_Cargo
* @generated
*/
@Entity
@Table(name = "\"STC_Evento_Cargo\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.EventoCargo")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class EventoCargo implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_EVENTO_CARGO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String eventoCargo = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_CARGO", nullable = true, referencedColumnName = "IDE_CARGO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FKSTCEvento_Cargo_STCCargo"))
        
        private Cargo cargo;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_FIM_EVENTO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datFimEvento;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_INICIO_EVENTO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datInicioEvento;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_VALIDACAO", nullable = true, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datValidacao;

    /**
    * @generated
    */
    @Column(name = "DES_OBSERVACAO", nullable = true, unique = false, length=500, insertable=true, updatable=true)
        
        private java.lang.String desObservacao;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_MOTIVO_EVENTO", nullable = true, referencedColumnName = "IDE_MOTIVO_EVENTO_CARGO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FKSTCEvento_Cargo_STCMotivoEventoCargo"))
        
        private MotivoEventoCargo motivoEventoCargo;

    /**
    * @generated
    */
    @Column(name = "NUM_PONTO_FISCAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double numPontoFiscal;

    /**
    * @generated
    */
    @Column(name = "QTD_PESSOAS", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtdPessoas;

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
    public EventoCargo(){
    }

    /**
    * Obtém eventoCargo
    * return eventoCargo
    * @generated
    */
    
    public java.lang.String getEventoCargo(){
        return this.eventoCargo;
    }

    /**
    * Define eventoCargo
    * @param eventoCargo eventoCargo
    * @generated
    */
    public EventoCargo setEventoCargo(java.lang.String eventoCargo){
        this.eventoCargo = eventoCargo;
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
    public EventoCargo setCargo(Cargo cargo){
        this.cargo = cargo;
        return this;
    }
    /**
    * Obtém datFimEvento
    * return datFimEvento
    * @generated
    */
    
    public java.util.Date getDatFimEvento(){
        return this.datFimEvento;
    }

    /**
    * Define datFimEvento
    * @param datFimEvento datFimEvento
    * @generated
    */
    public EventoCargo setDatFimEvento(java.util.Date datFimEvento){
        this.datFimEvento = datFimEvento;
        return this;
    }
    /**
    * Obtém datInicioEvento
    * return datInicioEvento
    * @generated
    */
    
    public java.util.Date getDatInicioEvento(){
        return this.datInicioEvento;
    }

    /**
    * Define datInicioEvento
    * @param datInicioEvento datInicioEvento
    * @generated
    */
    public EventoCargo setDatInicioEvento(java.util.Date datInicioEvento){
        this.datInicioEvento = datInicioEvento;
        return this;
    }
    /**
    * Obtém datValidacao
    * return datValidacao
    * @generated
    */
    
    public java.util.Date getDatValidacao(){
        return this.datValidacao;
    }

    /**
    * Define datValidacao
    * @param datValidacao datValidacao
    * @generated
    */
    public EventoCargo setDatValidacao(java.util.Date datValidacao){
        this.datValidacao = datValidacao;
        return this;
    }
    /**
    * Obtém desObservacao
    * return desObservacao
    * @generated
    */
    
    public java.lang.String getDesObservacao(){
        return this.desObservacao;
    }

    /**
    * Define desObservacao
    * @param desObservacao desObservacao
    * @generated
    */
    public EventoCargo setDesObservacao(java.lang.String desObservacao){
        this.desObservacao = desObservacao;
        return this;
    }
    /**
    * Obtém motivoEventoCargo
    * return motivoEventoCargo
    * @generated
    */
    
    public MotivoEventoCargo getMotivoEventoCargo(){
        return this.motivoEventoCargo;
    }

    /**
    * Define motivoEventoCargo
    * @param motivoEventoCargo motivoEventoCargo
    * @generated
    */
    public EventoCargo setMotivoEventoCargo(MotivoEventoCargo motivoEventoCargo){
        this.motivoEventoCargo = motivoEventoCargo;
        return this;
    }
    /**
    * Obtém numPontoFiscal
    * return numPontoFiscal
    * @generated
    */
    
    public java.lang.Double getNumPontoFiscal(){
        return this.numPontoFiscal;
    }

    /**
    * Define numPontoFiscal
    * @param numPontoFiscal numPontoFiscal
    * @generated
    */
    public EventoCargo setNumPontoFiscal(java.lang.Double numPontoFiscal){
        this.numPontoFiscal = numPontoFiscal;
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
    public EventoCargo setQtdPessoas(java.lang.Integer qtdPessoas){
        this.qtdPessoas = qtdPessoas;
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
    public EventoCargo setTimRowversion(java.lang.Long timRowversion){
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
EventoCargo object = (EventoCargo)obj;
        if (eventoCargo != null ? !eventoCargo.equals(object.eventoCargo) : object.eventoCargo != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((eventoCargo == null) ? 0 : eventoCargo.hashCode());
        return result;
    }

}