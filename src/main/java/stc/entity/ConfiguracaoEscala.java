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
* Classe que representa a tabela STC_CONFIGURACAO_ESCALA
* @generated
*/
@Entity
@Table(name = "\"STC_CONFIGURACAO_ESCALA\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.ConfiguracaoEscala")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class ConfiguracaoEscala implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_CONFIGURACAO_ESCALA", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String configuracaoEscala;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="IDE_ESCALA", nullable = false, referencedColumnName = "IDE_ESCALA", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "FK_STC_CONF_FKSTC_CON_STC_ESCA"))
        
        private Escala escala;

    /**
    * @generated
    */
    @Column(name = "IND_FOLGA", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indFolga;

    /**
    * @generated
    */
    @Column(name = "NUM_DIA", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numDia;

    /**
    * @generated
    */
    @Column(name = "NUM_SEMANA", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer numSemana;

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
    public ConfiguracaoEscala(){
    }

    /**
    * Obtém configuracaoEscala
    * return configuracaoEscala
    * @generated
    */
    
    public java.lang.String getConfiguracaoEscala(){
        return this.configuracaoEscala;
    }

    /**
    * Define configuracaoEscala
    * @param configuracaoEscala configuracaoEscala
    * @generated
    */
    public ConfiguracaoEscala setConfiguracaoEscala(java.lang.String configuracaoEscala){
        this.configuracaoEscala = configuracaoEscala;
        return this;
    }
    /**
    * Obtém escala
    * return escala
    * @generated
    */
    
    public Escala getEscala(){
        return this.escala;
    }

    /**
    * Define escala
    * @param escala escala
    * @generated
    */
    public ConfiguracaoEscala setEscala(Escala escala){
        this.escala = escala;
        return this;
    }
    /**
    * Obtém indFolga
    * return indFolga
    * @generated
    */
    
    public java.lang.Boolean getIndFolga(){
        return this.indFolga;
    }

    /**
    * Define indFolga
    * @param indFolga indFolga
    * @generated
    */
    public ConfiguracaoEscala setIndFolga(java.lang.Boolean indFolga){
        this.indFolga = indFolga;
        return this;
    }
    /**
    * Obtém numDia
    * return numDia
    * @generated
    */
    
    public java.lang.Integer getNumDia(){
        return this.numDia;
    }

    /**
    * Define numDia
    * @param numDia numDia
    * @generated
    */
    public ConfiguracaoEscala setNumDia(java.lang.Integer numDia){
        this.numDia = numDia;
        return this;
    }
    /**
    * Obtém numSemana
    * return numSemana
    * @generated
    */
    
    public java.lang.Integer getNumSemana(){
        return this.numSemana;
    }

    /**
    * Define numSemana
    * @param numSemana numSemana
    * @generated
    */
    public ConfiguracaoEscala setNumSemana(java.lang.Integer numSemana){
        this.numSemana = numSemana;
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
    public ConfiguracaoEscala setTimRowversion(java.lang.Long timRowversion){
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
ConfiguracaoEscala object = (ConfiguracaoEscala)obj;
        if (configuracaoEscala != null ? !configuracaoEscala.equals(object.configuracaoEscala) : object.configuracaoEscala != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((configuracaoEscala == null) ? 0 : configuracaoEscala.hashCode());
        return result;
    }

}