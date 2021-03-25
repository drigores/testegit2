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
* Classe que representa a tabela STC_DIA_UTIL
* @generated
*/
@Entity
@IdClass(DiaUtilPK.class)
@Table(name = "\"STC_DIA_UTIL\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.DiaUtil")
@EntityListeners({cronapi.database.VersionListener.class})
@Converter(
  name="version",
  converterClass=VersionConverter.class
)
public class DiaUtil implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @JoinColumn(name="IDE_CARGO", nullable = false, referencedColumnName = "IDE_CARGO", insertable=true, updatable=true)
        private Cargo cargo;

    /**
    * @generated
    */
    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_UTIL", nullable = false, precision=3, scale=3, insertable=true, updatable=true)
        private java.util.Date datUtil;

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
    public DiaUtil(){
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
    public DiaUtil setCargo(Cargo cargo){
        this.cargo = cargo;
        return this;
    }
    /**
    * Obtém datUtil
    * return datUtil
    * @generated
    */
    
    public java.util.Date getDatUtil(){
        return this.datUtil;
    }

    /**
    * Define datUtil
    * @param datUtil datUtil
    * @generated
    */
    public DiaUtil setDatUtil(java.util.Date datUtil){
        this.datUtil = datUtil;
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
    public DiaUtil setTimRowversion(java.lang.Long timRowversion){
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
DiaUtil object = (DiaUtil)obj;
        if (cargo != null ? !cargo.equals(object.cargo) : object.cargo != null) return false;
        if (datUtil != null ? !datUtil.equals(object.datUtil) : object.datUtil != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = 31 * result + ((datUtil == null) ? 0 : datUtil.hashCode());
        return result;
    }

}