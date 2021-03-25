package stc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela VIW_STC_TipoInstrContratual
* @generated
*/
@Entity
@Table(name = "\"VIW_STC_TipoInstrContratual\"", schema="\"dbo\"" )
@XmlRootElement
@CronappSecurity
@JsonFilter("stc.entity.STCTipoInstrContratual")
public class STCTipoInstrContratual implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "codTipoInstrContratual", nullable = false, length=2, insertable=true, updatable=true)
        private java.lang.String codTipoInstrContratual;

    /**
    * @generated
    */
    @Column(name = "txtTipoInstrContratual", nullable = false, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String txtTipoInstrContratual;

    /**
    * Construtor
    * @generated
    */
    public STCTipoInstrContratual(){
    }

    /**
    * Obtém codTipoInstrContratual
    * return codTipoInstrContratual
    * @generated
    */
    
    public java.lang.String getCodTipoInstrContratual(){
        return this.codTipoInstrContratual;
    }

    /**
    * Define codTipoInstrContratual
    * @param codTipoInstrContratual codTipoInstrContratual
    * @generated
    */
    public STCTipoInstrContratual setCodTipoInstrContratual(java.lang.String codTipoInstrContratual){
        this.codTipoInstrContratual = codTipoInstrContratual;
        return this;
    }
    /**
    * Obtém txtTipoInstrContratual
    * return txtTipoInstrContratual
    * @generated
    */
    
    public java.lang.String getTxtTipoInstrContratual(){
        return this.txtTipoInstrContratual;
    }

    /**
    * Define txtTipoInstrContratual
    * @param txtTipoInstrContratual txtTipoInstrContratual
    * @generated
    */
    public STCTipoInstrContratual setTxtTipoInstrContratual(java.lang.String txtTipoInstrContratual){
        this.txtTipoInstrContratual = txtTipoInstrContratual;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
STCTipoInstrContratual object = (STCTipoInstrContratual)obj;
        if (codTipoInstrContratual != null ? !codTipoInstrContratual.equals(object.codTipoInstrContratual) : object.codTipoInstrContratual != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((codTipoInstrContratual == null) ? 0 : codTipoInstrContratual.hashCode());
        return result;
    }

}