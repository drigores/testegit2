package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela VIW_STC_Foto
* @generated
*/
@Entity
@Table(name = "\"VIW_STC_Foto\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.STCFoto")
public class STCFoto implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "Ide_foto", nullable = false, length=36, insertable=true, updatable=true)
        private java.lang.String ideFoto;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dat_foto", nullable = false, unique = false, precision=3, scale=3, insertable=true, updatable=true)
        
        private java.util.Date datFoto;

    /**
    * @generated
    */
    @Column(name = "img_foto", nullable = false, unique = false, length=2147483647, insertable=true, updatable=true)
        
        private byte[] imgFoto;

    /**
    * @generated
    */
    @Column(name = "num_cpf", nullable = false, unique = false, length=11, insertable=true, updatable=true)
        
        private java.lang.String numCpf;

    /**
    * Construtor
    * @generated
    */
    public STCFoto(){
    }

    /**
    * Obtém ideFoto
    * return ideFoto
    * @generated
    */
    
    public java.lang.String getIdeFoto(){
        return this.ideFoto;
    }

    /**
    * Define ideFoto
    * @param ideFoto ideFoto
    * @generated
    */
    public STCFoto setIdeFoto(java.lang.String ideFoto){
        this.ideFoto = ideFoto;
        return this;
    }
    /**
    * Obtém datFoto
    * return datFoto
    * @generated
    */
    
    public java.util.Date getDatFoto(){
        return this.datFoto;
    }

    /**
    * Define datFoto
    * @param datFoto datFoto
    * @generated
    */
    public STCFoto setDatFoto(java.util.Date datFoto){
        this.datFoto = datFoto;
        return this;
    }
    /**
    * Obtém imgFoto
    * return imgFoto
    * @generated
    */
    
    public byte[] getImgFoto(){
        return this.imgFoto;
    }

    /**
    * Define imgFoto
    * @param imgFoto imgFoto
    * @generated
    */
    public STCFoto setImgFoto(byte[] imgFoto){
        this.imgFoto = imgFoto;
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
    public STCFoto setNumCpf(java.lang.String numCpf){
        this.numCpf = numCpf;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
STCFoto object = (STCFoto)obj;
        if (ideFoto != null ? !ideFoto.equals(object.ideFoto) : object.ideFoto != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((ideFoto == null) ? 0 : ideFoto.hashCode());
        return result;
    }

}