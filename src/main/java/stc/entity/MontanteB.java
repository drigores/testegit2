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
* Classe que representa a tabela STC_Montante_B
* @generated
*/
@Entity
@Table(name = "\"STC_Montante_B\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.MontanteB")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class MontanteB implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "IDE_MONTANTE_B", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String montanteB = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "DES_MONTANTE_B", nullable = false, unique = false, length=72, insertable=true, updatable=true)
        
        private java.lang.String desMontanteB;

    /**
    * @generated
    */
    @Column(name = "IND_DESCONTO_FALTA", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean indDescontoFalta;

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
    public MontanteB(){
    }

    /**
    * Obtém montanteB
    * return montanteB
    * @generated
    */
    
    public java.lang.String getMontanteB(){
        return this.montanteB;
    }

    /**
    * Define montanteB
    * @param montanteB montanteB
    * @generated
    */
    public MontanteB setMontanteB(java.lang.String montanteB){
        this.montanteB = montanteB;
        return this;
    }
    /**
    * Obtém desMontanteB
    * return desMontanteB
    * @generated
    */
    
    public java.lang.String getDesMontanteB(){
        return this.desMontanteB;
    }

    /**
    * Define desMontanteB
    * @param desMontanteB desMontanteB
    * @generated
    */
    public MontanteB setDesMontanteB(java.lang.String desMontanteB){
        this.desMontanteB = desMontanteB;
        return this;
    }
    /**
    * Obtém indDescontoFalta
    * return indDescontoFalta
    * @generated
    */
    
    public java.lang.Boolean getIndDescontoFalta(){
        return this.indDescontoFalta;
    }

    /**
    * Define indDescontoFalta
    * @param indDescontoFalta indDescontoFalta
    * @generated
    */
    public MontanteB setIndDescontoFalta(java.lang.Boolean indDescontoFalta){
        this.indDescontoFalta = indDescontoFalta;
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
    public MontanteB setTimRowversion(java.lang.Long timRowversion){
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
MontanteB object = (MontanteB)obj;
        if (montanteB != null ? !montanteB.equals(object.montanteB) : object.montanteB != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((montanteB == null) ? 0 : montanteB.hashCode());
        return result;
    }

}