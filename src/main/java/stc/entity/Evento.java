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
* Classe que representa a tabela STC_Evento
* @generated
*/
@Entity
@Table(name = "\"STC_Evento\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.Evento")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class Evento implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_EVENTO", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String evento;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_CARGO_SUBSTITUTO", nullable = true, referencedColumnName = "IDE_CARGO_EM_EXERCICIO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "IX_FK_STC_Evento_STC_Cargo_Substituto"))
        
        private CargoEmExercicio cargosubistituto;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_CARGO_EM_EXERCICIO", nullable = false, referencedColumnName = "IDE_CARGO_EM_EXERCICIO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STC_Evento_STC_Cargo_em_Exercicio"))
        
        private CargoEmExercicio cargoemexercicio;

    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_FIM_EVENTO", nullable = true, unique = false, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datFimEvento;

    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_INICIO_EVENTO", nullable = false, unique = false, scale=3, insertable=true, updatable=true)
        
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
    @Column(name = "IND_VALIDACAO", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.Short indValidacao;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_MOTIVO_EVENTO", nullable = false, referencedColumnName = "IDE_MOTIVO_EVENTO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "IX_FK_STCEvento_STCMotivoEvento"))
        
        private MotivoEvento motivoEvento;

    /**
    * @generated
    */
    @Column(name = "NUM_PONTO_FISCAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double numPontoFiscal;

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
    public Evento(){
    }

    /**
    * Obtém evento
    * return evento
    * @generated
    */
    
    public java.lang.String getEvento(){
        return this.evento;
    }

    /**
    * Define evento
    * @param evento evento
    * @generated
    */
    public Evento setEvento(java.lang.String evento){
        this.evento = evento;
        return this;
    }
    /**
    * Obtém cargosubistituto
    * return cargosubistituto
    * @generated
    */
    
    public CargoEmExercicio getCargosubistituto(){
        return this.cargosubistituto;
    }

    /**
    * Define cargosubistituto
    * @param cargosubistituto cargosubistituto
    * @generated
    */
    public Evento setCargosubistituto(CargoEmExercicio cargosubistituto){
        this.cargosubistituto = cargosubistituto;
        return this;
    }
    /**
    * Obtém cargoemexercicio
    * return cargoemexercicio
    * @generated
    */
    
    public CargoEmExercicio getCargoemexercicio(){
        return this.cargoemexercicio;
    }

    /**
    * Define cargoemexercicio
    * @param cargoemexercicio cargoemexercicio
    * @generated
    */
    public Evento setCargoemexercicio(CargoEmExercicio cargoemexercicio){
        this.cargoemexercicio = cargoemexercicio;
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
    public Evento setDatFimEvento(java.util.Date datFimEvento){
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
    public Evento setDatInicioEvento(java.util.Date datInicioEvento){
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
    public Evento setDatValidacao(java.util.Date datValidacao){
        this.datValidacao = datValidacao;
        return this;
    }
    /**
    * Obtém indValidacao
    * return indValidacao
    * @generated
    */
    
    public java.lang.Short getIndValidacao(){
        return this.indValidacao;
    }

    /**
    * Define indValidacao
    * @param indValidacao indValidacao
    * @generated
    */
    public Evento setIndValidacao(java.lang.Short indValidacao){
        this.indValidacao = indValidacao;
        return this;
    }
    /**
    * Obtém motivoEvento
    * return motivoEvento
    * @generated
    */
    
    public MotivoEvento getMotivoEvento(){
        return this.motivoEvento;
    }

    /**
    * Define motivoEvento
    * @param motivoEvento motivoEvento
    * @generated
    */
    public Evento setMotivoEvento(MotivoEvento motivoEvento){
        this.motivoEvento = motivoEvento;
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
    public Evento setNumPontoFiscal(java.lang.Double numPontoFiscal){
        this.numPontoFiscal = numPontoFiscal;
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
    public Evento setTimRowversion(java.lang.Long timRowversion){
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
Evento object = (Evento)obj;
        if (evento != null ? !evento.equals(object.evento) : object.evento != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((evento == null) ? 0 : evento.hashCode());
        return result;
    }

}